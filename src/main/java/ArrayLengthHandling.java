public class ArrayLengthHandling{

     public static void main(String []args){
        // The array with capacity 6 can hold only 6 elements
    int[] array = new int[6];

    // Use the length variable,start with zero.
    int length = 0;

    // Add 3 items into it.
    for (int i = 0; i < 10; i++) {
        array[i] = i * i;
    // Each time we add an element, the length goes up by one
    length++;
    }

    System.out.println("The Array has a capacity of " + array.length);
    System.out.println("The Array has a length of " + length);
     }
     
     //The array which runs into ArrayIndexOutOfBoundsException as you add elements in the for loop - this is something which you need to consider while writing array functions and safe to assume capacity=length
}
