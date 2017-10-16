package com.cafekotlin;

import com.cafekotlin.config.MenuConfig;
import com.cafekotlin.foods.Food;
import com.cafekotlin.ingredients.Ingredient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MenuMain {

    public static void main(String... args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MenuConfig.class);
        Food burger = (Food) context.getBean("burger");
        burger.prepareFood();

        Food sandwich = (Food) context.getBean("sandwich");
        sandwich.prepareFood();


        List<Ingredient> ingredients = (List<Ingredient>) context.getBean("ingredientList");

        for (Ingredient ingredient : ingredients) {
            ingredient.addIngredient();
        }


    }
}
