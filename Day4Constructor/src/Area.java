
public class Area {
int length ,breadth;
	
	Area()
	{
		System.out.println("I am in Default Constructor ");
		length = 5;
		breadth = 6;
		
	}
	Area(int length, int breadth)
	{
		System.out.println("I am in Parameterized Constructor ");
	    this.length = length;
	    this.breadth = breadth;
	}

	  public void getArea()
	  {		  
	      int area = length * breadth;
	      System.out.println("Area: " + area);
	  }

	public static void main(String[] args) {
		Area a,a1,a2,a3;
		a = new Area();
		a.getArea();
		
		a1 = new Area(7,8);
		a1.getArea();
		
		a2 = new Area(10,15);
		a2.getArea();
		
		a3 = new Area(10,4);
		a3.getArea();
		

	}

}


