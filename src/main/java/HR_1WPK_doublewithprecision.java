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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    
    int[] arra = arr.stream().mapToInt(i->i).toArray();
    
    int N = arra.length;
    int cP = 0;
    int cN =0;
    int cZ=0;
    
    for(int n:arra){
        if(n<0){
            cN++;            
        }else if(n>0){
            cP++;
        }else{
            cZ++;
        }
    }
    
    //Int 
     double a = (double)cP/(double)N;
     double b = (double)cN/(double)N;
     double c = (double)cZ/(double)N;
 
    // Setting the precision to 6 places
    System.out.println(String.format("%.6f", a));
    System.out.println(String.format("%.6f", b));
    System.out.println(String.format("%.6f", c));


    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
