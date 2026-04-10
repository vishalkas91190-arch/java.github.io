import java.util.*;

public class multiply_reduce
 {
    public static void main(String[] args) 
    {
        List<Integer> list = Arrays.asList(10, 20, 30);

        int result = list.stream()
                         .reduce(1, (a, b) -> a * b);

        System.out.println(result);
    }
}
