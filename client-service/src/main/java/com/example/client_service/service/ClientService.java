package com.example.client_service.service;

import com.example.client_service.entity.Client;
import com.example.client_service.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    // Save a client to the database
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }
}
