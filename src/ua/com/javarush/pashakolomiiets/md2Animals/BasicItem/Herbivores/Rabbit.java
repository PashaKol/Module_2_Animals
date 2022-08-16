package ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Herbivores;

import ua.com.javarush.pashakolomiiets.md2Animals.Core.Setting;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Herbivor;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.HerbivorClass;

public class Rabbit extends HerbivorClass implements Herbivor {
    public Rabbit() {
        super(2, 2, 0.45);
    }

    public static int maxOnCell = Setting.rabbitMaxOnCell;

    public static int getMaxOnCell() {
        return maxOnCell;
    }

}
