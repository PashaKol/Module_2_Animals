package ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Predators;

import ua.com.javarush.pashakolomiiets.md2Animals.Core.Setting;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Predator;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.PredatorClass;

public class Snake extends PredatorClass implements Predator {

    public Snake() {
        super(15, 1, 3);
    }

    public static int maxOnCell = Setting.snakeMaxOnCell;

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}
