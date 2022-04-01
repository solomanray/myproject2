package com.ray.sales;

import java.util.ArrayList;
import java.util.List;

public class SalesTester {
    public static void main(String[] args) {

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("0001",1200));
        customers.add(new Customer("0002",800));
        customers.add(new SilverCustomer("0003",2300));
        customers.add(new GoldCustomer("0004",5400));
        customers.add(new PlatinumCustomer("0005",6800));

        for (int i = 0; i < customers.size(); i++) {
            customers.get(i).print();
        }
    }
}
