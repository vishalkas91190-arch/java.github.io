@FunctionalInterface
interface StringLength {
    int getLength(String str);
}

public class Main_9{
    public static void main(String[] args) {

        // Method reference to String's length method
        StringLength length = String::length;

        // Calling the method
        int result = length.getLength("Hello");

        System.out.println("Length of string: " + result);
    }
}
