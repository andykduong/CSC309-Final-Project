import processing.core.PApplet;
import processing.core.PImage;
/**
 * @author Riya Badadare
 */
public class StepInstruction extends Instruction{
    public StepInstruction(PApplet screen, int xPos, int yPos, PImage img) {
        super(screen, xPos, yPos, img);
    }
    @Override
    public StepInstruction clone() throws CloneNotSupportedException {
        return (StepInstruction) super.clone();
    }
    @Override
    public String toString() {
        return "step";
    }
}