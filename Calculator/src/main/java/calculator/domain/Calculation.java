package calculator.domain;

import calculator.exceptions.DivisionByZeroException;

public class Calculation implements ICalculation {
    @Override
    public double fold(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public double subtract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    @Override
    public double divide(double firstNumber, double secondNumber) {
        double result = firstNumber;
        if (secondNumber == 0) {
            try {
                throw new DivisionByZeroException("Делить на ноль нельзя");
            } catch (DivisionByZeroException e) {
                System.err.println(e.getMessage());
            }
        } else {
            result = result / secondNumber;
        }
        return result;
    }

}
