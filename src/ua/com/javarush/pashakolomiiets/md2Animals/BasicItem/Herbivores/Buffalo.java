package ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Herbivores;

import ua.com.javarush.pashakolomiiets.md2Animals.Core.Setting;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Herbivor;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.HerbivoreClass;

public class Buffalo extends HerbivoreClass implements Herbivor {
    public Buffalo() {
        super(700, 3, 100, 4);
    }


    public static int maxOnCell = Setting.buffaloMaxOnCell;

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}
