@FunctionalInterface
interface IsPositive {
    boolean check(int n);
}

public class Main_7{
    public static void main(String[] args) {

        // Lambda expression to check if number is positive
        IsPositive isPositive = (n) -> n > 0;

        // Test the lambda
        int num = -5;

        if (isPositive.check(num)) {
            System.out.println(num + " is positive");
        } else {
            System.out.println(num + " is not positive");
        }
    }
}
