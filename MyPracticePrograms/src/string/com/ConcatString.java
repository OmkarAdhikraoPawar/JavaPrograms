package string.com;

public class ConcatString {
	public void concat(String s1,String s2)
	{
		String emptystr = "";
		for(int i=0;i<s1.length();i++)
		{
			emptystr+=s1.charAt(i);
		}
		for(int i=0;i<s2.length();i++)
		{
			emptystr+=s2.charAt(i);
		}
		System.out.println(emptystr);
	}

	public static void main(String[] args) {
		//String s = "Wel"+"come";
		//System.out.println(s);
		
		String s1="Java ";  
		String s2="Programming";  
		//String s3=s1.concat(s2);  
		//System.out.println(s3);
		
		//String s4 = s3.replace("Java", "C");
		//System.out.println(s4);
		//System.out.println(s3);
		
		ConcatString obj = new ConcatString();
		obj.concat(s1, s2);
		
		
		
		

	}

}
