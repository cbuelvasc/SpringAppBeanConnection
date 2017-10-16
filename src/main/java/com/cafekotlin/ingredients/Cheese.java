package com.cafekotlin.ingredients;

public class Cheese implements Ingredient {

    private String slice;
    private String type;
    private String weight;

    public Cheese(String type, String slice, String weight) {
        this.type = type;
        this.slice = slice;
        this.weight = weight;
    }

    @Override
    public void addIngredient() {
        System.out.println("Add cheese...!");
    }
}
