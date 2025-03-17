// Day 13 CH

import java.util.Scanner;

public class index {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int number = 1;

        for (;number <= 100; number++) {

            if (number % 5 == 0 && number % 3 == 0) {
               System.out.println(ANSI_CYAN + "" + number + " Eletric and Fire");
            } else if (number % 5 == 0) {
               System.out.println(ANSI_YELLOW + "" + number + " Eletric");
            } else if (number % 3 == 0) {
                System.out.println(ANSI_RED + "" + number + " Fire");
            } else {
                System.out.println(ANSI_RESET + number + " Normal");
            }

        }
    }
}

/* Ik heb hier wederom gebruik gemaakt van een guide online, nadat ik er niet uitkwam hoe dit precies uitgeschreven moest worden. */
