//This program takes in an array of integers which are either all even except for one or all odd except for one and finds the outlier.
public class FindOutlier {
		  static int decide(int [] integers){
		    int count = 0;
		    for(int i = 0; i < 3; i++){
		      if(integers[i] % 2 == 0){
		        count++;
		      }
		      else{
		      count--;
		      } 
		    }
		    return count;
		  }
		  
		  static int find(int[] integers){
			  int result = 0;
		    if(decide(integers) > 0){
		      for(int i = 0; i < integers.length; i++){
		        if(integers[i] % 2 != 0){
		          result = integers[i];
		        }
		      }
		    }
		    else{
		      for(int i = 0; i < integers.length; i++){
		          if(integers[i] % 2 == 0){
		            result = integers[i];
		        }
		      }
		    }
		    return result;
		  }
		
}
