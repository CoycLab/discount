package com.github.coyclab.discount.managers;

import com.github.coyclab.discount.models.AModel;
import com.github.coyclab.discount.repositories.ARepository;

import java.util.List;

public class AManager<R extends ARepository, M extends AModel> {

    private R repository;
    private List<M> items;

    AManager(R repository) {
        this.repository = repository;
        this.items = repository.getRepository();
    }

    public List<M> getAll() {
        return items;
    }

    public void add(M entity) {
        items.add(entity);
    }
}
