package com.example.verodegit.service;

import com.example.verodegit.dto.ApiResponse;
import com.example.verodegit.dto.Artwork;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;


@Service
public class ExternalApiService {

    @Value("${external.api.url}") // Injects the URL of the external API from the application properties file
    private String externalApiUrl;

    private final WebClient webClient; // The WebClient instance to make HTTP requests

    // Constructor to inject the WebClient dependency
    public ExternalApiService(WebClient webClient) {
        this.webClient = webClient;
    }

    public ApiResponse getArtworks(String query, int page, int limit) {
        // Build the URL with the search query and pagination parameters
        String URL = externalApiUrl +
                (query != null ? "/search?q=" + query : "?") +
                "&fields=id,title,artist_title,description,date_display,place_of_origin,image_id,main_reference_number,artist_display" +
                "&page=" + page +
                "&limit=" + limit;

        // Using WebClient to make the external API call and retrieve the response
        return webClient
                .get()
                .uri(URL)
                .retrieve()
                .bodyToMono(ApiResponse.class) // Retrieve the entire response
                .block();
    }


}
