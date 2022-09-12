
//1,2,4,11,16,22,29
public class SeriesNumber_3 {

	public static void main(String[] args) {
		int i,num;
		
		for(i=0;i<=10;i++)
		{
			num = 1 + ((i * (i + 1)) / 2);
			System.out.print(num+", ");
		}
		
	}

}