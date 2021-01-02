
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        System.out.println(first + " + " + second + " = " + (first + second));
        // output values in variables called first & second
        // the + and = without quotation marks just appends next to the variables.
        // finally, in the parenthesis output the total from the variables first + second.
    }
}
