package Pojo;

public class FlightInformation {
	int flight_id;
	String origin;
	String destination;
	int duration;
	
		
	public FlightInformation() {	}
		
	public FlightInformation(int flight_id, String origin, String destination, int duration) {
		this.flight_id = flight_id;
		this.origin = origin;
		this.destination = destination;
		this.duration = duration;
	}
	public int getFlight_id() {
		return flight_id;
	}
	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "FlightInformation [flight_id=" + flight_id + ", origin=" + origin + ", destination=" + destination
				+ ", duration=" + duration + "]";
	}
	
	
}
