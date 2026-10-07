import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір ромба (непарне число): ");
        int n = scanner.nextInt();

        // Робимо n непарним, якщо ввели парне
        if (n % 2 == 0) {
            n++;
        }

        int mid = n / 2;
        StringBuilder result = new StringBuilder();

        // Верхня частина ромба (включаючи середину)
        for (int i = 0; i <= mid; i++) {
            for (int j = 0; j < mid - i; j++) {
                result.append(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                result.append("*");
            }
            result.append("\n");
        }

        // Нижня частина ромба
        for (int i = mid - 1; i >= 0; i--) {
            for (int j = 0; j < mid - i; j++) {
                result.append(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                result.append("*");
            }
            result.append("\n");
        }

        System.out.print(result.toString());
        scanner.close();
    }
}