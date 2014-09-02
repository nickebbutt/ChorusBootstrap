package demo.calculator;

import java.util.Stack;

public class Calculator {

    private Operator operator;

    public enum Operator {
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }

    private Stack<Double> stack = new Stack<Double>();

    public void enterNumber(Double number) {
        stack.push(number);
    }

    public void press(Operator operator) {
        this.operator = operator;
    }

    public double getResult() {
        checkInputs();
        double d2 = stack.pop();
        double d1 = stack.pop();

        double result = Double.NaN;
        switch (operator) {
            case ADD:
                result = d1 + d2;
                break;
            case SUBTRACT:
                result = d1 - d2;
                break;
            case MULTIPLY:
                result = d1 * d2;
                break;
            case DIVIDE:
                result = d1 / d2;
                break;
        }
        reset();
        return result;
    }

    private void checkInputs() {
        assert (operator != null);
        assert (stack.size() == 2);
    }

    private void reset() {
        operator = null;
        stack.empty();
    }
}
