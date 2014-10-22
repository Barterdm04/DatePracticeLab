/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.UIManager;

/**
 *
 * @author DB7
 */
public class DateCalculator {
    Calendar startDate = Calendar.getInstance();
    Calendar endDate = Calendar.getInstance();
    SimpleDateFormat sdf;
    
    public String calculateDifferenceOfDates(String format, Date start, Date end){
        startDate.setTime(start);
        endDate.setTime(end);
        sdf = new SimpleDateFormat(format);
        long startMsec = startDate.getTimeInMillis();
        long endMsec = endDate.getTimeInMillis();
        long difference = endMsec - startMsec;
        long days = difference/1000/60/60/24;
        return "The difference in days between your two dates is " + days;
    }
}
