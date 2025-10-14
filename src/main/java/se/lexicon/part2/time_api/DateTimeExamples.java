package se.lexicon.part2.time_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeExamples {
    public static void main(String[] args) {

        // LocalDate – Just the date (year, month, and day)

        LocalDate currentDate = LocalDate.now();
        System.out.println("currentDate = " + currentDate);



        // LocalTime – Just the time (hours, minutes, seconds)

        LocalTime currentTime = LocalTime.now();
        System.out.println("currentTime = " + currentTime);

        // LocalDateTime – Both date and time together

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("currentDateTime = " + currentDateTime);

        //You want to store someone’s birthday
        LocalDate specificDateUsingOf = LocalDate.of(2025, 12, 25);
        System.out.println("specificDateUsingOf = " + specificDateUsingOf);

        LocalDate specificDateUsingParse = LocalDate.parse("2023-12-25");

        //Date Math
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println("tomorrow = " + tomorrow);

        LocalDate oneWeekLater = currentDate.plusWeeks(1);
        System.out.println("oneWeekLater = " + oneWeekLater);

        LocalDate oneMonthEarlier = currentDate.minusMonths(1);
        System.out.println("oneMonthEarlier = " + oneMonthEarlier);

        //Creating and Parsing Times – “Set the Alarm”

        LocalTime specificTime = LocalTime.of(14, 30, 45);

        LocalTime lectureTime = LocalTime.parse("09:00");

        // Time Math
        LocalTime oneHourLater = currentTime.plusHours(1);
        System.out.println("oneHourLater = " + oneHourLater);

        LocalTime fifteenMinutesEarlier = currentTime.minusMinutes(15);
        System.out.println("fifteenMinutesEarlier = " + fifteenMinutesEarlier);

        LocalTime specificSecond = specificTime.withSecond(10);
        System.out.println("specificSecond = " + specificSecond);

        //LocalDateTime – “An Appointment”
        LocalDateTime specificDateTime = LocalDateTime.of(2023, 12, 25, 14, 30);
        System.out.println("specificDateTime = " + specificDateTime);

        LocalDateTime parsedDateTime = LocalDateTime.parse("2023-12-25T14:30:00");





    }
}
