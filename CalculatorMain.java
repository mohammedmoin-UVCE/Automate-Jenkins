public class CalculatorMain {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Calculator cal = new Calculator();
        System.out.println("Sum of " + a + " and " + b + " is  : " + cal.add(a, b));
        System.out.println("Sub of " + a + " and " + b + " is  : " + cal.add(a, b));
        System.out.println("Mul of " + a + " and " + b + " is  : " + cal.add(a, b));
        System.out.println("Div of " + a + " and " + b + " is  : " + cal.add(a, b));
    }
}

class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}
