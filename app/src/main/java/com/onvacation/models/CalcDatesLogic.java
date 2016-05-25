package com.onvacation.models;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
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
        GregorianCalendar stDate = new GregorianCalendar(_startVacDate.getYear(), _startVacDate.getMonth(), _startVacDate.getDay());

        int start_day_of_week = stDate.get(Calendar.DAY_OF_WEEK);

    }



}
