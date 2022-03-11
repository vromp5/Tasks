package module1.branching;

import java.util.Scanner;
// how can I replace all floats w doubles and similar operations? How can I search & fix names of all identifiers?
// write to methods max & min; they should return their respective values
public class Task2 {
    public static void main(String[] args) { // main is the entry point for any program
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value for variable a");
        double a = scanner.nextDouble();
        System.out.println("Please enter the value for variable b");
        double b = scanner.nextDouble();
        System.out.println("Please enter the value for variable c");
        double c = scanner.nextDouble();
        System.out.println("Please enter the value for variable d");
        double d = scanner.nextDouble();
        double result = max(min(a, b),min(c, d));
        System.out.println('\n');
        System.out.println("The max of the two min methods is: " + result + " .");
    }
    // write down the name of that ":" operator
    public static double min(double a, double b) { // doesn't matter what variable is here
        return a > b ? b : a; // the method is already established and can be used with any variables
    }

    public static double max(double c, double d) {
        return c > d ? c : d;
    }
}
