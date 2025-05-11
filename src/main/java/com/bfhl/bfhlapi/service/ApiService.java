package com.bfhl.bfhlapi.service;

import com.bfhl.bfhlapi.model.ApiResponse;
import com.bfhl.bfhlapi.model.InputRequest;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ApiService {

    public ApiResponse getOperationCode() {
        ApiResponse response = new ApiResponse();
        response.setUser_id("operation_code_xyz123");
        return response;
    }

    public ApiResponse processData(InputRequest input) {
        ApiResponse response = new ApiResponse();

        response.setUser_id("john_doe_17091999");
        response.setEmail("john@xyz.com");
        response.setRoll_number("ABCD123");
        response.setIs_success(true);

        List<String> numbers = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();

        for (String item : input.getData()) {
            if (item.matches("\\d+")) numbers.add(item);
            else if (item.matches("[a-zA-Z]")) alphabets.add(item);
        }

        response.setNumbers(numbers);
        response.setAlphabets(alphabets);

        List<String> lowercase = alphabets.stream()
                .filter(ch -> ch.matches("[a-z]"))
                .sorted(Comparator.reverseOrder())
                .limit(1)
                .collect(Collectors.toList());
        response.setHighest_lowercase_alphabet(lowercase);

        boolean hasPrime = numbers.stream().anyMatch(this::isPrime);
        response.setIs_prime_found(hasPrime);

        // Dummy file info
        ApiResponse.FileInfo fileInfo = new ApiResponse.FileInfo();
        fileInfo.setFile_valid(input.getFile_b64() != null && !input.getFile_b64().isEmpty());
        fileInfo.setFile_mime_type("application/octet-stream");
        fileInfo.setFile_size_kb(123);
        response.setFile_info(fileInfo);

        return response;
    }

    private boolean isPrime(String numStr) {
        try {
            int num = Integer.parseInt(numStr);
            if (num < 2) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

