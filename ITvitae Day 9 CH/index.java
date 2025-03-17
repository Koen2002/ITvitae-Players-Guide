// Day 9 

import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        
        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number");
        number = scanner.nextInt();

        if (number % 2 == 0) {
           System.out.println("TICK");
        } else {
            System.out.println("TOCK");
        }
    }
}