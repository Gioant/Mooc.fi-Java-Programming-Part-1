
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        System.out.println("Give the first number:");
        int x = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int y = Integer.valueOf(scanner.nextLine());
        
        int sum = x + y;
        int sub = x - y;
        int product = x * y;
        double quotient = (double) x / y;
        
        System.out.println(x + " + " + y + " = " + sum);
        System.out.println(x + " - " + y + " = " + sub);
        System.out.println(x + " * " + y + " = " + product);
        System.out.println(x + " / " + y + " = " + quotient);
        
    }
}
