package com.example.demo.rest.dto;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class TournamentCreateResponseDTO {
    public String id;
    public String name;
    public int maxPart;
    public TournamentCreateResponseDTO() {
    }
    public TournamentCreateResponseDTO(String id, String name, int maxPart) {
        this.id = id;
        this.name = name;
        this.maxPart = maxPart;
    }
}
