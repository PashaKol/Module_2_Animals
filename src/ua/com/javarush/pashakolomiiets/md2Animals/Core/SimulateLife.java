package ua.com.javarush.pashakolomiiets.md2Animals.Core;

import ua.com.javarush.pashakolomiiets.md2Animals.Island.Cell;

public class SimulateLife implements Runnable {

    private int iterSimulate;
    private final Cell[][] objects;

    public SimulateLife(Cell[][] objects) {
        this.objects = objects;
    }

    @Override
    public void run() {
        for (int i = 0; i < objects.length; i++) {
            for (int j = 0; j < objects[i].length; j++) {

                tryDecreaseSatiety(objects[i][j]);

                tryToEat(objects[i][j]);

                tryToMove(objects[i][j], i, j);

                tryToReproduction(objects[i][j]);
            }
        }
        this.iterSimulate++;
    }

    public void tryDecreaseSatiety(Cell cell) {
        cell.decreaseSatiety();
    }

    public void tryToReproduction(Cell cell) {
        cell.tryToReproduction();
    }

    public synchronized void tryToEat(Cell cell) {
        cell.tryToEat();
    }

    public void tryToMove(Cell cell, int positionY, int positionX) {
        cell.tryToMove(positionY, positionX);
    }}