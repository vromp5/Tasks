package module1.linear;

import java.util.Scanner;

// Linear task 3
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number for variable x: ");
        double x = scanner.nextDouble();
        System.out.println("Please enter a number for variable y: ");
        double y = scanner.nextDouble();
        double numerator = Math.sin(x) + Math.cos(y);
        double denominator = Math.cos(y) - Math.sin(x);
        double result = numerator / denominator * Math.tan(x * y);
        System.out.println("The result of this expression is: " + result);
    }
}
