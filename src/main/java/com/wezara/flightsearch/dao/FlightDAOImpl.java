package com.wezara.flightsearch.dao;

import com.google.gson.Gson;
import com.wezara.flightsearch.model.Flight;
import com.wezara.flightsearch.service.DataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@Repository
public class FlightDAOImpl implements FlightDAO {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    private Gson gson = new Gson();

    @Cacheable("flightArray")
    @Scheduled(cron = "1 0/5 * * * *")
    @Override
    public List<Flight> findAll() {
        Flight[] flightsArray = gson.fromJson(DataService.getFlightArray(), Flight[].class);
        logger.info("Cache was updated");
        return Arrays.stream(flightsArray).collect(Collectors.toList());
    }

    @Scheduled(cron = "0 0/5 * * * *")
    @CacheEvict(value = "flightArray", allEntries = true)
    public void removeCache() {
        logger.info("Cache was cleared");
    }

}
