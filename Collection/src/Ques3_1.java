
import java.util.ArrayList;
import java.util.Iterator;

public class Ques3_1 
{
	

	public void showSyllabus(ArrayList<Ques3>syl)
	{
		System.out.println("Display the Subject Name ");
		syl.add(new Ques3("Math","Addition & Substraction "));
		Ques3 syl1=new Ques3("Englisj","Tense");
		syl.add(syl1);
		syl.add(new Ques3("Java","class & object"));
		syl.add(new Ques3("Electronic ", "Sensors"));
		syl.add(new Ques3("Java","Inheritance"));
		syl.add(new Ques3("English","phases"));
		System.out.println(syl);
	}
	public void display(ArrayList<Ques3>syl)
	{
		System.out.println("Display the topic Name ");
		Iterator<Ques3>itr=syl.iterator();
		while(itr.hasNext())
		{
			Ques3 sy=itr.next();
			if("Java".equals(sy.subName))
			{
				System.out.println("Topic:"+sy.topicName);
			}
		}
	}

	public static void main(String[] args) 
	{
		ArrayList<Ques3>syl=new ArrayList();
		Ques3_1 obj=new Ques3_1();
		obj.showSyllabus(syl);
		obj.display(syl);

	}

}