package com.onvacation.models;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Dictionary;
import java.util.GregorianCalendar;

/**
 * Created by kychernov on 25.05.2016.
 */
public class CalcDatesLogic {

    private DateModel _startVacDate;
    private DateModel _endVacDate;

    public CalcDatesLogic(DateModel startDate, DateModel endDate){

        _startVacDate = startDate;
        _endVacDate = endDate;
    }

    public void CalculateMethod(){
        GregorianCalendar stDate = new GregorianCalendar(_startVacDate.getYear(), _startVacDate.getMonth()-1, _startVacDate.getDay());
        GregorianCalendar endDate = new GregorianCalendar(_endVacDate.getYear(), _endVacDate.getMonth()-1, _endVacDate.getDay());

        int stDayOfWeek = stDate.get(Calendar.DAY_OF_WEEK);

        if (stDayOfWeek == 4){

        }
        if (stDayOfWeek < 4){

        }
        if (stDayOfWeek > 4){


        }

//        String start_day_of_week = String.format("%1$tA", stDate);
//        String end_day_of_week = String.format("%1$tA", endDate);





    }



}
