package Utility;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class payloadGenerator {
	
	//convert a file into a string
	public static String generateStringPayload(String fileName) throws IOException {
		//for file uploading from resources
		String filePath = System.getProperty("user.dir")+"\\src\\main\\java\\resources\\"+ fileName;
		return new String(Files.readAllBytes(Paths.get(filePath)));		
	}

}
	