package com.example.paulap.crowdsourcing.models;

import java.util.Date;

public class Event {
    private Date date;
    private String location;
    private String goal;
    private int maxParticipants;
    private double budget;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Event(Date date, String location, String goal, int maxParticipants, double budget) {
        this.date = date;
        this.location = location;
        this.goal = goal;
        this.maxParticipants = maxParticipants;
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Event{" +
                "date=" + date +
                ", location='" + location + '\'' +
                ", goal='" + goal + '\'' +
                ", maxParticipants=" + maxParticipants +
                ", budget=" + budget +
                '}';
    }
}
