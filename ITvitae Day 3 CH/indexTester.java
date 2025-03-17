// The fixed program

import java.util.Scanner;

public class indexTester {

    public static void main(String[] args) {

        System.out.println("What kind of thing are we talking about?");
        Scanner input = new Scanner(System.in);
        
        String thing = input.next(); 


        System.out.println("How would you describe it? Big? Azure? Tattered?");
        String describe = input.next(); 

        String doom = "of Doom";
        String number = "3000"; 


        System.out.println("The " + describe + " " + thing + " of " + doom + " " + 3000 + "!");
    }

}

