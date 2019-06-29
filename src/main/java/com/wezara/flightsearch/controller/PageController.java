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
        return "formbydestination";
    }

    @RequestMapping(value = {"/carrierPage"}, method = RequestMethod.GET)
    public String carrierPage() {
        return "formbycarrier";
    }

    @RequestMapping(value = {"/flightPage"}, method = RequestMethod.GET)
    public String flightPage() {
        return "formbyflight";
    }

    @RequestMapping(value = {"/adminPage"}, method = RequestMethod.GET)
    public String adminPage() {
        return "adminpage";
    }
}
