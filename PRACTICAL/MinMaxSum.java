
        import java.util.Scanner;
public class MinMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long[] arr = new long[5];
        long sum = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextLong();
            sum += arr[i];
        }
        long min = arr[0];
        long max = arr[0];

        for (int i = 1; i < 5; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println((sum - max) + " " + (sum - min));

    }
}
   