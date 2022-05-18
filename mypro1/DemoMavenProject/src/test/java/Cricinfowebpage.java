

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricinfowebpage {

	public static void main(String[] args) {
		
			String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
			// step1: set driver executable path by using System.setProperty(String
			// key,String value)
			System.setProperty("webdriver.chrome.driver", driverPath);
			// step2: create an instance of Chrome Browser
			WebDriver driver = new ChromeDriver();
			// maximize browser
			driver.manage().window().maximize();
			// implicit wait
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get("https://www.cricinfo.com");
            String actualtitle=driver.getTitle();
            System.out.println("actualtitle: "+actualtitle);
            String currenturl=driver.getCurrentUrl();
            System.out.println("actualcurrenturl: "+currenturl);
  		List<WebElement> cricinfo  = driver.findElements(By.cssSelector("div[class='ds-flex ds-flex-row']>div>a"));
   		System.out.println("Number of Phones present on Home page: "+cricinfo.size());  
   		for(WebElement harsh:cricinfo) {
   			System.out.println(harsh.getText());
   		//	driver.close();
    		}
	}

}
//div[class='ds-flex ds-flex-row']>div>a
