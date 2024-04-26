public interface Draggable {
    void display();
    boolean isMouseOver();
    void setxPos(int x);
    void setyPos(int y);
    int getxPos();
    int getyPos();
    void setIsDragging(boolean isDragging);
}
