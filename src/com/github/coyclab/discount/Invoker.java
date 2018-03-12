package com.github.coyclab.discount;

import com.github.coyclab.discount.managers.CarManager;
import com.github.coyclab.discount.managers.ClientManager;
import com.github.coyclab.discount.managers.PurchaseManager;
import com.github.coyclab.discount.models.Car;
import com.github.coyclab.discount.models.Client;
import com.github.coyclab.discount.models.Purchase;

import java.util.Date;

public class Invoker {

    private CarManager carManager;
    private ClientManager clientManager;
    private PurchaseManager purchaseManager;

    public Invoker() {
        carManager = new CarManager();
        clientManager = new ClientManager();
        purchaseManager = new PurchaseManager();
    }

    public void init(){
        carManager.add(new Car("Mercedes-Benz", "W124",
                Car.FuelType.DIESEL, "2.0 CDi", new Date(), "WDB2100071B235689"));

        clientManager.add(new Client(50, "Алексей", "Юрьевич", "Васильков", "375291234567"));

        purchaseManager.add(new Purchase(new Date(),"51 567454",
                "Колодки тормозные W124 пер", 2,15.30f));
        purchaseManager.add(new Purchase(new Date(),"521104",
                "Шаровая опора W211 пер верхняя", 1,55.70f));
        purchaseManager.add(new Purchase(new Date(),"19223",
                "Свеча накала OM601", 10,14.10f));
    }

    public void getClients(){
        for (Client c: clientManager.getAll()) {
            System.out.println(c);
        }
    }

}
