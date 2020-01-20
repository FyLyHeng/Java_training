package date.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Dates {
    LocalDate myDate=LocalDate.now();
    public void showDate(){
        System.out.println(myDate);
    }
    LocalTime myTime=LocalTime.now();
    public void showTime(){
        System.out.println(myTime);
    }
    LocalDateTime myDateTime=LocalDateTime.now();
    public void showDateTime(){
        System.out.println(myDateTime);
    }
    public void showFormatDT(String format){
        LocalDateTime myTD=LocalDateTime.now();
        DateTimeFormatter myFormat=DateTimeFormatter.ofPattern(format);
        String forMatter=myTD.format(myFormat);
        System.out.println(forMatter);
    }
}
