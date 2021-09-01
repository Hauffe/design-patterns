package com.example.designpatterns.structural.prototype.model;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Circle extends Shape{
    private int radius;

    public Circle(Circle source) {
        super(source);
        this.radius = source.getRadius();
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}
