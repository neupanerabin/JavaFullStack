package com.example.demo.food;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)


public class PizzaMaker implements FoodMaker {
    @Override
    public String prepareFood() {
        return "Pizza";
    }
}
