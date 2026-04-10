@FunctionalInterface
interface StringOperation {
    String operate(String s1, String s2);
}

public class Main_3{
    public static void main(String[] args) {

        // Lambda expression to join two strings
        StringOperation join = (s1, s2) -> s1 + s2;

        // Calling the method
        String result = join.operate("Hello ", "World");

        System.out.println("Joined String: " + result);
    }
}