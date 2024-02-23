package com.ahamed.flight_Reservation.dao;

import java.util.HashMap;

import com.ahamed.flight_Reservation.model.Flight;
import com.ahamed.flight_Reservation.model.Reservation;

public class ReservationDaoImpl implements ReservationDao {
	
	HashMap<Long, Flight> flights;
	HashMap<Long, Reservation> reservations;
	long reservationId;
	
	public ReservationDaoImpl(){
		
		flights=new HashMap<>();
	    reservations = new HashMap<>();
	
		Flight flight1=new Flight(); // object for flight class
		flight1.setId(1l);
		flight1.setFlightNumber("10001");
		flight1.setOperationAirlines("india");
		flight1.setDepartureCity("chennai");
		flight1.setArrivalCity("madurai");
		flight1.setDateAndTimeOfDeparture("12/2/2023 5am");
		
		flights.put(flight1.getId(), flight1);
		
		Flight flight2=new Flight();
		flight2.setId(2l);
		flight2.setFlightNumber("10002");
		flight2.setOperationAirlines("india");
		flight2.setDepartureCity("coimbatore");
		flight2.setArrivalCity("madurai");
		flight2.setDateAndTimeOfDeparture("13/2/2023 6am");
		
		
		flights.put(flight2.getId(), flight2);
		
	}

	@Override
	public Reservation bookFlight(Reservation reservation) {
		Flight fight=flights.get(reservation.getFlightId());
		reservation.setFlight(fight);
		reservationId = reservationId+1;
		reservation.setId(reservationId);
		reservations.put(reservationId, reservation);

		return reservation;
	}

}
