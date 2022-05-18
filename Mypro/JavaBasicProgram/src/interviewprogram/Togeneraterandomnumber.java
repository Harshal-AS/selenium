package interviewprogram;

public class Togeneraterandomnumber {

	public static void main(String[] args) {
		int min=50;
		int max=100;
		//generate random value from 50 to 100
		System.out.println("random value in int from: "+min);
		System.out.println("random value in int from: "+max);
		int random_int=(int)Math.floor(Math.random()*(max-min+1)+min);
		System.out.println(random_int);
	}

}
