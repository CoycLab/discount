package com.github.coyclab.discount.managers;

import com.github.coyclab.discount.models.Car;
import com.github.coyclab.discount.repositories.CarRepository;

public class CarManager extends AManager<CarRepository, Car> {

    public CarManager() {
        super(new CarRepository());
    }

}
