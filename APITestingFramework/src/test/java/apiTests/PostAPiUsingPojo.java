package apiTests;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class PostAPiUsingPojo {
	
	
	EmployeePojo ep = new EmployeePojo(
			"morpheous","leader",
			new String[] {"Java","C"},
			"XYZ","morpheous@xyz.com"
			);	
	
	@Test(priority=1)

	public void ObjectMapperPojo() {	
		
		//Using Object Mapper to Parse the Java Object to convert it to Json and save Json 
		//Serialization with POJO class
		ObjectMapper map = new ObjectMapper();
		String filePath = System.getProperty("user.dir")+"\\src\\test\\java\\apiTests\\dataName.json";
		
		try {
		map.writeValue(new File(filePath), ep);
		} catch (JsonGenerationException e) {			
			e.printStackTrace();
		} catch (JsonMappingException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
	

	//Using Object Mapper to Parse the Json Object to convert it to Java Object
	//Deserialization using POJo class
		
		//String jsonfile = "{\"name\":\"morpheous\",\"job\":\"leader\",\"skills\":[\"Java\",\"C\"],\"details\":{\"companyName\":\"morpheous@xyz.com\",\"emailId\":\"XYZ\"}}";	
				EmployeePojo emp;
		try {
			emp = map.readValue(new File(filePath), EmployeePojo.class);
			System.out.println(emp.getName());
		} catch (JsonParseException e) {			
			e.printStackTrace();
		} catch (JsonMappingException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
	
	
	
	}	
		
	//*********************************************************************************//	
		@Test(dependsOnMethods = {"ObjectMapperPojo"})

		public void PostRequestWithPojo() {
		Response response  = given()
				.auth().none()
				.header("Content-Type","application/json")
				.contentType(ContentType.JSON)
				.when()
				.body(ep).log().all()
				.post("https://reqres.in/api/users");
				System.out.println(response.statusCode());
				
				
				
	
	}

}
