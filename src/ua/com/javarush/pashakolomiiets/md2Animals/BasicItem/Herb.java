package ua.com.javarush.pashakolomiiets.md2Animals.BasicItem;

import ua.com.javarush.pashakolomiiets.md2Animals.Core.Setting;

public class Herb {

    private double weigh;
    private static int maxOnCell = Setting.herbsMaxOnCell;

    public Herb() {
        this.weigh = 1;
    }

    public static int getMaxOnCell() {
        return maxOnCell;
    }

}

