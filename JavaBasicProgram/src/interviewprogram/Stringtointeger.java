package interviewprogram;

public class Stringtointeger {

	public static void main(String[] args) {
		int x=5;
		//1st way
		String str=Integer.toString(x);
		System.out.println(str);
		//2nd way
		String str2=String.valueOf(x);
		System.out.println(str2);
	}

}
