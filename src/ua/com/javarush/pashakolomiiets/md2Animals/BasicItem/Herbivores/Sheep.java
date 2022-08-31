package ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Herbivores;

import ua.com.javarush.pashakolomiiets.md2Animals.Core.Setting;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Herbivor;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.HerbivoreClass;

public class Sheep extends HerbivoreClass implements Herbivor {

    public Sheep() {
        super(70, 3, 15 , 5);
    }
    public static int maxOnCell = Setting.sheepMaxOnCell;

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}
