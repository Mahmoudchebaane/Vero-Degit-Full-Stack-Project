package com.example.verodegit.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Artwork {
    @JsonProperty("id") // // Maps the "id" property from the JSON to the "id" field in Java
    private int id;
    @JsonProperty("title") // Maps the JSON property "title" to this field
    private String title;
    @JsonProperty("artist_title") // Maps the "artist_title" property from the JSON to the "artiste" field in Java
    private String artiste;
    @JsonProperty("description") // Maps the JSON property "description" to this field
    private String description;

    @JsonProperty("place_of_origin") // Maps the JSON property "place_of_origin" to this field
    private String place;

    @JsonProperty("image_id") // Maps the JSON property "image_id" to this field
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
