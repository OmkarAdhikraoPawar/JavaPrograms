import java.util.Scanner;
//find which is greatest  number in between 2 numbers  using switch

public class Assignment10 {

	public static void main(String[] args) {
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		num1 = sc.nextInt(); 
		System.out.println("Enter Second Number");
		num2 = sc.nextInt();
		int max = 0;
		if(num1>num2)
			max = 0;
		else
			max = 1;
		switch(max)
		{
		case 0 :
			System.out.println(num1+" is Maximum");
			break;
		case 1 :
			System.out.println(num2+" is Maximum");
			break;
		default :
			System.out.println("Both the Number are Equal");
			
			
		}
		sc.close();

	}

}
