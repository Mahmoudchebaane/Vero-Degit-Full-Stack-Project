package com.example.verodegit.service;

import com.example.verodegit.dto.ApiResponse;
import com.example.verodegit.dto.Artwork;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;


@Service
public class ExternalApiService {

    @Value("${external.api.url}")
    private String externalApiUrl;

    private final WebClient webClient;

    public ExternalApiService(WebClient webClient) {
        this.webClient = webClient;
    }

    public ApiResponse getArtworks(String query, int page, int limit) {
        // Construire l'URL avec pagination
        String URL = externalApiUrl +
                (query != null ? "/search?q=" + query : "?") +
                "&fields=id,title,artist_title,description,date_display,place_of_origin,image_id,main_reference_number,artist_display" +
                "&page=" + page +
                "&limit=" + limit;

        // Utilisation de WebClient pour effectuer l'appel à l'API externe
        return webClient
                .get()
                .uri(URL)
                .retrieve()
                .bodyToMono(ApiResponse.class) // Récupérer toute la réponse
                .block();
    }


}
