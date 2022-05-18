package interviewprogram;

public class Equalitytwosarraysdiffrentmethods {

	public static void main(String[] args) {
		//definig arrays to be compare
		int[]a1=new int[] {1,2,3,4,5,6,7,8};
		int[]a2=new int[] {1,2,3,4,5,6,7,8};
		//compare references using==operator
		//works the same as a1.equals(a2)
		if(a1==a2)System.out.println("Array are equal");
		//if(a1.equals(a2))System.out.println("Array are equal");
	else 
		System.out.println("Array are not equal");
		
		}
		}


