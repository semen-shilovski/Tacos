package com.example.demo;

import lombok.Data;

import java.util.List;

@Data
public class Taco {
    private String name;
    private List<Ingridient> ingredients;
}