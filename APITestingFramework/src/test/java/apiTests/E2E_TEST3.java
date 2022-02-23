package apiTests;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class E2E_TEST3 {

//@Test(priority=1)
////http://ergast.com/mrd/methods/results/
//public void Test1() {
//
//	 given().
//	when().get("http://ergast.com/api/f1/2017/circuits.json").
//	then()
//	.assertThat().body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));
//	
//}
//
//@Test(priority=2)
//
//public void Test2() {
//	
//	Response response  = given()
//.when().get("http://ergast.com/api/f1/2017/circuits.json");
//System.out.println(response.contentType());
//System.out.println(response.body().asString());	
//}


@Test(priority=3)

public void Test3() {
	
	Response response  = given()
.when().post("https://reqres.in/api/register");
System.out.println(response.body().asString());	
}
	    
}
