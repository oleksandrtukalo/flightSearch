package com.wezara.flightSearch.controller;

import com.wezara.flightSearch.model.Flight;
import com.wezara.flightSearch.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FlightController {
    private FlightService flightService;
    private String searchParam;
    private String directionParam;
    private List<Flight> flightList = new ArrayList<>();

    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }


    @RequestMapping(value = {"/byDestination"}, method = RequestMethod.GET)
    public String paramDestination(
            @RequestParam(value = "destination") String destination, @RequestParam(value = "direction") String direction) {
        directionParam = direction;
        searchParam = destination;
        return "redirect:/listDestination";
    }

    @RequestMapping(value = {"/byCarrier"}, method = RequestMethod.GET)
    public String paramCarrier(
            @RequestParam(value = "carrier") String carrier, @RequestParam(value = "direction") String direction) {
        directionParam = direction;
        searchParam = carrier;
        return "redirect:/listCarrier";
    }

    @RequestMapping(value = {"/byFlight"}, method = RequestMethod.GET)
    public String paramFlight(
            @RequestParam(value = "flight") String flight, @RequestParam(value = "direction") String direction) {
        directionParam = direction;
        searchParam = flight;
        return "redirect:/listFlight";
    }


    @RequestMapping(value = {"/listDestination"}, method = RequestMethod.GET)
    public String listByDestination(Model model) {
        flightList.clear();
        flightList = flightService.getListByDestination(searchParam.toLowerCase(), directionParam);
        model.addAttribute("flights", flightList);
        return "formByDestination";
    }

    @RequestMapping(value = {"/listCarrier"}, method = RequestMethod.GET)
    public String listByCarrier(Model model) {
        flightList.clear();
        flightList = flightService.getListByCarrier(searchParam.toLowerCase(), directionParam);
        model.addAttribute("flights", flightList);
        return "formByCarrier";
    }

    @RequestMapping(value = {"/listFlight"}, method = RequestMethod.GET)
    public String listByFlight(Model model) {
        flightList.clear();
        flightList = flightService.getListByFlight(searchParam.toLowerCase(), directionParam);
        model.addAttribute("flights", flightList);
        return "formByFlight";
    }


}
