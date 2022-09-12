
class DryFruits extends Fruit
{
	String grade;
	float wholeSaleRate;
	
	public void export()
	{
		System.out.println("Exporting Fruit");
	}
	public void imports()
	{
		System.out.println("Imports Fruit");
	}
	
}
public class Inheritance {

	public static void main(String[] args) {
		DryFruits df = new DryFruits();
		df.eat();
		df.purchase();
		df.export();
		df.imports();

	}

}
