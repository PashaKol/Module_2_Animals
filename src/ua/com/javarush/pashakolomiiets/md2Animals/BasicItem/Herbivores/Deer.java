package ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Herbivores;

import ua.com.javarush.pashakolomiiets.md2Animals.Core.Setting;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Herbivor;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.HerbivorClass;

public class Deer extends HerbivorClass implements Herbivor {
    public Deer() {
        super(300, 4, 50);
    }

    public static int maxOnCell = Setting.deerMaxOnCell;

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}
