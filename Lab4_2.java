/*Write a Java program to create a Calculator class with overloaded methods named calculate() that perform:
Addition of two numbers
Subtraction of two numbers
Multiplication of two numbers
Division of two numbers*/

public class Calculator {

    void calculate(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    void calculate(int a, int b, String operation) {
        switch (operation) {
            case "sub":
                System.out.println("Subtraction: " + (a - b));
                break;
            case "mul":
                System.out.println("Multiplication: " + (a * b));
                break;
            case "div":
                if (b != 0) {
                    System.out.println("Division: " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Unknown operation");
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.calculate(10, 5);                
        calc.calculate(10, 5, "sub");         
        calc.calculate(10, 5, "mul");         
        calc.calculate(10, 5, "div");        
    }
}
