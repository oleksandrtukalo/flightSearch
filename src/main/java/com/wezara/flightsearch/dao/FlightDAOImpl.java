package com.wezara.flightsearch.dao;

import com.google.gson.Gson;
import com.wezara.flightsearch.model.Flight;
import com.wezara.flightsearch.service.DataService;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class FlightDAOImpl implements FlightDAO {
    private Gson gson = new Gson();

    @Override
    public List<Flight> findAll() {
        Flight[] flightsArray = gson.fromJson(DataService.getFlightArray(), Flight[].class);
        return Arrays.stream(flightsArray).collect(Collectors.toList());
    }
}
