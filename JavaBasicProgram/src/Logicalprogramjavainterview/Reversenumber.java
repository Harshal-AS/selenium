package Logicalprogramjavainterview;

public class Reversenumber {

	public static void main(String[] args) {
		int num=4567,reversed=0;
		System.out.println("orognal number: "+num);
		while(num!=0) {
			int digit=num%10;
			reversed=reversed*10+digit;
			num=10;
		}System.out.println("Reversed number:"+reversed);
		}

	}


