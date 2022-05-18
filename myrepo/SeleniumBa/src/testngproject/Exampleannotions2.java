package testngproject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Exampleannotions2 {
@BeforeMethod
public void a() {
	System.out.println("hi ");
}
@Test(priority=1)
public void b() {
	System.out.println("hi 1");
}
@AfterMethod
public void C() {
	System.out.println("hi 2 ");
}
@Test(priority=2)
public void d() {
	System.out.println("hi 3");	
}
@Test(priority=3)
public void e() {
	System.out.println("hi 4");	
}
	public static void main(String[] args) {
		

	}

}
