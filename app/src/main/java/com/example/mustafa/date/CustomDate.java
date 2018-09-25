package com.example.mustafa.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CustomDate {

    private String dateOfCreateAsString;
    private Calendar dateOfCreateAsCalendar;
    private Date dateOfCreateAsDate;

    private String dateOfUpdateAsString;
    private Calendar dateOfUpdateAsCalendar;
    private Date dateOfUpdateAsDate;

    // Custom Date Pattern: you can update it for each object
    private SimpleDateFormat dateFormat;

    //TODO be sure to add init method to all Constructor in the App :

    CustomDate(){
        initTimeOfCreate();
        dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss z");
    }

    private void initTimeOfCreate(){
        // Set the creation Time :
        dateOfCreateAsCalendar = Calendar.getInstance();
        dateOfCreateAsDate = dateOfCreateAsCalendar.getTime();
        dateOfCreateAsString = dateFormat.format(dateOfCreateAsDate);

        updateLastUpdateTime();
    }

    public void updateLastUpdateTime(){
        // Set the last update Time :
        dateOfUpdateAsCalendar = Calendar.getInstance();
        dateOfUpdateAsDate = dateOfUpdateAsCalendar.getTime();
        dateOfUpdateAsString = dateFormat.format(dateOfUpdateAsDate);
    }


    /**
     * Setter And Getter
     */
    public String getDateOfCreateAsString() {
        return dateOfCreateAsString;
    }

    public Calendar getDateOfCreateAsCalendar() {
        return dateOfCreateAsCalendar;
    }

    public Date getDateOfCreateAsDate() {
        return dateOfCreateAsDate;
    }

    public String getDateOfUpdateAsString() {
        return dateOfUpdateAsString;
    }

    public Calendar getDateOfUpdateAsCalendar() {
        return dateOfUpdateAsCalendar;
    }

    public Date getDateOfUpdateAsDate() {
        return dateOfUpdateAsDate;
    }

    public SimpleDateFormat getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String str_dateFormat) {
        this.dateFormat = new SimpleDateFormat(str_dateFormat);
    }
}
