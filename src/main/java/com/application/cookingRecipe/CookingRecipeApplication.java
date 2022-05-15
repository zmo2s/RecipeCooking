package com.application.cookingRecipe;

import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CookingRecipeApplication {
    @Autowired
    private RecipeService service;
    @Autowired
    private Irecipe repository;

	public static void main(String[] args) {
		SpringApplication.run(CookingRecipeApplication.class, args);
        }
        @PostConstruct
        public void checkIfWorks()
        {
         repository.deleteAll();
         Recipe cakeChocolate = new Recipe("gateau au chocolat", 5, "prechauffer au four 30 minute", "cake", 30, "cake.jpg", 273, "oeuf ,lait, chocolat", "https://cake.fr");
         Recipe cakeStrawberry = new Recipe( "gateau à la fraise", 5, "prechauffer au four 30 minute", "cake", 30, "cake.jpg", 273, "oeuf ,lait,fraise", "https://cake.fr");
         Recipe cakeNutella = new Recipe( "gateau à la nutella", 5, "prechauffer au four 30 minute", "cake", 30, "cake.jpg", 273, "oeuf ,lait,nutella", "https://cake.fr");
         service.create(cakeChocolate);
         service.create(cakeStrawberry);
         service.create(cakeNutella);
         service.deleteRecipe(cakeNutella);
        
         List<Recipe> find = service.findAll();
         for(Recipe recipe : find)
             System.out.println(recipe.getId()+";"+recipe.getName());
         //service.update(cakeStrawberry, (long)2);
         service.update(cakeChocolate, cakeStrawberry);      
         
        // service.deleteById((long)1);
     //    System.out.println("le nom est : "+ service.read((long)2).get().getName());
     //    service.deleteById((long)2);
     
         
        } 
        
        

}
