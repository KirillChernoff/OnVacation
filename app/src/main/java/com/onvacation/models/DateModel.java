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
        String d;
        String m;

        if (_dayOfMonth < 10)
            d = "0"+_dayOfMonth;
        else
            d = String.valueOf(_dayOfMonth);

        if (_month < 10)
            m = "0"+_month;
        else
            m = String.valueOf(_month);


        return String.format("%1s.%2s.%3s", d, m, _year);
    }

}
