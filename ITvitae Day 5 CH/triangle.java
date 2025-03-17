// Day 5 2/2

import java.util.Scanner;

public class triangle {
    
    public static void main(String[] args) {
          
        double triangleBase;
        double triangleHeight;
        double triangleSize;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the Base of the Triangle?");
        triangleBase = scanner.nextDouble();
        System.out.println("And what is the Height of the Triangle?");
        triangleHeight = scanner.nextDouble();
        
        triangleSize = triangleBase * triangleHeight / 2;

        System.out.println("The size of the Triangle is: " + triangleSize );
    }
}
