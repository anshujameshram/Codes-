package leetcode;

public class truncateSEntence {
	public String truncateSentence(String s, int k) {
        String[] s2=s.split(" ");
        
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<k;i++)
        {
            sb1.append(s2[i]+" ");
        }
        String s1=sb1.toString().trim(); //trim() is used to remove last space
        return s1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
