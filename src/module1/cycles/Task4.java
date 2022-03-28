package module1.cycles;

public class Task4 {
    public static void main(String[] args) {
        int i = 0;
        int j;
        while (i <= 200) {
            i++;
            j = (int) Math.pow(i, 2);
            System.out.println(j);
        }
    }
}
