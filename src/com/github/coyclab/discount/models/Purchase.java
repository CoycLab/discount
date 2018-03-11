package com.github.coyclab.discount.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Purchase {

    private static Long nextID = 0L;

    private Long id;
    private Date date;
    private String article;
    private String description;
    private Integer count;
    private Float fullPrice;
    private Float purchasePrice;

    public Purchase() {
        this.id = nextID++;
    }

    public Purchase(Date date, String article, String description, Integer count, Float fullPrice) {
        this();
        this.date = date;
        this.article = article;
        this.description = description;
        this.count = count;
        this.fullPrice = fullPrice;
    }

    public Long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Float getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(Float fullPrice) {
        this.fullPrice = fullPrice;
    }

    public Float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    @Override
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/YYYY");
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("%1$-13s", df.format(date)))
                .append(String.format("%1$-35s\t", description))
                .append(String.format("%1$-10s\t", article))
                .append(String.format("%1$2s\t", count))
                .append(String.format("%1$7s\t", fullPrice))
                .append(String.format("%1$7s", purchasePrice)).append("\n");

        return builder.toString();
    }
}
