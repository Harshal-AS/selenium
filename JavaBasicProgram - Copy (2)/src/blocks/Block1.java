package blocks;

public class Block1 {
	
	static // static block initilized before main
	{
		
	System.out.println(" static block hi harshal");//1
}
//	{
//		System.out.println("pankaj");//5
//	}
		public static void main(String[] args) {
		}
		
//			System.out.println("program start");//3
//			//Block1 r1=new Block1 ();
//			System.out.println("hi ...................");//4
//			
//			System.out.println("program end");//7
//		}
//		
		static {
		System.out.println("static hi harshal 2");//2 static block
			
		}
//	{
//	System.out.println("non static block pankaj1");//6
//	}
}