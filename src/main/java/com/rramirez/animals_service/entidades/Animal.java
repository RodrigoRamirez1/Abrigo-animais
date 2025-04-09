package com.rramirez.animals_service.entidades;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private UUID id;
    @Column(nullable = false)
    private String nomeProvisorio;
    @Column(nullable = false)
    private Integer idadeEstimada;
    @Column(nullable = false)
    private String raca;
    @Column(nullable = false)
    private Date daaEntrada;
    private Date dataAdocao;
    @Column(nullable = false)
    private String condicoesChegada;
    @Column(nullable = false)
    private String nomeRecebedor;
    private Date dataObito;
    @Column(nullable = false)
    private String porte;


    public UUID getId() {
        return id;
    }

    public String getNomeProvisorio() {
        return nomeProvisorio;
    }

    public void setNomeProvisorio(String nomeProvisorio) {
        this.nomeProvisorio = nomeProvisorio;
    }

    public Integer getIdadeEstimada() {
        return idadeEstimada;
    }

    public void setIdadeEstimada(Integer idadeEstimada) {
        this.idadeEstimada = idadeEstimada;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Date getDaaEntrada() {
        return daaEntrada;
    }

    public void setDaaEntrada(Date daaEntrada) {
        this.daaEntrada = daaEntrada;
    }

    public Date getDataAdocao() {
        return dataAdocao;
    }

    public void setDataAdocao(Date dataAdocao) {
        this.dataAdocao = dataAdocao;
    }

    public String getCondicoesChegada() {
        return condicoesChegada;
    }

    public void setCondicoesChegada(String condicoesChegada) {
        this.condicoesChegada = condicoesChegada;
    }

    public String getNomeRecebedor() {
        return nomeRecebedor;
    }

    public void setNomeRecebedor(String nomeRecebedor) {
        this.nomeRecebedor = nomeRecebedor;
    }

    public Date getDataObito() {
        return dataObito;
    }

    public void setDataObito(Date dataObito) {
        this.dataObito = dataObito;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }
}
