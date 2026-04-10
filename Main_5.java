@FunctionalInterface
interface CheckNumber {
    boolean isGreaterThanTen(int n);
}

public class Main_5{
    public static void main(String[] args) {

        // Lambda expression to check if number is greater than 10
        CheckNumber check = (n) -> n > 10;

        // Test the lambda
        int num = 15;

        if (check.isGreaterThanTen(num)) {
            System.out.println(num + " is greater than 10");
        } else {
            System.out.println(num + " is not greater than 10");
        }
    }
}
