package ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Predators;

import ua.com.javarush.pashakolomiiets.md2Animals.Core.Setting;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Predator;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.PredatorClass;

public class Wolf extends PredatorClass implements Predator {

    public Wolf() {
        super(50,3, 8);
    }

    public static int maxOnCell = Setting.wolfMaxOnCell;

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}
