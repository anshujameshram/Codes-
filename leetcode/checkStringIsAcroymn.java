package leetcode;

import java.util.List;

public class checkStringIsAcroymn {
	public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<words.size();i++)
        {
            sb1.append(words.get(i).charAt(0));
        }
    String ss=sb1.toString();
    return ss.equals(s);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
