package leetcode;

public class twostringequivalent {
	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // StringBuilder sb1=new StringBuilder();
        //  StringBuilder sb2=new StringBuilder();
        //  for(int i=0;i<word1.length;i++)
        //  {
        //      sb1.append(word1[i]);
        //  }
        //  for(int j=0;j<word2.length;j++)
        //  {
        //      sb2.append(word2[j]);
        //  }

        //  String s1=sb1.toString();
        //  String s2=sb2.toString();
        //  return s1.equals(s2);

        return String.join("",word1).equals(String.join("",word2));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
