package ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Predators;

import ua.com.javarush.pashakolomiiets.md2Animals.Core.Setting;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Predator;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.PredatorClass;

public class Bear extends PredatorClass implements Predator {


    public Bear() {
        super(500,2, 80);
    }

    public static int maxOnCell = Setting.bearMaxOnCell;

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}
