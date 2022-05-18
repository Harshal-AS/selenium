package CALENDER;

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
		as.findElement(By.id("src")).sendKeys("Pune");
		as.findElement(By.id("dest")).sendKeys("Goa");
as.findElement(By.cssSelector("22-june-2022")).click();
//	as.findElement(By.cssSelector("onward_cal").s
		//as.findElement(By.id("search_btn")).sendKeys("search buses");
		
		
		

	}

}//src//dest//onward_cal//search_btn
