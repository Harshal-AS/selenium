package Arroys;

public class Samplearrays {

	public static void main(String[] args) {
		// String[] har;// declared =datatype [index] arrayname;
		 // har=new  String[4];// initilization=aarayname =datatype [index];
		 // or
		 /* String[] har=new String[4];// datatype[] aarayname=new datatype [index value].
		  har[0]="A";
		  har[1]="B";
		  har[2]="c";
		  har[4]="D";*/
		//  or
		 String[] har= {"A","B","C","D"};
		  
		 //  Access the elwmwnt of aaray
		  System.out.println(har[0]);//A
		  // change the array element
		  har[0]="Z";
		 System.out.println(har[0]);//Z
		  // array element count
		  System.out.println(har.length);//4
		//  fixed iteration so, use the for loop
		  for(int i=0;i<har.length; i++);
		  System.out.println(har[0]);  
		  
		  
		  //iteration array use for each loop
		  for(String i:har) {
		  System.out.println(i);//ZZBCD
		  }
	}

}
