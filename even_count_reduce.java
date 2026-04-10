import java.util.*;
public class even_count_reduce {
    public static void main(String[] args)
     {
        List<Integer>list=Arrays.asList(10,20,30);
        int result=list.stream()
        .reduce(0,(num,count)->
        {
            if(num%2==0)
            {
                count++;
            }
            return count;
        });
        
        System.out.println(result);
    }
}
