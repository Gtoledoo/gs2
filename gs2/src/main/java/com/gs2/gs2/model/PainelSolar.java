package com.gs2.gs2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PainelSolar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 100)
    private String modelo;

    @Column(nullable = false, length = 50)
    private String fabricante;

    @Column(nullable = false)
    private Double potenciaWatts;

    @Column(nullable = false)
    private Double dimensoesMetros;

    @Column(nullable = false)
    private Double pesoKg;

    @Column(length = 200)
    private String descricao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Double getPotenciaWatts() {
        return potenciaWatts;
    }

    public void setPotenciaWatts(Double potenciaWatts) {
        this.potenciaWatts = potenciaWatts;
    }
    }