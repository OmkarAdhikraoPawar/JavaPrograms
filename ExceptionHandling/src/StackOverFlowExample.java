
public class StackOverFlowExample {
	public static void test(int i)
	{
        if (i == 0)
        {
            return;
        }   
        else 
        {
            test(i++);
        }
    }     

	public static void main(String[] args) {
		StackOverFlowExample.test(10);
	}

}
