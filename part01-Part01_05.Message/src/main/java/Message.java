
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //write program here
        
        System.out.println("Write a message:");
        // output following text written inside the parentheses
        
        String words = scanner.nextLine();
        /* create a data type for text called String (in java language). 
           store it inside a variable called words.
           scan for user input and go to next line.
        */
        
        System.out.println(words);
       // Output the stored value in words.

    }
}
