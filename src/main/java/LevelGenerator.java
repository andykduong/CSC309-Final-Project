import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Aayush Joshi
 */
public class LevelGenerator {
    public static void makeLevels(){
        level1();
        level2();
        level3();
        level4();
        level5();
        level6();
        level7();
        level8();
        level9();
        level10();
        level11();
        level12();
        level13();
        level14();
        level16();
        level17();
        level18();
        level19();
        level20();
    }

    public static void level1() {
        LoadLevels lvl = new LoadLevels(1);

        // Create points
        Point bluePoint1 = new Point(4, 1);
        Point redPoint1 = new Point(1, 1);
        Point greenPoint1 = new Point(1, 2);
        Point spiderLoc = new Point(1, 3);
        Point spiderDirection = new Point(1, 0);

        // Create ArrayLists and add points
        ArrayList<Point> bluePoints = new ArrayList<>();
        bluePoints.add(bluePoint1);
        ArrayList<Point> redPoints = new ArrayList<>();
        redPoints.add(redPoint1);
        ArrayList<Point> greenPoints = new ArrayList<>();
        greenPoints.add(greenPoint1);
        ArrayList<Point> spider = new ArrayList<>();
        spider.add(spiderLoc);
        spider.add(spiderDirection);

        // Create map and add ArrayLists
        HashMap<String, ArrayList<Point>> map = new HashMap<>();
        map.put("blue", bluePoints);
        map.put("red", redPoints);
        map.put("green", greenPoints);
        map.put("spider", spider);

        Point rowsXcols = new Point(5, 5);
        ArrayList<Point> dimentions = new ArrayList<>();
        dimentions.add(rowsXcols);
        map.put("dimentions", dimentions);

        lvl.saveHashMap(map);
    }
    public static void level2() {
        LoadLevels lvl = new LoadLevels(2);

        // Create points
        Point bluePoint1 = new Point(2, 1);
        Point redPoint1 = new Point(1, 4);
        Point greenPoint1 = new Point(1, 1);
        Point spiderLoc = new Point(3, 3);
        Point spiderDirection = new Point(1, 0);

        // Create ArrayLists and add points
        ArrayList<Point> bluePoints = new ArrayList<>();
        bluePoints.add(bluePoint1);
        ArrayList<Point> redPoints = new ArrayList<>();
        redPoints.add(redPoint1);
        ArrayList<Point> greenPoints = new ArrayList<>();
        greenPoints.add(greenPoint1);
        ArrayList<Point> spider = new ArrayList<>();
        spider.add(spiderLoc);
        spider.add(spiderDirection);

        // Create map and add ArrayLists
        HashMap<String, ArrayList<Point>> map = new HashMap<>();
        map.put("blue", bluePoints);
        map.put("red", redPoints);
        map.put("green", greenPoints);
        map.put("spider", spider);

        Point rowsXcols = new Point(5, 5);
        ArrayList<Point> dimentions = new ArrayList<>();
        dimentions.add(rowsXcols);
        map.put("dimentions", dimentions);

        lvl.saveHashMap(map);
    }
    public static void level3() {
        LoadLevels lvl = new LoadLevels(3);

        // Create points
        Point bluePoint1 = new Point(4, 1);
        Point bluePoint2 = new Point(2, 2);
        Point redPoint1 = new Point(1, 1);
        Point redPoint2 = new Point(3, 1);
        Point spiderLoc = new Point(2, 3);
        Point spiderDirection = new Point(1, 0);

        // Create ArrayLists and add points
        ArrayList<Point> bluePoints = new ArrayList<>();
        bluePoints.add(bluePoint1);
        bluePoints.add(bluePoint2);
        ArrayList<Point> redPoints = new ArrayList<>();
        redPoints.add(redPoint1);
        redPoints.add(redPoint2);
        ArrayList<Point> greenPoints = new ArrayList<>();
        ArrayList<Point> spider = new ArrayList<>();
        spider.add(spiderLoc);
        spider.add(spiderDirection);


        // Create map and add ArrayLists
        HashMap<String, ArrayList<Point>> map = new HashMap<>();
        map.put("blue", bluePoints);
        map.put("red", redPoints);
        map.put("green", greenPoints);
        map.put("spider", spider);

        Point rowsXcols = new Point(5, 5);
        ArrayList<Point> dimentions = new ArrayList<>();
        dimentions.add(rowsXcols);
        map.put("dimentions", dimentions);

        lvl.saveHashMap(map);
    }
    public static void level4() {
        LoadLevels lvl = new LoadLevels(4);

        // Create points
        Point bluePoint1 = new Point(1, 1);
        Point bluePoint2 = new Point(3, 1);
        Point spiderLoc = new Point(2, 3);
        Point spiderDirection = new Point(3, 0);

        // Create ArrayLists and add points
        ArrayList<Point> bluePoints = new ArrayList<>();
        bluePoints.add(bluePoint1);
        bluePoints.add(bluePoint2);
        ArrayList<Point> redPoints = new ArrayList<>();
        ArrayList<Point> greenPoints = new ArrayList<>();
        ArrayList<Point> spider = new ArrayList<>();
        spider.add(spiderLoc);
        spider.add(spiderDirection);


        // Create map and add ArrayLists
        HashMap<String, ArrayList<Point>> map = new HashMap<>();
        map.put("blue", bluePoints);
        map.put("red", redPoints);
        map.put("green", greenPoints);
        map.put("spider", spider);

        Point rowsXcols = new Point(5, 5);
        ArrayList<Point> dimentions = new ArrayList<>();
        dimentions.add(rowsXcols);
        map.put("dimentions", dimentions);

        lvl.saveHashMap(map);
    }
    public static void level5() {
        LoadLevels lvl = new LoadLevels(5);

        // Create points
        Point bluePoint1 = new Point(4, 3);
        Point greenPoint1 = new Point(4, 4);
        Point greenPoint2 = new Point(2, 4);
        Point spiderLoc = new Point(4, 2);
        Point spiderDirection = new Point(3, 0);

        // Create ArrayLists and add points
        ArrayList<Point> bluePoints = new ArrayList<>();
        bluePoints.add(bluePoint1);
        ArrayList<Point> redPoints = new ArrayList<>();
        ArrayList<Point> greenPoints = new ArrayList<>();
        greenPoints.add(greenPoint1);
        greenPoints.add(greenPoint2);
        ArrayList<Point> spider = new ArrayList<>();
        spider.add(spiderLoc);
        spider.add(spiderDirection);


        // Create map and add ArrayLists
        HashMap<String, ArrayList<Point>> map = new HashMap<>();
        map.put("blue", bluePoints);
        map.put("red", redPoints);
        map.put("green", greenPoints);
        map.put("spider", spider);

        Point rowsXcols = new Point(5, 5);
        ArrayList<Point> dimentions = new ArrayList<>();
        dimentions.add(rowsXcols);
        map.put("dimentions", dimentions);

        lvl.saveHashMap(map);
    }
    public static void level6() {
        LoadLevels lvl = new LoadLevels(6);

        // Create points
        Point bluePoint1 = new Point(1, 2);
        Point bluePoint2 = new Point(2, 2);
        Point bluePoint3 = new Point(3, 2);
        Point redPoint1 = new Point(1, 0);
        Point redPoint2 = new Point(1, 1);
        Point greenPoint1 = new Point(3, 0);
        Point greenPoint2 = new Point(3, 1);
        Point spiderLoc = new Point(0, 0);
        Point spiderDirection = new Point(0, 0);

        // Create ArrayLists and add points
        ArrayList<Point> bluePoints = new ArrayList<>();
        bluePoints.add(bluePoint1);
        bluePoints.add(bluePoint2);
        bluePoints.add(bluePoint3);
        ArrayList<Point> redPoints = new ArrayList<>();
        redPoints.add(redPoint1);
        redPoints.add(redPoint2);
        ArrayList<Point> greenPoints = new ArrayList<>();
        greenPoints.add(greenPoint1);
        greenPoints.add(greenPoint2);
        ArrayList<Point> spider = new ArrayList<>();
        spider.add(spiderLoc);
        spider.add(spiderDirection);

        // Create map and add ArrayLists
        HashMap<String, ArrayList<Point>> map = new HashMap<>();
        map.put("blue", bluePoints);
        map.put("red", redPoints);
        map.put("green", greenPoints);
        map.put("spider", spider);

        Point rowsXcols = new Point(5, 5);
        ArrayList<Point> dimentions = new ArrayList<>();
        dimentions.add(rowsXcols);
        map.put("dimentions", dimentions);

        lvl.saveHashMap(map);
    }
    public static void level7() {
        LoadLevels lvl = new LoadLevels(7);

        // Create points
        Point redPoint1 = new Point(1, 0);
        Point spiderLoc = new Point(0, 0);
        Point spiderDirection = new Point(0, 0);
        Point rowsXcols = new Point(3, 3);

        // Create ArrayLists and add points
        ArrayList<Point> bluePoints = new ArrayList<>();
        ArrayList<Point> redPoints = new ArrayList<>();
        redPoints.add(redPoint1);
        ArrayList<Point> greenPoints = new ArrayList<>();
        ArrayList<Point> spider = new ArrayList<>();
        spider.add(spiderLoc);
        spider.add(spiderDirection);
        ArrayList<Point> dimentions = new ArrayList<>();
        dimentions.add(rowsXcols);

        // Create map and add ArrayLists
        HashMap<String, ArrayList<Point>> map = new HashMap<>();
        map.put("blue", bluePoints);
        map.put("red", redPoints);
        map.put("green", greenPoints);
        map.put("spider", spider);
        map.put("dimentions", dimentions);

        lvl.saveHashMap(map);
    }
    public static void level8() {
        LoadLevels lvl = new LoadLevels(8);

        // Create points
        Point bluePoint1 = new Point(1, 0);
        Point bluePoint2 = new Point(2, 0);
        Point bluePoint3 = new Point(3, 0);

        Point redPoint1 = new Point(3, 3);
        Point spiderLoc = new Point(0, 0);
        Point spiderDirection = new Point(0, 0);
        Point rowsXcols = new Point(4, 4);

        // Create ArrayLists and add points
        ArrayList<Point> bluePoints = new ArrayList<>();
        bluePoints.add(bluePoint1);
        bluePoints.add(bluePoint2);
        bluePoints.add(bluePoint3);
        ArrayList<Point> redPoints = new ArrayList<>();
        redPoints.add(redPoint1);
        ArrayList<Point> greenPoints = new ArrayList<>();
        ArrayList<Point> spider = new ArrayList<>();
        spider.add(spiderLoc);
        spider.add(spiderDirection);
        ArrayList<Point> dimentions = new ArrayList<>();
        dimentions.add(rowsXcols);

        // Create map and add ArrayLists
        HashMap<String, ArrayList<Point>> map = new HashMap<>();
        map.put("blue", bluePoints);
        map.put("red", redPoints);
        map.put("green", greenPoints);
        map.put("spider", spider);
        map.put("dimentions", dimentions);

        lvl.saveHashMap(map);
    }
    public static void level9() {
        LoadLevels lvl = new LoadLevels(9);

        // Create points
        Point bluePoint1 = new Point(1, 5);
        Point bluePoint2 = new Point(2, 4);
        Point bluePoint3 = new Point(3, 3);
        Point bluePoint4 = new Point(4, 2);
        Point bluePoint5 = new Point(5, 1);

        Point redPoint1 = new Point(6, 0);
        Point redPoint2 = new Point(0, 6);

        Point spiderLoc = new Point(0, 0);
        Point spiderDirection = new Point(3, 0);
        Point rowsXcols = new Point(7, 7);

        // Create ArrayLists and add points
        ArrayList<Point> bluePoints = new ArrayList<>();
        bluePoints.add(bluePoint1);
        bluePoints.add(bluePoint2);
        bluePoints.add(bluePoint3);
        bluePoints.add(bluePoint4);
        bluePoints.add(bluePoint5);

        ArrayList<Point> redPoints = new ArrayList<>();
        redPoints.add(redPoint1);
        redPoints.add(redPoint2);

        ArrayList<Point> greenPoints = new ArrayList<>();
        ArrayList<Point> spider = new ArrayList<>();
        spider.add(spiderLoc);
        spider.add(spiderDirection);
        ArrayList<Point> dimentions = new ArrayList<>();
        dimentions.add(rowsXcols);

        // Create map and add ArrayLists
        HashMap<String, ArrayList<Point>> map = new HashMap<>();
        map.put("blue", bluePoints);
        map.put("red", redPoints);
        map.put("green", greenPoints);
        map.put("spider", spider);
        map.put("dimentions", dimentions);

        lvl.saveHashMap(map);
    }
    public static void level10() {
        LoadLevels lvl = new LoadLevels(10);

        // Create points
        Point redPoint1 = new Point(1, 0);
        Point redPoint2 = new Point(1, 1);
        Point redPoint3 = new Point(0, 1);

        Point spiderLoc = new Point(0, 0);
        Point spiderDirection = new Point(0, 0);
        Point rowsXcols = new Point(3, 3);

        // Create ArrayLists and add points
        ArrayList<Point> bluePoints = new ArrayList<>();
        ArrayList<Point> redPoints = new ArrayList<>();
        redPoints.add(redPoint1);
        redPoints.add(redPoint2);
        redPoints.add(redPoint3);

        ArrayList<Point> greenPoints = new ArrayList<>();
        ArrayList<Point> spider = new ArrayList<>();
        spider.add(spiderLoc);
        spider.add(spiderDirection);
        ArrayList<Point> dimentions = new ArrayList<>();
        dimentions.add(rowsXcols);

        // Create map and add ArrayLists
        HashMap<String, ArrayList<Point>> map = new HashMap<>();
        map.put("blue", bluePoints);
        map.put("red", redPoints);
        map.put("green", greenPoints);
        map.put("spider", spider);
        map.put("dimentions", dimentions);

        lvl.saveHashMap(map);
    }
    public static void level11() {
        LoadLevels lvl = new LoadLevels(11);

        // Create points
        Point redPoint1 = new Point(1, 0);
        Point redPoint2 = new Point(2, 0);
        Point redPoint3 = new Point(2, 1);
        Point redPoint4 = new Point(2, 2);
        Point redPoint5 = new Point(1, 2);
        Point redPoint6 = new Point(0, 2);
        Point redPoint7 = new Point(0, 1);

        Point spiderLoc = new Point(0, 0);
        Point spiderDirection = new Point(0, 0);
        Point rowsXcols = new Point(3, 3);

        // Create ArrayLists and add points
        ArrayList<Point> bluePoints = new ArrayList<>();
        ArrayList<Point> redPoints = new ArrayList<>();
        redPoints.add(redPoint1);
        redPoints.add(redPoint2);
        redPoints.add(redPoint3);
        redPoints.add(redPoint4);
        redPoints.add(redPoint5);
        redPoints.add(redPoint6);
        redPoints.add(redPoint7);

        ArrayList<Point> greenPoints = new ArrayList<>();
        ArrayList<Point> spider = new ArrayList<>();
        spider.add(spiderLoc);
        spider.add(spiderDirection);
        ArrayList<Point> dimentions = new ArrayList<>();
        dimentions.add(rowsXcols);

        // Create map and add ArrayLists
        HashMap<String, ArrayList<Point>> map = new HashMap<>();
        map.put("blue", bluePoints);
        map.put("red", redPoints);
        map.put("green", greenPoints);
        map.put("spider", spider);
        map.put("dimentions", dimentions);

        lvl.saveHashMap(map);
    }
    public static void level12() {
        LoadLevels lvl = new LoadLevels(12);

        // Create points
        Point redPoint1 = new Point(3, 1);
        Point bluePoint1 = new Point(3, 3);
        Point greenPoint1 = new Point(1, 3);

        Point spiderLoc = new Point(4, 0);
        Point spiderDirection = new Point(2, 0);
        Point rowsXcols = new Point(5, 5);

        // Create ArrayLists and add points
        ArrayList<Point> bluePoints = new ArrayList<>();
        bluePoints.add(bluePoint1);

        ArrayList<Point> redPoints = new ArrayList<>();
        redPoints.add(redPoint1);

        ArrayList<Point> greenPoints = new ArrayList<>();
        greenPoints.add(greenPoint1);

        ArrayList<Point> spider = new ArrayList<>();
        spider.add(spiderLoc);
        spider.add(spiderDirection);
        ArrayList<Point> dimentions = new ArrayList<>();
        dimentions.add(rowsXcols);

        // Create map and add ArrayLists
        HashMap<String, ArrayList<Point>> map = new HashMap<>();
        map.put("blue", bluePoints);
        map.put("red", redPoints);
        map.put("green", greenPoints);
        map.put("spider", spider);
        map.put("dimentions", dimentions);

        lvl.saveHashMap(map);
    }
    public static void level13() {
        LoadLevels lvl = new LoadLevels(13);

        // Create points
        Point redPoint1 = new Point(0, 1);
        Point redPoint2 = new Point(0, 2);
        Point redPoint3 = new Point(0, 3);
        Point redPoint4 = new Point(0, 4);
        Point redPoint5 = new Point(0, 5);
        Point redPoint6 = new Point(0, 6);
        Point redPoint7 = new Point(1, 6);
        Point redPoint8 = new Point(2, 6);
        Point redPoint9 = new Point(3, 6);
        Point redPoint10 = new Point(4, 6);
        Point redPoint11 = new Point(5, 6);
        Point redPoint12 = new Point(6, 6);

        Point spiderLoc = new Point(0, 0);
        Point spiderDirection = new Point(0, 0);
        Point rowsXcols = new Point(7, 7);

        // Create ArrayLists and add points
        ArrayList<Point> bluePoints = new ArrayList<>();

        ArrayList<Point> redPoints = new ArrayList<>();
        redPoints.add(redPoint1);
        redPoints.add(redPoint2);
        redPoints.add(redPoint3);
        redPoints.add(redPoint4);
        redPoints.add(redPoint5);
        redPoints.add(redPoint6);
        redPoints.add(redPoint7);
        redPoints.add(redPoint8);
        redPoints.add(redPoint9);
        redPoints.add(redPoint10);
        redPoints.add(redPoint11);
        redPoints.add(redPoint12);

        ArrayList<Point> greenPoints = new ArrayList<>();

        ArrayList<Point> spider = new ArrayList<>();
        spider.add(spiderLoc);
        spider.add(spiderDirection);
        ArrayList<Point> dimentions = new ArrayList<>();
        dimentions.add(rowsXcols);

        // Create map and add ArrayLists
        HashMap<String, ArrayList<Point>> map = new HashMap<>();
        map.put("blue", bluePoints);
        map.put("red", redPoints);
        map.put("green", greenPoints);
        map.put("spider", spider);
        map.put("dimentions", dimentions);

        lvl.saveHashMap(map);
    }
    public static void level14() {
        LoadLevels lvl = new LoadLevels(14);

        // Create points
        Point redPoint1 = new Point(1, 0);
        Point redPoint2 = new Point(2, 0);
        Point redPoint3 = new Point(3, 0);
        Point redPoint4 = new Point(2, 1);
        Point redPoint5 = new Point(1, 2);
        Point redPoint6 = new Point(0, 3);
        Point redPoint7 = new Point(1, 3);
        Point redPoint8 = new Point(2, 3);
        Point redPoint9 = new Point(3, 3);

        Point spiderLoc = new Point(0, 0);
        Point spiderDirection = new Point(0, 0);
        Point rowsXcols = new Point(4, 4);

        // Create ArrayLists and add points
        ArrayList<Point> bluePoints = new ArrayList<>();
        ArrayList<Point> redPoints = new ArrayList<>();
        redPoints.add(redPoint1);
        redPoints.add(redPoint2);
        redPoints.add(redPoint3);
        redPoints.add(redPoint4);
        redPoints.add(redPoint5);
        redPoints.add(redPoint6);
        redPoints.add(redPoint7);
        redPoints.add(redPoint8);
        redPoints.add(redPoint9);

        ArrayList<Point> greenPoints = new ArrayList<>();
        ArrayList<Point> spider = new ArrayList<>();
        spider.add(spiderLoc);
        spider.add(spiderDirection);
        ArrayList<Point> dimentions = new ArrayList<>();
        dimentions.add(rowsXcols);

        // Create map and add ArrayLists
        HashMap<String, ArrayList<Point>> map = new HashMap<>();
        map.put("blue", bluePoints);
        map.put("red", redPoints);
        map.put("green", greenPoints);
        map.put("spider", spider);
        map.put("dimentions", dimentions);

        lvl.saveHashMap(map);
    }
    public static void level15() {
        LoadLevels lvl = new LoadLevels(15);

        // Create points
        Point redPoint1 = new Point(0, 3);
        Point redPoint2 = new Point(1, 2);
        Point redPoint3 = new Point(2, 1);
        Point redPoint4 = new Point(3, 0);

        Point bluePoint1 = new Point(0, 4);
        Point bluePoint2 = new Point(1, 3);
        Point bluePoint3 = new Point(2, 2);
        Point bluePoint4 = new Point(3, 1);
        Point bluePoint5 = new Point(4, 0);


        Point spiderLoc = new Point(0, 0);
        Point spiderDirection = new Point(0, 0);
        Point rowsXcols = new Point(5, 5);

        // Create ArrayLists and add points
        ArrayList<Point> bluePoints = new ArrayList<>();
        bluePoints.add(bluePoint1);
        bluePoints.add(bluePoint2);
        bluePoints.add(bluePoint3);
        bluePoints.add(bluePoint4);
        bluePoints.add(bluePoint5);

        ArrayList<Point> redPoints = new ArrayList<>();
        redPoints.add(redPoint1);
        redPoints.add(redPoint2);
        redPoints.add(redPoint3);
        redPoints.add(redPoint4);

        ArrayList<Point> greenPoints = new ArrayList<>();

        ArrayList<Point> spider = new ArrayList<>();
        spider.add(spiderLoc);
        spider.add(spiderDirection);
        ArrayList<Point> dimentions = new ArrayList<>();
        dimentions.add(rowsXcols);

        // Create map and add ArrayLists
        HashMap<String, ArrayList<Point>> map = new HashMap<>();
        map.put("blue", bluePoints);
        map.put("red", redPoints);
        map.put("green", greenPoints);
        map.put("spider", spider);
        map.put("dimentions", dimentions);

        lvl.saveHashMap(map);
    }
    public static void level16() {
        LoadLevels lvl = new LoadLevels(16);

        // Create points
        Point redPoint1 = new Point(3, 1);
        Point bluePoint1 = new Point(1, 3);
        Point greenPoint1 = new Point(4, 2);

        Point spiderLoc = new Point(2, 2);
        Point spiderDirection = new Point(3, 0);
        Point rowsXcols = new Point(5, 5);

        // Create ArrayLists and add points
        ArrayList<Point> bluePoints = new ArrayList<>();
        bluePoints.add(bluePoint1);

        ArrayList<Point> redPoints = new ArrayList<>();
        redPoints.add(redPoint1);

        ArrayList<Point> greenPoints = new ArrayList<>();
        greenPoints.add(greenPoint1);

        ArrayList<Point> spider = new ArrayList<>();
        spider.add(spiderLoc);
        spider.add(spiderDirection);
        ArrayList<Point> dimentions = new ArrayList<>();
        dimentions.add(rowsXcols);

        // Create map and add ArrayLists
        HashMap<String, ArrayList<Point>> map = new HashMap<>();
        map.put("blue", bluePoints);
        map.put("red", redPoints);
        map.put("green", greenPoints);
        map.put("spider", spider);
        map.put("dimentions", dimentions);

        lvl.saveHashMap(map);
    }
    public static void level17() {
        LoadLevels lvl = new LoadLevels(17);

        // Create points
        Point redPoint1 = new Point(1, 2);
        Point bluePoint1 = new Point(0, 1);
        Point redPoint2 = new Point(2, 0);

        Point spiderLoc = new Point(2, 2);
        Point spiderDirection = new Point(0, 0);
        Point rowsXcols = new Point(3, 3);

        // Create ArrayLists and add points
        ArrayList<Point> bluePoints = new ArrayList<>();
        bluePoints.add(bluePoint1);

        ArrayList<Point> redPoints = new ArrayList<>();
        redPoints.add(redPoint1);
        redPoints.add(redPoint2);

        ArrayList<Point> greenPoints = new ArrayList<>();

        ArrayList<Point> spider = new ArrayList<>();
        spider.add(spiderLoc);
        spider.add(spiderDirection);
        ArrayList<Point> dimentions = new ArrayList<>();
        dimentions.add(rowsXcols);

        // Create map and add ArrayLists
        HashMap<String, ArrayList<Point>> map = new HashMap<>();
        map.put("blue", bluePoints);
        map.put("red", redPoints);
        map.put("green", greenPoints);
        map.put("spider", spider);
        map.put("dimentions", dimentions);

        lvl.saveHashMap(map);
    }
    public static void level18() {
        LoadLevels lvl = new LoadLevels(18);

        // Create points
        Point redPoint1 = new Point(1, 0);
        Point greenPoint1 = new Point(1, 1);

        Point spiderLoc = new Point(0, 0);
        Point spiderDirection = new Point(2, 0);
        Point rowsXcols = new Point(2, 2);

        // Create ArrayLists and add points
        ArrayList<Point> bluePoints = new ArrayList<>();

        ArrayList<Point> redPoints = new ArrayList<>();
        redPoints.add(redPoint1);

        ArrayList<Point> greenPoints = new ArrayList<>();
        greenPoints.add(greenPoint1);

        ArrayList<Point> spider = new ArrayList<>();
        spider.add(spiderLoc);
        spider.add(spiderDirection);
        ArrayList<Point> dimentions = new ArrayList<>();
        dimentions.add(rowsXcols);

        // Create map and add ArrayLists
        HashMap<String, ArrayList<Point>> map = new HashMap<>();
        map.put("blue", bluePoints);
        map.put("red", redPoints);
        map.put("green", greenPoints);
        map.put("spider", spider);
        map.put("dimentions", dimentions);

        lvl.saveHashMap(map);
    }
    public static void level19() {
        LoadLevels lvl = new LoadLevels(19);

        // Create points
        Point redPoint1 = new Point(1, 0);
        Point greenPoint1 = new Point(1, 1);
        Point greenPoint2 = new Point(1, 2);

        Point spiderLoc = new Point(0, 0);
        Point spiderDirection = new Point(2, 0);
        Point rowsXcols = new Point(3, 3);

        // Create ArrayLists and add points
        ArrayList<Point> bluePoints = new ArrayList<>();

        ArrayList<Point> redPoints = new ArrayList<>();
        redPoints.add(redPoint1);

        ArrayList<Point> greenPoints = new ArrayList<>();
        greenPoints.add(greenPoint1);
        greenPoints.add(greenPoint2);

        ArrayList<Point> spider = new ArrayList<>();
        spider.add(spiderLoc);
        spider.add(spiderDirection);
        ArrayList<Point> dimentions = new ArrayList<>();
        dimentions.add(rowsXcols);

        // Create map and add ArrayLists
        HashMap<String, ArrayList<Point>> map = new HashMap<>();
        map.put("blue", bluePoints);
        map.put("red", redPoints);
        map.put("green", greenPoints);
        map.put("spider", spider);
        map.put("dimentions", dimentions);

        lvl.saveHashMap(map);
    }
    public static void level20() {
        LoadLevels lvl = new LoadLevels(20);

        // Create points
        Point redPoint1 = new Point(1, 0);
        Point greenPoint1 = new Point(1, 1);
        Point greenPoint2 = new Point(2, 2);

        Point spiderLoc = new Point(0, 0);
        Point spiderDirection = new Point(3, 0);
        Point rowsXcols = new Point(3, 3);

        // Create ArrayLists and add points
        ArrayList<Point> bluePoints = new ArrayList<>();

        ArrayList<Point> redPoints = new ArrayList<>();
        redPoints.add(redPoint1);

        ArrayList<Point> greenPoints = new ArrayList<>();
        greenPoints.add(greenPoint1);
        greenPoints.add(greenPoint2);

        ArrayList<Point> spider = new ArrayList<>();
        spider.add(spiderLoc);
        spider.add(spiderDirection);
        ArrayList<Point> dimentions = new ArrayList<>();
        dimentions.add(rowsXcols);

        // Create map and add ArrayLists
        HashMap<String, ArrayList<Point>> map = new HashMap<>();
        map.put("blue", bluePoints);
        map.put("red", redPoints);
        map.put("green", greenPoints);
        map.put("spider", spider);
        map.put("dimentions", dimentions);

        lvl.saveHashMap(map);
    }
}
