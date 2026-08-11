import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            boolean isPrime = true;

            if (digit < 2) {
                isPrime = false;
            }

            for (int i = 2; i < digit; i++) {
                if (digit % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(digit + " ");
                sum = sum + digit;
            }

            n = n / 10;
        }

        System.out.println();
        System.out.println("Sum of prime numbers = " + sum);
    }
}