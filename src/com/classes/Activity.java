package com.classes;

/**
 *
 * @author Kgaugelo
 */
public class Activity 
{
    private String date;
    private String time;

    public Activity(String date, String time) {
        this.date = date;
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
       return date + " " + time;
    }
}
