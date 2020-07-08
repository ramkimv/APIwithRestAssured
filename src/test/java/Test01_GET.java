import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Test01_GET {
	
	@Test
	void test_01() {
		JsonObject jBody = new JsonObject();
		
		jBody.addProperty("name", "demo");
		jBody.addProperty("size", "85,112");
		jBody.addProperty("hash", "1919609B03E626DD8C04C9202FF52364");
		jBody.addProperty("file", "C:\\Users\\ENTERPRISE TOUCH\\Desktop\\demo.txt");
		
		System.out.println(jBody);
		given().
		header("Content-type","application/json").
		contentType(ContentType.JSON).accept(ContentType.JSON).
		body(jBody).
		when().
		post("https://ec2-35-154-146-139.ap-south-1.compute.amazonaws.com/sharebox/api"+
		"/upload?token=8341d437-ae85-4abb-a232-1b349939951d").
		then().
		statusCode(200); 	                    
					
	}

}
