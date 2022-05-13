package com.ray.parking;

import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {
    public static void main(String[] args) throws ParseException {
        String enterTime = "8:00";
        String exitTime = "14:06";
        SimpleDateFormat sdf= new SimpleDateFormat("HH:mm");
        Date d1 = null;
        Date d2 = null;
        try {
            d1 =sdf.parse(enterTime);
            System.out.println(d1);
        }catch (Exception e){
            System.out.println("Wrong format");
        }
        try {
            d2 =sdf.parse(exitTime);
            System.out.println(d2);
            long ms = d2.getTime()- d1.getTime();
            int minutes =(int) (ms/60/1000);
            System.out.println(minutes);
            int fee = (minutes/60)*30;
            if (minutes%60<=15) {
                System.out.println(fee);
            }   else {
                System.out.println(fee+15);
            }
        }catch (Exception e){
            System.out.println("Wrong format");
        }

    }
}
