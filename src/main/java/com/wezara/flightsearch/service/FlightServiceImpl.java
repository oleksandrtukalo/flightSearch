package com.wezara.flightsearch.service;

import com.wezara.flightsearch.dao.FlightDAO;
import com.wezara.flightsearch.model.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class FlightServiceImpl implements FlightService {
    private static final String REAL_DAY = "todayActiveOnly";
    private FlightDAO flightDAO;

    @Autowired
    public FlightServiceImpl(FlightDAO flightDAO) {
        this.flightDAO = flightDAO;
    }

    @Override
    public List<Flight> getListByDestination(String destination, String direction) {
        return this.flightDAO.findAll().stream()
                .filter(checkDirectionAndDay(direction))
                .filter(flight -> ((flight.getAirport0().toLowerCase().contains(destination) ||
                        flight.getAirport1().toLowerCase().contains(destination) ||
                        flight.getAirport2().toLowerCase().contains(destination))))
                .collect(Collectors.toList());
    }

    @Override
    public List<Flight> getListByFlight(String flightNumber, String direction) {
        return this.flightDAO.findAll().stream()
                .filter(checkDirectionAndDay(direction))
                .filter(flight -> flight.getFltname().toLowerCase().contains(flightNumber))
                .collect(Collectors.toList());
    }

    @Override
    public List<Flight> getListByCarrier(String carrier, String direction) {
        return this.flightDAO.findAll().stream()
                .filter(checkDirectionAndDay(direction))
                .filter(flight -> (flight.getAirline_name().toLowerCase().contains(carrier)))
                .collect(Collectors.toList());
    }

    private Predicate<? super Flight> checkDirectionAndDay(String direction) {
        return checkObj -> checkObj.getDirection().equals(direction)
                && checkObj.getRel_day_f().equals(REAL_DAY);
    }
}

