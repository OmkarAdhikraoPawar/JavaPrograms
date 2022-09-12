
public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 20, num1 = 0, num2 = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; i++)
	    {
	      System.out.print(num1+ ", ");

          int total = num1 + num2;
	      num1 = num2;
	      num2 = total;
	}

}
	
}