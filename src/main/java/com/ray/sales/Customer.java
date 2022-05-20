package com.ray.sales;

public class Customer{
    public String id;
    int price;
    int discount;
    int bonus;


    public Customer(String id, int price){
        this.id = id;
        this.price = price;

//      買千送百
        discount = price/1000*100;
    }
    public Customer(){}

    public void print(){
        if (price>=1000) {
            System.out.println(id + "\t" + price + "\t" + (price-discount) + "\t" +"(" +bonus+")");
        }else {
            System.out.println(id  +"\t" + price + "\t" +"\t" + (price-discount) + "\t" + "\t"+"(" +bonus+")");
        }
    }


}
