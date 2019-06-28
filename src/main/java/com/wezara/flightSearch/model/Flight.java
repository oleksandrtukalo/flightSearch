package com.wezara.flightSearch.model;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Flight {


    private String status_alias;
    private String direction;
    private String dt_plan_f;
    private String act_time_expected;
    private String takeoff_time;
    private String fltname;
    private String checkingates;
    private String terminal;
    private String rel_day_f;
    private String airport0;
    private String airport1;
    private String airport2;
    private String gate;
    private String airline_name;


    public String getStatus_alias() {
        return status_alias;
    }

    public void setStatus_alias(String status_alias) {
        this.status_alias = status_alias;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDt_plan_f() {
        return dt_plan_f;
    }

    public void setDt_plan_f(String dt_plan_f) {
        this.dt_plan_f = dt_plan_f;
    }

    public String getAct_time_expected() {
        return act_time_expected;
    }

    public void setAct_time_expected(String act_time_expected) {
        this.act_time_expected = act_time_expected;
    }

    public String getTakeoff_time() {
        return takeoff_time;
    }

    public void setTakeoff_time(String takeoff_time) {
        this.takeoff_time = takeoff_time;
    }

    public String getFltname() {
        return fltname;
    }

    public void setFltname(String fltname) {
        this.fltname = fltname;
    }

    public String getCheckingates() {
        return checkingates;
    }

    public void setCheckingates(String checkingates) {
        this.checkingates = checkingates;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getRel_day_f() {
        return rel_day_f;
    }

    public void setRel_day_f(String rel_day_f) {
        this.rel_day_f = rel_day_f;
    }

    public String getAirport0() {
        return airport0;
    }

    public void setAirport0(String airport0) {
        this.airport0 = airport0;
    }

    public String getAirport1() {
        return airport1;
    }

    public void setAirport1(String airport1) {
        this.airport1 = airport1;
    }

    public String getAirport2() {
        return airport2;
    }

    public void setAirport2(String airport2) {
        this.airport2 = airport2;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public String getAirline_name() {
        return airline_name;
    }

    public void setAirline_name(String airline_name) {
        this.airline_name = airline_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return direction == flight.direction &&
                Objects.equals(status_alias, flight.status_alias) &&
                Objects.equals(dt_plan_f, flight.dt_plan_f) &&
                Objects.equals(act_time_expected, flight.act_time_expected) &&
                Objects.equals(takeoff_time, flight.takeoff_time) &&
                Objects.equals(fltname, flight.fltname) &&
                Objects.equals(checkingates, flight.checkingates) &&
                Objects.equals(terminal, flight.terminal) &&
                Objects.equals(rel_day_f, flight.rel_day_f) &&
                Objects.equals(airport0, flight.airport0) &&
                Objects.equals(airport1, flight.airport1) &&
                Objects.equals(airport2, flight.airport2) &&
                Objects.equals(gate, flight.gate) &&
                Objects.equals(airline_name, flight.airline_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status_alias, direction, dt_plan_f, act_time_expected, takeoff_time, fltname, checkingates, terminal, rel_day_f, airport0, airport1, airport2, gate, airline_name);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "status_alias='" + status_alias + '\'' +
                ", direction=" + direction +
                ", dt_plan_f='" + dt_plan_f + '\'' +
                ", act_time_expected='" + act_time_expected + '\'' +
                ", takeoff_time='" + takeoff_time + '\'' +
                ", fltname='" + fltname + '\'' +
                ", checkingates='" + checkingates + '\'' +
                ", terminal='" + terminal + '\'' +
                ", rel_day_f='" + rel_day_f + '\'' +
                ", airport0='" + airport0 + '\'' +
                ", airport1='" + airport1 + '\'' +
                ", airport2='" + airport2 + '\'' +
                ", gate='" + gate + '\'' +
                ", airline_name='" + airline_name + '\'' +
                '}';
    }

}
