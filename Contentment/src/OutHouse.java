
public class OutHouse
{
   int outHouseno;
   double outHouseArea;
   
   OutHouse() {}
   
   OutHouse(int ohn, double oha)
   {
	   outHouseno = ohn;
	   outHouseArea = oha; 
   }
   
   public String toString()
   {
	   return outHouseno+ " "+outHouseArea+" " ;
   }
   
}
