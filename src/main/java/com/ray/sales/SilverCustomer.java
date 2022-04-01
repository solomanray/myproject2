package com.ray.sales;

public class SilverCustomer extends Customer {


    public SilverCustomer(String id, int price){
        super(id, price);
        //      滿千送百購物金
        bonus = discount;
    }

    public SilverCustomer(){}
}
