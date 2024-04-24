import processing.core.PApplet;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Jemma Arona
 */
public final class WorldView implements PropertyChangeListener {
    public final PApplet screen;
    private static final float leftPadding = 9;
    private static final float topPadding = 143;
    private float tileWidth = 60;
    private boolean visible;
    private int numRows;
    private int bgColor;
    private int[] spider;
    private HashMap <String, ArrayList <Point>> levelMap;
    private HashMap <Point, String> tileMap;
    private String IMAGEFOLDERPATH = "images/";

    public WorldView(PApplet screen) {
        this.screen = screen;
    }
//    public int[] getSpider() {
//        return spider;
//    }
//
//    public void readLevel() {
////        edit if level has different size or background color
//        numRows = 5;
//        tileWidth = 60;
//        bgColor = screen.color( 110, 113, 132 );
//    }

    public void drawGrid() {
        screen.fill( bgColor );
        screen.stroke( 204, 204, 204 );
        screen.rect( leftPadding, topPadding, tileWidth * numRows, tileWidth * numRows );
        for ( int row = 1; row < numRows; row++ ) {
            screen.line( leftPadding, topPadding + tileWidth * row,
                    leftPadding + tileWidth * numRows, topPadding + tileWidth * row );
        }
        for ( int col = 1; col < numRows; col++ ) {
            screen.line( leftPadding + tileWidth * col, topPadding,
                    leftPadding + tileWidth * col, topPadding + tileWidth * numRows );
        }
    }

    public void drawSandGrid(){
        screen.color(50, 50, 50);
        screen.fill(211, 211, 210);
        screen.stroke(0, 0, 250);
        screen.rect( leftPadding, topPadding, tileWidth * numRows, tileWidth * numRows );
        for ( int row = 1; row < numRows; row++ ) {
            screen.line( leftPadding, topPadding + tileWidth * row,
                    leftPadding + tileWidth * numRows, topPadding + tileWidth * row );
        }
        for ( int col = 1; col < numRows; col++ ) {
            screen.line( leftPadding + tileWidth * col, topPadding,
                    leftPadding + tileWidth * col, topPadding + tileWidth * numRows );
        }

    }

    public void drawDiamonds() {
        screen.textSize( 12 );
        // draw red diamonds
        if ( levelMap.containsKey( "red" ) ) {
            screen.fill( screen.color( 255, 89, 94 ) );
            for ( Point p : levelMap.get( "red" ) ) {
                float diamondX = (float) ( leftPadding + tileWidth * ( p.getX() + .5 ) - 5 );
                float diamondY = (float) ( topPadding + tileWidth * ( p.getY() + .5 ) + 5 );
                screen.text('◆', diamondX, diamondY );
            }
        }
        // draw blue diamonds
        if ( levelMap.containsKey( "blue" ) ) {
            screen.fill( screen.color( 63, 166, 231 ) );
            for ( Point p : levelMap.get( "blue" ) ) {
                float diamondX = (float) ( leftPadding + tileWidth * ( p.getX() + .5 ) - 5 );
                float diamondY = (float) ( topPadding + tileWidth * ( p.getY() + .5 ) + 5 );
                screen.text('◆', diamondX, diamondY );
            }
        }
        // draw green diamonds
        if ( levelMap.containsKey( "green" ) ) {
            screen.fill( screen.color( 138, 201, 38 ) );
            for ( Point p : levelMap.get( "green" ) ) {
                float diamondX = (float) ( leftPadding + tileWidth * ( p.getX() + .5 ) - 5 );
                float diamondY = (float) ( topPadding + tileWidth * ( p.getY() + .5 ) + 5 );
                screen.text('◆', diamondX, diamondY );
            }
        }
        String imgPath = IMAGEFOLDERPATH;
        switch ( spider[2] ) {
            case 1:
                imgPath += "spider_north.png";
                break;
            case 2:
                imgPath += "spider_west.png";
                break;
            case 3:
                imgPath += "spider_south.png";
                break;
            default:
                imgPath += "spider_east.png";
                break;
        }
        screen.image( screen.loadImage( imgPath ), leftPadding + spider[0]*tileWidth, topPadding + spider[1]*tileWidth );
    }

    public void drawPaint() {
        for ( Point p : tileMap.keySet() ) {
            switch ( tileMap.get(p) ){
                case "red":
                    screen.fill( screen.color( 255, 89, 94 ), 99 );
                    break;
                case "blue":
                    screen.fill( screen.color( 63, 166, 231 ), 99 );
                    break;
                case "green":
                    screen.fill( screen.color( 138, 201, 38 ), 99 );
                    break;
                default:
                    screen.fill( bgColor );
            }
            screen.rect(leftPadding + tileWidth * ( p.getX() ), topPadding + tileWidth * ( p.getY() ), tileWidth, tileWidth );
        }
    }

    public void drawWorld() {
        drawGrid();
        drawDiamonds();
        drawPaint();
    }

    public void drawSandWorld(){
        drawSandGrid();
    }


    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        switch ( evt.getPropertyName() ) {
            case "bgColor":
                bgColor = screen.color(((int[]) evt.getNewValue())[0], ((int[]) evt.getNewValue())[1], ((int[]) evt.getNewValue())[2]);
                break;
            case "numRows":
                numRows = (int) evt.getNewValue();
                break;
            case "levelMap":
                levelMap = (HashMap<String, ArrayList<Point>>) evt.getNewValue();
                break;
            case "tileMap":
                tileMap = (HashMap<Point, String>) evt.getNewValue();
                break;
            case "spider":
                spider = (int[]) evt.getNewValue();
                break;
            case "visible":
                visible = (boolean) evt.getNewValue();
                if (visible) drawWorld();
                break;
        }
    }
}
