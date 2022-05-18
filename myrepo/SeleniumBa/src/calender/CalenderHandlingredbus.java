package calender;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderHandlingredbus {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver as=new ChromeDriver();
		as.manage().window().maximize();
		as.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		as.get("https://m.redbus.in");
		as.findElement(By.cssSelector("#src")).sendKeys("Pune");
		as.findElement(By.cssSelector("#dest")).sendKeys("Goa");
as.findElement(By.cssSelector("#onward_cal")).sendKeys("10-jun-2022");
	as.findElement(By.cssSelector("#search_btn")).click();
		//as.findElement(By.id("search_btn")).sendKeys("search buses");
		
		
		

	}

}//src//dest//onward_cal//search_btn
