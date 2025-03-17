// Day 11 1/2

import java.util.Scanner;

public class index {

    public static void main(String[] args) {

        int item;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("The items you can get at this shop are:");
        System.out.println("-----------");
        System.out.println("1 = Rope");
        System.out.println("2 = Torches");
        System.out.println("3 = Climbing Equipment");
        System.out.println("4 = Clean Water");
        System.out.println("5 = Machete");
        System.out.println("6 = Canoe");
        System.out.println("7 = Food Supplies");
        System.out.println("-----------");
        System.out.println("Of what item do you wanna see the price?");
        item = scanner.nextInt();

        switch (item) {
            case 1:
            System.out.println("Rope is 10 Gold pieces");
                break;
            case 2:
            System.out.println("Torches are 15 Gold pieces");
                break;
            case 3:
            System.out.println("Climbing Equipment is 25 Gold pieces");
                break;
            case 4:
            System.out.println("Clean Water is 1 Gold piece");
                break;
            case 5:
            System.out.println("A Machete is 20 Gold pieces");
                break;
            case 6:
            System.out.println("A Canoe is a whopping 200 Gold pieces");
                break;
            case 7:    
            System.out.println("Food Supllies are 1 Gold piece");
                break;
            default:
            System.out.println("We don't have that in our Shop");
        }
    }
}

