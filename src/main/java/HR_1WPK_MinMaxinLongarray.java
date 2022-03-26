import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    
    if(arr.size() ==0 || arr == null){
        System.out.println(0+" "+0);
    }
    
    long min=Long.MAX_VALUE;
    long sum=0;
    long max=Long.MIN_VALUE;
    
    for(long n:arr){
        
        sum+=n;
        
    }
    
    for(long n:arr){
        min = Math.min(min, sum-n);
        max = Math.max(max, sum-n);
    }
    
    System.out.println(min+" "+max);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
