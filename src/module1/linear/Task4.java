package module1.linear;

import java.util.Scanner;
// Linear task 4; число R вида nnn.ddd --> ddd.nnn
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a six digit number, in a format such as nnn.ddd: ");
        double nnnddd = scanner.nextDouble();
        double ddd = (nnnddd - (int)nnnddd) * 1000;
        double nnn = nnnddd / 1000;
        nnn = (int)(nnn * 1000); // to get rid of potential rounding w numbers such as (234.567)
        double n2 = nnn/1000;
        double dddnnn = ddd + n2;
        dddnnn = Double.parseDouble(String.format("%.3f", dddnnn));  // smal error with some numbers (234.567)
        System.out.println("\n");
        System.out.println("When the whole number and the fraction are reversed " +
                "(nnn.ddd --> ddd.nnn) the result is: " + "\n" + dddnnn);
    }
}
