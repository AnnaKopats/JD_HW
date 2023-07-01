package com.academy.kopats.lesson20;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Task2 {
    public static void main(String[] args) {

        LocalDate newYear1 = LocalDate.of(2023, 1, 1);
        LocalDate newYear2 = LocalDate.of(2023, 1, 2);
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        String formatNewYear1 = formatter.format(newYear1);
        String formatNewYear2 = formatter.format(newYear2);
        System.out.println("Новый год: " + formatNewYear1 + " и " + formatNewYear2);

        LocalDate christmas = LocalDate.of(2023, 1, 7);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String christmasFormat = formatter1.format(christmas);
        System.out.println("Рождество Христово (православное Рождество): " + christmasFormat);

        LocalDate womenDay = LocalDate.of(2023, 3, 8);
        String womenDayFormat = DateTimeFormatter.ISO_DATE.format(womenDay);
        System.out.println("День женщин: " + womenDayFormat);

        LocalDate radunitsa = LocalDate.of(2023, 4, 25);
        String radunitsaFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(radunitsa);
        System.out.println("Радуница: " + radunitsaFormat);

        LocalDate laborDayHoliday = LocalDate.of(2023, 5, 1);
        String laborDayHolidayFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(laborDayHoliday);
        System.out.println("Праздник труда: " + laborDayHolidayFormat);


        LocalDate victoryDay = LocalDate.of(2023, 5, 9);
        String victoryDayFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(victoryDay);
        System.out.println("День Победы: " + victoryDayFormat);

        LocalDate independenceDay = LocalDate.of(2023, 7, 3);
        String independenceDayFormat = DateTimeFormatter.ofPattern("dd MM yyyy").format(independenceDay);
        System.out.println("День Независимости Республики Беларусь (День Республики): " + independenceDayFormat);

        LocalDate octoberRevolutionDay = LocalDate.of(2023, 11, 7);
        String octoberRevolutionDayFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(octoberRevolutionDay);
        System.out.println("День Октябрьской революции: " + octoberRevolutionDayFormat);

        LocalDate christmas2 = LocalDate.of(2023, 12, 25);
        String christmas2Format = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(christmas2);
        System.out.println("Рождество Христово (католическое Рождество): " + christmas2Format);
    }
}
//        Объявляются нерабочими днями:
//        1 и 2 января - Новый год;
//        7 января - Рождество Христово (православное Рождество);
//        8 марта - День женщин;
//        25 апреля - Радуница;
//        1 мая - Праздник труда;
//        9 мая - День Победы;
//        3 июля - День Независимости Республики Беларусь (День Республики);
//        7 ноября - День Октябрьской революции;
//        25 декабря - Рождество Христово (католическое Рождество).