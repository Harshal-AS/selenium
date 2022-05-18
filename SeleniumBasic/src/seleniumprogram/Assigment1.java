package seleniumprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment1 {

	public static void main(String[] args) {
		// Test cases script 
		/*1.Launch a new chrome browser.
		 * 2.Open https://demo.actitime.com/. url
		 * 3.Get Page Title name & Title length.
		 * 4.Print Page Title& Title length on the eclipse consol.
		 * 5.Get Page URL AND verify if it is a correct page open .
		 * 6.Get page source (HTML source code)  and source length.
		 * 7.print page length on eclipse console.
		 */
		// Relative Path
		String driver1=".//executables//chromedriver.exe";
       // by using system class
		String driver2=System.getProperty("user.dir")+".//executables//chromedriver.exe";
		//set the driver executable path using System.setProperty("String key",String value);
		System.setProperty("webdriver.chrome.driver", driver1);
		WebDriver cchrome=new ChromeDriver();// launch chrome browser
		
		//2.Open https://demo.actitime.com/
		cchrome.get("https://demo.actitime.com/");
		String actualtitle= cchrome.getTitle();
		String exceptedtitle ="actitime login page";
		System.out.println("Actual: "+actualtitle);
		System.out.println("Expected: "+exceptedtitle);
		
		//3.Get Page Title name & Title length.
		System.out.println("Ttile length:"+actualtitle.length());
		
		// 5.Get Page URL AND verify if it is a correct page open .
		String appcurrenturl=cchrome.getCurrentUrl();
		String excecepredurl="https://demo.actitime.com/";
		
		if(appcurrenturl.equals(excecepredurl)) {
		System.out.println("TITLE VALID IS PASSED");
		}
		else {
			System.out.println("TITLE INVALID IS PASSED");	
		}
		// 4.Print Page Title& Title length on the eclipse consol.
		System.out.println("Page title: "+appcurrenturl);
		System.out.println("URL LENGTH: "+appcurrenturl.length());
		
		//6.Get page source (HTML source code)  and source length.
		String sourcecontent =cchrome.getPageSource();
		System.out.println("SOURCE CONTENT LENGTH: "+ sourcecontent.length());
		//close the browser
		cchrome.close();
		
	

}
}