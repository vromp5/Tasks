package module1.linear;

import java.util.Scanner;
// Linear task 1
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number for variable a: ");
        double a = scanner.nextFloat();
        System.out.println("Please enter a number for variable b: ");
        double b = scanner.nextFloat();
        System.out.println("Please enter a number for variable c: ");
        double c = scanner.nextFloat();
        double z = ( (a - 3 ) * b / 2) + c;
        System.out.println("The result of the expression is: " + z);
    }
}
