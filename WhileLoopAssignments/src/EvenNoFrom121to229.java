//WAP to print even numbers from 121 to 229 using for loop. 
public class EvenNoFrom121to229 {

	public static void main(String[] args) {
		int i = 121;
		System.out.println("List of Even Numbers from 121 to 229 is : ");
		while(i<=229)
		{
			i++;
			if(i%2 == 0)
			{
				System.out.println(i+ " ");
			}
		}

	}

}
