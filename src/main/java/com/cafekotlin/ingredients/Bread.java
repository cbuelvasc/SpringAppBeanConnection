package com.cafekotlin.ingredients;

public class Bread implements Ingredient {

    private String type;
    private String weight;

    public Bread(String type, String weight){
        this.type = type;
        this.weight = weight;
    }

    @Override
    public void addIngredient() {
        System.out.println("Add bread...!");
    }
}
