class Car
{
	String Vehicle;
	public void car1()
	{
		System.out.println("Quality Cars");
	}
}
class Tata extends Car
{
	int speed;
	public void Brand()
	{
	    System.out.println("TATA");
	}
}
public class TataSafari extends Tata
{
	public void model()
	{
		System.out.println("TATA Model : Safari");
	}

	public static void main(String[] args) {
		TataSafari t = new TataSafari();
		t.car1();
		t.Brand();
		t.model();
		

	}

}
