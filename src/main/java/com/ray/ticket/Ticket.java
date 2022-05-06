package com.ray.ticket;

public class Ticket{

    int start;
    int end;
    int price;

    public Ticket(){}
    public Ticket(int start, int end) {
        this.start = start;
        this.end = end;
    }


    public int getPrice() {
        int distance = Math.abs(start-end);
        switch (distance) {
            case 100:
                price = 500;
                break;
            case 200:
                price = 600;
                break;
            case 300:
                price = 1100;
                break;
        }
        return price;
    }

}
