package demo.calculator;

import org.chorusbdd.chorus.annotations.Handler;
import org.chorusbdd.chorus.annotations.Step;
import org.chorusbdd.chorus.util.assertion.ChorusAssert;

@Handler("Calculator")
public class CalculatorHandler {

    private Calculator calc = new Calculator();

    @Step("I enter (\\d+) into the calculator")
    public void enterNumber(Double number) {
        calc.enterNumber(number);
    }

    @Step("I press (add|subtract)")
    public void enterOperator(String operator) {
        if ("add".equalsIgnoreCase(operator)) {
            calc.press(Calculator.Operator.ADD);
        }
        else if ("subtract".equalsIgnoreCase(operator)) {
            calc.press(Calculator.Operator.SUBTRACT);
        }
    }

    @Step("the result is (\\d+).*")
    public void checkCalculation(double expectedResult) {
        ChorusAssert.assertEquals(expectedResult, calc.getResult());
    }
}
