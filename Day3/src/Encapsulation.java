
public class Encapsulation {
	private String course;
	
	public String getCourse()
	{
	    return course;
    }
	  public void setCourse(String s)
	  {
	    course = s;
	  }

	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		e.setCourse("Core Java");
		System.out.println(e.getCourse());

	}

}
