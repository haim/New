package com.LMI.step_definition;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class StepDefs {

	private static final Object APPID = null;
	Response response;
	String Url;

	@Given("Content type is Json")
	public void content_type_is_Json() {
		given().contentType(ContentType.JSON);
	}

	@When("I get the current weather using city name {string}")
	public void i_get_the_current_weather_using_city_name(String city) {
		Url = "https://api.openweathermap.org/data/2.5/weather?q=" + city
				+ "&APPID=6e14338fb0279331c26170d93f7cde45";
		given().accept(ContentType.JSON).when().get(Url).prettyPrint();
	}

	@Then("Status code should be {int}")
	public void status_code_is(int statusCode) {
		response = given().accept(ContentType.JSON).when().get(Url);
		assertEquals(response.statusCode(), statusCode);
	}

	@Then("Temperature should be in specific range")
	public void temperature_should_be_in_specific_range() {

		JsonPath jsonPath = response.jsonPath();
		double temp = jsonPath.getDouble("main.temp");
		double tempMin = Double.parseDouble(ConfigurationReader.getProperty("temp_min"));
		double tempMax = Double.parseDouble(ConfigurationReader.getProperty("temp_max"));
		assertThat(temp, greaterThan(tempMin));
		assertThat(temp, lessThan(tempMax));
	}
}
