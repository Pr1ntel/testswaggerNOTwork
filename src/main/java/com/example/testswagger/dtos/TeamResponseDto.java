package com.example.testswagger.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamResponseDto {
    private int id;
    private String name;
    private double rating;
}
