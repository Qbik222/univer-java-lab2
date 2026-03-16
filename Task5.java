import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.print("Enter the first number: ");
            double a = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double b = scanner.nextDouble();

            double result = a * b;
            System.out.println("Multiplication result: " + result);

            System.out.print("Enter 1 to exit, or any other number to continue: ");
            choice = scanner.nextInt();

        } while (choice != 1);

        scanner.close();
    }
}

