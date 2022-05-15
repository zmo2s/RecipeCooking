/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.cookingRecipe;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;



/**
 *
 * @author anto
 */
@Service
public class RecipeService {
    private Irecipe recipeService;
    public RecipeService(Irecipe recipeService) { this.recipeService = recipeService;} 

  
    @Transactional(propagation = Propagation.REQUIRED)
    public Recipe create(Recipe recipe ) {
        return recipeService.save(recipe);
    }
    
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteRecipe( Recipe recipe ) {
         recipeService.delete(recipe);
    }
    
      @Transactional(propagation = Propagation.REQUIRED)
    public Optional<Recipe> read( Long id ) {
         return recipeService.findById(id);

    }
    
    @Transactional(propagation = Propagation.REQUIRED)
    public void save(Recipe recipe ) {
         recipeService.save(recipe);
    }
     @Transactional(propagation = Propagation.REQUIRED)
    public void update(Recipe recipe, Recipe recipe1) {
        deleteRecipe(recipe);
        Recipe newRecipe = recipe;
        recipe.setName(recipe1.getName());
        create(recipe);
    }
    
         @Transactional(propagation = Propagation.REQUIRED)
    public List<Recipe> findAll() {
        List<Recipe> recipe = new ArrayList<>();
        Iterable<Recipe> iterator = recipeService.findAll();
        iterator.forEach(recipe::add);
        return recipe;
    }
    
    
    
    
    
    
    
    
}
