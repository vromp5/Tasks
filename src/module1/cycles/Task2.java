package module1.cycles;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        System.out.println();
        for (int i = a; i < b; i = i + h){
            if (i > 2) {
                System.out.println(i);
            }
            else {
                System.out.println(-i);
            }
        }
    }
}
