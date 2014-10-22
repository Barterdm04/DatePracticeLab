
package old.api;

import java.util.Calendar;
import java.util.Date;

public class Demo1 {
    
    public Date getCurrentDateTime(){        
        Date currentDate = new Date();
        return currentDate;
    }
    
    public Calendar getCurrentCalendar(){        
        Calendar calendar = Calendar.getInstance();
        return calendar;
    }
    
    public Date getSpecificDateTime(){
        Date currentDate = new Date(2015-1900, 0, 1);
        return currentDate;
    }
    
    
}
