package com.wezara.flightSearch.service;

import com.wezara.flightSearch.model.Flight;

import java.util.List;

public interface FlightService {
    List<Flight> getListByDestination(String destination, String direction);

    List<Flight> getListByFlight(String flight, String direction);

    List<Flight> getListByCarrier(String carrier, String direction);
}
