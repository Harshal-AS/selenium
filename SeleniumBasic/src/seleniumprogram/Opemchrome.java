package seleniumprogram;

import org.openqa.selenium.chrome.ChromeDriver;

public class Opemchrome {

	public static void main(String[] args) {
		String driverPath3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		//Set the driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath3);
		//create an instance of required browser class
		ChromeDriver cdriver=new ChromeDriver();

	}



	}


