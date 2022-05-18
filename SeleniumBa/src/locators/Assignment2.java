package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment2 {

	public static void main(String[] args) {
		/*
		 * 1.launch the new firefox browser 2.open
		 * https://demosite.executeautomation.com/Login.html/ 3.get page title name &
		 * title length 4.print page title & title length on the eclipse console 5.get
		 * page url &verify if it is a correct page opened 6.enter the valid username
		 * as"execution" & password as "admin" 7.click on login button 8.print the title
		 * on the console 9.click on logout 10.close the browser
		 */
		// 1.launch the new firefox browser
		// relative path
		String driver1 = ".//executables//geckodriver.exe";
		// set driver1 executable path using Ststem.setProperty(String key,String
		// value);
		System.setProperty("webdriver.gecko.driver", driver1);
		WebDriver firefox = new FirefoxDriver();
		//implicit wait
		firefox.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// 2.open https://demosite.executeautomation.com/Login.html/
		firefox.get("https://demosite.executeautomation.com/Login.html");
		String actualtitle = firefox.getTitle();
		String expectedtitle = "executeautomation login";
		// 3.get page title name & title length
		System.out.println("actualtitle: " + actualtitle);
		System.out.println("expected title: " + expectedtitle);
		System.out.println("title length: " + actualtitle.length());
		// 5.get page url &verify if it is a correct page opened
		String actualurl = firefox.getCurrentUrl();
		String expectedurl = "https://demosite.executeautomation.com/Login.html";
		System.out.println("actual url: " + actualurl);
		System.out.println("expected url: " + expectedurl);
		if (actualurl.equals(expectedurl)) {
			System.out.println("URL PASS");
		} else {
			System.out.println("URL FAILED");
		}
		// 6.enter the valid username as"execution" & password as "admin"
		WebElement username3 = firefox.findElement(By.name("username"));
		//username3.clear();
		username3.sendKeys("execution");
		WebElement passwordchange = firefox.findElement(By.name("username"));
		//passwordchange.clear();
		passwordchange.sendKeys("admin");

		WebElement loginButton = firefox.findElement(By.name("loginButton"));
		loginButton.click();
//8.print the title & current url on console
		String actualtitle1 = firefox.getTitle();
		System.out.println("actualtitle1: " + actualtitle1);

		String actualurl1 = firefox.getCurrentUrl();
		System.out.println("actualurl1: " + actualurl1);

//logout
	WebElement firefox1= firefox.findElement(By.linkText("Logout"));
	firefox1.click();
//10.close the browser

		firefox.close();
	}

}
