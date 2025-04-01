package SampleJava.Lessons;


import java.sql.SQLOutput;
import java.time.*;
import java.util.Date;
import java.util.Calendar;
import java.util.Set;
import java.util.TimeZone;

public class Time {
    public static void main(String[] args){
        Date now = new Date();
        //System.out.println(now);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTimeZone());
        System.out.println();

        TimeZone zone = TimeZone.getTimeZone("Africa/Juba");
        System.out.println(zone.getDisplayName());

        System.out.println();

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalTime thistime = LocalTime.now();
        System.out.println(thistime);

        Set<String> allId = ZoneId.getAvailableZoneIds();
        System.out.println(allId);

    }
}
