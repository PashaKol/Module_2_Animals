package ua.com.javarush.pashakolomiiets.md2Animals.BasicItem;

import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Animal;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Herbivor;

public class HerbivorClass extends Animal implements Herbivor {


    public HerbivorClass(double weight, int speed, double satiety) {
        super(weight, speed, satiety);
    }


}
