
public class BoxingAndUnBoxing {

	public static void main(String[] args) {
		//Boxing
		byte b = 100;
		Byte B = new Byte(b); 
		System.out.println(B);
		  
	    short s = 100; 
		Short S = new Short(s); 
		System.out.println(S);
		  
		int i = 200; 
		Integer I = new Integer(i);
		System.out.println(I);
		  
		long l = 250; 
		Long L = new Long(l); 
		System.out.println(L);
		
		float f = 120L; 
		Float F = new Float(f);
		System.out.println(F);

		double d = 18.58; 
		Double D = new Double(d);
		System.out.println(D);

		boolean bln = false; 
		Boolean BLN = new Boolean(bln);
		System.out.println(BLN);

		char c = 'C'; 
		Character C = new Character(c); 
		System.out.println(C);
		
		System.out.println("_________________________");
		//UnBoxing
		Byte B1 = new Byte((byte) 10); 
		byte b1 = B1.byteValue(); 
	    System.out.println(b1);

		Short S1 = new Short((short) 20);
		short s1 = S1.shortValue();
		System.out.println(s1);

		Integer I1 = new Integer(15); 
		int i1 = I1.intValue(); 
		System.out.println(i1);

	    Long L1 = new Long(50); 
		long l1 = L1.longValue(); 
		System.out.println(l1);

		Float F1 = new Float(20); 
		float f1 = F1.floatValue(); 
		System.out.println(f1);

		Double D1 = new Double(20.5); 
		double d1= D1.doubleValue(); 
		System.out.println(d1);

		Boolean BLN1 = new Boolean(true);
		boolean bln1 = BLN1.booleanValue(); 
		System.out.println(bln1);

		Character C1 = new Character('C'); 
		char c1 = C1.charValue(); 
		System.out.println(c1);
		 
		

	}

}
