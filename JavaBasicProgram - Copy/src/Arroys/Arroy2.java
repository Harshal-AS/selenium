package Arroys;

import java.util.Arrays;

public class Arroy2 {

	public static void main(String[] args) {
		int []aaru= {20,40,30,10};
		System.out.println(aaru.length);//4
		System.out.println(" printing of original arroy");
		for(int i:aaru) { //arroy r=each for loop
			System.out.println(i);
		}
		System.out.println(" printing clone of the arroy");
		int []car=aaru.clone();
		for(int h:car) {
			System.out.println(h);
		}
		System.out.println(" both are equal aaru&car ?");
	System.out.println(Arrays.equals(aaru,car));// true
	System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,");
	

	int newCopiedArray[]=Arrays.copyOf(aaru, aaru.length);
	for (int i : newCopiedArray){
		System.out.println(i);
		System.out.println(".............................");
	}
	
	int newCopiedRangeArray[]=Arrays.copyOfRange(aaru, 0, 2);//range=20,40
	for (int i : newCopiedRangeArray){
		System.out.println(i);
		
}
	System.out.println("copare between newCopiedArray&newCopiedRangeArray:"
	                          +  Arrays.equals(newCopiedArray,newCopiedRangeArray));
	//FALSE
	Arrays.sort(aaru);//sort the array elements in ascending order and stores the sorted element in the same array
	System.out.println("After sorting original array:");
	for (int i : aaru) {
		System.out.println(i);
	}
}
}
