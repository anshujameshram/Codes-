package practice;

public class findNumberOfTriangles {

	public static void main(String[] args) {
		Arrays.sort(arr);
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(arr[i]+arr[j]>arr[k])
                        count++;
                }
            }
        }
        return count;
	}

}
