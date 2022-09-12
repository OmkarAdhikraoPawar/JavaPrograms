
public class Exam {
	public Semester calculateResult(Semester obj1, Semester obj2)
	{
		Semester finalResult = new Semester();
		finalResult.rollNo = obj1.rollNo;
		finalResult.m1 = obj1.m1 + obj2.m1;
		finalResult.m2 = obj1.m2 + obj2.m2;
		finalResult.m3 = obj1.m3 + obj2.m3;
		return finalResult;
		
	}

	public static void main(String[] args) {
		Exam e = new Exam();
		
		Semester s1,s2;
		s1 = new Semester();
		s1.acceptDetails();
		s1.showDetails();
		
		s2 = new Semester();
		s2.acceptDetails();
		s2.showDetails();
		
		Semester res = e.calculateResult(s1, s2);
		res.showDetails();

	}

}
