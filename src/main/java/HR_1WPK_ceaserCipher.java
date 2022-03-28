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
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
    // Write your code here
    StringBuilder result = new StringBuilder();
    
    for (char c : s.toCharArray()){
        if((c >= 'a' && c <= 'z') ){ //Character.isLowerCase(c) && Character.isAlphabetic(c)
            int originalAlphaPosition = c - 'a';
            int newAlphaPosition = (originalAlphaPosition + k)%26;
            char newAlpha = (char) (newAlphaPosition + 'a');
            result.append(newAlpha);
        } else if((c >= 'A' && c <= 'Z')){//Character.isUpperCase(c) && Character.isAlphabetic(c)
            int originalAlphaPosition = c - 'A';
            int newAlphaPosition = (originalAlphaPosition + k)%26;
            char newAlpha = (char) (newAlphaPosition + 'A');
            result.append(newAlpha);
        }
        else{
            result.append(c);
        }
    } 
    
    return result.toString();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
