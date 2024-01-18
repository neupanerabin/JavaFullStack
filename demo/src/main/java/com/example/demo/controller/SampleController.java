package com.example.demo.controller;

import com.example.demo.food.FoodMaker;
import com.example.demo.food.FoodMaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    private FoodMaker foodMaker;
    FoodMaker foodMakerTwo;

    @Autowired
    SampleController(@Qualifier("pizzaMaker") FoodMaker theFoodMaker, @Qualifier("pizzaMaker") FoodMaker theFoodMakerTwo) {
        foodMaker = theFoodMaker;
        foodMakerTwo = theFoodMakerTwo;
    }

    @GetMapping("/greeting")
    public String getGreeting() {
        return ("Hello Greetings ");
    }

    @GetMapping("/prepareFood")
    public String prepareFood() {
        return foodMaker.prepareFood();
    }
    @GetMapping("/compareInstance")
        public Boolean compareInstance(){
            return foodMaker==foodMakerTwo;
    }
}