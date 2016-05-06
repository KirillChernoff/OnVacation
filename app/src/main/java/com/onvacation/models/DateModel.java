package com.onvacation.models;

/**
 * Created by kychernov on 06.05.2016.
 */
public class DateModel {

    private int _dayOfMonth;
    private int _month;
    private int _year;

    public DateModel(int day, int month, int year){
        _dayOfMonth = day;
        _month = month;
        _year = year;
    }

    public int getDay(){
        return _dayOfMonth;
    }

    public int getMonth(){
        return _month;
    }

    public int getYear(){
        return _year;
    }

    @Override
    public String toString(){
        return _dayOfMonth+"."+_month+"."+_year;
    }

}
