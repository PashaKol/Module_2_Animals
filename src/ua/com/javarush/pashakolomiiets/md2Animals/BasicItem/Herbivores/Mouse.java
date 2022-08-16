package ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Herbivores;

import ua.com.javarush.pashakolomiiets.md2Animals.Core.Setting;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Herbivor;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.HerbivorClass;

public class Mouse extends HerbivorClass implements Herbivor {

    public Mouse() {
        super(0.05, 1, 0.01);
    }
    public static int maxOnCell = Setting.mouseMaxOnCell;

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}
