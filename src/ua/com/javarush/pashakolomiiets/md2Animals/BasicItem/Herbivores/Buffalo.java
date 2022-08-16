package ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Herbivores;

import ua.com.javarush.pashakolomiiets.md2Animals.Core.Setting;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Herbivor;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.HerbivorClass;

public class Buffalo extends HerbivorClass implements Herbivor {
    public Buffalo() {
        super(700, 3, 100);
    }


    public static int maxOnCell = Setting.buffaloMaxOnCell;

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}
