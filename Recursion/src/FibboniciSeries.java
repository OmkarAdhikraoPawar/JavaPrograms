
public class FibboniciSeries {
	public void fibbo(int a, int b, int range)
	{
		if(a <= range)
		{
			System.out.print(a+" ");
			int c = a + b;
			a = b;
			b = c;
			fibbo(a,b,range);
		}
	}

	public static void main(String[] args) {
		FibboniciSeries obj = new FibboniciSeries ();
		obj.fibbo(0, 1, 25);
		

	}

}
