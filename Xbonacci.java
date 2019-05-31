//This program returns the tribonacci sequence of double values based on the initial double values from the array 's'
public class Xbonacci {

  public double[] tribonacci(double[] s, int n) {
      // hackonacci me
      double [] arr = new double [n];      
      if(n < 3){
       for(int i = 0; i < n; i++){
         arr[i] = s[i];
       }
       return arr;
      }
      arr[0] = s[0];
      arr[1] = s[1];
      arr[2] = s[2];
      for(int i = 3; i < n; i++){
        arr[i] = arr[i-1] + arr [i-2] + arr [i-3];
      }
      return arr;
  }
}
