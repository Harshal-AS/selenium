

import org.testng.annotations.Test;

public class TestNGpara2 {
@Test(priority=1)
public void a() {
	System.out.println("hi harsha a");
}
@Test(priority=2)
	public void b() {
		System.out.println("hi harshal b");
	}
	@Test(priority=3)
	public void c() {
		System.out.println("hi harshal c");
}
	public static void main(String[] args) {
		
// pritority is a lowset priority is first executed
	}

}
