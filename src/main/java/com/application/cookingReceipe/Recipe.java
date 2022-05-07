/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.cookingReceipe;

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
    private int id;
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

    public Recipe(){}
    public Recipe(@NotNull int id, @NotNull String name, @NotNull int rating, @NotNull String notes, @NotNull 
             String type, @NotNull int prepTime, @NotNull String photo, @NotNull int page, 
             @NotNull String ingredient, @NotNull String link) {
        this.id = id;
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
