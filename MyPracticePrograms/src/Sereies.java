import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Sereies {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input_from_question = br.readLine();
		int no = Integer.parseInt(input_from_question);
		input_from_question="";
		for(int i=0;i<no;i++)
		{
			i = (i*2)+1;
			input_from_question+=" ";
		}
		System.out.println(input_from_question);
	}

}
