package Game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {

        Simulation simulation = new Simulation();

        // U1 LOADING


        ArrayList<Item> itemsPhase1 = simulation.loadItems("phase-1.txt");
        ArrayList<Item> itemsPhase2 = simulation.loadItems("phase-2.txt");

            //PHASE 2

        System.out.println("\nPHASE 1");

        ArrayList<Rocket> U1P1_fleet = simulation.loadU1(itemsPhase1);
        simulation.runSimulation(U1P1_fleet);

        System.out.println("\nPHASE 2");

        ArrayList<Rocket> U1P2_fleet = simulation.loadU1(itemsPhase2);
        simulation.runSimulation(U1P2_fleet);

        // U2 LOADING
        System.out.println("\nPHASE 1");

            //PHASE 1
        ArrayList<Rocket> U2P1_fleet = simulation.loadU2(itemsPhase1);
        simulation.runSimulation(U2P1_fleet);

        System.out.println("\nPHASE 2");

            //PHASE 2
        ArrayList<Rocket> U2P2_fleet = simulation.loadU2(itemsPhase2);
        simulation.runSimulation(U2P2_fleet);


    }

}