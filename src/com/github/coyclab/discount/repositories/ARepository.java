package com.github.coyclab.discount.repositories;

import com.github.coyclab.discount.models.AModel;

import java.util.ArrayList;
import java.util.List;

public abstract class ARepository<M extends AModel> {

    private List<M> repository;

    ARepository() {
        this.repository = new ArrayList<>();
    }

    public List<M> getRepository() {
        return repository;
    }
}
