package com.cafekotlin.ingredients;

public class Meat implements Ingredient {

    private String slice;
    private String weight;

    public Meat(String slice, String weight) {
        this.slice = slice;
        this.weight = weight;
    }

    @Override
    public void addIngredient() {
        System.out.println("Add meat...!");
    }
}
