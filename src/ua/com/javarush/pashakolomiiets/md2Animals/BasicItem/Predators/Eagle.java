package ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Predators;

import ua.com.javarush.pashakolomiiets.md2Animals.Core.Setting;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Predator;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.PredatorClass;

public class Eagle  extends PredatorClass implements Predator {
    public Eagle(double weight, int speed, int satiety) {
        super(6, 3, 1 , 6);
    }
    public static int maxOnCell = Setting.eagleMaxOnCell;

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}
