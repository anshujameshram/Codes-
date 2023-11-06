package practice;

class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        int l=0,r=0;
        ArrayList<Integer> ans=new ArrayList<>();
        if(s==0){
            ans.add(-1);
            return ans;
        }
        
        boolean isfound=false;
        int sum=arr[0];
        while(r<n){
            if(sum==s)
            {
                isfound=true;
                break;
            }
            else if(sum<s)
            {
                r++;
                if(r<n) sum+=arr[r];
            }
            else{
                sum-=arr[l];
                l++;
            }
            
        }
        if(isfound)
        {
            ans.add(l+1);
            ans.add(r+1);
            return ans;
        }
        ans.add(-1);
        return ans;
    }
}