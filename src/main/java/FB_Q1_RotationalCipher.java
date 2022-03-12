import java.util.*;
// Add any extra import statements you may need here


class Main {

  // Add any helper functions you may need here
  

  String rotationalCipher(String input, int rotationFactor) {
    // Write your code here
    
    StringBuilder strBuilder = new StringBuilder();
     char c;
    for (int i=0; i< input.length(); i++){
     
     c = input.charAt(i);
      
      if(Character.isLetter(c)){
        int OptiRF = rotationFactor%26;
        c = (char) (input.charAt(i) + OptiRF);        
        if ((Character.isLowerCase(input.charAt(i)) && c > 'z')|| (Character.isUpperCase(input.charAt(i)) && c > 'Z'))
        c = (char) (input.charAt(i) - (26 - OptiRF));
        strBuilder.append(c);
      }else if (Character.isDigit(c)){
        int newC = (Character.getNumericValue(input.charAt(i)) + rotationFactor)%10;
        System.out.println(input.charAt(i)+" "+ newC);
        strBuilder.append(newC); 
      }else{        
        strBuilder.append(c);
      }
    }
    
   
    return strBuilder.toString();
  }











  // These are the tests we use to determine if the solution is correct.
  // You can add your own at the bottom.
  int test_case_number = 1;
  void check(String expected, String output) {
    boolean result = (expected.equals(output));
    char rightTick = '\u2713';
    char wrongTick = '\u2717';
    if (result) {
      System.out.println(rightTick + " Test #" + test_case_number);
    }
    else {
      System.out.print(wrongTick + " Test #" + test_case_number + ": Expected ");
      printString(expected); 
      System.out.print(" Your output: ");
      printString(output);
      System.out.println();
    }
    test_case_number++;
  }
  void printString(String str) {
    System.out.print("[\"" + str + "\"]");
  }
  
  public void run() {
    String input_1 = "All-convoYs-9-be:Alert1.";
    int rotationFactor_1 = 4;
    String expected_1 = "Epp-gsrzsCw-3-fi:Epivx5.";
    String output_1 = rotationalCipher(input_1, rotationFactor_1);
    check(expected_1, output_1);

    String input_2 = "abcdZXYzxy-999.@";
    int rotationFactor_2 = 200;
    String expected_2 = "stuvRPQrpq-999.@";
    String output_2 = rotationalCipher(input_2, rotationFactor_2);
    check(expected_2, output_2);

    // Add your own test cases here
    
  }
  
  public static void main(String[] args) {
    new Main().run();
  }
}
