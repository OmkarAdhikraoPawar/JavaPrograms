package com.InheiAssignment;
class IPLTeam
{
	public void play()
	{
		System.out.println("10 Teams are playing in IPL");
	}
}
class CSK extends IPLTeam
{
	public void play()
	{
		super.play();
		System.out.println("Team CSK ");
	}
}
class RCB extends IPLTeam
{
	public void play()
	{
		System.out.println("Team RCB");
	}
}
public class IPL {

	public static void main(String[] args) {
		CSK c = new CSK();
		c.play();
		RCB r = new RCB();
		r.play();
		

	}

}
