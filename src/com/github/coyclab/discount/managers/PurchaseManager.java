package com.github.coyclab.discount.managers;

import com.github.coyclab.discount.models.Purchase;
import com.github.coyclab.discount.repositories.PurchaseRepository;

public class PurchaseManager extends AManager<PurchaseRepository, Purchase> {

    public PurchaseManager(){
        super(new PurchaseRepository());
    }
}
