@FunctionalInterface
interface MathOperation {
    int operate(int a);
}

public class Main_1 {
    public static void main(String[] args) {

        // Lambda expression to calculate square
        MathOperation square = (a) -> a * a;

        // Calling the method
        int result = square.operate(6);

        System.out.println("Square of number: " + result);
    }
}