package com.example.recipesandcookingtips;

public class Recipes {
    private String RecipesTitle;
    private String RecipesAuthor;
    private int RecipesImageId;

    public Recipes(String RecipesTitle, String bookAuthor, int bookImageId) {
        this.RecipesTitle = RecipesTitle;
        this.RecipesAuthor = RecipesAuthor;
        this.RecipesImageId = RecipesImageId;
    }

    public String getRecipesTitle() {
        return RecipesTitle;
    }

    public String getRecipesAuthor() {
        return RecipesAuthor;
    }

    public int getRecipesImageId() {
        return RecipesImageId;
    }
}