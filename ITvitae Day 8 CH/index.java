// Day 8

import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        
        int targetRow;
        int targetColumn;
        int one = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What Row are they attacking?");
        targetRow = scanner.nextInt();
        System.out.println("What Column are they attacking?");
        targetColumn = scanner.nextInt();

        System.out.println("Deploy squad at " + targetRow + "," + targetColumn + (- one));
        System.out.println("Deploy squad at " + targetRow + (- one) + "," + targetColumn);
        System.out.println("Deplay squad at " + targetRow + "," + targetColumn + (+ one));
        System.out.println("Deploy squad at " + targetRow + (+ one) + "," + targetColumn);
        
        /*  Deze equation zou in mijn ogen moeten lukken, Toch gaat er iets fout en ik kan niet uitvogelen wat het is.
         * Hierdoor loop ik ook vast voor de rest van de Challenge
         */
    }
}