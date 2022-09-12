package string.com;

import java.util.Arrays;

public class CopyString {
	public void copyStr(String str, String strCopy)
	{
		System.out.println(strCopy);
	}
	public void removeChar(String str,char ch)
	{
		String str1 = "";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=ch)
			{
				str1+=str.charAt(i);
			}
		}
		System.out.println("After Removing :"+str1);
	}
	public void findOcc(String str)
	{
		char ch [] = new char [ str.length()];
		for( int i=0; i<str.length(); i++)
		{
			ch[i] = str.charAt(i);
		}
		System.out.println();
		System.out.println(Arrays.toString(ch));
		
		for ( int i=0; i<ch.length; i++)
		{
			if (ch[i] == '0')
			 continue;
			int cnt=1;
			for( int j=i+1; j<str.length(); j++)
			{
				if (ch[i] == ch[j])
				{
					cnt++;
					ch[j]=0;
				}
			}
			System.out.println(ch[i]+" Occurance "+cnt+" times");
		}
	}
	public void reverse(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=str.length()-1; i>=0; i--)
		{			
			if(i%2==0)
		    System.out.print(ch[i]);
		}	
		
	}

	public static void main(String[] args) {
		String str = "hello";
		String strCopy = str;
		char ch = 'l';
		CopyString o = new CopyString();
		o.copyStr(str, strCopy);
		System.out.println("___________________________");
		o.removeChar(str, ch);
		System.out.println("___________________________");
		o.findOcc(str);
		System.out.println("___________________________");
		o.reverse(str);
	
		

	}

}
