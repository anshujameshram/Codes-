package leetcode;

import java.util.HashSet;
import java.util.Set;

public class countConsistentString {
	public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set=new HashSet<Character>();

        for(char ch:allowed.toCharArray())
        {
            set.add(ch);
        }
        int res=0;
        for(String w:words)
        {
            boolean match=true;
            for(char ch:w.toCharArray())
            {
                if(!set.contains(ch))
                {
                    match=false;
                    break;

                }
            }
            if(match)
            {
                res++;
            }
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
