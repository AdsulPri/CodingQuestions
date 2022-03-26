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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    String twentyFourTime = "";
    
    if(s.isEmpty() || !(s.contains("AM")||s.contains("PM")))
        return "Invalid string";
     
    String hour = s.substring(0, 2);
    
    int h = Integer.parseInt(hour);
    
    if(s.contains("AM")){
        h=h%12;
    }   
    else{
        h=12+h%12;
    }
    
    
     
     String hs = String.format("%02d", h); //////////////VIMPPPPPPPPPPPPPPPPP
     
     
        twentyFourTime=hs+s.substring(2, s.length()-2);
     
     
    return twentyFourTime;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
