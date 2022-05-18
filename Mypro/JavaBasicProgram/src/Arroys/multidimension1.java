package Arroys;

public class multidimension1 {

	public static void main(String[] args) {
		int[][] v = new int[4][4];
		System.out.println("array total count use arrayname.length: " + v.length);
		// normal for loop single dimension
	//	for(int i=0;i<v.length;i++) {
			//System.out.println("normal for loop: "+v[i]);
		
		//for(int h=0;h<v[i].length;h++) {//cell count current row

		// System.out.println("normal for loop: "+v[i][h]);
	//	}}
		v[0][0] = 2;
		v[0][1] = 4;
		v[0][2] = 6;
		v[0][3] = 8;
		v[1][0] = 10;
		v[1][1] = 12;
		v[1][2] = 14;
		v[1][3] = 16;
		v[2][0] = 18;
		v[2][1] = 18;
		v[2][2] = 18;
		v[2][3] = 18;
		v[3][0] = 18;
		v[3][1] = 18;
		v[3][2] = 18;
		v[3][3] = 18;

		for (int i = 0; i < v.length; i++) {
			for (int h = 0; h < v[i].length; h++) {// cell count current row

				System.out.println("normal for loop: " + v[i][h] + " ");

			}
			System.out.println();
		}
	}
}
	

	


