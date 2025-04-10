package com.rramirez.animals_service.repositorios;

import com.rramirez.animals_service.entidades.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AnimalReposiory extends JpaRepository<Animal, Long> {
    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NULL ORDER BY a.dataEntrada")
    List<Animal> findNotAdoped();

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NOT NULL ORDER ")
    List<Animal> findAdoped();
}
