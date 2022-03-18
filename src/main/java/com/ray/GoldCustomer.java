package com.ray;

public class GoldCustomer extends Customer{
    public GoldCustomer(String id, int price){
        super(id, price);
    }
    public GoldCustomer(){}
    @Override
    public void print(){
        payment = price-(price/1000)*200;
        bonus = price/1000*200;
        if (price>=1000) {
            System.out.println(id+"*" + "\t" + price + "\t" + payment + "\t" +"(" +bonus+")");
        }else {
            System.out.println(id+"*" +"\t" + price + "\t" +"\t" + payment + "\t" + "\t"+"(" +bonus+")");
        }

    }
}
