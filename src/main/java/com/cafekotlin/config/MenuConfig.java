package com.cafekotlin.config;

import com.cafekotlin.foods.Burger;
import com.cafekotlin.foods.Sandwich;
import com.cafekotlin.ingredients.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.util.List;

@Configuration
@ImportResource({"classpath:META-INF/spring/ingredients.xml",
        "classpath:META-INF/spring/orderManager.xml"
})
public class MenuConfig {

    @Autowired
    private List<Ingredient> ingredients;

    @Bean
    @Qualifier("burger")
    public Burger burger() {
        return new Burger("Star Burger", 250.0, ingredients);
    }

    @Bean
    @Qualifier("sandwich")
    public Sandwich sandwich() {
        return new Sandwich("Italian Sandwich", 450.0, ingredients);
    }
}
