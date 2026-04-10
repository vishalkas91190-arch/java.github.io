import java.util.*;

public class min_reduce
 {
    public static void main(String[] args)
     {
         List<Integer>list=Arrays.asList(10,30);
         int result=list.stream()
         .reduce(0,(a,b)->a<b?a:b);
         System.out.println(result);
    }
}
