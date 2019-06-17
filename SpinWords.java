// Description from website: Write a function that takes in a string of one or more words, and returns the same string, but
//with all five or more letter words reversed (Just like the name of this Kata). Strings passed in will consist of only //letters and spaces. Spaces will be included only when more than one word is present.

public class SpinWords {

	public static String spinWords(String sentence) {
		String retSentence = "";
		String [] arr = sentence.split(" ");
		int size = arr.length;
		for(int i = 0; i < size; i++) {
			if(arr[i].length() > 4) {
				String reverse = new StringBuffer(arr[i]).reverse().toString();
				retSentence = retSentence + reverse;
			}
			else {
				retSentence = retSentence + arr[i];
			}
      
      if(size > 1 && size - i > 1){
        retSentence = retSentence + " ";
		  }
	}
  return retSentence;
}

}
