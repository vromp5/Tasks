package module1.branching;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a value for the first angle (x): ");
        double x = scanner.nextDouble();
        System.out.println("Please enter a value for the second angle (y): ");
        double y = scanner.nextDouble();
        double z = 180 - (x + y);
        double total = x + y + z;
        System.out.print('\n');
        if (total == 180 && !(x <= 0 || y <= 0 || z <= 0 || x + y >= 180)) {
            System.out.println("This is a real triangle.");
            if (x == 90 || y == 90 || z == 90) {
                System.out.println("This is also a right triangle.");
            }
        } else {
            System.out.println("This is not a real triangle.");
        }
    }
}
