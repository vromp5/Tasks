package module1.branching; // this program needs to see if the 3 points lie on the same line

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value for x1 coordinate: ");
        double x1 = scanner.nextDouble();
        System.out.println("Please enter the value for y1 coordinate: ");
        double y1 = scanner.nextDouble();
        System.out.println("Please enter the value for x2 coordinate: ");
        double x2 = scanner.nextDouble();
        System.out.println("Please enter the value for y2 coordinate: ");
        double y2 = scanner.nextDouble();
        System.out.println("Please enter the value for x3 coordinate: ");
        double x3 = scanner.nextDouble();
        System.out.println("Please enter the value for y3 coordinate: ");
        double y3 = scanner.nextDouble();
        double slope1 = slope(y1, y2, x1, x2);
        double slope2 = slope(y2, y3, x2, x3);
        double slope3 = slope(y3, y1, x3, x1);
        double pointSlopeLeft1 = pointSlopeLeft(y1, y2);
        double pointSlopeLeft2 = pointSlopeLeft(y2, y3);
        double pointSlopeLeft3 = pointSlopeLeft(y3, y1);
        double pointSlopeRight1 = pointSlopeRight(slope1, x1, x2);
        double pointSlopeRight2 = pointSlopeRight(slope2, x2, x3);
        double pointSlopeRight3 = pointSlopeRight(slope3, x3, x1);
        System.out.println('\n');
        if (pointSlopeLeft1 == pointSlopeRight1 && pointSlopeLeft2 == pointSlopeRight2
                && pointSlopeLeft3 == pointSlopeRight3) {
            System.out.println("These three points are collinear");
        } else {
            System.out.println("These three points are NOT collinear.");
        }
    }

    public static double slope(double y1, double y2, double x1, double x2) {
        return (y1 - y2) / (x1 - x2);
    }

    public static double pointSlopeLeft(double y1, double y2) {
        return (y1 - y2);
    }

    public static double pointSlopeRight(double slope1, double x1, double x2) {
        return (slope1 * (x1 - x2));
    }
}
// what to do with 0 x coordinates?
// declare slope int method
// declare method for comparing all three points
// create logic & output for the results of the comparison (true/false/if)