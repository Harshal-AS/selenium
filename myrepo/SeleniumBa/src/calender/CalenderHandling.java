package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver a=new ChromeDriver();
		a.get( "https://www.makemytrip.com/");
		a.findElement(By.cssSelector("li[data-cy='account']")).click();
		//identify departure date and click on it
		a.findElement(By.cssSelector("label[for='departure']")).click();
		//select any date from next month
		a.findElement(By.cssSelector("div.DayPicker-Months>*:last-child>.DayPicker-Body>div:nth-of-type(2)>*:nth-child(2)>div>p")).click();

	}

}
