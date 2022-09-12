package com.enumAssignment;
enum Softy
{
	BUTTERSCTOCH(100,10),VENELLA(110,5),MANGO(120,7);
	int price;
	int quantity;
	Softy(int p, int q)
	{
		price = p;
		quantity = q;			
	}
	public void calculateBill()
	{
		int total = price * quantity;
		System.out.println(total);
	}
}
public class IceCreamParler {

	public static void main(String[] args) {
		Softy s = Softy.BUTTERSCTOCH;
		
		switch(s)
		{
		case BUTTERSCTOCH: 
			s.calculateBill();
			break;
		case VENELLA:
			s.calculateBill();
			break;
		case MANGO:
			s.calculateBill();
			
		}

	}

}
