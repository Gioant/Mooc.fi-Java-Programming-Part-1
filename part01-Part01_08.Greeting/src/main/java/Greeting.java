
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program below
        
        System.out.println("What's your name?");
        // Ask user for their name
        
        String name = scanner.nextLine();
        // Scan & store their answer in a variable called name.
        
        System.out.println("Hi " + name);
        // output a static "Hi" and the answer they gave before.
    }
}
