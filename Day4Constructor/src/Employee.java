


public class Employee {
	int empId;  
	String empName; 
	Employee()
    {		
        empId = 123;
        empName = "Rohit"; 
    }   
    Employee(int id, String name)
    {  
	    this.empId = id;  
	    this.empName = name;  
    }  
     public void information()
     {
	      System.out.println("Id: "+empId+" Name: "+empName);
	 }
     public static void main(String args[]){
    	 
		 Employee obj = new Employee();
		 Employee obj1 = new Employee(11,"Suraj");  
		 Employee obj2 = new Employee(232,"Shubham");  
		 obj.information();
		 obj1.information();  
		 obj2.information();  
   }  

}
