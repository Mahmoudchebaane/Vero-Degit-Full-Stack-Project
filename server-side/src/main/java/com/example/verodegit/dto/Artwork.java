package com.example.verodegit.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Artwork {
    @JsonProperty("id")
    private int id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("artist_title")
    private String artiste;
    @JsonProperty("description")
    private String description;

    @JsonProperty("place_of_origin")
    private String place;

    @JsonProperty("image_id")
    private UUID image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtiste() {
        return artiste;
    }

    public void setArtiste(String artiste) {
        this.artiste = artiste;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public UUID getImage() {
        return image;
    }

    public void setImage(UUID image) {
        this.image = image;
    }
}
