package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonwebpagenavigation {

	public static void main(String[] args) throws InterruptedException {
		String driver1=".//executables//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver1);
		 WebDriver cdriver=new ChromeDriver();
		// cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(1000);
		cdriver.get("https://www.amazon.in");
		Thread.sleep(2000);
		Dimension harshal=new Dimension(400,500);
cdriver.manage().window().setSize(harshal);
		cdriver.manage().window().maximize();
		String actualtitle=cdriver.getTitle();
		String expectedtitle="amazon-log";
		System.out.println("actualtitle: "+actualtitle);
		System.out.println("expectedtitle: "+expectedtitle);
		WebElement c=cdriver.findElement(By.id("twotabsearchtextbox"));
		c.sendKeys("Mobiles 9 pro");
		cdriver.get("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
			String a=cdriver.getTitle();
			String expectedur2="https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles";
		System.out.println("a:"+a);
		System.out.println("a:"+expectedur2);
		//WebDriverWait har=new WebDriverWait(cdriver,15);
		
		//Wait.Until(ExpectedConditions.elementToBeClickable(A));
		cdriver.navigate().back();
		String actualtitle1=cdriver.getTitle();
		String expectedtitle1="amazon-log";
	System.out.println("a:"+actualtitle1);
		System.out.println("expectedtitle1:"+expectedtitle1);
		if(actualtitle1.contains(expectedtitle1)) {
		System.out.println("URL PASS");
		
		}
		else {
			System.out.println("URL fail");
		//cdriver.close();
		}
			
		}}

