package com.cafekotlin.ingredients;

public class Lettuce implements Ingredient {

    private String type;
    private String weight;

    public Lettuce(String type, String weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public void addIngredient() {
        System.out.println("Add lettuce...!");
    }
}
