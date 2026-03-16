import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть додатнє число N: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Число має бути додатнім.");
            scanner.close();
            return;
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Сума чисел від 1 до " + n + " дорівнює " + sum);

        scanner.close();
    }
}

