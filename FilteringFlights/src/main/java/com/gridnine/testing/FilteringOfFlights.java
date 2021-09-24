package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class FilteringOfFlights implements  FilteringOfFlight<Flight>{


    @Override
    public List<Flight> DepartureUntilCurrentTime(List<Flight> flights) {
        LocalDateTime timeNow = LocalDateTime.now();
       // Iterator<Flight> flightsIterator = flights.iterator();

        List<Flight> flightssList=new LinkedList<>();

        for(Flight localFlights:flights){
            List<Segment> segmentList=new LinkedList<>();
            for (Segment localSegment:localFlights.getSegments()){
                if(localSegment.getDepartureDate().isAfter(timeNow)){
                    segmentList.add(localSegment);
                }
            }
            Flight flightLocal=new Flight(segmentList);
            flightssList.add(flightLocal);


        }

            return flightssList;
    }

    @Override
    public List<Flight> DateEarlierThanDepartureDate(List<Flight> flights) {
        LocalDateTime timeNow = LocalDateTime.now();
        // Iterator<Flight> flightsIterator = flights.iterator();

        List<Flight> flightssList=new LinkedList<>();

        for(Flight localFlights:flights){
            List<Segment> segmentList=new LinkedList<>();
            for (Segment localSegment:localFlights.getSegments()){
                if(localSegment.getArrivalDate().isAfter(localSegment.getDepartureDate())){
                    segmentList.add(localSegment);
                }
            }
            Flight flightLocal=new Flight(segmentList);
            flightssList.add(flightLocal);


        }

        return flightssList;
    }

    @Override
    public List<Flight> TotalTimeSpentExceedsTwoHours(List<Flight> flights) {
        LocalDateTime timeNow = LocalDateTime.now();
        // Iterator<Flight> flightsIterator = flights.iterator();

        List<Flight> flightssList=new LinkedList<>();

        for(Flight localFlights:flights){
            List<Segment> segmentList=new LinkedList<>();
            for (Segment localSegment:localFlights.getSegments()){
                if((localSegment.getArrivalDate().plusHours(2)).isBefore(localSegment.getDepartureDate())){
                    segmentList.add(localSegment);
                }
            }
            Flight flightLocal=new Flight(segmentList);
            flightssList.add(flightLocal);


        }

        return flightssList;
    }
}
