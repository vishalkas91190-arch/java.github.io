
interface MathUtility {

    
    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    
    static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


public class Main_11{
    public static void main(String[] args) {

        int num = 7;

        // Calling static methods
        boolean even = MathUtility.isEven(num);
        boolean prime = MathUtility.isPrime(num);

        System.out.println(num + " is even? " + even);
        System.out.println(num + " is prime? " + prime);
    }
}