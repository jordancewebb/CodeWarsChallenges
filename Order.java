//Description from website: Your task is to sort a given string. Each word in the string will contain a single number.
//This number is the position the word should have in the result. Note: Numbers can be from 1 to 9. So 1 will be the first
//word (not 0). If the input string is empty, return an empty string. The words in the input String will only contain valid
//consecutive numbers.
//Examples:
//"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
//"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople" ""  -->  ""

public class Order {
  public static String order(String words) {
    String [] sentence = words.split(" ");
    int  len = sentence.length;
      for(int i = 0; i < len-1; i++){
        for(int j = 0; j < len-i-1; j++){
          if(findNumber(sentence[j]) > findNumber(sentence[j+1])){
            String temp = sentence[j];
            sentence[j] = sentence[j+1]; 
            sentence[j+1] = temp; 
          }
        }
      }
     return String.join(" ", sentence);
    }
    
  public static int findNumber(String word){
    int length = word.length();
	    int let;
	    int answ = 10;
	    for(int i = 0; i < length; i++){
	      let = Character.getNumericValue(word.charAt(i));
	      if(let < answ){
	        answ = let;
	      }
	    }
	    return answ;
  }
}
