package Pojo;

public class Reservation {
	String name;
	int flight_id;
	
	
	
	public Reservation(String name, int flight_id) {		
		this.name = name;
		this.flight_id = flight_id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFlight_id() {
		return flight_id;
	}
	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}
	
	
	
}
