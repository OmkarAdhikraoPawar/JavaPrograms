package string.com;

public class CharacterString {
	
	public void checkCount(String str, char ch) 
    { 
    	int count = 0;
    	for(int i=0;i<str.length();i++)
    	{
    		if(str.charAt(i) == ch)
    			count++;
    	}
    	System.out.println("Character "+ch+" Count is : "+count);
	   
    } 
	

	public static void main(String[] args) {
		String str = "Hello";
		char ch = 'H';
		CharacterString obj = new CharacterString();
		
		obj.checkCount(str, ch);

	}

}
