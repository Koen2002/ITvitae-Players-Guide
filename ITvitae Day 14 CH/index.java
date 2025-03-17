// Day 14 CH

import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] arrayNumber;
        arrayNumber = new int[5];

        System.out.println("Give me Five numbers ");
        
        for (int i = 0; i < arrayNumber.length; i++) {
            int allNumbers = scanner.nextInt();
            System.out.println(allNumbers);
        }
        System.out.println(arrayNumber);
        }
}