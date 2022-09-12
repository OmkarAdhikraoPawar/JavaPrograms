
public class Banglo 
{
	private String bName;
	private double bArea;
	private OutHouse outObj;
	
	public String getBangloName()
	{
		return bName;
	}
	public void setBangloName(String n)
	{
		bName = n;
	}
	public double getBangloArea()
	{
		return bArea;
	}
	public void setBangloArea(double a)
	{
		bArea = a;
	}	
	public OutHouse getOutHouse()
	{
		return outObj;
	}
	public void setOutHouse(OutHouse o)
	{
		outObj = o;
	}	 
	public String toString()
    {
		  return bName+" "+bArea+" "+outObj ;
    }
}
