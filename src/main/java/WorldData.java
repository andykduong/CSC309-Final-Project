import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Jemma Arona
 */
public final class WorldData extends PropertyChangeSupport {
    private static WorldData worldData;
    private int numRows;
    private HashMap <String, ArrayList <Point>> levelMap;
    private HashMap <Point, String> tileMap;
    private int[] spider, bgColor;
    private int speed = 500;

    private WorldData() {
        super( new Object() );
        numRows = 0;
        tileMap = new HashMap<>();
        spider = new int[]{0, 0, 0};
        bgColor = new int[]{0, 0, 0};
    }

    public static WorldData getWorldData() {
        if ( worldData == null ) {
            worldData = new WorldData();
        }
        return worldData;
    }

    public void setSpeed(int speed) {
        this.speed = speed * 50;
    }

    public int getSpeed() {
        return speed;
    }

    public void setLevel(HashMap <String, ArrayList<Point>> level ) {
        setLevel( level, 5, 26, 26, 26 );
    }

    public void setLevel( HashMap <String, ArrayList<Point>> level, int rows, int r, int g, int b ) {
        levelMap = level;
        if ( levelMap == null ) {
            levelMap = new HashMap<>();
        }
        numRows = rows;
        bgColor[0] = r;
        bgColor[1] = g;
        bgColor[2] = b;
        firePropertyChange( "levelMap", null, levelMap );
        firePropertyChange( "numRows", null, numRows );
        firePropertyChange( "bgColor", null, bgColor );
        resetWorld();
//        paintTile( 1, 1, "red");
//        paintTile( 2, 1, "red");
//        paintTile( 3, 1, "blue");
//        paintTile( 4, 1, "blue");
//        paintTile( 2, 2, "green");
//        paintTile( 1, 2, "green");
//        paintTile( 0, 4, "red");
//        paintTile( 1, 4, "red");
//        paintTile( 4, 4, "red");
//        paintTile( 0, 4, "blue");
//        paintTile( 2, 4, "blue");
//        paintTile( 4, 4, "blue");
//        paintTile( 1, 4, "green");
//        paintTile( 2, 4, "green");
//        paintTile( 4, 4, "green");
    }

    public int[] getSpider() {
        return spider;
    }

    /**
     * @param rot: 0 = east, 1 = north, 2 = west, 3 = south
     */
    public void moveSpider( int x, int y, int rot ) {
        if ( x > numRows || y > numRows || x < 0 || y < 0 ) {
            throw new RuntimeException( "Spider Out of Bounds" );
        } else {
            this.spider[0] = x;
            this.spider[1] = y;
            this.spider[2] = rot%4;
        }
        firePropertyChange( "spider", null, spider );
        firePropertyChange( "visible", null, true );
    }

    public HashMap<String, ArrayList<Point>> getLevelMap() {
        return levelMap;
    }
    public HashMap<Point, String> getTileMap() {
        return tileMap;
    }

    public void paintTile( int x, int y, String color ) {
        Point p = new Point( x, y );
        if ( tileMap.containsKey( p ) ) {
            tileMap.replace(p, color);
        }
        else {
            tileMap.put(p, color);
        }
        firePropertyChange( "visible", null, true );
    }

    public void resetWorld() {
        tileMap.clear();
        firePropertyChange( "tileMap", null, tileMap );
        try {
            Point pos = levelMap.get("spider").get(0);
            Point rot = levelMap.get("spider").get(1);
            moveSpider(pos.getX(), pos.getY(), rot.getX());
        } catch ( NullPointerException e ) {
            moveSpider( 0, 0, 0 );
        }
    }
}

