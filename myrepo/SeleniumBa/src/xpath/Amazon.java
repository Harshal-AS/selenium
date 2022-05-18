package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");
		WebElement a=driver.findElement(By.xpath("//div[div[h2[a[span[text()='OnePlus Nord CE 2 5G (Bahamas Blue, 8GB RAM, 128GB Storage)']]]]]/div[3]/div[2]/a/span"));
		System.out.println(a.getText());
	}

}
