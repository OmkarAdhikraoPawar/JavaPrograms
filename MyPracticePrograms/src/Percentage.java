import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter out of Marks :");
		int totalmaths=sc.nextInt();
		System.out.println("Enter Marks of maths :");
		int maths=sc.nextInt();
		System.out.println("Enter out of Marks :");
		int totalphysics=sc.nextInt();
		System.out.println("Enter Marks of Physics :");
    	int physics=sc.nextInt();
		System.out.println("Enter out of Marks :");
		int totalchemistry=sc.nextInt();
		System.out.println("Enter Marks of Chemistry :");
		int chemistry=sc.nextInt();
		sc.close();
		double percentage = ((maths+physics+chemistry)*100)/(totalmaths+totalphysics+totalchemistry);
		System.out.println("Percentage :"+percentage);
		
		

	}

}
