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
        int n = start + end;
        switch (n) {
            case 300:
                price = 600;
                break;
            case 400:
                price = 1500;
                break;
            case 500:
                price = 900;
                break;
        }
        return price;
    }

}
