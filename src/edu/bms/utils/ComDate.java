package edu.bms.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ComDate {
    public Boolean comdate(String s,String n) throws ParseException{
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	Date dt1 = df.parse(s);//应还

    	Date dt2 = df.parse(n);//现在
    	if(dt1.getTime()>dt2.getTime()){
    		System.out.println("no");
    		return false;
    	}
    	else{
    		System.out.println("chaoqi");
    		return true;
    	}
    }
}
