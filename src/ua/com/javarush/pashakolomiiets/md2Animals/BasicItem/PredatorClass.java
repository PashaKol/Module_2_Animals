package ua.com.javarush.pashakolomiiets.md2Animals.BasicItem;

import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Animal;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Predator;
import ua.com.javarush.pashakolomiiets.md2Animals.Core.Setting;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class PredatorClass  extends Animal implements Predator {

    public PredatorClass(double weight, int speed, double satiety, int starvingTime) {
        super(weight, speed, satiety, starvingTime);
    }

    @Override
    public void eat(List<?> listOfFood, List<?> listOfFood1) {
        try {

            int eatChance = ThreadLocalRandom.current().nextInt(0, 100);
            Map<String, Integer> mapOfChanceHunt = null;
            List<String> listOfHunts = null;
            String animalToEat;
            int listOfHuntsId;

            if (this.getStarvingTime() == 0) {

                if (this.getClass().getSimpleName().equals("Wolf")) {
                    mapOfChanceHunt = Setting.wolfMap;
                } else if (this.getClass().getSimpleName().equals("Snake")) {
                    mapOfChanceHunt = Setting.snakeMap;
                } else if (this.getClass().getSimpleName().equals("Fox")) {
                    mapOfChanceHunt = Setting.foxMap;
                } else if (this.getClass().getSimpleName().equals("Bear")) {
                    mapOfChanceHunt = Setting.bearMap;
                } else if (this.getClass().getSimpleName().equals("Eagle")) {
                    mapOfChanceHunt = Setting.eagleMap;
                }


                if (mapOfChanceHunt != null) {
                    listOfHunts = mapOfChanceHunt.entrySet().stream()
                            .filter(entry -> eatChance <= entry.getValue())
                            .map(Map.Entry::getKey)
                            .collect(Collectors.toList());

                }

                if (listOfHunts != null && listOfHunts.size() > 0) {

                    listOfHuntsId = ThreadLocalRandom.current().nextInt(0, listOfHunts.size());
                    animalToEat = listOfHunts.get(listOfHuntsId);

                    for (Object herbivore : listOfFood) {
                        Animal herbivore1 = (Animal) herbivore;
                        if (animalToEat.equals(herbivore1.getClass().getSimpleName())) {
                            listOfFood.remove(herbivore);
                        } else {
                            for (Object predator : listOfFood1) {
                                Animal predator1 = (Animal) predator;
                                if (animalToEat.equals(predator1.getClass().getSimpleName())) {
                                    listOfFood1.remove(predator);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
