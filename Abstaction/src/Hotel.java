abstract class Food
{
	abstract public void recipe();
	abstract public void ingredients();
	public void parsal(String f)
	{
		System.out.println("Parsal food is : "+f);
	}	
}
abstract class MixVeg extends Food
{
	public void recipe()
	{
		parsal("Mix Veg");	
		System.out.println("Recipe of Mix Veg");			
	}
	public void ingredients() 
	{
		System.out.println("Ingredients are : Onions chopped, Tomato Slices,Mix Vegetables,salt,powder");
		
	}
	abstract public void paratha();
	
}
class Atta extends MixVeg
{
	public void recipe()
	{
		System.out.println("recipe of Atta");
	}
	public void paratha()
	{
		System.out.println("Paratha");
	}
	public void roti()
	{
		System.out.println("Roti");
	}
	public void naan()
	{
		System.out.println("Naan");
	}
	
}
public class Hotel {

	public static void main(String[] args) {
		Food f = new Atta();
		f.recipe();
		f.ingredients();
		MixVeg m = new Atta();
		m.paratha();
		Atta a = new Atta();
		a.recipe();
		a.roti();
		a.naan();
		
	}

}
