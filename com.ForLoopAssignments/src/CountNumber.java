//Write a program to count number of digits in any number
public class CountNumber {

	public static void main(String[] args) {
		int count = 0, num = 123456;

	    for (; num != 0; num /= 10, ++count) {
	    }

	    System.out.println("Number of digits: " + count);
	}
}
