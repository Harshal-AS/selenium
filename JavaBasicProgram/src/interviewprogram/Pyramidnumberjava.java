package interviewprogram;

import java.util.Scanner;

public class Pyramidnumberjava {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Taking noofrows value for user
		System.out.println("how many rows you want in youe pyramid");
		int noofrows=sc.nextInt();
		//initilize rowcount with 1
		int RowCount=1;
		System.out.println("here in your pyramid");
		//implrmenting the logic
		for(int i =noofrows;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.println(" ");
			}}
				for(int j=1;j<=RowCount;j++){
				System.out.println(RowCount);		
		}
				System.out.println();
				RowCount++;
	}

}
