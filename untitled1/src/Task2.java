import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть текст:");
        String text = scanner.nextLine();

        StringBuilder sb = new StringBuilder(text);
        int count = 0;
        int i = 0;

        while (i < sb.length()) {
            char c = sb.charAt(i);
            if (c == '.' || c == '!' || c == '?') {
                count++;
            }
            i++;
        }

        System.out.println("Кількість речень: " + count);
        scanner.close();
    }
}