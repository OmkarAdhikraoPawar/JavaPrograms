
public class Demo1 {

	public static void main(String[] args) {
		Integer o = 55;
		int a = o.intValue();
		System.out.println(a);	
		o = Integer.parseInt("123");
		System.out.println(o);
		System.out.println("____________________");
		
		Double d = 10.5;
		double b = d.doubleValue();
		System.out.println(b);
		d = Double.parseDouble("115.3");
		System.out.println(d);

	}

}
