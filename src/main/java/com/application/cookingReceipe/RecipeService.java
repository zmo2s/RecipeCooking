/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.cookingReceipe;


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
  
    
    
}
