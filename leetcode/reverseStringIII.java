package leetcode;
//Example 1:
//
//Input: s = "Let's take LeetCode contest"
//Output: "s'teL ekat edoCteeL tsetnoc"
//Example 2:
//
//Input: s = "God Ding"
//Output: "doG gniD"
public class reverseStringIII {
	public String reverseWords(String s) {
        if(s==null||s.length()==0)
        {
            return s;
        }

        StringBuilder result=new StringBuilder();
        String[] splittedWords=s.split(" ");

        for(String word:splittedWords)
        {
            StringBuilder wordsb=new StringBuilder();
            wordsb.append(word);
            wordsb.reverse();
            result.append(wordsb.toString()+" ");
        }
        //result.setLength(result.length()-1);
        return result.toString().trim();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
