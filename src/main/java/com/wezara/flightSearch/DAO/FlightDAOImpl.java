package com.wezara.flightSearch.DAO;

import com.google.gson.Gson;
import com.wezara.flightSearch.model.Flight;
import com.wezara.flightSearch.service.Data;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FlightDAOImpl implements FlightDAO {
    private List<Flight> flights = new ArrayList<>();
    private Gson gson = new Gson();
    private Flight[] flightsArray = gson.fromJson(Data.getFlightArray(), Flight[].class);

    public List<Flight> getListByDestination(String destination, String direction) {
        for (Flight flight : flightsArray) {
            if ((flight.getRel_day_f().equals("todayActiveOnly")
                    && flight.getDirection().equals(direction)) &&
                    (flight.getAirport0().toLowerCase().contains(destination)
                            || flight.getAirport1().toLowerCase().contains(destination)
                            || flight.getAirport2().toLowerCase().contains(destination))) {
                flights.add(flight);
            }
        }
        return flights;
    }

    public List<Flight> getListByFlight(String flightNumb, String direction) {
        for (Flight flight : flightsArray) {
            if (flight.getFltname().toLowerCase().contains(flightNumb)
                    && flight.getRel_day_f().equals("todayActiveOnly")
                    && flight.getDirection().equals(direction)) {
                flights.add(flight);
            }
        }
        return flights;
    }

    public List<Flight> getListByCarrier(String carrier, String direction) {
        for (Flight flight : flightsArray) {
            if (flight.getAirline_name().toLowerCase().contains(carrier)
                    && flight.getRel_day_f().equals("todayActiveOnly")
                    && flight.getDirection().equals(direction)) {
                flights.add(flight);
            }
        }
        return flights;
    }
}
