package leetcode;

public class longestCommonPrefix {
	String compare(String a,String b)
    {
        int i=0,j=0;
        String ret="";
        while(i<a.length()&& j<b.length())
        {
            if(a.charAt(i)==b.charAt(j))
            {
                ret+=String.valueOf(a.charAt(i));
                
            }else{
               return ret; 
            }
            i++;j++;
        }
        return ret;
    }
    String longestCommonPrefix(String arr[], int n){
        // code here
        String ans=arr[0];
        for(int i=0;i<n-1;i++)
        {
            String x=compare(ans,arr[i+1]);//compare and return common prefix
            if(x.equals("")){
                return "-1";
            }
            ans=x;
            
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
