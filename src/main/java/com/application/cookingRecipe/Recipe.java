/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.cookingRecipe;

import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author anto
 */
@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private int rating;
    @NotNull
    private String notes;
    @NotNull
    private String type;
    @NotNull
    private int prepTime;
    @NotNull
    private String photo;
    @NotNull
    private int page;
    @NotNull
    private String ingredient;
    @NotNull
    private String link;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public String getNotes() {
        return notes;
    }

    public String getType() {
        return type;
    }

    public int getPrepTime() {
        return prepTime;
    }

    public String getPhoto() {
        return photo;
    }

    public int getPage() {
        return page;
    }

    public String getIngredient() {
        return ingredient;
    }

    public String getLink() {
        return link;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrepTime(int prepTime) {
        this.prepTime = prepTime;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public void setLink(String link) {
        this.link = link;
    }

   
    public Recipe(){}
    public Recipe( @NotNull String name, @NotNull int rating, @NotNull String notes, @NotNull 
             String type, @NotNull int prepTime, @NotNull String photo, @NotNull int page, 
             @NotNull String ingredient, @NotNull String link) {
     
        this.name = name;
        this.rating = rating;
        this.notes = notes;
        this.type = type;
        this.prepTime = prepTime;
        this.photo = photo;
        this.page = page;
        this.ingredient = ingredient;
        this.link = link;
    }
    
    
}
