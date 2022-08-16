package ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Herbivores;

import ua.com.javarush.pashakolomiiets.md2Animals.Core.Setting;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Herbivor;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.HerbivorClass;

public class Sheep extends HerbivorClass implements Herbivor {

    public Sheep() {
        super(70, 3, 15);
    }
    public static int maxOnCell = Setting.sheepMaxOnCell;

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}
