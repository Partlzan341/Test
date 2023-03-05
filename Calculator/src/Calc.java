import java.util.Scanner;
import java.util.regex.Pattern;

public class Calc {
    static Scanner scanner = new Scanner(System.in);
    static String regex = "^[0-9]";
    static Pattern pattern = Pattern.compile(regex);

    public static int addition(int result) {
        if (result != 0) {
            System.out.println("Введите число");
            int number = scanner.nextInt();
            result += number;
        } else {
            System.out.println("Введите число");
            int number = scanner.nextInt();
            System.out.println("Введите число");
            int number2 = scanner.nextInt();
            int x = number + number2;
            result += x;
        }
        return result;
    }

    public static int subtraction(int result) {
        if (result != 0) {
            System.out.println("Введите число");
            int number = scanner.nextInt();
            result -= number;
        } else {
            System.out.println("Введите число");
            int number = scanner.nextInt();
            System.out.println("Введите число");
            int number2 = scanner.nextInt();
            int x = number - number2;
            result += x;
        }
        return result;
    }

    public static int division(int result) {
        if (result != 0) {
            System.out.println("Введите число");
            int number = scanner.nextInt();
            result /= number;
        } else {
            System.out.println("Введите число");
            int number = scanner.nextInt();
            System.out.println("Введите число");
            int number2 = scanner.nextInt();
            int x = number / number2;
            result += x;
        }
        return result;
    }

    public static int multiplication(int result) {
        if (result != 0) {
            System.out.println("Введите число");
            int number = scanner.nextInt();
            result *= number;
        } else {
            System.out.println("Введите число");
            int number = scanner.nextInt();
            System.out.println("Введите число");
            int number2 = scanner.nextInt();
            int x = number * number2;
            result += x;
        }
        return result;
    }
}
