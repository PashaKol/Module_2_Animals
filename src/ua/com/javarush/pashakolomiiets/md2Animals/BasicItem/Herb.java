package ua.com.javarush.pashakolomiiets.md2Animals.BasicItem;

import ua.com.javarush.pashakolomiiets.md2Animals.Core.Setting;

public class Herb {

    private int weight;

    public Herb(int weight) {
        this.weight = 1;
    }

    public static int maxOnCell = Setting.herbsMaxOnCell;

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}

