package com.stringAssignment;
import java.util.Scanner;
public class OccuranceOfWord
{
	
    public void countWord(String s)
    {
    	int cnt=0;
	    char ch[] = s.toCharArray();
	   //System.out.println(ch.length);
			
	for(int i=0;i<s.length();i++)
	{
		if(ch[i]==' ')
		cnt++;
    }			
	String words[] = new String[cnt+1];
	String word="";
	int j=0;
			
	for(int i=0;i<ch.length;i++)
	{
	  if(ch[i]!=' ')
	   {
		 word = word+ch[i];
	   }
	   else
	   {		   
		   words[j] = word;
		   j++;
		   word="";
	   }
    }
	words[j]=word;	
	findOccur(words);
}
  
  public void findOccur(String words[]){
	  
	  for(int i=0;i<words.length;i++)
	  {
		  
	      if (words[i]=="0")
			continue;
		  int cnt=1;
		  for(int j=i+1;j<words.length;j++)
		  {
			  if(words[i].equals(words[j]))
		      {
				  cnt++;
					words[j]="0";
			  }
	      }
		  System.out.println(words[i]+" occurs "+cnt+" times");
	  }
  }
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		
		OccuranceOfWord o = new OccuranceOfWord();
		o.countWord(s);
		sc.close();

	}

}


