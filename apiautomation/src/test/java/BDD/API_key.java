package BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class API_key {
    @Test
	public void apikey() {
		RestAssured.given().baseUri("https://api.openweathermap.org/data/2.5/weather")
		.queryParam("q", "Chennai")
		.queryParam("appid", "0188faf0c21f12091deb6a4bdba787f0")
		.when().get().prettyPrint();
	}
}
