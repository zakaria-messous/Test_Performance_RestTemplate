package com.example.client_service.controller;

import com.example.client_service.entity.Client;
import com.example.client_service.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/clients") // Ensure this maps to /clients
public class ClientController {

    @Autowired
    private ClientService clientService;

    // POST endpoint to save a client
    @PostMapping
    public ResponseEntity<Client> saveClient(@RequestBody Client client) {
        System.out.println("Request received to save client: " + client);
        return ResponseEntity.ok(clientService.saveClient(client));
    }


}
