public class Main2 {
    // addition method
    static void add(int a, int b) {
        System.out.println("Addition is " + (a + b));
    }

    // subtraction method
    static void subtract(int a, int b) {
        System.out.println("Subtraction is " + (a - b));
    }

    // multiplication method
    static void multiply(int a, int b) {
        System.out.println("Multiplication is " + (a * b));
    }

    static void divide(int a, int b) {
        System.out.println("Division is " + (a / b));
    }

    // main method
    public static void main(String[] args) {
        int a = 15;
        int b = 13;
        // execute the methods
        add(a, b);
        subtract(a, b);
        multiply(a, b);
        divide(a, b);
    }
}