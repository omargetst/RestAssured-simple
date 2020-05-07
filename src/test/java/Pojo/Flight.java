package Pojo;


public class Flight {
	String origin;
	String destination;
	Integer duration;
	
	public Flight(String origin, String destination, Integer duration) {
		this.origin = origin;
		this.destination = destination;
		this.duration = duration;
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
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	
	
	
	
}
