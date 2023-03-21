package calculator;

import java.util.regex.Pattern;

public class TestController implements ITestController {
    @Override
    public boolean isNumber(String number) {
        Pattern pattern = Pattern.compile("((-|\\+)?[0-9]+(\\.[0-9]+)?)+");
        return pattern.matcher(String.valueOf(number)).find();
    }

    @Override
    public boolean checkNumber(String inputNumber) {
        return isNumber(inputNumber);
    }

    @Override
    public boolean isAction(String action) {
        Pattern pattern = Pattern.compile("^[=+-/*]");
        return pattern.matcher(String.valueOf(action)).find();
    }

    @Override
    public boolean checkAction(String action) {
        return isAction(action);
    }
}
