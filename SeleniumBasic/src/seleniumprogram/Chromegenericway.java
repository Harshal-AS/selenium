package seleniumprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromegenericway {

	public static void main(String[] args) {
		String driver1="D:\\AUTOMATION\\ACCELERATION\\worksapce\\SeleniumBasic\\executables\\chromedriver.exe";
		String driver2=".//executables//chromedriver.exe";
		String driver3=System.getProperty("user.dir")+".//executables//chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driver3);
		
		WebDriver cdriver=new ChromeDriver();
		
	}

}
