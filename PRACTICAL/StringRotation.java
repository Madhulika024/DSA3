import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(str.charAt(j));
            }
            for (int j = 0; j < i; j++) {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}