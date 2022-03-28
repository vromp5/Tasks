package module1.cycles;

public class Task3 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            i++;
            sum = (int)Math.pow(i, 2) + sum;
        }
        System.out.println("The sum of the first 100 natural numbers' squares is: " + sum);
    }
}
