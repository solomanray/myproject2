package com.ray;

public class SilverCustomer extends Customer {


    public SilverCustomer(String id, int price){
        super(id, price);
    }

    public SilverCustomer(){}

    @Override
    public void print() {
//  買千送百抵用金

        bonus = price/1000*100;
        super.print();

    }
}
