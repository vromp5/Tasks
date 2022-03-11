package module1.branching;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a value for the variable x: ");
        double x = scanner.nextDouble();
        double y;
        if (x <= 3) {
            y = Math.pow(x, 2) - (3 * x) + 9;
        }
        else {
            y = 1/(Math.pow(x, 3)+6);
        }
        System.out.println('\n');
        System.out.println("The value you have entered for x is: " + x + '.');
        System.out.println("The result of the expression is: " + y + '.');
    }
}
