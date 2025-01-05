package com.example.client_service.controller;

import com.example.client_service.entity.Client;
import com.example.client_service.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients") // Ensures this controller handles requests for /clients
public class ClientController {

    @Autowired
    private ClientService clientService;

    // POST endpoint to save a client
    @PostMapping
    public ResponseEntity<Client> saveClient(@RequestBody Client client) {
        System.out.println("Received client: " + client);
        return ResponseEntity.ok(clientService.saveClient(client));
    }

    // GET endpoint to retrieve all clients
    @GetMapping
    public ResponseEntity<List<Client>> getAllClients() {
        List<Client> clients = clientService.getAllClients();
        return ResponseEntity.ok(clients);
    }
}
