package com.ray;

public class Customer {
    String id;
    int price;
    int payment;
    int bonus=0;

    public Customer(String id, int price){
        this.id = id;
        this.price = price;
    }
    public Customer(){}

    public void print(){
//      買千送百
        payment = price-(price/1000*100);
        if (price>=1000) {
            System.out.println(id + "\t" + price + "\t" + payment + "\t" +"(" +bonus+")");
        }else {
            System.out.println(id  +"\t" + price + "\t" +"\t" + payment + "\t" + "\t"+"(" +bonus+")");
        }
    }


}
