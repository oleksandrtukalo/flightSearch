package com.wezara.flightsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {

    @RequestMapping(value = {"/homePage"}, method = RequestMethod.GET)
    public String homePage() {
        return "index";
    }

    @RequestMapping(value = {"/destinationPage"}, method = RequestMethod.GET)
    public String destinationPage() {
        return "formByDestination";
    }

    @RequestMapping(value = {"/carrierPage"}, method = RequestMethod.GET)
    public String carrierPage() {
        return "formByCarrier";
    }

    @RequestMapping(value = {"/flightPage"}, method = RequestMethod.GET)
    public String flightPage() {
        return "formByFlight";
    }
}
