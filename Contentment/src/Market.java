
public class Market {
	String mName;
	int mShops;
	Shop sObj;
	Market(String n,int s,Shop ob)
	{
		mName = n;
		mShops = s;
		sObj = ob;
	}
	public String toString()
	{
		return mName+" ,"+mShops+" ,"+sObj;
	}

}
