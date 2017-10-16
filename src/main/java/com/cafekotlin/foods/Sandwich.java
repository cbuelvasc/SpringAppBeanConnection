package com.cafekotlin.foods;

import com.cafekotlin.ingredients.Ingredient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Sandwich implements Food {

    private String name;
    private Double price;
    private List<Ingredient> ingredientList;

    public Sandwich(String name, Double price, List<Ingredient> ingredientList) {
        this.name = name;
        this.price = price;
        this.ingredientList = ingredientList;
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

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public void setIngredients(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    @Override
    public void prepareFood() {
        System.out.println("Preparing Sandwich");
        System.out.println(getName() + " " + getPrice());
        for (Ingredient ingredient : getIngredientList()) {
            ingredient.addIngredient();
        }
    }
}
