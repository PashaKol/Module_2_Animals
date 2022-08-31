package ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Predators;

import ua.com.javarush.pashakolomiiets.md2Animals.Core.Setting;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Predator;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.PredatorClass;

public class Fox extends PredatorClass implements Predator {

    public Fox() {
        super(8, 2, 2 , 8);
    }
    public static int maxOnCell = Setting.foxMaxOnCell;

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}
