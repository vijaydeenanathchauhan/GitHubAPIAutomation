package basic.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.Authn;
import Utility.CommonUtilFunctions;
import Utility.createURL;
import Utility.payloadGenerator;
import io.restassured.response.Response;
import restapibase.BaseClass;

public class createRepoTest {
	Response response;
	
	//Get all the repos for vijaydeenanath chauhan
//	@Test(priority=1)
//	public void getRepositoryTestCase() throws IOException {
//		String endPoint = createURL.getBaseURI("/users/vijaydeenanathchauhan/repos");		
//		response = BaseClass.getRequest(endPoint);
//		
//		String responseString = response.getBody().asString();
//		
//	
//		System.out.println("*************************Request Response1**********************");
//		System.out.println(responseString);
//	}
//	
//	
//	
//	
//	
//	//create repo for vijaydeenanathchauhan
//	@Test(priority=2)
//	public void createRepositoryTestCase() throws IOException {
//		String endPoint = createURL.getBaseURI("/user/repos");
//		
//		String req_Payload = payloadGenerator.generateStringPayload("createRepo.json");		
//		String bearer_Token =Authn.getBearerToken();		
//		response = BaseClass.postRequest(endPoint,req_Payload,bearer_Token);		
//		String responseString = response.getBody().asString();
//		
//		Assert.assertEquals(CommonUtilFunctions.getResponseKeyValue(responseString, "name"), CommonUtilFunctions.getResponseKeyValue(req_Payload, "name"));
//		Assert.assertEquals(CommonUtilFunctions.getResponseKeyValue(responseString, "description"), CommonUtilFunctions.getResponseKeyValue(req_Payload, "description"));		
//		System.out.println("*************************Request Response2**********************");
//		System.out.println(responseString);
//	}
	
	
	
	
	
	//delete repo for vijaydeenanathchauhan
	@Test(priority=3)
	public void deleteRepositoryTestCase() throws IOException {
		String endPoint = createURL.getBaseURI("/repos/vijaydeenanathchauhan/Api-testing-restcall-5");
		
		String req_Payload = payloadGenerator.generateStringPayload("createRepo.json");		
		String bearer_Token =Authn.getBearerToken();		
		response = BaseClass.deleteRequestWithPayload(endPoint,req_Payload,bearer_Token);		
		String responseString = response.getBody().asString();
		
		System.out.println("*************************Request Response3**********************");
		System.out.println(responseString);
	}


}
