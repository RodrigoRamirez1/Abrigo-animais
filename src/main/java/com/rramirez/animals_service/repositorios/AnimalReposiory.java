package com.rramirez.animals_service.repositorios;

import com.rramirez.animals_service.entidades.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalReposiory extends JpaRepository<Animal, Long> {
}
