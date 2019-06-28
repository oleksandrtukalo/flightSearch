package com.wezara.flightSearch.service;

import com.wezara.flightSearch.DAO.FlightDAO;
import com.wezara.flightSearch.model.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {
    private FlightDAO flightDAO;

    @Autowired
    public FlightServiceImpl(FlightDAO flightDAO) {
        this.flightDAO = flightDAO;
    }

    @Override
    public List<Flight> getListByDestination(String destination, String direction) {
        return this.flightDAO.getListByDestination(destination, direction);
    }

    @Override
    public List<Flight> getListByFlight(String flight, String direction) {
        return this.flightDAO.getListByFlight(flight, direction);
    }

    @Override
    public List<Flight> getListByCarrier(String carrier, String direction) {
        return this.flightDAO.getListByCarrier(carrier, direction);
    }
}

