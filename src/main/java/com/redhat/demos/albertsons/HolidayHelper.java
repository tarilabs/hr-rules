package com.redhat.demos.albertsons;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;

import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.date.HolidayCalendar;
import com.opengamma.strata.basics.date.HolidayCalendarId;
import com.opengamma.strata.basics.date.HolidayCalendarIds;

public class HolidayHelper {
    private static final HolidayCalendarId holCalId = HolidayCalendarIds.NYSE;
    private static final HolidayCalendar holCal = holCalId.resolve(ReferenceData.standard());    

    public static boolean isHoliday(LocalDate date){
        return holCal.isHoliday(date);
    }

    public static boolean isBusinessDay(LocalDate date){
        return holCal.isBusinessDay(date);
    }

    public static boolean isThatDay(LocalDate date, DayOfWeek dayOfWeek){
        return date.getDayOfWeek() == dayOfWeek;
    }

}