package seleniumprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxgenericway {

	public static void main(String[] args) {
		//Absolute class
		String driver1="D:\\AUTOMATION\\ACCELERATION\\worksapce\\SeleniumBasic\\executables\\geckodriver.exe";
		//relative class
		String driver2=".//executables//geckodriver";
		//by using system class
		String driver3=System.getProperty("used.dir")+".//executables//geckodriver";
		//Set the driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.gecko.driver",driver2);
		//create an instance of required browser class
		WebDriver fdriver=new FirefoxDriver();
		
	}

}
