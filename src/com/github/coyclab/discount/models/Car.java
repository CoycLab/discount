package com.github.coyclab.discount.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Car extends AModel {
    private static Long nextID = 0L;

    private Long id;
    private String producer;
    private String model;
    private FuelType fuelType;
    private String engine;
    private Date year;
    private String VIN;

    private Car() {
        this.id = nextID++;
    }

    public Car(String producer, String model, FuelType fuelType, String engine, Date year) {
        this();
        this.producer = producer;
        this.model = model;
        this.fuelType = fuelType;
        this.engine = engine;
        this.year = year;
    }

    public Car(String producer, String model, FuelType fuelType, String engine, Date year, String VIN) {
        this();
        this.producer = producer;
        this.model = model;
        this.fuelType = fuelType;
        this.engine = engine;
        this.year = year;
        this.VIN = VIN;
    }


    public Long getId() {
        return id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    @Override
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat("YYYY");
        StringBuilder builder = new StringBuilder();
        builder.append("Производитель:\t").append(producer).append("\n")
                .append("Модель:\t\t\t").append(model).append("\n")
                .append("Тип топлива:\t").append(fuelType).append("\n")
                .append("Двигатель:\t\t").append(engine).append("\n")
                .append("Год выпуска:\t").append(df.format(year)).append("\n")
                .append("VIN код: \t\t").append(VIN).append("\n");

        return builder.toString();
    }

    public enum FuelType {
        DIESEL("Дизель"),
        GASOLINE("Бензин"),
        LPG("Газ-Бензин");

        private String fuelType;

        FuelType(String fuelType) {
            this.fuelType = fuelType;
        }

        @Override
        public String toString() {
            return fuelType;
        }
    }
}
