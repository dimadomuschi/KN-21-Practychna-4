public class Task1 {
}
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть друге число: ");
        double b = scanner.nextDouble();

        System.out.print("Введіть оператор (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Результат: " + (a + b));
                break;
            case '-':
                System.out.println("Результат: " + (a - b));
                break;
            case '*':
                System.out.println("Результат: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Результат: " + (a / b));
                } else {
                    System.out.println("Помилка: ділення на нуль!");
                }
                break;
            default:
                System.out.println("Невідомий оператор!");
        }

        scanner.close();
    }
}