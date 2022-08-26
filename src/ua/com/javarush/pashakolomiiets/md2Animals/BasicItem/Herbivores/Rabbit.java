package ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Herbivores;

import ua.com.javarush.pashakolomiiets.md2Animals.Core.Setting;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Herbivor;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.HerbivoreClass;

public class Rabbit extends HerbivoreClass implements Herbivor {
    public Rabbit() {
        super(2, 2, 0.45 , 7);
    }

    public static int maxOnCell = Setting.rabbitMaxOnCell;

    public static int getMaxOnCell() {
        return maxOnCell;
    }

}
