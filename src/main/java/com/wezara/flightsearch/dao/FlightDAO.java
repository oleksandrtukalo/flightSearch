package com.wezara.flightsearch.dao;

import com.wezara.flightsearch.model.Flight;

import java.util.List;

public interface FlightDAO {

    List<Flight> findAll();

}
