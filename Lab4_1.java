/*Write a program to implement single inheritance where the parent class defines a method calculate(), 
and the child class overrides it to perform a specific arithmetic operation.*/

class Operation {
    void calculate() {
        System.out.println("Calculation in parent class");
    }
}

class Addition extends Operation {
    @Override
    void calculate() {
        int a = 10, b = 5;
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
}

public class Overriding {
    public static void main(String[] args) {
        Operation op = new Addition(); // dynamic binding
        op.calculate();
    }
}
