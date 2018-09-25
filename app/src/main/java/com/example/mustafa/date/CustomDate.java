package com.example.mustafa.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CustomDate {

    public String dateOfCreateAsString;
    public Calendar dateOfCreateAsCalendar;
    public Date dateOfCreateAsDate;

    public String dateOfUpdateAsString;
    public Calendar dateOfUpdateAsCalendar;
    public Date dateOfUpdateAsDate;

    //TODO be sure to add init method to all Constructor in the App :

    public CustomDate(){
        initTimeOfCreate();
    }

    public void initTimeOfCreate(){
        // Custom Date Pattern:
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss z");

        // Set the creation Time :
        dateOfCreateAsCalendar = Calendar.getInstance();
        dateOfCreateAsDate = dateOfCreateAsCalendar.getTime();
        dateOfCreateAsString = dateFormat.format(dateOfCreateAsDate);

        updateLastUpdateTime();
    }

    public void updateLastUpdateTime(){
        // Set the last update Time :
        dateOfUpdateAsCalendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss z");
        dateOfUpdateAsDate = dateOfUpdateAsCalendar.getTime();
        dateOfUpdateAsString = dateFormat.format(dateOfUpdateAsDate);
    }


    /**
     * Setter And Getter
     */

    public String getDateOfCreateAsString() {
        return dateOfCreateAsString;
    }

    public void setDateOfCreateAsString(String dateOfCreateAsString) {
        this.dateOfCreateAsString = dateOfCreateAsString;
    }

    public Calendar getDateOfCreateAsCalendar() {
        return dateOfCreateAsCalendar;
    }

    public void setDateOfCreateAsCalendar(Calendar dateOfCreateAsCalendar) {
        this.dateOfCreateAsCalendar = dateOfCreateAsCalendar;
    }

    public Date getDateOfCreateAsDate() {
        return dateOfCreateAsDate;
    }

    public void setDateOfCreateAsDate(Date dateOfCreateAsDate) {
        this.dateOfCreateAsDate = dateOfCreateAsDate;
    }

    public String getDateOfUpdateAsString() {
        return dateOfUpdateAsString;
    }

    public void setDateOfUpdateAsString(String dateOfUpdateAsString) {
        this.dateOfUpdateAsString = dateOfUpdateAsString;
    }

    public Calendar getDateOfUpdateAsCalendar() {
        return dateOfUpdateAsCalendar;
    }

    public void setDateOfUpdateAsCalendar(Calendar dateOfUpdateAsCalendar) {
        this.dateOfUpdateAsCalendar = dateOfUpdateAsCalendar;
    }

    public Date getDateOfUpdateAsDate() {
        return dateOfUpdateAsDate;
    }

    public void setDateOfUpdateAsDate(Date dateOfUpdateAsDate) {
        this.dateOfUpdateAsDate = dateOfUpdateAsDate;
    }
}
