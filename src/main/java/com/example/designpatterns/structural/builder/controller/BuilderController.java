package com.example.designpatterns.structural.builder.controller;

import com.example.designpatterns.structural.builder.model.CarBuilder;
import com.example.designpatterns.structural.builder.model.Director;
import com.example.designpatterns.structural.builder.model.ManualBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/structural")
public class BuilderController {

    /**
     * @apiNote This is a simple example of a Builder method as an endpoint, I used <a href="https://refactoring.guru/design-patterns/builder">this</a> as a guideline.
     * @param type String
     * @return Plain json response
     * @see <a href="https://refactoring.guru/design-patterns/builder">this</a>
     */
    @GetMapping(path = {"/builder/car/{type}"})
    public String CarBuilderMethod(@PathVariable String type) {
        var method = "";
        switch (type){
            case "suv":
                method = new Director().makeSUV(new CarBuilder());
                break;
            case "sports":
                method = new Director().makeSportsCar(new CarBuilder());
                break;
        }
        return method;
    }

    /**
     * @apiNote This is a simple example of a Builder method as an endpoint, I used <a href="https://refactoring.guru/design-patterns/builder">this</a> as a guideline.
     * @param type String
     * @return Plain json response
     * @see <a href="https://refactoring.guru/design-patterns/builder">this</a>
     */
    @GetMapping(path = {"/builder/manual/{type}"})
    public String ManualBuilderMethod(@PathVariable String type) {
        var method = "";
        switch (type){
            case "suv":
                method = new Director().makeSUV(new ManualBuilder());
                break;
            case "sports":
                method = new Director().makeSportsCar(new ManualBuilder());
                break;
        }
        return method;
    }
}
