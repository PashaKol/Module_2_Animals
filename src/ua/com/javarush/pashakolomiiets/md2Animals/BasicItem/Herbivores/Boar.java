package ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Herbivores;

import ua.com.javarush.pashakolomiiets.md2Animals.Core.Setting;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Herbivor;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.HerbivorClass;

public class Boar extends HerbivorClass implements Herbivor {

    public Boar() {
        super(400, 2, 50);
    }
  public static int maxOnCell = Setting.boarMaxOnCell;

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}
