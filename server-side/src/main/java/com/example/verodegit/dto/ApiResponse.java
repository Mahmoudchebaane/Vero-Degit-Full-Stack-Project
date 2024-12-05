package com.example.verodegit.dto;

import java.util.List;

public class ApiResponse {
    private Pagination pagination;
    private List<Artwork> data;

    // Getters et setters
    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public List<Artwork> getData() {
        return data;
    }

    public void setData(List<Artwork> data) {
        this.data = data;
    }
}
