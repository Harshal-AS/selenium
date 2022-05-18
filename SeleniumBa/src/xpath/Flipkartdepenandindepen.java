package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkartdepenandindepen {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		WebElement phones=driver.findElement(By.xpath("//div[div[a[text()='SAMSUNG Galaxy M33 5G (Mystique Green, 128 GB)']]]/div[3]/div/div[1]"));
		
		//List<WebElement> phones = driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));

		//System.out.println("Number of Phones present on Home page: "+phones.size());
		
			System.out.println(phones.getText());
	}
}
////div[div[a[text()='SAMSUNG Galaxy M33 5G (Mystique Green, 128 GB)']]]/div[3]/div/div[1]