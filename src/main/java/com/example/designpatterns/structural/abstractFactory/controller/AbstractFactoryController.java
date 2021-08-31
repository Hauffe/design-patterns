package com.example.designpatterns.structural.abstractFactory.controller;

import com.example.designpatterns.structural.abstractFactory.model.AppConfigurator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/structural")
public class AbstractFactoryController {

    /**
     * @apiNote This is a simple example of a factory method as an endpoint, I used <a href="https://refactoring.guru/design-patterns/abstract-factory">this</a> as a guideline.
     * @param type String
     * @return Plain json response
     * @see <a href="https://refactoring.guru/design-patterns/abstract-factory">this</a>
     */
    @GetMapping(path = {"/abstract-factory/{type}"})
    public String AbstractFactoryMethod(@PathVariable String type) {
        var factory = AppConfigurator.factoryConfig(type);
        return factory.CreateChair().getDescription() +
                factory.CreateSofa().getDescription() +
                factory.CreateCoffeeTable().getDescription();
    }
}
