package calculate;

public class Calculator {
    public void addition(int a, int b) {
        System.out.println(a + b);
    }

    public void subtraction(int a, int b) {
        System.out.println(a - b);
    }

    public void division(int a, int b) {
        System.out.println(a / b);
    }

    public void multiplication(int a, int b) {
        System.out.println(a * b);
    }

    public void calculateResult(int a, int b, char symbol) {
        if (symbol == '+') {
            System.out.println("Addition of " + a + " and " + b + " is " + (a + b));
        } else if (symbol == '-') {
            System.out.println("Subtraction of " + a + " and " + b + " is " + (a - b));
        } else if (symbol == '/') {
            System.out.println("Division of " + a + " and " + b + " is " + (a / b));
        } else if (symbol == '*') {
            System.out.println("Multiplication of " + a + " and " + b + " is " + (a * b));
        } else {
            System.out.println("Please enter a valid symbol such as +, -, / or * ");
        }
    }
}
