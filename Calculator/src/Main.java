import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int result = 0;
        while (true) {
            System.out.println("Введите действие + - * / =");
            String action = scanner.next();
            if (action.equals("+")) {
                result = Calc.addition(result);
            }
            if (action.equals("-")) {
                result = Calc.subtraction(result);
            }
            if (action.equals("/")) {
                result = Calc.division(result);
            }
            if (action.equals("*")) {
                result = Calc.multiplication(result);
            }
            if (action.equals("=")) {
                break;
            }
        }
        System.out.println("Результат = " + result);
    }
}