package com.example.designpatterns.structural.prototype.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ShapesDB {

    private List<Shape> shapes;
    private Circle circle;
    private Rectangle rectangle;

    private static ShapesDB instance;

    public ShapesDB() {
        shapes = new ArrayList<Shape>();
        circle = new Circle();
        circle.setX(10);
        circle.setY(10);
        circle.setRadius(20);
        shapes.add(circle);

        rectangle = new Rectangle();
        rectangle.setX(10);
        rectangle.setY(10);
        rectangle.setHeight(20);
        rectangle.setWidth(40);
        shapes.add(rectangle);
    }

    /**
     * This is a singleton method just to illustrate an use with prototype pattern.
     * @return ShapesDB instance
     */
    public static ShapesDB getInstance(){
        if(instance ==null){
            instance = new ShapesDB();
        }
        return instance;

    }
}
