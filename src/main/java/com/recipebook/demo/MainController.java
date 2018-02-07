package com.recipebook.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String index (){
        return "index";
    }

    @RequestMapping("/recipeindex")
    public String recipeindex (){
        return "recipeIndex";
    }

    @RequestMapping("/crabcake")
    public String crabpage (){
        return "crabCakeRecipe";
    }

    @RequestMapping("/injera")
    public String injerapage (){
        return "injeraRecipe";
    }

    @RequestMapping("/golabjamun")
    public String golabjamunpage (){
        return "golabJamunRecipe";
    }

    @RequestMapping("/jerkchicken")
    public String jerkchickenpage (){
        return "jerkChickenRecipe";
    }

    @RequestMapping("/croquemadame")
    public String croquemadamepage (){
        return "croqueMadameRecipe";
    }

    @RequestMapping("/bara")
    public String barapage (){
        return "baraRecipe";
    }
}
