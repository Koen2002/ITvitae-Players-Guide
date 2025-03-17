// Day 7 

import java.util.Scanner; 

public class index {

    public static void main(String[] args) {
        
        int estate;
        int duchy; 
        int province;
        int Melik;
        int Casik;
        int Balik;
        

        Scanner scanner = new Scanner(System.in);

        // King Melik
        System.out.println("How many Estates does Melik have?");
        estate = scanner.nextInt();
        System.out.println("How many Duchies does Melik have?");
        duchy = scanner.nextInt();
        System.out.println("How many Provinces does Melik have?");
        province = scanner.nextInt();

        Melik = estate * 1 + duchy * 3 + province * 6;
        System.out.println("King Melik has a total points of " + Melik);

        
        // King Casik
        System.out.println("How many Estates does Casik have?");
        estate = scanner.nextInt();
        System.out.println("How many Duchies does Casik have?");
        duchy = scanner.nextInt();
        System.out.println("How many Provinces does Casik have?");
        province = scanner.nextInt();

        Casik = estate * 1 + duchy * 3 + province * 6;
        System.out.println("King Casik has a total points of " + Casik);

        
        // King Balik
        System.out.println("How many Estates does Balik have?");
        estate = scanner.nextInt();
        System.out.println("How many Duchies does Balik have?");
        duchy = scanner.nextInt();
        System.out.println("How many Provinces does Balik have?");
        province = scanner.nextInt();

        Balik = estate * 1 + duchy * 3 + province * 6;
        System.out.println("KIng Balik has a total points of " + Balik);


    }
}
/* Ik weet dat dit waarschijnlijk op een betere manier gecoded kan worden.
 Wist alleen niet uit te vinden hoe dan. */