package com.example.designpatterns.structural.abstractFactory.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sofa {
    private Integer legs;
    private String size;
    private String shape;
    private String description;
}
