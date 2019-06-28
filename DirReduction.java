//Description from website: Once upon a time, on a way through the old wild west,…
//… a man was given directions to go from one point to another. The directions were "NORTH", "SOUTH", "WEST", "EAST". Clearly "NORTH" and "SOUTH" are opposite, "WEST" and "EAST" too. Going to one direction and coming back the opposite direction is a needless effort. Since this is the wild west, with dreadfull weather and not much water, it's important to save yourself some energy, otherwise you might die of thirst!
//How I crossed the desert the smart way.
//The directions given to the man are, for example, the following (depending on the language):
//["NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"]. or
//{ "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" }; or
//[North, South, South, East, West, North, West]
//You can immediatly see that going "NORTH" and then "SOUTH" is not reasonable, better stay to the same place! So the task is to give to the man a simplified version of the plan. A better plan in this case is simply:
//["WEST"]
import java.util.Arrays;

public class DirReduction {
	 public static String[] dirReduc(String[] arr) {
	        // Your code here.
	        
	        int north = 0;
	        int south = 0;
	        int east = 0;
	        int west = 0;
	        int length = arr.length;
	        for(int i = 0; i < length; i++){
	          switch(arr[i]){
	            case "NORTH":
	              north++;
	              break;
	            case "SOUTH":
	              south++;
	              break;
	            case "EAST":
	              east++;
	              break;
	            case "WEST":
	              west++;
	              break;
	          }
	        }  
	        String leadVert = findLead("NORTH", "SOUTH", north, south);
	        String leadHoz = findLead("EAST", "WEST", east, west);
	        
	        String [] arrVert = buildArray(leadVert, Math.abs(north - south));
	        String [] arrHoz = buildArray(leadHoz, Math.abs(east - west));
	        
	        return combine(arrHoz, arrVert);
	    }
	    
	    public static String findLead(String s1, String s2, int n1, int n2){
	      if(n1 > n2){
	        return s1;
	      }
	      else if(n2 > n1){
	        return s2;
	      }
	      else{
	        return null;
	      }
	    }
	    
	    public static String [] buildArray(String lead, int counter){
	      String [] result = new String[counter];
	      
	      for(int i = 0; i < counter; i++){
	        result[i] = lead;
	      }
	      
	      return result;
	    }
	    
	    public static String [] combine(String [] arr1, String [] arr2) {
	    	int len1 = arr1.length;
	    	int len2 = arr2.length;
	    	int count = len1 + len2;
	    	String[] result = new String[count];
	    	for(int i = 0; i < len1; i++) {
	    		result[i] = arr1[i];
	    	}
	    	
	    	for(int j = 0; j < len2; j++) {
	    		result[len1 + j] = arr2[j];
	    	}
	    	
	    	return result;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr ={"NORTH", "EAST", "NORTH", "EAST", "WEST", "WEST", "EAST", "EAST", "WEST", "SOUTH"};
		System.out.print(Arrays.toString(dirReduc(arr)));
	}

}
