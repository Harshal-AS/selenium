package seleniumprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		
String driver1=".executables//chomedriver";
System.getProperty("webdriver.chrome.driver", driver1);
WebDriver edriver=new ChromeDriver ();
// new APPLICATION OPEN THE BROWSER
edriver.get("htpps://demo.actitime.com/");
String appCurrentUrl=edriver.getCurrentUrl();
String expectedUrl="htpps://demo.actitime.com/";
System.out.println("Actaul URL:"+appCurrentUrl);
System.out.println("Expected URL: "+expectedUrl);
if(appCurrentUrl.contains(expectedUrl)) {
	System.out.println("Current URL validation is passed");
}else {
	System.out.println("Current URL validation is Failed");
}

//verify that Google search page is opened or not using title
String actualTitle=edriver.getTitle();
String expectedTitle="Google";
System.out.println("ActualTitle:"+actualTitle);
System.out.println("ExpectedTitle: "+expectedTitle);
if(actualTitle.equals(expectedTitle)) {
	System.out.println("Title validation is passed");
}else {
	System.out.println("Title validation is Failed");
}
//get the webpage source content
String sourceContent=edriver.getPageSource();
System.out.println("Source content lenght:"+sourceContent.length());
//close current browser
edriver.close();

}

/**
* Open Chrome browser
* Enter google search page url
* validate URL is entered properly or not
* validate google search page is open or not
* once all the validation are performed close the browser
*/ 


	}
