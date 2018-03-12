package com.github.coyclab.discount.managers;

import com.github.coyclab.discount.models.Client;
import com.github.coyclab.discount.repositories.ClientRepository;

public class ClientManager extends AManager<ClientRepository, Client> {

    public ClientManager() {
        super(new ClientRepository());
    }
}
