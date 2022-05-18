package handlingmultipleelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//import org.openqa.selenium.WebDriver;

public class WebDrivermanager {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver aaru=new ChromeDriver();
		aaru.get("https://www.gsmarena.com");
	}

}
