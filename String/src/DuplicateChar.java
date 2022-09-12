import java.io.BufferedReader;
import java.io.InputStreamReader;
public class DuplicateChar {
	public String dublicateChar(char ch[])
	{
		String s = "";
		for (int i = 0; i < ch.length; i++)
		{
			if(ch[i]=='0')
				continue;
			int cnt = 0;
	        for (int j = i + 1; j < ch.length; j++)
	        {
	        	if(ch[i] == ch[j] ) 
	            {  
	                 cnt++;    
	                 ch[j] = '0';  
	            }
	        }	
	        if(cnt!=0)
	        {
	       	    s += ch[i]+"\n";
	       	}            	         	       
	    }
		return s;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input_from_question = br.readLine();
		
		char ch[] = input_from_question.toCharArray();
		input_from_question = "";
		
		DuplicateChar obj = new DuplicateChar();
		input_from_question = obj.dublicateChar(ch);
		
		System.out.println(input_from_question);
		
		
	}
	

}
