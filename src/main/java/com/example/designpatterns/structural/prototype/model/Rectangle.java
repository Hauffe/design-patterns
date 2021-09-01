package com.example.designpatterns.structural.prototype.model;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Rectangle extends Shape{

    private int width;
    private int height;

    public Rectangle(Rectangle source) {
        super(source);
        this.width = source.getWidth();
        this.height = source.getHeight();
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
