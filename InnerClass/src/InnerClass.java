class Society
{
	int registerNo, surveyNo;
	String sName;
	Society(){}
	Society(int r, int s, String n)
	{
		registerNo = r;
		surveyNo = s;
		sName = n;
	}
	public void show()
	{
		System.out.println("Society Name: "+sName+" Register No: "+registerNo+" Survey No : "+surveyNo);
	}
	public void functionEvent()
	{
	   ClubHouse c =  new ClubHouse()
		{
			public void conductGames()
			{
				System.out.println("Games are conducted to Society Members..");
				
			}
			
		};
		c.conductGames();
	}
	public void performTask()
	{
		Decorate d = new Decorate()
		{
			public void makeDecoration()
			{
				System.out.println("Make Decorate");
				makeClubHouseReady();
			}
			public void makeClubHouseReady()
			{
				System.out.println("Club House Ready");
			}
			
		};
		d.makeDecoration();
	}
	class Flat
	{
		int fId;
		String oName;
		Flat(int id, String n)
		{
			fId = id;
			oName = n;
		}
		public void showFlatDetails()
		{
			System.out.println("Flat Id : "+fId+" Owner Name : "+oName);
		}
	}
	static class Audit
	{
		String aName;
		int aId;
		Audit(String n, int id)
		{
			aName = n;
			aId = id;
		}
		public void doAudit()
		{
			//System.out.println(sName);
			//showFlatDetails();
			System.out.println("Auditer Name : "+aName+" Audit ID : "+aId);
		}
	}
}
public class InnerClass {

	public static void main(String[] args) {
		//Society obj = new Society(101,1,"Gajanan Society");
		//Society.Flat f = obj.new Flat(7,"Suraj");
		//f.showFlatDetails();
		//Society.Audit a = new Society.Audit("EBTtgg",15754);
		//a.doAudit();
		
		Society s = new Society();
		//s.functionEvent();
		s.performTask();
		
		

	}

}
