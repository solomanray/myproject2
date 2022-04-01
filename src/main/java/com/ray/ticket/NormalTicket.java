package com.ray.ticket;

public class NormalTicket extends Ticket{
    int normal;
    public NormalTicket(){}
    public NormalTicket(int start, int end, int normal){
        super(start, end);
        this.normal =normal;

    }

    @Override
    public int getPrice() {
        return (super.getPrice()*normal);
    }
}
