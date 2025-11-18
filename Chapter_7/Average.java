import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int n = s.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " positive integers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            array[i] = s.nextInt();
        }
        System.out.println("\nOutput: " + countGreater(array));
    }

    public static int countGreater(int[] array) {
        if (array.length <= 1) return 0;
        int c = 0;
        double sum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > sum / i) c++;
            sum += array[i];
        }
        return c;
    }
}
