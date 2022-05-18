

import org.testng.annotations.Test;

public class TestNGpara3 {
@Test(enabled=true)
public void a() {
	System.out.println("enable to process =retue executed");
}
@Test(enabled=false)
public void b() {
	System.out.println("enable=false not executed");
}
@Test(enabled=true)
public void c() {
	System.out.println("enable to process =retue executed");
}
@Test(enabled=false)
public void d() {
	System.out.println("enable=false not executed");
}
	public static void main(String[] args) {
	
	// enabled= true only executed test method	
		// enabled= false not executed test method	
	}

}
