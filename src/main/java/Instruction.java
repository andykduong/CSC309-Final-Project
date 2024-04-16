import processing.core.PApplet;
import processing.core.PImage;
/**
 * @author Riya Badadare
 */
public class Instruction extends DragDrop implements Cloneable{
    final PImage img;
    private final int width;
    private final int height;

    public Instruction(PApplet screen, int xPos, int yPos, PImage img){
        super(screen, xPos, yPos);
        this.img = img;
        width = img.width;
        height = img.height;
    }

    public void display(){
        screen.image(img, xPos, yPos);
    }

    @Override
    public boolean isMouseOver() {
        return (((xPos < screen.mouseX) && (screen.mouseX < xPos + width))
                && ((yPos < screen.mouseY) && (screen.mouseY < yPos + height)));
    }
    // for cloning the sidebar blocks
    public Instruction clone() throws CloneNotSupportedException {
        return (Instruction) super.clone();
    }

    public boolean toSnap(Instruction b) {
        double xDiff = Math.abs(this.xPos - b.xPos);
        double yDiff = Math.abs(this.yPos - b.yPos);
        return (xDiff < 30) && (yDiff < 30);
    }

    public String toString() {
        return "instruction\n";
    }
}

