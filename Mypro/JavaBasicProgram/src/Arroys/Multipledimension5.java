package Arroys;

public class Multipledimension5 {

	public static void main(String[] args) {
		//int [][]sam;
		int [][]sam=new int[4][4];
		System.out.println(sam.length);//4
		sam[0][0]=1;
		sam[0][1]=2;
		sam[0][2]=3;
		sam[0][3]=4;
		sam[1][0]=5;
		sam[1][1]=6;
		sam[1][2]=7;
		sam[1][3]=8;
		sam[2][0]=9;
		sam[2][1]=10;
		sam[2][2]=11;
		sam[2][3]=12;
		sam[3][0]=13;
		sam[3][1]=14;
		sam[3][2]=15;
		sam[3][3]=16;
		System.out.println(sam[0][0]);
		System.out.println(sam[0][1]);
		System.out.println(sam[0][2]);
		System.out.println(sam[0][3]);
		System.out.println(sam[1][0]);
		System.out.println(sam[1][1]);
		System.out.println(sam[1][2]);
		System.out.println(sam[1][3]);
		System.out.println(sam[2][0]);
		System.out.println(sam[2][1]);
		System.out.println(sam[2][2]);
		System.out.println(sam[2][3]);
		System.out.println(sam[3][0]);
		System.out.println(sam[3][1]);
		System.out.println(sam[3][2]);
		System.out.println(sam[3][3]);
		for(int i=0;i<sam.length;i++) {
			for(int j=0;j<sam[i].length;j++) {
				System.out.print(sam[i][j] + " ");
		}
		System.out.println();
	}

}
}
