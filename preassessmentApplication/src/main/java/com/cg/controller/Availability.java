package com.cg.controller;



import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dto.AvailabilityDto;
import com.cg.model.Calendar;
import com.cg.model.CalendarRecords;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@Slf4j
@RequestMapping("/findStoreAvailability")
public class Availability {
    @PostMapping
    public ResponseEntity findAvailability(@RequestBody AvailabilityDto input){
        List<Calendar> calendarRecords = new CalendarRecords().calendarList.stream()
                .filter(c -> c.locationId.equals(input.storeID))
                .collect(Collectors.toList());
        input.status="Not Available";
        if (calendarRecords.size()!=0){
            input.status="Available";
        }
        return new ResponseEntity<>(input, HttpStatus.OK);
    }
}
