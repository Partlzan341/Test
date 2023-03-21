package calculator.domain;

public interface ICalculation {
    double fold(double firstNumber, double secondNumber);

    double subtract(double firstNumber, double secondNumber);

    double multiply(double firstNumber, double secondNumber);

    double divide(double firstNumber, double secondNumber);

}
