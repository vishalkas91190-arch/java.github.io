import java.util.*;
public class sumofeven_reduce{
    public static void main(String[] args)
     {
        List<Integer>list=Arrays.asList(10,20,30);
        int result=list.stream()
        .reduce(0,(num,sum)->
        {
            if(num%2==0)
            {
                return sum+num;
            }else 
            return sum ;
        });
        
        System.out.println(result);
    }
}
