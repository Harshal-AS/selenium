

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsmarenaurl {

	public static void main(String[] args) {
		//relative path
		//String driver1=".//executables//chromedriver.exe";
		//system path
		String driver2=System.getProperty("user.dir")+".//executables//chromedriver.exe";
		//set driver executalbes path in System.set(String key,value);
		System.setProperty("webdriver.chrome.driver", driver2);
	    // instance of required application
		WebDriver harshal=new ChromeDriver();
		//implicit wait
		harshal.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//browser operation maximize
		harshal.manage().window().maximize();
		//launch the url
		harshal.get("https://www.gsmarena.com");
		String actualtitle=harshal.getTitle();
		System.out.println("actualtitle: "+actualtitle);
		String currenturl1=harshal.getCurrentUrl();
		System.out.println("currenturl: "+currenturl1);
		
		//use fond elements method =it is used in all elements of html object
		//it is return type List<WebElement>
		//it is used args (by.cssSelector(>>>>>>);
		List<WebElement> phones=harshal.findElements(By.cssSelector("div[class='makers']>ul>li>a>strong>span"));
		System.out.println(phones.size());
		for(int i=0;i<phones.size();i++) {
		System.out.println(phones.get(i).getText());
		//}
	}
}
}
//#header>div>div>button>span
