package Utility;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CommonUtilFunctions {
	
	public static JsonPath jsonPath;
	
	public static String getResponseKeyValue(String response_body, String response_key) {
		Utility.RestFWLogger.initLogger();
		Utility.RestFWLogger.info("Response body is  :-"+response_body);		
		jsonPath = new JsonPath(response_body);
	String key_value = jsonPath.get(response_key);
		return key_value;		
	}
	
	public static int getStatusCode(Response response) {
		Utility.RestFWLogger.initLogger();
		Utility.RestFWLogger.info("Response body is  :-"+response);
		int status_code = response.getStatusCode();
		return status_code;		
	}
	
	public static String getStatusMessage(Response response) {
		Utility.RestFWLogger.initLogger();
		Utility.RestFWLogger.info("Response body is  :-"+response);
	String status_message = response.getStatusLine();
		return status_message;		
	}
	
	public static String getResponseHeader(Response response, String header_key) {
		Utility.RestFWLogger.initLogger();
		Utility.RestFWLogger.info("Response body is  :-"+response);
	String response_header = response.getHeader(header_key);
		return response_header;		
	}
	
	public static String getResponseContentType(Response response) {
		Utility.RestFWLogger.initLogger();
		Utility.RestFWLogger.info("Response body is  :-"+response);
		String content_type = response.getContentType();
			return content_type;		
		}

}
