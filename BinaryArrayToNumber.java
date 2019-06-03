//Description from website: Given an array of ones and zeroes, convert the equivalent
//binary value to an integer.Eg: [0, 0, 0, 1] is treated as 0001 which is the binary 
//representation of 1.

import java.util.*;
import java.io.*;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        // Your Code
          Collections.reverse(binary);
          int sum = 0;
          Iterator<Integer> iter = binary.iterator();
          int multiplier = 1;
          
          while(iter.hasNext()){
            sum = sum + (iter.next() * multiplier);
            multiplier *= 2;
          }
          return sum;
    }
}
