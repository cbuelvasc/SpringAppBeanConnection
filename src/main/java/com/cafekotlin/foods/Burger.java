package com.cafekotlin.foods;

import com.cafekotlin.ingredients.Ingredient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Burger implements Food {

    private String name;
    private Double price;
    private List<Ingredient> ingredients;

    public Burger(String name, Double price, List<Ingredient> ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public void prepareFood() {
        System.out.println("Preparing hamburger");
        System.out.println(getName() + " " + getPrice());
        for (Ingredient ingredient : getIngredients()) {
            ingredient.addIngredient();
        }
    }
}
