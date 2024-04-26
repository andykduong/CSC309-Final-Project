import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Riya Badadare
 */

public class InstructionList {
    private static InstructionList instance;
    private static List<Instruction> instructions;

    private InstructionList() {
        instructions = new ArrayList<>();
    }

    public static InstructionList getInstance() {
        if (instance == null) {
            instance = new InstructionList();
        }
        return instance;
    }

    public void addInstruction(Instruction instruction) {
        instructions.add(instruction);
    }
    public void setInstructions(List<Instruction> instructions) {
        this.instructions = instructions;
    }

    public List<Instruction> getSortedInstructions() {
        return instructions.stream()
                .sorted(Comparator.comparingInt(Instruction::getyPos))
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
