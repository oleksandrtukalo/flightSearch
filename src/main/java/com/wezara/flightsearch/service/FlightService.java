package com.wezara.flightsearch.service;

import com.wezara.flightsearch.model.Flight;

import java.util.List;

public interface FlightService {
    List<Flight> getListByDestination(String destination, String direction);

    List<Flight> getListByFlight(String flightNumber, String direction);

    List<Flight> getListByCarrier(String carrier, String direction);

    void refreshCache();
}
