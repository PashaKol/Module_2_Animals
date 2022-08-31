package ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Herbivores;

import ua.com.javarush.pashakolomiiets.md2Animals.Core.Setting;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Herbivor;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.HerbivoreClass;

public class Duck extends HerbivoreClass implements Herbivor {
    public Duck() {
        super(1, 4, 0.15, 4 );
    }


    public static int maxOnCell = Setting.duckMaxOnCell;

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}
