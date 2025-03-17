// Day 6 

import java.util.Scanner;

public class Index {

    public static void main(String[] args) {

        int chocolateEggs;
        int sisters;
        int duckBear;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many Chocolate Eggs have been collected today?");
        chocolateEggs = scanner.nextInt();
        
        sisters = chocolateEggs / 4;
        duckBear = chocolateEggs % 4;

        System.out.println("Sisters got each " + sisters + " Chocolate Eggs!");
        System.out.println("The duckbear got the remaining " + duckBear + " Chocolate Eggs!");
    }
}

/* Ik kom er niet helemaal uit bij de laatste opdracht van deze Challenge, maar ik weet in ieder geval dat bij 6 en 7 Chocolate Eggs de Duckbear meer krijgt dan de Sisters*/