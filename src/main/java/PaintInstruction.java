import processing.core.PApplet;
import processing.core.PImage;

/**
 * @author Riya Badadare
 */

public class PaintInstruction extends Instruction {
    private String color;

    public PaintInstruction(PApplet screen, int xPos, int yPos, PImage img, String color) {
        super(screen, xPos, yPos, img);
        this.color = color;
    }
    @Override
    public PaintInstruction clone() throws CloneNotSupportedException {
        return (PaintInstruction) super.clone();
    }
    @Override
    public String toString(){
        return "paint " + this.color;
    }
    public String getColor() {
        return this.color;
    }
}
