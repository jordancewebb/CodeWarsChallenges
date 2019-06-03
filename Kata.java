//Description from website: You are going to be given a word. Your job is to return the middle character of the word. If the
//word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.

class Kata {
  public static String getMiddle(String word) {
    //Code goes here!
     int len = word.length();
	    int halfway = len / 2;
	    String middle;
	    if(len % 2 == 0){
	      middle = word.charAt(halfway - 1) + "" + word.charAt(halfway) +"";
	    }
	    else{
	      middle = word.charAt(halfway) + "";
	    }
	    return middle;
  }
}
