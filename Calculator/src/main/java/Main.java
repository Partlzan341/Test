import calculator.CalculationController;
import calculator.ICalculationController;
import calculator.ITestController;
import calculator.TestController;
import calculator.domain.Calculation;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ICalculationController calculationController = new CalculationController(new Calculation());
    static ITestController testController = new TestController();

    public static void main(String[] args) {
        double firstNumber = 0;
        double secondNumber = 0;
        String action = null;
        while (true) {
            System.out.println("Введите число");
            String inputNumber = scanner.next();
            if (testController.isNumber(inputNumber)) {
                firstNumber = calculationController.setNumber(inputNumber, firstNumber);
                calculationController.setResult(firstNumber);
                break;
            } else {
                testController.checkNumber(inputNumber);
                calculationController.throwNumberException();
            }
        }
        while (true) {
            while (true) {
                System.out.println("Введите введите действие (+ - * / =)");
                String inputAction = scanner.next();
                if (testController.isAction(inputAction)) {
                    action = calculationController.setAction(inputAction, action);
                    break;
                } else {
                    testController.checkAction(inputAction);
                    calculationController.throwActionException();
                }
            }
            if ("=".equals(action)) {
                break;
            }
            while (true) {
                System.out.println("Введите число");
                String strNumber = scanner.next();
                if (testController.isNumber(strNumber)) {
                    secondNumber = calculationController.setNumber(strNumber, secondNumber);
                    break;
                } else {
                    testController.checkNumber(strNumber);
                    calculationController.throwNumberException();
                }
            }
            testController.isNumber(String.valueOf(secondNumber));
            calculationController.actionChoice(action, secondNumber);
        }
        double result = calculationController.getResult();
        System.out.println(result);
    }

}