package com.bfhl.bfhlapi.controller;

import com.bfhl.bfhlapi.model.ApiResponse;
import com.bfhl.bfhlapi.model.InputRequest;
import com.bfhl.bfhlapi.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bfhl")
@CrossOrigin(origins = "*")
public class ApiController {

    @Autowired
    private ApiService apiService;

    @GetMapping
    public ApiResponse getOperationCode() {
        return apiService.getOperationCode();
    }

    @PostMapping
    public ApiResponse handlePost(@RequestBody InputRequest input) {
        return apiService.processData(input);
    }
}