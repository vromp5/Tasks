package module1.linear;

import java.util.Scanner;
// Linear task 2
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a value for a: ");
        double a = scanner.nextFloat();
        System.out.println("Please enter a value for b: ");
        double b = scanner.nextFloat();
        System.out.println("Please enter a value for c: ");
        double c = scanner.nextFloat();
        double numerator = (double) (b + (Math.sqrt(Math.pow(b, 2) + 4 * a * c)));
        double denominator = 2 * a;
        double theRest = Math.pow(a, 3) * c - Math.pow(b, -2);
        double total = numerator/denominator - theRest;
    }
}
