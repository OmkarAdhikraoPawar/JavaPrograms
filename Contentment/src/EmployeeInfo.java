
public class EmployeeInfo {

	public static void main(String[] args) {
		
		Department1 dept = new Department1(1 , " Computer ") ;
		MyDate mydate = new MyDate( 31," March",1998);
		Employee obj = new Employee( 1, " Suraj ", 25000,dept,mydate);
		System.out.println(" ** Employee Infomation ** ");
        System.out.println(obj);
		

	}

}
