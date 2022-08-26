package ua.com.javarush.pashakolomiiets.md2Animals;

import ua.com.javarush.pashakolomiiets.md2Animals.Core.PrintStatictic;
import ua.com.javarush.pashakolomiiets.md2Animals.Core.Setting;
import ua.com.javarush.pashakolomiiets.md2Animals.Core.SimulateLife;
import ua.com.javarush.pashakolomiiets.md2Animals.Island.Island;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Setting settings = new Setting();
        Island island = new Island();
        PrintStatictic prs = new PrintStatictic(island.getIsland());
        SimulateLife simLife = new SimulateLife(island.getIsland());
        ScheduledExecutorService sesStatictic = Executors.newScheduledThreadPool(1);
        ScheduledExecutorService sesSimulateLife = Executors.newScheduledThreadPool(10);
        ScheduledFuture<?> sF = sesStatictic.scheduleAtFixedRate(prs, 0, 3, TimeUnit.SECONDS);
        ScheduledFuture<?> simulateLife = sesSimulateLife.scheduleAtFixedRate(simLife, 1, 1, TimeUnit.SECONDS);

        int iter = 0;
        while (true) {
            try {
                Thread.sleep(3000);
                iter++;
                if (iter > 1000) {
                    System.out.println("Конец итерациям!");
                    sF.cancel(true);
                    simulateLife.cancel(true);
                    sesStatictic.shutdown();
                    sesSimulateLife.shutdown();
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    }

