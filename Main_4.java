@FunctionalInterface
interface CheckOperation {
    boolean check(int a);
}

public class Main_4{
    public static void main(String[] args) {

    
        CheckOperation isDivisibleBy3 = (a) -> a % 3 == 0;

        
        int num = 9;

        if (isDivisibleBy3.check(num)) {
            System.out.println(num + " is divisible by 3");
        } else {
            System.out.println(num + " is not divisible by 3");
        }
    }
}
