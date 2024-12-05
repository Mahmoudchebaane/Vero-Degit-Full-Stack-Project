package com.example.verodegit.controller;

import com.example.verodegit.dto.ApiResponse;
import com.example.verodegit.service.ExternalApiService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/artworks")
public class ArtWorkController {

    private final ExternalApiService externalApiService;


    public ArtWorkController(ExternalApiService externalApiService) {
        this.externalApiService = externalApiService;
    }

    @CrossOrigin(origins = "http://localhost:3001") // Autoriser uniquement localhost:3001
    @GetMapping
    public ApiResponse getArtWorks(
            @RequestParam(required = false) String search,
            @RequestParam(defaultValue = "1") int page,  // Page par défaut : 1
            @RequestParam(defaultValue = "12") int limit // Limite par défaut : 10 résultats
    ) {
        return externalApiService.getArtworks(search, page, limit);
    }

}
