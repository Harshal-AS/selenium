package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//import java.io.FileInputStream;
public class GetDataPropertiesFiles {

	public static void main(String[] args) throws IOException {
		// File name and location
		// String
		String filePath1="D:\\AUTOMATION\\ACCELERATION\\worksapce\\JavaBasicProgram\\src\\properties\\GetDataPropertiesFiles.java";
		// or
		String filePath2 = ".//TestAppData//TestData.properties";
		// or
		String filePath3 = System.getProperty("user.dir") + ".//TestAppData//TestData.properties";
		// step-2create instance of fileinputstream class by passing file locations to
		// its cons
		FileInputStream fis = new FileInputStream(filePath1 );

		// Steps-3 create instance of properties class
		Properties pro = new Properties();
		// step-4 with the help of properties class ref. call load()and pass
		// fileinputstream ref as a parameter
		pro.load(fis);
		// in order to read the data from property files use getproperty(string key)
		// property class
		
		System.out.println("appurl: " + pro.getProperty("appurl"));
		System.out.println("username: " + pro.getProperty("username"));
		System.out.println("confirmPassword: " + pro.getProperty("confirmPassword"));
		System.out.println("firstname: " + pro.getProperty("firstname"));
		System.out.println("lastname: " + pro.getProperty("lastname"));
		System.out.println("contctnumber: " + pro.getProperty("contctnumber"));
		System.out.println("emailID: " + pro.getProperty("emailID"));

	}

}
