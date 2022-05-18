package testngproject;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exapleofannotions1 {
@BeforeTest
public void openbrowser() {
	System.out.println("before open browser");//1
}
@Test(priority=1)//2
public void a() {
	System.out.println(" pritority first means lower so executed first");
}
@AfterTest
public void b() {
	System.out.println("after browser open last executed");//4
}
@Test(priority=2)
public void f() {
	System.out.println("priority second executed");//3
}
	public static void main(String[] args) {
		
	}

}
