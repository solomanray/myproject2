package com.ray.sales;

public class PlatinumCustomer extends Customer{

    public PlatinumCustomer(String id , int price){
        super(id, price);
//        任何金額七折
//        回饋20%購物金
        discount =(int)(price*0.3f) ;
        bonus = (int) (price*0.2f);
    }

    public PlatinumCustomer(){}
}
