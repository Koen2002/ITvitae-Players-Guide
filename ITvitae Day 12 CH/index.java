// Day 12 CH

import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        

        
        int number;
        int hunter;

        Scanner scanner = new Scanner(System.in);

        
        System.out.println("User 1, Give me a number between 0 and 100.");
        number = scanner.nextInt();
        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println("---------------");    
         
        do {

            System.out.println("User 2, Guess the number!");
            hunter = scanner.nextInt();

            if (number > hunter) {
                System.out.println("You guessed to low, try again!");
            } else if (number < hunter) {
                System.out.println("You guessed to high, try again!");
            }
    
        } 
        while (number < hunter || number > hunter);

        System.out.println("Nice!! You guessed the right number!");
        
    }

    
}

