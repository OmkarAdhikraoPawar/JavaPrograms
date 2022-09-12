import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int a = sc.nextInt();
		
		switch(a)
		{
		case 1 :System.out.println("The Value of a = One");
		        break;
		case 2 :System.out.println("The Value of a = Two");
                break;
		case 3 :System.out.println("The Value of a = Three");
                break;
		case 4 :System.out.println("The Value of a = Four");
                break;
		case 5 :System.out.println("The Value of a = Five");
                break;
        default :
        	System.out.println("Invalid Input");
      
		}
		sc.close();

	}

}
