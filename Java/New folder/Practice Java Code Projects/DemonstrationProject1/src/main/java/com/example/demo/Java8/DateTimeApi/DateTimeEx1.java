package com.example.demo.Java8.DateTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeEx1 {
    public static void main(String[] args) {

        System.out.println("LocalDate start");
        LocalDate date = LocalDate.now();
        System.out.println("Today date: "+date);

        LocalDate date1 = LocalDate.of(2020,5,15);
        System.out.println("date1: "+date1);

        String d1Str = date.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Date1 in string :  " + d1Str);


        System.out.println("LocalTime start");
        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime time1 = LocalTime.of(10,43,12);
        System.out.println(time1);

        ZoneId zone1 = ZoneId.of("Asia/Kolkata");
        LocalTime time2 = LocalTime.now(zone1);
        System.out.println("India Time Zone: "+time2);


        System.out.println("LocalDatetime start");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before Formatting: " + now);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formatDateTime = now.format(format);
        System.out.println("After Formatting: " + formatDateTime);



    }
}
