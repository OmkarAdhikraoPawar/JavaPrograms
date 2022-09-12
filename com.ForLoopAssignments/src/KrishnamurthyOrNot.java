import java.util.Scanner;
//WAP to check given no is Krishnamurthy or not
public class KrishnamurthyOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
        int den, fact, sum = 0,num = n;
        for(; num>0; num=num/10)
        {
        	den = num % 10;
        	fact =den * den * den;
        	sum = sum + fact;
        }
        if(sum == n)
        	System.out.println("The Given Number is Krishamurthy Number ");
        else
        {
        	System.out.println("The Given Number is not Krishamurthy Number ");
        }
        sc.close();
	}

}
