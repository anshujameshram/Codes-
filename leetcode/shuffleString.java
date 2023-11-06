package leetcode;

public class shuffleString {
	public String restoreString(String s, int[] indices) {
        StringBuilder res=new StringBuilder(s);
        for(int i=0;i<indices.length;i++)
        {
            res.setCharAt(indices[i],s.charAt(i));
        }
        return res.toString();
    }
	public static void main(String[] args) {
		

	}

}
