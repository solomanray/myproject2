package com.ray.ticket;

public class Ticket{
    static final int TAIPEI_CITY = 100;
    static final int TAICHUNG_CITY = 200;
    static final int KAOHSIUNG_CITY = 300;


    int start;
    int end;
    int price;
    int normal;
    int student;
    int elder;


    public Ticket(){}
    public Ticket(int start, int end, int normal,int student,int elder) {
        this.start = start;
        this.end = end;
        this.normal = normal;
        this.student = student;
        this.elder = elder;
    }


    public void print(){
        int n = start+end;
        switch (n){
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

        System.out.println("價格:"+price);


    }
}
