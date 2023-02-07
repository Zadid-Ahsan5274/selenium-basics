package read_write_files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_Write {

	public static void main(String[] args) throws IOException {

		Properties properties = new Properties();
		FileInputStream inputStream = new FileInputStream("./src/test/resources/properties/testData.properties");
		properties.load(inputStream);
		System.out.println(properties.getProperty("browser"));
		System.out.println(properties.getProperty("url"));
		FileOutputStream outputStream = new FileOutputStream("./src/test/resources/properties/testData.properties");
		properties.setProperty("testData", "654653645");
		properties.store(outputStream, "This is random test data");
	}

}
