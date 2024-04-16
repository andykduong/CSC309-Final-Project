import java.io.Serializable;

/**
 * @author Aayush Joshi
 */
class Point implements Serializable {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }

    @Override
    public int hashCode() {
        return (7 * 31 + this.x) * 31 + this.y;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if ( !( o instanceof Point p ) ) return false;
        return p.getX() == x && p.getY() == y;
    }
}
