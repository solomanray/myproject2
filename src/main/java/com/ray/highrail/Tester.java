package com.ray.highrail;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Station startStaion = null;
        Station endStaion = null;
        int normal;
        int student;
        int elder;
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
        System.out.println("How many normal tickets you need?" );

        Ticket ticket1 = new Ticket(startStaion.id,endStaion.id,2,3,3);
        System.out.print("起站:"+startStaion.name+"\t"+"迄站:"+endStaion.name+"\t");
        ticket1.print();


    }

}
