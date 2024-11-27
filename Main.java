class Calculator {
    // Method to add two numbers
    int add(int a, int b) {
        return a + b;
    }
 // Overloaded method to add three numbers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 numbers: " + calc.add(10, 20));
        System.out.println("Sum of 3 numbers: " + calc.add(10, 20, 30));
    }
}  
