package interviewprogram;

public class Reversestringusingrecursive {

	public static void main(String[] args) {
		String str="Welcome to Beginnersbook ";
		String reversed=reverseString(str);
		System.out.println("the reversed string is; "+reversed);

	}
	public static String reverseString(String str) {
		if(str.isEmpty())
			return str;
		//calling function recursively
		return reverseString (str.substring(1))+str.charAt(0);
		
	}

}
