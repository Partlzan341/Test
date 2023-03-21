package calculator;

import calculator.domain.ICalculation;
import calculator.exceptions.ActionIsIncorrectException;
import calculator.exceptions.NumberIsIncorrectException;

public class CalculationController implements ICalculationController {
    private double result = 0;

    @Override
    public double getResult() {
        return result;
    }

    @Override
    public void setResult(double result) {
        this.result = result;
    }

    private ICalculation calculation;

    public CalculationController(ICalculation calculation) {
        this.calculation = calculation;
    }

    @Override
    public void actionChoice(String action, double secondNumber) {
        switch (action) {
            case "+" -> result = calculation.fold(result, secondNumber);
            case "-" -> result = calculation.subtract(result, secondNumber);
            case "*" -> result = calculation.multiply(result, secondNumber);
            case "/" -> result = calculation.divide(result, secondNumber);
            default -> {
            }
        }
    }

    @Override
    public double setNumber(String inputNumber, double number) {
        number = Double.parseDouble(inputNumber);
        return number;
    }

    @Override
    public String setAction(String inputAction, String action) {
        action = inputAction;
        return action;
    }

    @Override
    public void throwNumberException() {
        try {
            throw new NumberIsIncorrectException("Некорректно введено число");
        } catch (NumberIsIncorrectException e) {
            System.err.println(e.getMessage());
        }

    }

    @Override
    public void throwActionException() {
        try {
            throw new ActionIsIncorrectException("Некорректно введено действие");
        } catch (ActionIsIncorrectException e) {
            System.err.println(e.getMessage());
        }
    }

}
