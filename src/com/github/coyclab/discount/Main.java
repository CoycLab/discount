package com.github.coyclab.discount;

import com.github.coyclab.discount.models.Car;
import com.github.coyclab.discount.models.Purchase;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Mercedes-Benz", "W124",
                Car.FuelType.DIESEL, "2.0 CDi", new Date(), "WDB2100071B235689");

        System.out.println(car);

        Purchase purchase = new Purchase(new Date(),"51 567454",
                "Колодки тормозные W124 пер", 2,15.30f);
        Purchase purchase2 = new Purchase(new Date(),"521104",
                "Шаровая опора W211 пер верхняя", 1,55.70f);
        Purchase purchase3 = new Purchase(new Date(),"19223",
                "Свеча накала OM601", 10,14.10f);

        System.out.println(purchase);
        System.out.println(purchase2);
        System.out.println(purchase3);
    }
}
