import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number N: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The number must be positive.");
            scanner.close();
            return;
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of numbers from 1 to " + n + " is " + sum);

        scanner.close();
    }
}

