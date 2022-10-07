package com.cg.model;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class CalendarRecords {
    public List<Calendar> calendarList = new ArrayList<>();
    Calendar c = new Calendar("STORE001", "ALL", LocalTime.of(13,30));
    Calendar c1 = new Calendar("STORE002", "SUNDAY", LocalTime.of(13,30));
    Calendar c2 = new Calendar("STORE003", "MONDAY", LocalTime.of(13,30));
    public CalendarRecords(){
        calendarList.add(c);
        calendarList.add(c1);
        calendarList.add(c2);
    }
}
