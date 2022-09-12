import java.util.Scanner;
public class OddPosition {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the size of array = ");
		int size = sc.nextInt();
		int a[] = new int [size];
		System.out.println(" Enter the elements = ");
        for(int i=0; i<size ;i++ )
        {
           a[i] = sc.nextInt();
        }
        
        int sum = 0;
        float average = 0.0f;
        int cnt=0;
        for (int j=0; j<a.length;j++)
        {
          if((j+1) % 2 != 0)
          {
        	  sum +=  a[j];
        	  cnt++;
          }
        }
        average = sum / cnt;
        System.out.println(average);
        sc.close();
	

	}

}
