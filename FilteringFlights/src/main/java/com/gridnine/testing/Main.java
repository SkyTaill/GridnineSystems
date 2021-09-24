package com.gridnine.testing;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FlightBuilder flightBuilder=new FlightBuilder();
        FilteringOfFlight<Flight> filteringOfFlight=new FilteringOfFlights();
        List<Flight>flightList= flightBuilder.createFlights();





        System.out.println("\n 1.\tвылет до текущего момента времени");
        System.out.println(filteringOfFlight.DepartureUntilCurrentTime(flightList));
        System.out.println("\n 2.\tимеются сегменты с датой прилёта раньше даты вылета");
        System.out.println(filteringOfFlight.DateEarlierThanDepartureDate(flightList));
        System.out.println("\n 3.\tобщее время, проведённое на земле превышает два часа (время на земле — это интервал между прилётом одного сегмента и вылетом следующего за ним)");
        System.out.println(filteringOfFlight.TotalTimeSpentExceedsTwoHours(flightList));



    }
}
