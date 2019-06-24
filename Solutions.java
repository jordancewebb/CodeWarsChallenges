//Write a program that will calculate the number of trailing zeros in a factorial of a given number.
//N! = 1 * 2 * 3 * ... * N. Be careful 1000! has 2568 digits... For more info, see:
//http://mathworld.wolfram.com/Factorial.html

public class Solution {
  public static int zeros(int n) {
      int zeros = 0;
      for(int i = 5; n/i >= 1; i *= 5)
        zeros += n/i;
      return zeros;
  }
}
