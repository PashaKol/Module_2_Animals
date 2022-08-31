package ua.com.javarush.pashakolomiiets.md2Animals.Island;

import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Animal;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Herb;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Herbivor;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Herbivores.*;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Predator;
import ua.com.javarush.pashakolomiiets.md2Animals.BasicItem.Predators.*;
import ua.com.javarush.pashakolomiiets.md2Animals.Core.FaunaMovement;
import ua.com.javarush.pashakolomiiets.md2Animals.Core.GeneratorFauna;
import ua.com.javarush.pashakolomiiets.md2Animals.Core.Setting;

import java.util.List;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

import static ua.com.javarush.pashakolomiiets.md2Animals.Core.ScanClasses.herbivoresClasses;
import static ua.com.javarush.pashakolomiiets.md2Animals.Core.ScanClasses.predatorsClasses;

public class Cell {

    GeneratorFauna generatorFauna = new GeneratorFauna();

    FaunaMovement faunaMovement = new FaunaMovement();


    private final List<Animal> predators = generatorFauna.generateFauna(predatorsClasses);

    private final List<Animal> herbivors = generatorFauna.generateFauna(herbivoresClasses);

    private final List<Herb> herbs = new CopyOnWriteArrayList<>();


    public Cell() {
        generateHerbs();
    }

    private void generateHerbs() {
        int countCreate = ThreadLocalRandom.current().nextInt(1, Herb.getMaxOnCell());
        for (int k = 0; k <= countCreate; k++) {
            herbs.add(new Herb());
        }
    }

    public void addHerb() {
        if (this.herbs.size() < Setting.herbsMaxOnCell) {
            int diff = Setting.herbsMaxOnCell - this.herbs.size();
            int getIntCalculate = ThreadLocalRandom.current().nextInt(0, diff);
            for (int i = 0; i < getIntCalculate; i++) {
                this.herbs.add(new Herb());
            }
        }
    }

    public void addAnimal(Animal animal) {
        if (animal instanceof Predator) {
            predators.add(animal);
        } else if (animal instanceof Herbivor) {
            herbivors.add(animal);
        }
    }

    public long countHerbs() {
        return herbs.size();
    }

    public long countPredators() {
        return predators.size();
    }

    public long countHerbivores() {
        return herbivors.size();
    }

    public String countEachPredator() {
        StringBuilder st = new StringBuilder();
        int wolf = predators.stream().filter(entity -> entity instanceof Wolf).toList().size();
        int snake = predators.stream().filter(entity -> entity instanceof Snake).toList().size();
        int fox = predators.stream().filter(entity -> entity instanceof Fox).toList().size();
        int bear = predators.stream().filter(entity -> entity instanceof Bear).toList().size();
        int eagle = predators.stream().filter(entity -> entity instanceof Eagle).toList().size();
        st.append("Волков:").append(wolf)
                .append(" Змей: ").append(snake)
                .append(" Лис:").append(fox)
                .append(" Медведь:").append(bear)
                .append(" Орел:").append(eagle);

        return String.valueOf(st);
    }

    public String countEachHerbivore() {
        int horse = herbivors.stream().filter(entity -> entity instanceof Horse).toList().size();
        int deer = herbivors.stream().filter(entity -> entity instanceof Deer).toList().size();
        int rabbit = herbivors.stream().filter(entity -> entity instanceof Rabbit).toList().size();
        int hamster = herbivors.stream().filter(entity -> entity instanceof Mouse).toList().size();
        int goat = herbivors.stream().filter(entity -> entity instanceof Goat).toList().size();
        int sheep = herbivors.stream().filter(entity -> entity instanceof Sheep).toList().size();
        int boar = herbivors.stream().filter(entity -> entity instanceof Boar).toList().size();
        int cow = herbivors.stream().filter(entity -> entity instanceof Buffalo).toList().size();
        int duck = herbivors.stream().filter(entity -> entity instanceof Duck).toList().size();
        int caterpillar = herbivors.stream().filter(entity -> entity instanceof Caterpillar).toList().size();
        StringBuilder st = new StringBuilder();
        st.append("Лошадей:").append(horse)
                .append(" Оленей: ").append(deer)
                .append(" Зайцев:").append(rabbit)
                .append(" Мышей:").append(hamster)
                .append(" Коз:").append(goat)
                .append(" Овец:").append(sheep)
                .append(" Кабанов:").append(boar)
                .append(" Коров:").append(cow)
                .append(" Уток:").append(duck)
                .append(" Гуcениц:").append(caterpillar);
        return String.valueOf(st);
    }

    public void tryToReproduction() {
        generatorFauna.reproductionFauna(predatorsClasses, predators);
        generatorFauna.reproductionFauna(herbivoresClasses, herbivors);
    }

    public void decreaseSatiety() {
        for (Animal predator : predators) {
            if (predator.getStarvingTime() <= 0) {
                predators.remove(predator);
            } else {
                predator.decreaseSatiety();
            }
        }
        for (Animal herbivore : herbivors) {
            if (herbivore.getStarvingTime() <= 0) {
                herbivors.remove(herbivore);
            } else {
                herbivore.decreaseSatiety();
            }
        }
    }

    public void tryToEat() {
        try {
            for (Animal predator : predators) {
                predator.eat(herbivors, predators);
            }
            for (Animal herbivore : herbivors) {
                herbivore.eat(herbs, herbivors);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void tryToMove(int positionY, int positionX) {
        Cell[][] island = Island.getStaticIsland();
        faunaMovement.movingFaunaInCells(predators, island, positionY, positionX);
        faunaMovement.movingFaunaInCells(herbivors, island, positionY, positionX);
    }

}