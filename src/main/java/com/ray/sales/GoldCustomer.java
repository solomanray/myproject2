package com.ray.sales;

public class GoldCustomer extends Customer{
    public GoldCustomer(String id, int price){
        super(id, price);
//        任何金額九折
//        回饋10%購物金
        discount =(int)(price*0.1f) ;
        bonus = (int) (price*0.1f);
    }
    public GoldCustomer(){}
}
