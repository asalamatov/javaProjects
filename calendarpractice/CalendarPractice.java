package calendarpractice;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class CalendarPractice {
    
    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 111);
        System.out.println(calendar.getTime());
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String formatted = format1.format(calendar.getTime());
        System.out.println(formatted);
    }

    
}
