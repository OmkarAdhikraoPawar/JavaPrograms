package com.interf;
interface Service
{
	void provideService(String n,float charges);
}
public class Services {

	public static void main(String[] args) {
		Service s = (n,charges)-> {System.out.println("Services for Bike "+n);
        System.out.println("Chargers for "+n+" Service : "+charges);};
		s.provideService("Insurance", 5000.0f);

	}

}
