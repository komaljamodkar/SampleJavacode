package pkg1.pkg2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Parsedateoperation {
    public static void main(String[] args) {
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date=LocalDate.parse("01 31 2022",dtf);
        LocalTime time=LocalTime.parse("11:33");

        System.out.println(date);
        System.out.println(time);
        String text=date.format(dtf);
        System.out.println(text);

        LocalDate parsedate=LocalDate.parse(text,dtf);
        System.out.println(parsedate);

        LocalDate mydata=LocalDate.of(2022,3,21);
        String dateString=dtf.format(mydata);

        LocalDate anotherdate=LocalDate.parse(dateString,dtf);
        anotherdate=anotherdate.plusDays(3).plusDays(21);
        System.out.println(dtf.format(anotherdate));

        LocalDateTime dt=LocalDateTime.of(2017,5,10,11,22,33);
        Period p=Period.ofDays(10).plusMonths(3);
        dt=dt.minus(p);
        DateTimeFormatter f=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(f.format(dt));

    }
}
