import processing.core.PApplet;
/**
 * @author Andy Duong
 */
public abstract class DragDrop {
    protected PApplet screen;
    protected int xPos;
    protected int yPos;
    protected int xOffset;
    protected int yOffset;
    protected boolean isDragging;

    protected DragDrop(PApplet screen, int x, int y) {
        this.screen = screen;
        this.xPos = x;
        this.yPos = y;
        this.isDragging = false;
    }

    public abstract void display();
    public abstract boolean isMouseOver();

    //continuously updates the screen every x frames
    public void drag() {
        if (isDragging) {
            xPos = screen.mouseX - xOffset;
            yPos = screen.mouseY - yOffset;
        }
    }

    public void mousePressed() {
        if(isMouseOver()){ //calculate offset for the dragging
            xOffset = Math.abs(xPos - screen.mouseX);
            yOffset = Math.abs(yPos - screen.mouseY);
            isDragging = true;
        }
    }

    public int getyPos() {
        return this.yPos;
    }
    public int getxPos() {
        return xPos;
    }
}
