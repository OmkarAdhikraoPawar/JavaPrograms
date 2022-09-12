
public class WordOccurance {
	public void occurance(String s)
	{
		char ch[] = new char[20];
		for(int i=0;i<s.length();i++)
		{
			ch[i]=s.charAt(i);
		}
		for(int i=0;i<s.length();i++)
		{
			int cnt = 1;
			if(ch[i]=='@')
				continue;
			for(int j=i+1;j<s.length();j++)
			{
				if((ch[i] == ch[j]) && (i != j))
				{
					cnt++;
					ch[j] = '@';
				}
			}
			System.out.println(ch[i]+" Occurs "+cnt+" time.");
			
		}
	}

	public static void main(String[] args) {
		WordOccurance w = new WordOccurance();
		String s = "Good Morning";
		w.occurance(s);
		

	}

}
