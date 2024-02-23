package com.ahamed.flight_Reservation.model;

public class Reservation extends AbstructModel {
	
	private Flight flight;
	private Passenger passenger;
	private long flightId;
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public long getFlightId() {
		return flightId;
	}
	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}
	@Override
	public String toString() {
		return "Reservation [flight=" + flight + ", passenger=" + passenger + ", flightId=" + flightId + "]";
	}
	
	


}
