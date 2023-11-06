package leetcode;

import java.util.*;
//https://tutorialcup.com/leetcode-solutions/number-of-good-pairs-leetcode-solution.htm
//Approach (Optimized)
//We can optimize the solution by using Hash Map. There is no use of iterating over all combinations of pairs i*j times. We have to count only the equal elements.
//i.e. If we have count of a particular element in the array we can calculate total number of ways of picking any two elements in this set of similar elements.
//For this what we can do is, we can iterate from the 1st element and update the count of each element at every step.
//Whenever we find a element we will check how many similar elements have already been present before this element using a count map variable. So that it can make pair with all those previous occurred elements.
//We will add that count to our result and update (increment) the count of current element by +1.
//
//Number of Good Pairs Leetcode Solution
//
//Algorithm :
//1. Create a Has Map of Integer and Integer whose key is the element and value is the current count of that element.
//2. Run a for loop for each element form i=0 to n-1.
//3. Find the count(a[i]) before putting it into the map and add this value to the res.
//4. Now update the count of a[i] as count(a[i]) = count(a[i]) + 1.
//5. Return the value of res.
public class NumberOfGoodPairs {
	 public int numIdenticalPairs(int[] nums) {
	        int res=0;
	        Map<Integer,Integer> count=new HashMap<Integer,Integer>();
	        for(int a:nums)
	        {
	        	int cur=count.getOrDefault(a,0);  //get count of current value
	            res+=cur; //add the count to res variable 
	            count.put(a,cur+1); //insert into map
	        }
	        return res;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
