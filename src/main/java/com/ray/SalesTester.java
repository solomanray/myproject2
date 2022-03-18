package com.ray;

public class SalesTester {
    public static void main(String[] args) {
        Customer c1 = new Customer("0001",1200);
        Customer c2 = new Customer("0002",800);
        SilverCustomer c3 = new SilverCustomer("0003",2000);
        GoldCustomer c4 = new GoldCustomer("0004",5000);
        c1.print();
        c2.print();
        c3.print();
        c4.print();


    }
}
