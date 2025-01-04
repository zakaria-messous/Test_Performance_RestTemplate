package com.example.client_service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "car-service")
public interface CarServiceFeignClient {
    @GetMapping("/cars/client/{clientId}")
    List<Object> getCarsByClientId(@PathVariable int clientId);
}
