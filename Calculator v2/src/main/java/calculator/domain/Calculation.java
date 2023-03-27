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
    public double divide(double firstNumber, double secondNumber) throws DivisionByZeroException {
        double result = firstNumber;
        if (secondNumber == 0) {
            throw new DivisionByZeroException("Делить на ноль нельзя");
        } else {
            result = result / secondNumber;
        }
        return result;
    }

}
