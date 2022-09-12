
public class BufferAndBuilder {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("String"); 
		StringBuffer sb2 = new StringBuffer("String"); 

		System.out.println(sb1.equals(sb2));
		
		StringBuilder s1 = new StringBuilder("String"); 
		StringBuilder s2 = new StringBuilder("String"); 

		System.out.println(s1.equals(s2));

	}

}
