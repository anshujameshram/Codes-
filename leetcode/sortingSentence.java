package leetcode;

public class sortingSentence {
	 public String sortSentence(String s) {
	        //split the sentence by whitespace
	        //select data structure to store words in correct order.ArrayList
	        //iterate and get the last char of words
	        //

	        String[] words=s.split(" ");
	        String[] wordsWithCorrectPos=new String[words.length];
	        for(String word:words)
	        {
	            int index=Character.getNumericValue(word.charAt(word.length()-1)); //get word last charcter(int)
	            wordsWithCorrectPos[index-1]=word.substring(0,word.length()-1);  //store index wise
	        }
	        return String.join(" ",wordsWithCorrectPos);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
