// Day 10

import java.util.Scanner;

public class index {

    public static void main(String[] args) {

        int x;
        int y;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a X value!");
        x = scanner.nextInt();
        System.out.println("Give me a Y value!");
        y = scanner.nextInt();

        if (x < 0 && y > 0) {
            System.out.println("The enemy is to the north west!"); 
        }
        else if (x == 0 && y > 0) {
            System.out.println("The enemy is to the north!");
        }
        else if (x > 0 && y > 0) {
            System.out.println("The enemy is to the north east!");
        }
        else if (x < 0 && y == 0) {
            System.out.println("The enemy is to the west!");
        }
        else if (x == 0 && y == 0) {
            System.out.println("The enemy is HERE!!");
        }
        else if (x > 0 && y == 0) {
            System.out.println("The enemy is to the east!");
        }
        else if (x < 0 && y < 0) {
            System.out.println("The enemy is to the south west!");
        }
        else if (x == 0 && y < 0) {
            System.out.println("The enemy is to the south!");
        }
        else if (x > 0 && y < 0) {
            System.out.println("The enemy is to the south east");
        }

    }
}

/* Ik heb bij deze opgave gebruik gemaakt van de C# PLayers Guide waar ook de solutions bij staan.
 * Ik kon namelijk niet uitvogelen welke richting bij welke nummers hoorde.
 */