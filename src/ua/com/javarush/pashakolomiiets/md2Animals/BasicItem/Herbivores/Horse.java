package ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Herbivores;

import ua.com.javarush.pashakolomiiets.md2Animals.Core.Setting;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Herbivor;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.HerbivorClass;

public class Horse extends HerbivorClass implements Herbivor {

    public Horse() {
        super(400, 4, 60);
    }

    public static int maxOnCell = Setting.horseMaxOnCell;

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}
