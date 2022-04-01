package com.ray.ticket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Station startStaion = null;
        Station endStaion = null;

        int normal=0;
        int student=0;
        int elder=0;
        boolean roundtrip=false;

        System.out.println("Your start station?  (Taipei:1 ,Taichung:2, Kaohsiung:3"  );
        int choice = Integer.parseInt(scanner.next());
        switch (choice){
            case 1:
                startStaion = Station.TAIPEI;
                System.out.println("#Taipei-->");
                System.out.println("Your end station?  (Taichung:2, Kaohsiung:3"  );
                break;
            case 2:
                startStaion = Station.TAICHUNG;
                System.out.println("#Taichung-->");
                System.out.println("Your end station?  (Taipei:1, Kaohsiung:3"  );
                break;
            case 3:
                startStaion = Station.KAOHSIUNG;
                System.out.println("#Kaohsiung-->");
                System.out.println("Your end station?  (Taipei:1, Taichung:2,"  );
                break;
        }
        choice = Integer.parseInt(scanner.next());
        switch (choice){
            case 1:
                endStaion = Station.TAIPEI;
                System.out.println("#"+startStaion.name+"-->Taipei");
                break;
            case 2:
                endStaion = Station.TAICHUNG;
                System.out.println("#"+startStaion.name+"-->Taichung");
                break;
            case 3:
                endStaion = Station.KAOHSIUNG;
                System.out.println("#"+startStaion.name+"-->Kaohsiung");
                break;
        }
        List<String> ticketClass = new ArrayList<>();
        ticketClass.add("normal tickets");
        ticketClass.add("student tickets");
        ticketClass.add("elder tickets");

        for (int i =0;i<ticketClass.size();i++) {
            System.out.println("How many "+ticketClass.get(i)+" do you need?");
            switch (i){
                case 0:
                    normal = scanner.nextInt();
                    break;
                case 1:
                    student = scanner.nextInt();
                    break;
                case 2:
                    elder = scanner.nextInt();
                    break;
            }
        }
        System.out.println("Do you need round-trip tickets?  (YES:1, NO:0");
        choice = Integer.parseInt(scanner.next());
        switch (choice){
            case 1:
                roundtrip =true;
                System.out.print("起站:"+startStaion.name+"\t"+"迄站:"+endStaion.name+"\t"+"一般票:"+normal*2+"\t"+"學生票:"+student*2+"\t"+"敬老票:"+elder*2+"\t"+"(包含來回)"+"\t");
                break;
            case 0:
                System.out.print("起站:"+startStaion.name+"\t"+"迄站:"+endStaion.name+"\t"+"一般票:"+normal+"\t"+"學生票:"+student+"\t"+"敬老票:"+elder+"\t");
                break;
        }
        Ticket t1 = new NormalTicket(startStaion.id,endStaion.id,normal);
        Ticket t2 = new StudentTicket(startStaion.id,endStaion.id,student);
        Ticket t3 = new ElderTicket(startStaion.id,endStaion.id,elder);
        if (!roundtrip){
            System.out.println("合計:"+(t1.getPrice()+t2.getPrice()+t3.getPrice()));
        }else {
            System.out.println("合計:"+2*(t1.getPrice()+t2.getPrice()+t3.getPrice())*0.9);
        }
    }

}
