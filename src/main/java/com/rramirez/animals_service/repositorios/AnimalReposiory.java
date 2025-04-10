package com.rramirez.animals_service.repositorios;

import com.rramirez.animals_service.dtos.AnimaisPorFuncionario;
import com.rramirez.animals_service.entidades.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface AnimalReposiory extends JpaRepository<Animal, Long> {
    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NULL ORDER BY a.dataEntrada")
    List<Animal> findNotAdoped();

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NOT NULL")
    List<Animal> findAdoped();

    @Query("SELECT a from Animal a WHERE a.tipoAnimal = 'CACHORRO'")
    List<Animal> findTipoDog();

    @Query("SELECT a from Animal a WHERE a.tipoAnimal = 'GATO'")
    List<Animal> findTipoCat();

    @Query("SELECT nomeRecebedor AS funcionario, COUNT(*) AS quantidadeResgates FROM Animal  WHERE dataEntrada BETWEEN :dataInicio AND :dataFim GROUP BY nomeRecebedor")
    List<AnimaisPorFuncionario> findAnimaisPorFuncionario(@Param("dataInicio") LocalDateTime dataInicio, @Param("dataFim") LocalDateTime dataFim);
}
