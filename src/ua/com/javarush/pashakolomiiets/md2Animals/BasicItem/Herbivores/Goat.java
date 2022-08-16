package ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Herbivores;

import ua.com.javarush.pashakolomiiets.md2Animals.Core.Setting;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Herbivor;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.HerbivorClass;

public class Goat extends HerbivorClass implements Herbivor {
    public Goat() {
        super(60, 3, 10);
    }

    public static int maxOnCell = Setting.goatMaxOnCell;

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}
