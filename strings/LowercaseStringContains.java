package strings;

public class LowercaseStringContains {
	
		 
	    private static boolean isStringLowerCase(String str){
	        
	        //convert String to char array
	        char[] charArray = str.toCharArray();
	        
	        for(int i=0; i < charArray.length; i++){
	            
	            //if any character is not in lower case, return false
	            if( !Character.isLowerCase( charArray[i] ))
	                return false;
	        }
	        
	        return true;
	 
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "lowercasestring";
        System.out.println( "Is String lowercase?: " + isStringLowerCase(str) );
	}

}
