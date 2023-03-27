import calculator.CalculationController;
import calculator.ICalculationController;
import calculator.domain.Calculation;
import calculator.exceptions.ActionIsIncorrectException;
import calculator.exceptions.NumberIsIncorrectException;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ICalculationController calculationController = new CalculationController(new Calculation());

    public static void main(String[] args) {
        double number;
        String action;
        while (true) {
            System.out.println("Введите число");
            String inputNumber = scanner.next();
            try {
                number = calculationController.getCorrectNumber(inputNumber);
                calculationController.setResult(number);
                break;
            } catch (NumberIsIncorrectException e) {
                System.err.println(e.getMessage());
            }
        }
        while (true) {
            while (true) {
                System.out.println("Введите действие (+ - * / =)");
                action = scanner.next();
                try {
                    action = calculationController.getCorrectAction(action);
                    break;
                } catch (ActionIsIncorrectException e) {
                    System.err.println(e.getMessage());
                }
            }
            if ("=".equals(action)) break;
            while (true) {
                System.out.println("Введите действие число");
                try {
                    number = calculationController.getCorrectNumber(scanner.next());
                    break;
                } catch (NumberIsIncorrectException e) {
                    System.err.println(e.getMessage());
                }
            }
            calculationController.actionChoice(action, number);
        }
        System.out.print("Результат = " + calculationController.getResult());
    }

}