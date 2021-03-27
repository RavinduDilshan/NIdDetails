package com.example.niddetails;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public void btnClick(View view){

        int dayNo=0;
        String idNo="";
        String year="";
        String month="";
        int day=0;
        String gender="";


        EditText inputField= findViewById(R.id.idNoField);
        idNo=inputField.getText().toString();



        //validate id no
        if(idNo.length()!=10 && idNo.length()!=12){
            System.out.println("invalid id number");
        }
        else if(idNo.length()==10 && !isNumeric(idNo.substring(0,9)) || idNo.length()==12 && !isNumeric(idNo.substring(0))){
            System.out.println("invalid id number");
        }

        else{
           //getting year
            if(idNo.length()==10){
                year="19"+idNo.substring(0,2);
                dayNo=Integer.parseInt(idNo.substring(2,5));

            }
            else{
                year=idNo.substring(0,4);
                dayNo=Integer.parseInt(idNo.substring(4,7));

            }

            //getting gender
            if(dayNo>500){
                gender="Female";
                dayNo=dayNo-500;
            }else{
                gender="male";
            }

            if(dayNo<1 && dayNo>366){
                System.out.println("invalid Id number");

            }else{

                //getting birthday
                if (dayNo > 335) {
                    day = dayNo - 335;
                    month = "December";
                }
                else if (dayNo > 305) {
                    day = dayNo - 305;
                    month = "November";
                }
                else if (dayNo > 274) {
                    day = dayNo - 274;
                    month = "October";
                }
                else if (dayNo > 244) {
                    day = dayNo - 244;
                    month = "September";
                }
                else if (dayNo > 213) {
                    day = dayNo - 213;
                    month = "Auguest";
                }
                else if (dayNo > 182) {
                    day = dayNo - 182;
                    month = "July";
                }
                else if (dayNo > 152) {
                    day = dayNo - 152;
                    month = "June";
                }
                else if (dayNo > 121) {
                    day = dayNo - 121;
                    month = "May";
                }
                else if (dayNo > 91) {
                    day = dayNo - 91;
                    month = "April";
                }
                else if (dayNo > 60) {
                    day = dayNo - 60;
                    month = "March";
                }
                else if (dayNo < 32) {
                    month = "January";
                    day = dayNo;
                }
                else if (dayNo > 31) {
                    day = dayNo - 31;
                    month = "Febuary";
                }



            }


        }

        System.out.println("gender is: "+gender);
        System.out.println("birth month: "+month);
        System.out.println("birthDay: "+day);
        System.out.println("birth year: "+year);







    }
}