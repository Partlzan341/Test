package calculator;

public interface ICalculationController {


    void actionChoice(String action, double secondNumber);

    double getResult();

    void setResult(double result);

    void throwNumberException();

    void throwActionException();

    double setNumber(String inputNumber, double firstNumber);

    String setAction(String inputAction, String action);
}
