package ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Herbivores;

import ua.com.javarush.pashakolomiiets.md2Animals.Core.Setting;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Herbivor;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.HerbivorClass;

public class Caterpillar extends HerbivorClass implements Herbivor {
    public Caterpillar() {
        super(0.01, 0, 0);
    }


    public static int maxOnCell = Setting.caterpillarMaxOnCell;

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}
