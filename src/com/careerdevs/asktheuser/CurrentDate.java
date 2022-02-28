package com.careerdevs.asktheuser;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Date;
import java.text.SimpleDateFormat;
public class CurrentDate {
    public static void main(String[] args) {

        Date currentDate = new Date();
        System.out.println(currentDate);

        SimpleDateFormat timeFormat = new SimpleDateFormat();
        System.out.println(timeFormat.format(currentDate));

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(dateFormat.format(currentDate));

        SimpleDateFormat dayOfTheWeekFormat = new SimpleDateFormat("EEEE");
        System.out.println(dayOfTheWeekFormat.format(currentDate));

        SimpleDateFormat clockFormat = new SimpleDateFormat("h:mm a");
        System.out.println(clockFormat.format(currentDate));
    }
}
