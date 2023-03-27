package calculator;

import calculator.exceptions.ActionIsIncorrectException;
import calculator.exceptions.NumberIsIncorrectException;

public interface ICalculationController {

    void actionChoice(String action, double secondNumber);

    double getResult();

    void setResult(double result);

    String getCorrectAction(String inputAction) throws ActionIsIncorrectException;

    double getCorrectNumber(String number) throws NumberIsIncorrectException;

    boolean isAction(String action);
}
