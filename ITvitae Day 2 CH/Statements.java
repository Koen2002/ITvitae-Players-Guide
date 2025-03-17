// Day 2: 1/3

import java.util.Scanner;

class Different {

    public static void main(String[] args) {
        System.out.println("Say something else the Hello World.");
    }
}

// Day 2: 2/3
public class Statements {

    public static void main(String[] args) {
        System.out.println("A");
        System.out.println("program");
        System.out.println("can");
        System.out.println("contain");
        System.out.println("unlimited");
        System.out.println("statements");
    }
}

// Day 2: 3/3
class takeNoteNames {
    public static void main(String[] args) {
       Scanner person = new Scanner(System.in);

       System.out.println("Bread is ready.");

       System.out.println("Hello Customer. May I know your name?");
       String name = person.nextLine();

       System.out.println("Noted: " + name + " got bread." );
    }
}
