package com.example.designpatterns.structural.factory.controller;

import com.example.designpatterns.structural.factory.model.JungleTransport;
import com.example.designpatterns.structural.factory.model.RoadTransport;
import com.example.designpatterns.structural.factory.model.SeaTransport;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/structural")
public class FactoryController {

    /**
     * @apiNote This is a simple example of a factory method as an endpoint, I used <a href="https://refactoring.guru/design-patterns/factory-method">this</a> as a guideline.
     * @param type String
     * @return Plain json response
     * @see <a href="https://refactoring.guru/design-patterns/factory-method">this</a>
     */
    @GetMapping(path = {"/factory/{type}"})
    public String FactoryMethod(@PathVariable String type) {
        var method = "";
        switch (type){
            case "sea":
                method = new SeaTransport().showTransport();
                break;
            case "road":
                method = new RoadTransport().showTransport();
                break;
            case "jungle":
                method = new JungleTransport().showTransport();
                break;
        }
        return method;
    }
}
