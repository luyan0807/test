package edu.bms.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetlimitDate {
    public int getlimit(Date a,Date b) throws ParseException{
    	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
        Date smdate = sdf.parse(sdf.format(a));  
        Date bdate = sdf.parse(sdf.format(b));  
        Calendar cal = Calendar.getInstance();    
        cal.setTime(smdate);    
        long time1 = cal.getTimeInMillis();//a       
        cal.setTime(bdate);    
        long time2 = cal.getTimeInMillis();//b    
        int between_days=(int) ((time2-time1)/(1000*3600*24));//b-a
    	System.out.println(between_days);
    	return between_days;
    	
    }
}
