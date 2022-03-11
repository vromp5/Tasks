package module1.linear;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Please enter a value for the x coordinate: ");
        float x = scanner.nextFloat();
        System.out.println("Please enter a value for the y coordiate: ");
        float y = scanner.nextFloat();
        System.out.println('\n');
        if (x < 4 && x > -4 && y < 4 && y > -3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
