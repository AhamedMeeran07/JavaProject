package com.ahamed.flight_Reservation.model;

public class Flight extends AbstructModel {
	
	private String flightNumber;
	private String operationAirlines;
	private String departureCity;
	private String arrivalCity;
	private String dateAndTimeOfDeparture;
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getOperationAirlines() {
		return operationAirlines;
	}
	public void setOperationAirlines(String operationAirlines) {
		this.operationAirlines = operationAirlines;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public String getDateAndTimeOfDeparture() {
		return dateAndTimeOfDeparture;
	}
	public void setDateAndTimeOfDeparture(String dateAndTimeOfDeparture) {
		this.dateAndTimeOfDeparture = dateAndTimeOfDeparture;
	}
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", operationAirlines=" + operationAirlines + ", departureCity="
				+ departureCity + ", arrivalCity=" + arrivalCity + ", dateAndTimeOfDeparture=" + dateAndTimeOfDeparture
				+ "]";
	}
	
	 

	

}
