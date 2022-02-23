package restapibase;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {

	// base class
	// Basic calling functions of Framework
	public static Response getRequest(String requestURI) {
		Utility.RestFWLogger.initLogger();
		Utility.RestFWLogger.startTestCase(requestURI);
		Utility.RestFWLogger.info("Url is "+requestURI);
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType(ContentType.JSON);
		Response response = requestSpecification.get(requestURI);
		return response;
	}

	public static Response postRequest(String requestURI, String requestPayload) {
		Utility.RestFWLogger.initLogger();
		Utility.RestFWLogger.info(requestPayload);		
		Utility.RestFWLogger.startTestCase(requestURI);
		Utility.RestFWLogger.info("Url is "+requestURI);
		RequestSpecification requestSpecification = RestAssured.given().body(requestPayload);
		requestSpecification.contentType(ContentType.JSON);
		Response response = requestSpecification.post(requestURI);
		return response;
	}
	public static Response postRequest(String requestURI, String requestPayload,String bearer_Token) {
		Utility.RestFWLogger.initLogger();
		Utility.RestFWLogger.startTestCase(requestURI);
		Utility.RestFWLogger.info(requestPayload);
		RequestSpecification requestSpecification = RestAssured.given().body(requestPayload);
		requestSpecification.contentType(ContentType.JSON);
		requestSpecification.header("Authorization","Bearer "+bearer_Token);		
		Response response = requestSpecification.post(requestURI);		
		return response;
	}

	public static Response putRequest(String requestURI, String requestPayload) {
		Utility.RestFWLogger.initLogger();
		Utility.RestFWLogger.startTestCase(requestURI);
		Utility.RestFWLogger.info(requestPayload);
		RequestSpecification requestSpecification = RestAssured.given().body(requestPayload);
		requestSpecification.contentType(ContentType.JSON);
		Response response = requestSpecification.put(requestURI);
		return response;
	}

	public static Response deleteRequest(String requestURI) {
		Utility.RestFWLogger.initLogger();
		Utility.RestFWLogger.startTestCase(requestURI);
		
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType(ContentType.JSON);
		Response response = requestSpecification.delete(requestURI);
		return response;
	}

	public static Response deleteRequestWithPayload(String requestURI,String requestPayload ,  String bearer_Token) {
		Utility.RestFWLogger.initLogger();
		Utility.RestFWLogger.startTestCase(requestURI);
		Utility.RestFWLogger.info(requestPayload);
		RequestSpecification requestSpecification = RestAssured.given().body(requestPayload);
		requestSpecification.contentType(ContentType.JSON);
		requestSpecification.header("Authorization","Bearer "+bearer_Token);
		Response response = requestSpecification.delete(requestURI);
		return response;
	}

}
