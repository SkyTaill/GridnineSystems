package com.gridnine.testing;

import java.util.List;

public interface FilteringOfFlight<T> {

   List<T> DepartureUntilCurrentTime(List<T> flights);
    List<T> DateEarlierThanDepartureDate(List<T> flights);
    List<T> TotalTimeSpentExceedsTwoHours(List<T> flights);


}
