
interface Calculator {

    // Static method to find square
    static int square(int n) {
        return n * n;
    }

    // Static method to find cube
    static int cube(int n) {
        return n * n * n;
    }
}
public class Main_10{
    public static void main(String[] args) {

        int num = 4;

        // Calling static methods using interface name
        int squareResult = Calculator.square(num);
        int cubeResult = Calculator.cube(num);

        System.out.println("Square: " + squareResult);
        System.out.println("Cube: " + cubeResult);
    }
}
