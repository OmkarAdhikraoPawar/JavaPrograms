
public class StayArrangement {

	public static void main(String[] args) {
	
		OutHouse obj = new OutHouse(12, 123);
		
		Banglo obj1 = new Banglo();
		obj1.setBangloName("Abc");
		obj1.setBangloArea(65);
		obj1.setOutHouse(obj);		
		System.out.println(obj1);
	}

}
