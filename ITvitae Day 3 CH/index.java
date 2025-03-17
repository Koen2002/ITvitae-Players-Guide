// The bugged program

import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        System.out.println("What kind of thing are we talking about?");
Scanner input = new Scanner(System.in);
String a = input.next(); // a Stores the input of "What kind of thing are we talking about?"
System.out.println("How would you describe it? Big? Azure? Tattered?");
String b = input.next(); // b Stores the input of "How ould you describe it? Big? Azure? Tattered?"
String c = "of Doom"; // c Stores "of Doom"
String d = "3000"; /* d Stores "3000" */ 
System.out.println("The " + b + " " + a + " of " + c + " " + d + "!");
    }

}

/* What else could you do to make this code understandable? 
   Try to get some space betweeen lines. 
   This way its more clear how the code works. */ 


