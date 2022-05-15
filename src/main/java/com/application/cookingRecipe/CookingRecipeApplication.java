package com.application.cookingReceipe;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CookingReceipeApplication {
    @Autowired
    private RecipeService service;
    @Autowired
    private Irecipe repository;

	public static void main(String[] args) {
		SpringApplication.run(CookingReceipeApplication.class, args);
        }
        @PostConstruct
        public void checkIfWorks()
        {
         repository.deleteAll();
         service.create(new Recipe(1, "gateau au chocolat", 5, "prechauffer au four 30 minute", "cake", 30, "cake.jpg", 273, "oeuf ,lait", "https://cake.fr"));
        } 
        
        

}
