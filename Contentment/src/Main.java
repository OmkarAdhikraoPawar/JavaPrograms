
public class Main {

	public static void main(String[] args) {
		Shop obj = new Shop("ms",1);
		Market obj1 = new Market("ABC",10,obj);
		System.out.println(obj1);
	}

}
