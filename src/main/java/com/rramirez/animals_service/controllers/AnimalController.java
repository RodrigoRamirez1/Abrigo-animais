package com.rramirez.animals_service.controllers;

import com.rramirez.animals_service.entidades.Animal;
import com.rramirez.animals_service.repositorios.AnimalReposiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("animal")
public class AnimalController {

    @Autowired
    private AnimalReposiory reposiory;

    public AnimalController(AnimalReposiory reposiory){
        this.reposiory = reposiory;
    }

    @GetMapping
    private List<Animal> listaAnimal(){
        return reposiory.findAll();
    }

    @PostMapping
    private Animal cadastrarAnimal(@RequestBody Animal animal){
        return reposiory.save(animal);
    }
}
