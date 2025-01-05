package com.example.client_service.service;

import com.example.client_service.entity.Client;
import com.example.client_service.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    // Save a client to the database
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    // Retrieve all clients from the database
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}
