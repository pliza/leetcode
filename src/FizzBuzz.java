import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> toRet = new ArrayList<>();
        for (int i = 1; i <= n; i ++) { 
            if( i % 3 == 0 && i % 5 == 0 ) { 
                toRet.add("FizzBuzz");
            } else if (i % 3 == 0 ) { 
                toRet.add("Fizz");
            } else if (i % 5 == 0 ) { 
                toRet.add("Buzz");
            } else { 
                toRet.add("" + i);
            }
        }
        return toRet;
    }
}
    
}
