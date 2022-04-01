package com.ray.ticket;

public class ElderTicket extends Ticket{
    int elder;
    public ElderTicket(){}
    public ElderTicket(int start, int end,int elder){
        super(start, end);
        this.elder =elder;
    }

    @Override
    public int getPrice() {
        return (int) (super.getPrice()*0.5*elder);
    }
}
