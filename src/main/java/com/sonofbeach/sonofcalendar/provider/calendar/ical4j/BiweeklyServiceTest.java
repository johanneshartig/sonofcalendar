package com.sonofbeach.sonofcalendar.provider.calendar.ical4j;

import org.junit.jupiter.api.Test;

public class BiweeklyServiceTest {

    @Test
    public void getCalendarEventsTest(){
        BiweeklyService biweeklyService = new BiweeklyService();
        biweeklyService.getCalendarEvents(
                "https://calendar.google.com/calendar/ical/lapotschka.sonofcalendar%40gmail.com/private-a280434896f8520ed82a3ff91b1723f3/basic.ics");
    }

}
