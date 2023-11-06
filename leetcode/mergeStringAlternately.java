package leetcode;

public class mergeStringAlternately {
	public String mergeAlternately(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        StringBuilder ans=new StringBuilder();
        int i=0;
        while(i<n1||i<n2)
        {
            if(i<n1)
            {
                ans.append(word1.charAt(i));
            }
            if(i<n2)
            {
                ans.append(word2.charAt(i));
            }
            i++;
        }
        return ans.toString();

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
