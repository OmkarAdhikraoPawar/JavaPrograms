
public class Area {
	int a,b;
	public float calculateArea(int a,int b)
	{
		float area = a*b;
		return area;
	}
	public double calculateArea(float a,float b)
	{
		double area = 0.5*a*b;
		return area;
	}
	public double calculateArea(float r)
	{
		double area = 3.14*r*r;
		return area;
	}

	public static void main(String[] args) {
		Area a = new Area();
		a.calculateArea(6);
		
		a.calculateArea(8, 9);
		System.out.println("Area of Rectangle :"+a.calculateArea(10, 5));
		System.out.println("Area of Circle :"+a.calculateArea(10, 5));
		System.out.println("Area of Triangle :"+a.calculateArea(10));
		
		

	}

}
