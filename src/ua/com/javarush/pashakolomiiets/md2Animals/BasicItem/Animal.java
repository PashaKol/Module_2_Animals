package ua.com.javarush.pashakolomiiets.md2Animals.BasicItem;

public  abstract class Animal {
    private  double weight;
    private int speed;
    private double maxSatiety;
    private double satiety;
    private int maxNumberInCage;



    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public double getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public double getMaxSatiety() {
        return maxSatiety;
    }

    public double getSatiety() {
        return satiety;
    }

    public int getMaxNumberInCage() {
        return maxNumberInCage;
    }

    public Animal(double weight, int speed, double satiety) {
        this.weight = weight;
        this.speed = speed;
        this.satiety = satiety;
    }
}
