@FunctionalInterface
interface Greeting {
    void greet(String name);
}

// Greeter class
class Greeter {
    void sayHello(String name) {
        System.out.println("Hello, " + name);
    }
}

public class Main_8{
    public static void main(String[] args) {

        Greeter greeter = new Greeter();

        // Method reference to instance method
        Greeting greeting = greeter::sayHello;

        // Calling the method
        greeting.greet("Sneha");
    }
}
