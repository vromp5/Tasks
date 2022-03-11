package module1.branching;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the width(A) of the opening: ");
        double A = scanner.nextDouble();
        System.out.println("Please enter the length(B) of the opening: ");
        double B = scanner.nextDouble();
        System.out.println("Please enter the width(x) of the brick: ");
        double x = scanner.nextDouble();
        System.out.println("Please enter the length(y) of the brick: ");
        double y = scanner.nextDouble();
        System.out.println("Please enter the height(z) of the brick: ");
        double z = scanner.nextDouble();
        System.out.println("\n");
        if ((x < A || x < B) && (z < A || z < B)) {
            System.out.println("Your brick will fit through the opening.");
        } else if ((x < A || x < B) && (y < A || y < B)) {
            System.out.println("Your brick will fit through the opening.");
        } else if ((z < A || z < B) && (y < A || y < B)) {
            System.out.println("Your brick will fit through the opening.");
        }
        else {
            System.out.println("Your brick will not fit through the opening.");
        }
    }
}
