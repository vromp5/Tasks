package module1.cycles;

public class Task4 {
    public static void main(String[] args) {
        int i = 0;
        int j;
        int sum = 0;
        while (i <= 200) {
            i++;
            j = (int) Math.pow(i, 2);
            sum = j + sum;
            // use BigInteger
        }
        System.out.println(sum); // multiply the first 200 squares instead of printing them, print the result
    }
}
