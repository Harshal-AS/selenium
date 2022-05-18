package unaryoperator;

public class Unaryoperator {

	public static void main(String[] args) {
		int a=34,b;
		b=a++;//b=34,a=35
		System.out.println("a:"+a);//35
		System.out.println("b:"+b);//34
		
		int z=a,x;//z=35
		x=z--;
		System.out.println("z:"+z);//34
		System.out.println("x:"+x);//35
		
		int p=-15,q=14;
		int res=p++ + q--;
		System.out.println("p:"+p);//-14
		System.out.println("q:"+q);//13
		System.out.println("res:"+res);//-1
		
		
		int res1=++p + --q;
		System.out.println("p:"+p);//-13
		System.out.println("q:"+q);//12
		System.out.println("res1:"+res1);//-1
		
		int res2=++p + q--;
		System.out.println("p:"+p);//-12
		System.out.println("q:"+q);//11
		System.out.println("res2:"+res2);//-1
		
		
	}

}
