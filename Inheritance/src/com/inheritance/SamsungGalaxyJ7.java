package com.inheritance;
class SamsungMobiles
{
	public void samsung()
	{
		System.out.println("Samsung Mobile Phones : ");
	}
}
class SamsungGalaxySeries extends SamsungMobiles
{
	public void galaxySeries()
	{
		System.out.println("Samsung Galaxy Series A, S, M, F, j, Note etc.");
	}
}

public class SamsungGalaxyJ7 extends SamsungGalaxySeries {
	public void jSeriesPhone()
	{
		System.out.println("Samsung Galaxy J7 Pro \nFeatures : \n Screen Size: 5.5 inches \n Display: 1920x1080 \n Storage: 64 GB \n Camera: 48MP.  ");
	}
	

	public static void main(String[] args) {
		SamsungGalaxyJ7 s = new SamsungGalaxyJ7();
		s.samsung();
		s.galaxySeries();
		s.jSeriesPhone();
		

	}

}
