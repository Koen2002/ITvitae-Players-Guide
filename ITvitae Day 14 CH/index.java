// Day 14 CH

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Creating two arrays of length 5
        int[] numbers1 = new int[5];
        int[] numbers2 = new int[5];

        // Asking the user for five numbers for the first array
        System.out.println("Enter 5 numbers for the first array:");
        for (int i = 0; i < numbers1.length; i++) {
            numbers1[i] = scanner.nextInt();
        }

        // Copying values from the first array to the second array
        for (int i = 0; i < numbers1.length; i++) {
            numbers2[i] = numbers1[i];
        }

        // Closing the scanner
        scanner.close();

        // Printing the first array values
        System.out.println("First array elements:");
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }

        // Printing the second array values
        System.out.println("Second array elements (copied from first array):");
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }
    }
}
/* Ik kwam er niet uit bij deze opdracht.
Mijn vader kwam met het idee om is een keer gebruik te maken van chatGPT.
Deze hele code is dus heschreven door chatGPT.*/ 