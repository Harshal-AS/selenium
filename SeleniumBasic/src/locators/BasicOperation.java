package locators;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

//import java.awt.Dimension;
//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOperation {

	public static void main(String[] args) throws InterruptedException   {
		//public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "./executables/chromedriver.exe");
			// creating an object of chromedriver class and upcasting it to WebDriver interface
			WebDriver edriver = new ChromeDriver();	
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(2000);
			// maximize browser window
			edriver.manage().window().maximize();
		Thread.sleep(2000);
			// set window size based on our requirement
		//edriver.manage().window().setSize(new Dimension(500, 700));
			Thread.sleep(20000);
			// maximize browser window
			edriver.manage().window().maximize();
			// enter required application url
			edriver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			// implicit wait
			edriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// get the web page title
			System.out.println("Current Page title is: " + edriver.getTitle());
			// get current web page url
		System.out.println("Current page url: " + edriver.getCurrentUrl());
						
			edriver.findElement(By.linkText("Forgot your password?")).click();
			//Navigation in browser
			Thread.sleep(2000);
			//go to previous page
			edriver.navigate().back();
			Thread.sleep(2000);
//			// next page
			edriver.navigate().forward();
			Thread.sleep(2000);
//			//reload or refresh current page
			edriver.navigate().refresh();
		Thread.sleep(2000);
//			//jump from current page to another page or URL
		edriver.navigate().to("https://www.amazon.in/");
//			// close current instance of browser
//			driver.close();
		}

	}