package tests;

import org.testng.annotations.Test;



import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;

public class AirlineTest {

	@Test
	public void newFlight() {
		given()
			.header("Content-Type", "application/json")
			.body("{\n" +
			        "  \"origin\": \"Brujas\",\n" +
			        "  \"destination\": \"Mexico\",\n" +
			        "  \"duration\": \"369\"\n" +	
			        "}")
		.when()
			.post ("http://localhost:5000/api/flight/new") 

		.then()
			.statusCode(200);
		
	}
	
	@Test
	public void getFlight () {
		String respString=
		given()
			.header("Content-Type", "application/json")					
		.when()
			.get ("http://localhost:5000/api/flights/3")
		.then()
			.statusCode(200)			
			.body("destination",equalTo("Tokyo"))
			.body("duration", equalTo(700))
			.body("origin",equalTo("Istanbul"))
			.extract().body().asString();			
		System.out.println(respString);
	}
	
	@Test
	public void newReservation () {
		Integer resp=
		given()
			.header("Content-Type", "application/json")
			.body("{\n" +
			        "  \"flight_id\": \"3\",\n" +
			        "  \"name\": \"Adry\"\n" +			        
			        "}")
		.when()
			.post ("http://localhost:5000/api/reservation/new")			
		.then()
			.statusCode(200)
			.extract().path("reservation_id");
		
		System.out.println(resp);
	}
	
	@Test
	public void  getReservation() {
		String strReservation=
		given()
			.header("Content-Type", "application/json")
		.when ()
			.get("http://localhost:5000/api/reservations/8")
		.then()
			.statusCode(200)
			.body("destination",equalTo("Mexico"))
			.body("duration", equalTo(369))
			.body("origin",equalTo("Brujas"))
			.body("passenger",equalTo("Celeste"))
			.body("reservation_id",equalTo(8))
			.extract().body().asString();
		System.out.println(strReservation);
	}

}

