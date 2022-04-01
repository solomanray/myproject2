package com.ray.ticket;

public class StudentTicket extends Ticket{
    int student;
    public StudentTicket(){}
    public StudentTicket(int start, int end, int student){
        super(start, end);
        this.student =student;
    }

    @Override
    public int getPrice() {
        return (int) (super.getPrice()*0.75*student);
    }
}
