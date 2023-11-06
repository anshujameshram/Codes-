package leetcode;

public class checkpangram {
	public boolean checkpangram(char ch,String str){
        for(char c:str.toCharArray())
        {
            if(c==ch)
                return true;
        }
        return false;
    }
    public boolean checkIfPangram(String sentence) {
         //string is pangram if it contains all alphabets from A to Z
         boolean flag=false;
         for(char ch='a';ch<='z';ch++)
         {
             boolean panagram=checkpangram(ch,sentence);
             if(panagram==false){
                flag=false;
                break;
             }else{
                 flag=true;
             }


         }
         return flag;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
