import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.print("Введіть перше число: ");
            double a = scanner.nextDouble();

            System.out.print("Введіть друге число: ");
            double b = scanner.nextDouble();

            double result = a * b;
            System.out.println("Результат множення: " + result);

            System.out.print("Для виходу введіть 1, для продовження — інше число: ");
            choice = scanner.nextInt();

        } while (choice != 1);

        scanner.close();
    }
}

