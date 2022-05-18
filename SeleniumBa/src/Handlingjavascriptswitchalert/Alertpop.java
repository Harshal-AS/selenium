package Handlingjavascriptswitchalert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertpop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.google.com/url?hl=en-US&q=https://www.techlistic.com/2020/07/automation-testing-demo-websites.html&sa=D&source=meet&ust=1652321494036212&usg=AOvVaw0LlUIC3jml-3yPsUXL4_2z");
		//switch your control to frame using WebElement 
		//WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
	//	driver.switchTo().frame(frame);
				//or
		//driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
				//or
		//Switch your control to frame using  index ---> now you are allowed to identify any element inside the frame
		
		
	}

}//https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert
