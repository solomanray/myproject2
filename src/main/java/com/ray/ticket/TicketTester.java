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
        System.out.println("Your start station?  (Taipei:1 ,Taichung:2, Kaohsiung:3"  );
        int choice = Integer.parseInt(scanner.next());
        switch (choice){
            case 1:
                startStaion = Station.TAIPEI;
                System.out.println("Your end station?  (Taichung:2, Kaohsiung:3"  );
                break;
            case 2:
                startStaion = Station.TAICHUNG;
                System.out.println("Your end station?  (Taipei:1, Kaohsiung:3"  );
                break;
            case 3:
                startStaion = Station.KAOHSIUNG;
                System.out.println("Your end station?  (Taipei:1, Taichung:2,"  );
                break;
        }
        choice = Integer.parseInt(scanner.next());
        switch (choice){
            case 1:
                endStaion = Station.TAIPEI;
                break;
            case 2:
                endStaion = Station.TAICHUNG;
                break;
            case 3:
                endStaion = Station.KAOHSIUNG;
                break;
        }
        List<String> ticketClass = new ArrayList<>();
        ticketClass.add("normal tickets");
        ticketClass.add("student tickets");
        ticketClass.add("elder tickets");

        for (int i =0;i<ticketClass.size();i++) {
            System.out.println("How many "+ticketClass.get(i)+" do you need?");

        }

        Ticket ticket1 = new Ticket(startStaion.id,endStaion.id,normal,student,elder);
        System.out.print("起站:"+startStaion.name+"\t"+"迄站:"+endStaion.name+"\t"+"一般票:"+endStaion.name+"\t"+"學生票:"+endStaion.name+"\t"+"敬老票:"+endStaion.name+"\t");
        ticket1.print();


    }

}
