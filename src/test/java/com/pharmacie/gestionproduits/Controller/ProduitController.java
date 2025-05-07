package com.pharmacie.gestionproduits.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/print")
public class ProduitController {

    @GetMapping("/print-name")
    public String printName(){
        return "asmoune test:::::::::";
    }
}
