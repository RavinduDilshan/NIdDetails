package com.example.niddetails;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

import org.w3c.dom.Text;

public class Dialog extends AppCompatDialogFragment {

    private String year;
    private String month;
    private int day;
    private String gender;

    public Dialog(String year, String month, int day, String gender) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.gender = gender;
    }




    private TextView birthYear;
    private TextView birthMonth;
    private TextView birthDay;
    private TextView Gender;

    @Override
    public android.app.Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder= new AlertDialog.Builder(getActivity());
        LayoutInflater inflater =getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.layout_dialog,null);
        builder.setView(view)
                .setTitle("Information")
                .setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        birthYear=view.findViewById(R.id.birthYearDisplay);
        birthYear.setText(year);

        birthMonth=view.findViewById(R.id.birthMonthDisplay);
        birthMonth.setText(month);

        birthDay=view.findViewById(R.id.birthDayDisplay);
        String dayDisplay=String.valueOf(day);
        birthDay.setText(dayDisplay);

        Gender=view.findViewById(R.id.genderDisplay);
        Gender.setText(gender);
        return builder.create();

    }
}
