import java.io.*;
import java.util.*;
public class CheckedExceptionThrown {

	public static void main(String[] args) throws FileNotFoundException{
        FileInputStream obj = null;
        try 
        {
        	obj = new FileInputStream("/home/file/omk.txt");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File does not exist");
            System.out.println(e.getMessage());
        }

	}

}
