import java.util.Scanner;
//1,3,7,15,31 ,….n
public class SeriesNumber_2 {

	public static void main(String[] args) {
		int i,num,sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Limit : ");
		num = sc.nextInt();
	
		for(i=1; i<=num; i++)
		{
			sum=(sum*2)+1;
			System.out.print(sum+" ");
		}
		sc.close();
		
		
	}

}
