package com.example.verodegit.controller;

import com.example.verodegit.dto.ApiResponse;
import com.example.verodegit.service.ExternalApiService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/artworks") // Specifies the base URL for this controller
public class ArtWorkController {

    private final ExternalApiService externalApiService; // The service class used to fetch artworks data

    // Constructor to inject the ExternalApiService into the controller
    public ArtWorkController(ExternalApiService externalApiService) {
        this.externalApiService = externalApiService;
    }

    @CrossOrigin(origins = "http://localhost:3001") // Autorise only localhost:3001
    @GetMapping
    public ApiResponse getArtWorks(
            @RequestParam(required = false) String search,  // Optional search query
            @RequestParam(defaultValue = "1") int page,  // Default page: 1
            @RequestParam(defaultValue = "12") int limit // Default limit: 12 results
    ) {
        return externalApiService.getArtworks(search, page, limit);
    }

}
