/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package old.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.UIManager;

/**
 *
 * @author dbarter1
 */
public class Startup{
    public static void main(String[] args) throws ParseException {
        try {
            // Set System L&F
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            // do nothing, this can safely be ignored because
            // it will fall back to the basic metal L&F if something
            // goes wrong. This is also a rare example of a scenario
            // where the catch clause could be safely eliminated.
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimpleDateWindow().setVisible(true);
            }
        });
        
        
        Demo1 demo1 = new Demo1();
        Date date = demo1.getCurrentDateTime();
        Calendar calendar = demo1.getCurrentCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm a");
        SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yy hh:mm:ss:S a");
        
        //Converting date to string
        System.out.println(sdf.format(date));
        System.out.println(sdf2.format(calendar.getTime()));
        
        //Converting string to date
        String s = "10/23/2014 6:12 PM";
        Date date2 = sdf.parse(s);
        System.out.println("Parsed date: " + date2);
        
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        System.out.println("Parsed Calendar: " + cal2.getTime());
        
        Calendar startDate = Calendar.getInstance();
        startDate.set(2014, Calendar.JANUARY, 1);
        startDate.roll(Calendar.YEAR, -2);
        Calendar endDate = Calendar.getInstance();
        endDate.set(2014, Calendar.JANUARY, 15);
        long startMsec = startDate.getTimeInMillis();
        long endMsec = endDate.getTimeInMillis();
        long difference = endMsec - startMsec;
        long days = difference/1000/60/60/24;
        System.out.println("Days between dates: " + days);
        
        
    }
}
