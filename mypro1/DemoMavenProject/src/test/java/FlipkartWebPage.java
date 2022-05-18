

import java.util.List;
//import java.util.List;
//import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartWebPage {

	public static void main(String[] args) {
		//relative path
		String driver1=".//executables//chromedriver.exe";
		//set  driver execytable the path System.setProperty(String key,String value);
		System.setProperty("webdriver.chrome.driver", driver1);
		// instance of the required web page
		WebDriver cdriver=new ChromeDriver();
		//maximaze browser operation
		cdriver.manage().window().maximize();
		// implicit wait
		cdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//launch the url in flipkart
		cdriver.get("https://www.flipkart.com");
		//1.validate home page
		String actualtitle=cdriver.getTitle();
		System.out.println(" actualtitle: "+ actualtitle);
		
		String currenturl=cdriver.getCurrentUrl();
		System.out.println(" currenturl: "+ currenturl);
		
		//2.use the findelements method
		
		List<WebElement> flipkart = cdriver.findElements(By.cssSelector("._37M3Pb>div>a"));
				
		System.out.println("count main menu of flipkart: "+flipkart.size());
		//Object flipkart;
		//get text method use to inner text of html object
		for(WebElement element:flipkart) {
   			System.out.println (element.getText());
			//cdriver.close();
		}
	}//>div>:nth-of-type(1)

}
//DIV[class='_37M3Pb']
