package com.wezara.flightSearch.DAO;

import com.wezara.flightSearch.model.Flight;

import java.util.List;

public interface FlightDAO {

    List<Flight> getListByDestination(String destination, String direction);

    List<Flight> getListByFlight(String flight, String direction);

    List<Flight> getListByCarrier(String carrier, String direction);
}
