package string.com;

public class StringSpace {
	public void addSpaces(String str)
	{
		String word[] = str.split(" ");
		int wsps = 3,cnt = 1;
		String es ="";
		for(String w : word)
		{
			es += w;
			if(cnt<word.length)
				for(int i=1; i<wsps*cnt; i++)			
					es +="_";
			cnt++;
		}
		System.out.println(es);
		
	}

	public static void main(String[] args) {
		String str = "I am learning java";
		
		StringSpace obj = new StringSpace();
		obj.addSpaces(str);

	}

}
