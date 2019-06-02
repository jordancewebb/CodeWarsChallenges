//Description of challenge from website: In this kata, you must create a digital root function.A digital root 
//is the recursive sum of all the digits in a number. Given n, take the sum of the digits of n. 
//If that value has more than one digit, continue reducing in this way until a single-digit number is produced.
//This is only applicable to the natural numbers.

public class DRoot {
  public static int digital_root(int n) {
    // ...
    if(n < 10){
      return n;
    }
  
    int holder = n;
    int sum = 0;
    int temp;
    
    while(holder > 0){
    temp = holder % 10;
    sum += temp;
    holder /= 10;
    }
    
    return digital_root(sum);
    
    
  }
}
