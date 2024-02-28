package com.example.demo.food;

import org.springframework.stereotype.Component;

@Component
public class BurgerMaker implements FoodMaker{
    @Override
    public String prepareFood() {
        return "Burger ";
    }
}
