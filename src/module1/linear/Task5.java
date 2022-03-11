package module1.linear;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the total amount of seconds you would like to convert: ");
        int seconds = scanner.nextInt();
        int minutes = (seconds/60);
        int minutes2 = (seconds/60)%60;
        int hours = minutes/60;
        int seconds2 = seconds%60;
        System.out.println(seconds + " seconds equals to: \n" + hours +
                " hours, " + minutes2 + " minutes, " + seconds2 + " seconds.");
    }
}
