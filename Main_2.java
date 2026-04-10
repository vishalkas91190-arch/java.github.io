
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class Main_2 {
    public static void main(String[] args) {

        // Lambda expression to find maximum
        MathOperation max = (a, b) -> (a > b) ? a : b;

        // Calling the method
        int result = max.operate(10, 20);

        System.out.println("Maximum number: " + result);
    }
}