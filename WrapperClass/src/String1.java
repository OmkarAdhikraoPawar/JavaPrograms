
public class String1 {
	public void char3(String str)
	{
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int c = (int)ch[i]+1;
			System.out.print((char)c);
		}
	}

	public static void main(String[] args) {
		String str = "sdjfsd";
		String1 obj = new String1();
		obj.char3(str);
		
		

	}

}
