package ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Herbivores;

import ua.com.javarush.pashakolomiiets.md2Animals.Core.Setting;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Herbivor;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.HerbivoreClass;

public class Caterpillar extends HerbivoreClass implements Herbivor {
    public Caterpillar() {
        super(0.01, 0, 0 , 2);
    }


    public static int maxOnCell = Setting.caterpillarMaxOnCell;

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}
