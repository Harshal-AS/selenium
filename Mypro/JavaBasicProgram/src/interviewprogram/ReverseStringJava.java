package interviewprogram;

public class ReverseStringJava {

	public static void main(String[] args) {
	String str="Harshal",a="";
	char ch;
	//System.out.println("orignal word");
	//System.out.println("Harshal");
	for(int i=0;i<str.length();i++) {
		 ch=str.charAt(i);
		a=ch+a;
		
	}
	System.out.println("Reversed number: "+a);
	

	}

}
