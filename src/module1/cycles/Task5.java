package module1.cycles;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a value for variable e: ");
        float e = scanner.nextFloat(); // is the upper limit of the function
        int n = 1;
        float x = calcNumber(1);
        float sum = 0;
        while(e <= Math.abs(x)){
            sum += x;
            n++;
            System.out.println("x is " + x);
            x= calcNumber(n);
        }
        System.out.println("The sum of the results is: " + sum);
    }

    private static float calcNumber(int n) {
        return (float) (1/ Math.pow(2, n) + 1 / Math.pow(3, n));
    }
}
// user inputs e; this is a logorithmic equation
// main while loop
// function calcNumber(int $n): float
//{
//  return 1 / pow(2, $n) + 1 / pow(3, $n);
//}
//
//function getResult(float $e): float
//{
//  $n = 1;
//  $x = calcNumber($n);
//  $sum = 0;
//  while ($e <= abs($x)) {
//    $sum += $x;
//    $n++;
//    $x = calcNumber($n);
//  }