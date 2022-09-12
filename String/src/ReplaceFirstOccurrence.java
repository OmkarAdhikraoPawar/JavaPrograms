
public class ReplaceFirstOccurrence {

	public static void main(String[] args) {
		String str = "Hi! Good morning. Have a Good day.";
        String str1 = "Good";
        String str2 = "Very-Good";         
        //replace first occurrence
        String resultStr = str.replaceFirst(str1, str2);        
        System.out.println(resultStr);

	}

}
