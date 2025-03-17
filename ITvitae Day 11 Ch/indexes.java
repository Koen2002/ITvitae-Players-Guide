// Day 11 2/2

import java.util.Scanner;

public class indexes {

    public static void main(String[] args) {

        int item;
        int price;
        String myName = "Koen";
        String name;
        int rope = 10;
        int torches = 14;
        int climbingEquipment = 24;
        int cleanWater = 2;
        int machete = 20;
        int canoe = 200;
        int foodSupplies = 2;
        
        
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
        System.out.println("Can you give me your name? You might strike yourself a good deal!");
        name = scanner.nextLine();
        System.out.println("Of what item do you wanna see the price?");
        item = scanner.nextInt();

        switch (item) {
            case 1: 
            // System.out.println(name.equals(myName));
            if (name.equals("Koen")){
                System.out.println("Nice you got a 50% discount");
                price = rope / 2;
                System.out.println("Rope is " + price + " Gold pieces"); 
            } else {
                 System.out.println("Sadly you didn't get a discount"); 
                 System.out.println("Rope is 10 Gold pieces");
            }  
                break;
            case 2:
            if (name.equals("Koen")){
                System.out.println("Nice you got a 50% discount");
                price = torches / 2;
                System.out.println("Torches are now " + price + " Gold pieces"); 
            } else {
                 System.out.println("Sadly you didn't get a discount"); 
                 System.out.println("Torches are 14 Gold pieces");
            } 
            
                break;
            case 3:
            if (name.equals("Koen")){
                System.out.println("Nice you got a 50% discount");
                price = climbingEquipment / 2;
                System.out.println("Climbing Equipment is now " + price + " Gold pieces"); 
            } else {
                 System.out.println("Sadly you didn't get a discount"); 
                 System.out.println("Climbing Equipment is 24 Gold pieces");
            } 
            
                break;
            case 4:
            if (name.equals("Koen")){
                System.out.println("Nice you got a 50% discount");
                price = cleanWater / 2;
                System.out.println("Clean Water is now " + price + " Gold pieces"); 
            } else {
                 System.out.println("Sadly you didn't get a discount"); 
                 System.out.println("Clean Water is 2 Gold piece");
            } 
            
                break;
            case 5:
            if (name.equals("Koen")){
                System.out.println("Nice you got a 50% discount");
                price = machete / 2;
                System.out.println("Machete is now" + price + " Gold pieces"); 
            } else {
                 System.out.println("Sadly you didn't get a discount"); 
                 System.out.println("A Machete is 20 Gold pieces");
            } 
            
                break;
            case 6:
            if (name.equals("Koen")){
                System.out.println("Nice you got a 50% discount");
                price = canoe / 2;
                System.out.println("The Canoe is now " + price + " Gold pieces"); 
            } else {
                 System.out.println("Sadly you didn't get a discount"); 
                 System.out.println("A Canoe is a whopping 200 Gold pieces");
            } 
            
                break;
            case 7:  
            if (name.equals("Koen")){
                System.out.println("Nice you got a 50% discount");
                price = foodSupplies / 2;
                System.out.println("Food Supllies are now " + price + " Gold pieces"); 
            } else {
                 System.out.println("Sadly you didn't get a discount"); 
                 System.out.println("Food Supllies are 2 Gold piece");
            }   
            
                break;
            default:
            System.out.println("We don't have that in our Shop");
        }
    

       
    }
}

/* Ik heb bij deze opdracht lang lopen struggelen met de if statement en hoe deze hier juist te gebruiken.
 * In het begin probeerde ik met == de juiste logica te krijgen om de discount toe te passen.
 * Helaas werkte dit niet, toen heb ik hulp in geschakeld van mijn oude programmeer docent.
 * Die heeft mij haarfijn uitgelegd dat je dus met text in een if statement niet == moet gebruiken,
 * maar gebruik moet maken van 'equals'.
 * Dit te hebben toegepast aan mijn code is het me eindelijk gelukt om deze code juist te laten runnen.
 * Deze opdracht is de eerste opdracht waar ik een stuk langer op vast zat vergeleken met de rest.
 */