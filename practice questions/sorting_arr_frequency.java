package practice;

import java.util.Map;
import java.util.*;

public class sorting_arr_frequency {
	public static int[] frequencySort(int[] nums)
	{
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++)
		{
			//to add elements in map first check if array elements present inside the map
			if(map.containsKey(nums[i]))
			{
				map.put(nums[i], map.get(nums[i])+1);  //going to increment the frequency of that key
				//nums[i]=key we put the array element 
				//map.get(nums[i])+1=frequency of that array element +1
				
			}
			else {
				map.put(nums[i], 1); //key is not present inside the map so going to add 
				//that element into map and frequency as well
				
			}
		}
		//to add key inside the map into the list going to use keySet() method
		List<Integer> list=new ArrayList<Integer>(map.keySet()); 
		//sort the list 
		//condition multiple values of the same frequency then sort them in descending order
		Collections.sort(list,(a,b)->{
			//if a and b have same frequency then b should print first
			if(map.get(a)==map.get(b)) {
				return b - a;  //b will appeared first and then a
			}
			else {
				return map.get(a) - map.get(b);  //if frequency of a and b are not equal 
				//then a will print first and then b
			}
		
		});
		int result[]=new int[nums.length]; //converting list into array we define array first
		int index=0;
		for(int num:list)
		{
			//map.get(num)---frequency of that num so that much times they will num
			for(int i=0;i<map.get(num);i++) {
				result[index++]=num;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int a[]=frequencySort(arr);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}
