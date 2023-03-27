package calculator;

import calculator.domain.ICalculation;
import calculator.exceptions.ActionIsIncorrectException;
import calculator.exceptions.DivisionByZeroException;
import calculator.exceptions.NumberIsIncorrectException;

import java.util.regex.Pattern;

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
    public void actionChoice(String action, double number) {

        switch (action) {
            case "+" -> result = calculation.fold(result, number);
            case "-" -> result = calculation.subtract(result, number);
            case "*" -> result = calculation.multiply(result, number);
            case "/" -> {
                try {
                    result = calculation.divide(result, number);
                } catch (DivisionByZeroException e) {
                    e.printStackTrace();
                }
            }
            default -> {
            }
        }
    }

    @Override
    public String getCorrectAction(String inputAction) throws ActionIsIncorrectException {
        if (isAction(inputAction)) {
            return inputAction;
        }
        throw new ActionIsIncorrectException("Некорректно введено действие");
    }

    @Override
    public double getCorrectNumber(String number) throws NumberIsIncorrectException {
        Pattern pattern = Pattern.compile("((-|\\+)?[0-9]+(\\.[0-9]+)?)+");
        if (pattern.matcher(String.valueOf(number)).find()) {
            return Double.parseDouble(number);
        }
        throw new NumberIsIncorrectException("Некорректно введено число");
    }

    @Override
    public boolean isAction(String action) {
        Pattern pattern = Pattern.compile("^[=+-/*]");
        return pattern.matcher(String.valueOf(action)).find();
    }
}
