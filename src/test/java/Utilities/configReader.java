package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configReader {
	Properties pr;
	public configReader () throws IOException {
		pr= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\TESTING\\eclipse-workspace\\PageFactoryV2\\Properties\\Confige.properties");
		pr.load(fis);
		
	}
	public String Value (String value) {
		return pr.getProperty(value);
	}

}
