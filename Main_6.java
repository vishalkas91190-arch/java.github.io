@FunctionalInterface
interface Message {
    String getMessage();
}

public class Main_6{
    public static void main(String[] args) {

        // Lambda expression with no arguments
        Message msg = () -> "Hello Lambda!";

        // Calling the method
        String result = msg.getMessage();

        System.out.println(result);
    }
}
