package com.onvacation;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;

import com.onvacation.models.DateModel;

import java.util.Calendar;

/**
 * Created by kychernov on 06.05.2016.
 */
public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {

    static DateModel dateModel;

    public IOnCompleteListener mListener;

    public DatePickerFragment(){
    }

    public DatePickerFragment(IOnCompleteListener onCompleteListener) {
        this.mListener = onCompleteListener;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        final Calendar cal = Calendar.getInstance();
        int year = cal.get(cal.YEAR);
        int month = cal.get(cal.MONTH);
        int day = cal.get(cal.DAY_OF_MONTH);

        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    @Override
    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        dateModel = new DateModel(dayOfMonth, monthOfYear + 1, year);
        this.mListener.onComplete(dateModel);
    }

//    public void onAttach(Activity activity){
//        super.onAttach(activity);
//        try {
////            this.mListener = (OnCompleteListener)activity;
//
//        }catch (final ClassCastException e){
//            throw new ClassCastException(activity.toString() + " must implement OnCompleteListener");
//        }
//    }
}
