package hello;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Application {
	
    public static void main(String[] args) {
    	Date date=new Date();
    	date.setYear(2017);
    	SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
    	String ss=sdf.format(date);
    }
}
