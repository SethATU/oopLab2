package ie.atu.week2oop;

public class Calculate {
    private int num1;
    private int num2;
    private String operator;
    private double result;
    private String message;

    public Calculate(int num1, int num2, String operator, double result) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
        this.result = result;
        this.message = message;
    }

    public Calculate(String message) {
        this.message = message;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public String getOperator() {
        return operator;
    }

    public double getResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }
}
