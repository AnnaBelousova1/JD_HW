package com.academy.belousova.lesson20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Task2 {
    public static void main(String[] args) throws ParseException {
        System.out.println("график праздников на текущий год");
        System.out.println("________________________________");

        LocalDate newYear1 = LocalDate.of(2023, 1, 1);
        LocalDate newYear2 = LocalDate.of(2023, 1, 2);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        String formattedString1 = newYear1.format(formatter);
        String formattedString2 = newYear2.format(formatter);
        System.out.println("Новый год: " + formattedString1 + " и " + formattedString2);


        LocalDate christmas1 = LocalDate.of(2023, 1, 7);
        LocalDate christmas2 = LocalDate.of(2023, 1, 8);
        DateTimeFormatter formatterCh = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String formatString1 = christmas1.format(formatterCh);
        String formatString2 = christmas2.format(formatterCh);
        System.out.println("Рождество Христово: " + formatString1 + " и " + formatString2);


        String pattern = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = simpleDateFormat.parse("03-08-2023");
        System.out.println("День женщин: " + date);

        LocalDate startDate = LocalDate.of(2023, 4, 22);
        LocalDate endDate = LocalDate.of(2023, 4, 25);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        String formattedStartDate = startDate.format(f);
        String formattedEndDate = endDate.format(f);
        Period period = Period.between(startDate, endDate);
        int days = period.getDays() + 1;
        System.out.println("Радуница: " + days + " дня c " + formattedStartDate + " по " + formattedEndDate);


        ZonedDateTime holiday1 = ZonedDateTime.of(2023, 4, 30, 9, 32,
                0, 0, ZoneId.of("Asia/Singapore"));
        ZonedDateTime holiday2 = ZonedDateTime.of(2023, 5, 1, 9, 32,
                0, 0, ZoneId.of("America/New_York"));
        String formattedHoliday1 = DateTimeFormatter.ISO_OFFSET_DATE.format(holiday1);
        String formattedHoliday2 = DateTimeFormatter.ISO_OFFSET_DATE.format(holiday2);
        System.out.println("Праздник труда: " + formattedHoliday1 + " и " + formattedHoliday2);


        String string = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormatString = new SimpleDateFormat(string);
        Date date1 = simpleDateFormatString.parse("05-06-2023");
        Date date2 = simpleDateFormatString.parse("05-09-2023");
        System.out.println("День победы: с " + date1 + " по " + date2);


        String rawDate1 = "2023-07-01";
        String rawDate2 = "2023-07-03";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        LocalDate independenceDay1 = LocalDate.parse(String.format(rawDate1, dateTimeFormatter));
        LocalDate independenceDay2 = LocalDate.parse(String.format(rawDate2, dateTimeFormatter));
        System.out.println("День Независимости Республики Беларусь: c " + independenceDay1 + " по " + independenceDay2);


        holiday1 = ZonedDateTime.parse("2023-11-04 03:32:00-0400",
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssxx"));
        holiday2 = ZonedDateTime.parse("2023-11-07 08:22:00-0600",
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssxx"));
        System.out.println("День Октябрьской революции: c " + holiday1 + " по " + holiday2);


        LocalDate christmas3 = LocalDate.of(2023, 12, 23);
        LocalDate christmas4 = LocalDate.of(2023, 12, 25);
        DateTimeFormatter formatterChr = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattString1 = christmas3.format(formatterChr);
        String formattString2 = christmas4.format(formatterChr);
        System.out.println("Рождество Христово: c " + formattString1 + " по " + formattString2);
    }
}