package ua.com.javarush.pashakolomiiets.md2Animals.Island;

import ua.com.javarush.pashakolomiiets.md2Animals.Core.Setting;

public class Island {

    private static final Cell[][] island = new Cell[Setting.maxY][Setting.maxX];

    public Island() {
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[i].length; j++) {
                island[i][j] = new Cell();
            }
        }
    }

    public Cell[][] getIsland() {
        return island;
    }

    public static Cell[][] getStaticIsland() {
        return island;
    }

}
