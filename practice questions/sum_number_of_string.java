package practice;

public class sum_number_of_string {

	public static void main(String[] args) {
		//"4PREP2INSTAA6"
		String str="4PREP2INSTAA6";
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				sum=sum+(str.charAt(i)-'0');
			}
		}
		System.out.println("Sum="+sum);
	}

}
