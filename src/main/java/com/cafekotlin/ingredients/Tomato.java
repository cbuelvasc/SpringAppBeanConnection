package com.cafekotlin.ingredients;

public class Tomato implements Ingredient {

    private String slices;
    private String weight;

    public Tomato(String slices, String weight) {
        this.slices = slices;
        this.weight = weight;
    }

    @Override
    public void addIngredient() {
        System.out.println("Add tomato slices...!");
    }
}
