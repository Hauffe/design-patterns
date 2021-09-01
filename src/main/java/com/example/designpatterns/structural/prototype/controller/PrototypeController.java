package com.example.designpatterns.structural.prototype.controller;

import com.example.designpatterns.structural.prototype.model.ShapesDB;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/structural")
public class PrototypeController {
    /**
     * @apiNote This is a simple example of a factory method as an endpoint, I used <a href="https://refactoring.guru/design-patterns/prototype">this</a> as a guideline.
     * @param type String
     * @return Plain json response
     * @see <a href="https://refactoring.guru/design-patterns/prototype">this</a>
     */
    @GetMapping(path = {"/prototype/{type}"})
    public String FactoryMethod(@PathVariable String type) {
        switch (type){
            case "circle":
                ShapesDB.getInstance().getShapes().add(ShapesDB.getInstance().getCircle().clone());
                break;
            case "rectangle":
                ShapesDB.getInstance().getShapes().add(ShapesDB.getInstance().getRectangle().clone());
                break;
        }
        return ShapesDB.getInstance().getShapes().toString();
    }
}
