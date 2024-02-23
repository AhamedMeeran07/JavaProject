package com.ahamed.flight_Reservation.dao;

import com.ahamed.flight_Reservation.model.Reservation;

public interface ReservationDao {

	Reservation bookFlight(Reservation reservation);
}
