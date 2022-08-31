package ua.com.javarush.pashakolomiiets.md2Animals.Core;

import java.util.HashMap;
import java.util.Map;

public class Setting {

    public static int maxY = 100;
    public static int maxX = 20;

    public static int wolfMaxOnCell = 30;
    public static int snakeMaxOnCell = 30;
    public static int foxMaxOnCell = 30;
    public static int bearMaxOnCell = 5;
    public static int eagleMaxOnCell = 20;

    public static int horseMaxOnCell = 20;
    public static int deerMaxOnCell = 20;

    public static int rabbitMaxOnCell = 150;
    public static int mouseMaxOnCell = 500;
    public static int goatMaxOnCell = 140;
    public static int sheepMaxOnCell = 140;
    public static int boarMaxOnCell = 50;
    public static int buffaloMaxOnCell = 10;
    public static int duckMaxOnCell = 200;
    public static int caterpillarMaxOnCell = 1000;
    //Растения
    public static int herbsMaxOnCell = 200;

    public Setting() {
    }


    public static Map<String, Integer> wolfMap = new HashMap<>();
    public static Map<String, Integer> snakeMap = new HashMap<>();
    public static Map<String, Integer> foxMap = new HashMap<>();
    public static Map<String, Integer> bearMap = new HashMap<>();
    public static Map<String, Integer> eagleMap = new HashMap<>();

    static {

        wolfMap.put("Horse", 10);
        wolfMap.put("Deer", 15);
        wolfMap.put("Rabbit", 60);
        wolfMap.put("Mouse", 80);
        wolfMap.put("Goat", 60);
        wolfMap.put("Sheep", 70);
        wolfMap.put("Boar", 15);
        wolfMap.put("Buffalo", 10);
        wolfMap.put("Duck", 40);

        snakeMap.put("Fox", 15);
        snakeMap.put("Rabbit", 20);
        snakeMap.put("Mouse", 40);
        snakeMap.put("Duck", 10);

        foxMap.put("Rabbit", 70);
        foxMap.put("Mouse", 90);
        foxMap.put("Duck", 60);
        foxMap.put("Caterpillar", 40);

        bearMap.put("Snake", 80);
        bearMap.put("Horse", 40);
        bearMap.put("Deer", 80);
        bearMap.put("Rabbit", 80);
        bearMap.put("Mouse", 90);
        bearMap.put("Goat", 70);
        bearMap.put("Sheep", 70);
        bearMap.put("Boar", 50);
        bearMap.put("Buffalo", 20);
        bearMap.put("Duck", 10);

        eagleMap.put("Fox", 10);
        eagleMap.put("Rabbit", 90);
        eagleMap.put("Mouse", 90);
        eagleMap.put("Duck", 80);
    }
}
