package module1.cycles;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive number: ");
        int j = scanner.nextInt();
        while (i < j) {
            i++;
            sum = sum + i;
        }
        System.out.println("The sum of all the numbers from 1 to " + j + " equals to " + sum);
    }
}
