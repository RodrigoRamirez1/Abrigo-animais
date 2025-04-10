package com.rramirez.animals_service.controllers;

import com.rramirez.animals_service.dtos.AnimaisPorFuncionario;
import com.rramirez.animals_service.entidades.Animal;
import com.rramirez.animals_service.repositorios.AnimalReposiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
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

    @GetMapping("/nao-adotados")
    private List<Animal> listaNaoAdotados(){
        return reposiory.findNotAdoped();
    }

    @GetMapping("/adotados")
    private List<Animal> listaAdotados(){
        return reposiory.findAdoped();
    }

    @GetMapping("/cachorros")
    private List<Animal> listarDogs(){
        return  reposiory.findTipoDog();
    }

    @GetMapping("/gatos")
    private List<Animal> listarCats(){
        return  reposiory.findTipoCat();
    }

    @GetMapping("/resgates")
    public List<AnimaisPorFuncionario> listaPorFuncionario() {
        return reposiory.findAnimaisPorFuncionario(LocalDateTime.now().minusYears(1), LocalDateTime.now());
    }
}
