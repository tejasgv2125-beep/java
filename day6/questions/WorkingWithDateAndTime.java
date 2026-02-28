package day6.questions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class WorkingWithDateAndTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Date :"+date);
        LocalTime time = LocalTime.now();
        System.out.println("Time :"+time);
        LocalDateTime dateTime = LocalDateTime.now();//gives date and time together
        System.out.println("Date Time :"+dateTime);
        /*
        Display the day of the month
        Display the day of the year
        Display the Week Name,Month Name,Month Number
         */
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("D, dd mm yyyy");//to formate the date
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("E, dd mm yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("D, M mm yyyy");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("D, MMM mm yyyy");
        String formattedDateTime = dateTime.format(formatter);
        String formattedDateTime1 = dateTime.format(formatter1);
        String formattedDateTime2 = dateTime.format(formatter2);
        String formattedDateTime3 = dateTime.format(formatter3);
        System.out.println("Formatted DateTime :"+formattedDateTime);
        System.out.println("Formatted DateTime 1 :"+formattedDateTime1);
        System.out.println("Formatted DateTime 2 :"+formattedDateTime2);
        System.out.println("Formatted DateTime 3 :"+formattedDateTime3);
        /*
        E- Name of the day:(Mon-Sun)
        D-Day of the year(1-366)
        dd-Day of the Month(1-31)
        M-Month Number(1-12)
        MMM- Month name - Jan- Dec
         */
    }
}
