
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int answer = Integer.valueOf(scan.nextLine());
        
        double tax1 = (100 + (answer - 5000) * 0.08);
        double tax2 = (1700 + (answer - 25000) * 0.10);
        double tax3 = (4700 + (answer - 55000) * 0.12);
        double tax4 = (22100 + (answer - 200000) * 0.15);
        double tax5 = (142100 + (answer - 1000000) * 0.17);
        
        if (answer < 5000) {
            System.out.println("No tax!");
        } else if (answer >= 5000 && answer < 25000) {
            System.out.println("Tax: " + tax1);
        } else if (answer >= 25000 && answer < 55000) {
            System.out.println("Tax: " + tax2);
        } else if (answer >= 55000 && answer < 200000) {
            System.out.println("Tax: " + tax3);
        } else if (answer >= 200000 && answer < 1000000) {
            System.out.println("Tax: " + tax4);
        } else if (answer >= 1000000) {
            System.out.println("Tax: " + tax5);
        }
    }
}
