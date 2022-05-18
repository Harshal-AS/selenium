package keyboardoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keywordoperation4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement pop=driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']"));
		pop.sendKeys(Keys.ESCAPE);
		//scrolling using page down button
//		for(int i=0;i<10;i++);
//		pop.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(2000);
		//or
		//Scrolling - directly goto bottom of the page
				pop.sendKeys(Keys.CONTROL,Keys.END);
				Thread.sleep(1500);
				//Scrolling- directly goto Top of the page
			pop.sendKeys(Keys.CONTROL,Keys.HOME);
			}
		
	}


