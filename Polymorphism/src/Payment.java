import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CreaditCard
{
	public void doPayment(double amt)
	{
		System.out.println("Payment Done = "+amt);
    }
}	
class DebitCard
{
	public void doPayment(double amt)
	{
		System.out.println("Payment Done = "+amt);
	}
}
class NetBanking
{
	public void doPayment(double amt)
	{
		System.out.println("Payment Done = "+amt);
	}
}
public class Payment
{

	public void payment(CreaditCard p)
	{
		p.doPayment(5000);
	}
	public void payment(DebitCard p)
	{
		p.doPayment(5000);
	}
	public void payment(NetBanking p)
	{
		p.doPayment(5000);
	}


	public static void main(String[] args) {
		Payment p = new Payment();
		System.out.println("Select Payment Option : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String choice = null;
		try{
			choice = br.readLine();
		}catch (IOException e){
			e.printStackTrace();
		}
		if(choice.equals("CreaditCard"))
		{
			CreaditCard c = new CreaditCard();
			p.payment(c);
		}else if(choice.equals("DebitCard"))
		{
			DebitCard d = new DebitCard();
			p.payment(d);
		}else
		{
			NetBanking n = new NetBanking();
			p.payment(n);
		}
		
	}

}
