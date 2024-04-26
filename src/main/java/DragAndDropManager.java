import processing.core.PApplet;
import processing.core.PImage;

import java.util.ArrayList;
import java.util.List;

public class DragAndDropManager {
    private PApplet screen;
    private InstructionList instructions;
    PImage closedDelete;
    private InstructionList instructionCopies = InstructionList.getInstance();

    public DragAndDropManager(PApplet screen, PImage closedDelete) {
        this.screen = screen;
        this.instructions = InstructionList.getInstance();
        this.closedDelete = closedDelete;
    }

    public void makeDraggable() {
        for (Instruction currInstruction : OriginalInstructions.getInstance()) {
            currInstruction.drag();
            currInstruction.display();
        }
        for (Instruction currInstruction : InstructionList.getInstance().getSortedInstructions()) {
            currInstruction.drag();
            currInstruction.display();
        }
    }

    public void mousePressed() {

        //when on original blocks, will create copies and will automatically be dragging copies
        for(Instruction currInstruction: OriginalInstructions.getInstance()) {
            if (currInstruction.isMouseOver()) {
                Instruction copy = null; // Create a copy
                try {
                    copy = currInstruction.clone();
                } catch (CloneNotSupportedException e) {
                    throw new RuntimeException(e);
                }
                copy.mousePressed();
                instructionCopies.addInstruction(copy); // Add the copy to the list
                break;
            }
        }

        //lets you drag around copies that you've dropped
        for (Instruction copy : InstructionList.getInstance().getSortedInstructions()) {
            copy.mousePressed();
        }
    }

    public void mouseReleased() {
        List<Instruction> instructions = instructionCopies.getSortedInstructions();
        List<Instruction> newInstructions = new ArrayList<>(instructions);

        //dealing with release of instruction over trash can
        for (Instruction currInstruction : instructions) {
            currInstruction.setIsDragging(false);
            if(currInstruction.getxPos() < 100 + closedDelete.width && currInstruction.getxPos() + 100 > 100
                    && currInstruction.getyPos() < 600 + closedDelete.height && currInstruction.getyPos() + 60 > 600
                    && currInstruction.isMouseOver()){
                newInstructions.remove(currInstruction);
            }
        }

        instructionCopies.setInstructions(newInstructions);
        instructions = instructionCopies.getSortedInstructions();

        // Snapping to other blocks
        for (int i = 0; i < instructions.size(); i++) {
            for (int j = 0; j < instructions.size(); j++) {
                if (i == j) continue;
                Instruction a = instructions.get(i);
                Instruction b = instructions.get(j);

                if (a.toSnap(b)) {
                    if (a.getyPos() < b.getyPos()) {
                        b.setxPos(a.getxPos());
                        b.setyPos(a.getyPos() + 50);
                    } else {
                        a.setxPos(b.getxPos());
                        a.setyPos(b.getyPos() + 50);
                    }
                }
            }
        }
    }
}
