package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertiesfiles2 {

	public static void main(String[] args) throws IOException {
		//step-1 file name & locations
		String filePath1=".//TestAPPData//abc.properties";
		//or
		String filePath3 = System.getProperty("user.dir") + ".//TestAPPData//abc.properties";
     // STEP-2 CREATE instance FileInputSream class by passing file location
		//it cons
		FileInputStream c=new FileInputStream(filePath3);
		// insert import statements 
		//step-3 create instance properties class
		Properties d=new Properties();
		// insert import statements 
		//STEP-4 WITH THE HELP OF PROPERTIES CLASS REG. CALL TO LOAD METHOD ()&
		// PASS THE FILEINPUTSTREAM REF AS PARAMETER 
		d.load(c);
		//step-5 in order toread the data from property files 
		//use getproperty (string key)properties class
		System.out.println("username: "+d.getProperty("username"));
		System.out.println("password: "+d.getProperty("password"));
		System.out.println("firstname: "+d.getProperty("firstname"));
		System.out.println("lastname: "+d.getProperty("lastname"));
		System.out.println("city: "+d.getProperty("city"));
		System.out.println("adress: "+d.getProperty("dress"));//spealling mistake
		// consol null value display
		
	}

}
