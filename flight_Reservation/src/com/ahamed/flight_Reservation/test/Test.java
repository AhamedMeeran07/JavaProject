package com.ahamed.flight_Reservation.test;

import com.ahamed.flight_Reservation.dao.ReservationDao;
import com.ahamed.flight_Reservation.dao.ReservationDaoImpl;
import com.ahamed.flight_Reservation.model.Passenger;
import com.ahamed.flight_Reservation.model.Reservation;

public class Test {

	public static void main(String[] args) {
		
		ReservationDao dao= new ReservationDaoImpl();
		Passenger passenger = new Passenger();
		Reservation reservation = new Reservation();
		passenger.setId(1234);
		passenger.setFirstName("ahamed");
		reservation.setPassenger(passenger);
		reservation.setFlightId(1l);
		
		System.out.println(dao.bookFlight(reservation));
		
		
	}

}
