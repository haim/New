package RestApiTest;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class RestTest {

	@BeforeClass
	public void setUp() {
		RestAssured.baseURI = "https://www.batch8-api-site.dev.cc/wp-json";
		basePath = "/wp/v2";
	}

	// Given rest end point "http://73.166.37.2:1000/ords/hr/countries/"
	// When I send HTTP Get request to the server
	// Then I should get 200 OK result as status code
	@Test
	public void firstTest() {
		when()
		.get("http://73.166.37.2:1000/ords/hr/countries/")
		.then()
		.statusCode(200);
	}

	/* Given rest end point https://www.batch8-api-site.dev.cc/wp-json/wp/v2/posts/13
	 * When i send a HTTP Get request to the server 
		Then i should get 200 OK result as status code 
	 * */
	@Test(priority = 2)
	public void thirdTest() {

		given().relaxedHTTPSValidation().when().get("https://www.batch8-api-site.dev.cc/wp-json/wp/v2/posts/10").then()
				.statusCode(200).and().assertThat().contentType(ContentType.JSON).and().assertThat()
				.body("id", equalTo(10));
	}

	/* Given rest end point 
	 * https://www.batch8-api-site.dev.cc/wp-json/wp/v2/posts/24
	 * When i send a HTTP Get request to the server 
		Then i should get 200 OK result as status code 
		and id field should be 24
	 * */
	@Test(priority = 3)
	public void idTest() {

		given().relaxedHTTPSValidation().when().get("https://www.batch8-api-site.dev.cc/wp-json/wp/v2/posts/10").then()
				.statusCode(200)
				// how to find by id to verify your code
				.and().body("id", equalTo(10)).body("date", equalTo("2018-08-18T20:53:38"))
				.body("title.rendered", equalTo("abc"));
	}

	@Test
	public void anotherTest() {
		given().relaxedHTTPSValidation().when().log().all()
				.get("https://www.batch8-api-site.dev.cc/wp-json/wp/v2/posts/{id}", 10).then().log().all()
				.statusCode(200).and().body("id", equalTo(10)).body("title.rendered", equalTo("abc"))
				.body("status", equalTo("publish")).body("author", equalTo(1));
	}
}