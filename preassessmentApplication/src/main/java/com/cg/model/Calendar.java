package com.cg.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

public class Calendar {
    public String locationId;
    public String day;
    public LocalTime cutOffTime;

    public Calendar(String locationId, String day, LocalTime cutOffTime){
        this.locationId = locationId;
        this.day = day;
        this.cutOffTime = cutOffTime;
    }
}
