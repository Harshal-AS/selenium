import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshotfacebook {

	
	public static void main(String[] args) throws IOException {
	WebDriverManager.chromiumdriver().setup();
	WebDriver harshal=new ChromeDriver();
	harshal.get("https://m.facebook.com/");
	harshal.manage().window().maximize();
	//screenshot of facebook
	TakesScreenshot a= (TakesScreenshot)harshal;
	File as=a.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(as,new File("./Screenshot_Folder/Test2_Login.png"));

}}
