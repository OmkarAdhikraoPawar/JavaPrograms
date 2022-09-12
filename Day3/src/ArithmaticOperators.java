
public class ArithmaticOperators {
	int add(int num1, int num2)
    {
        return num1+num2;
    }
    int sub(int num1, int num2)
    {
        return num1-num2;
    }
    int mul(int num1, int num2)
    {
        return num1*num2;
    }
    int div(int num1, int num2)
    {
        return num1/num2;
    }
    int mod(int num1, int num2)
    {
        return num1%num2;
    }
    

	public static void main(String[] args) {
		ArithmaticOperators a = new ArithmaticOperators();
		
		System.out.println("Sum of two numbers: "+a.add(10, 20));
		
		System.out.println("Sum of two numbers: "+a.sub(70, 20));
		
		System.out.println("Sum of two numbers: "+a.mul(100, 20));
		
		System.out.println("Sum of two numbers: "+a.div(400, 20));
		
		System.out.println("Sum of two numbers: "+a.mod(60, 20));
		

	}

}
