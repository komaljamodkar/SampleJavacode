package pkg1.pkg2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class Datetimeoperation {
    public static void main(String[] args) {
        LocalDate localdate=LocalDate.now();
        LocalTime localtime=LocalTime.now();
        LocalDateTime localdatetime=LocalDateTime.now();
        LocalDate localdate1=LocalDate.of(2022,3,4);
        System.out.println(localdate);
        System.out.println(localdate1);
        LocalDate localdate2=localdate1.minusMonths(2);
        System.out.println(localdate2);

        LocalTime localtime2=localtime.minusHours(2);
        System.out.println(localdate2);
        System.out.println(Period.ofDays(45));
        System.out.println(Period.of(2022,4,23));
        //Datetimeformatter
        DateTimeFormatter shortformatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter mediumformatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);

        System.out.println(shortformatter.format(localdatetime));
        System.out.println(mediumformatter.format(localdatetime));
        System.out.println(mediumformatter.format(localdate));

        System.out.println(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(DateTimeFormatter.ISO_DATE);

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("m dd,YYYY,hh:mm");
        System.out.println(localdatetime.format(formatter));
        //previous java8
        SimpleDateFormat sf=new SimpleDateFormat("hh:mm");
        System.out.println(sf.format(new Date()));

        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(dtf.format(localdatetime));
        System.out.println(dtf.format(localdate));

        //parse date and time convert to string

    }
}
