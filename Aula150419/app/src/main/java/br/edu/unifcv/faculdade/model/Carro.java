package br.edu.unifcv.faculdade.model;

import android.graphics.drawable.Drawable;

public class Carro {

    public Drawable picture;
    private int id;
    private String modelo;
    private int potencia;
    private Double preco;

    public Carro(int id, String modelo, int potencia, Double preco) {
        this.id = id;
        this.modelo = modelo;
        this.potencia = potencia;
        this.preco = preco;
    }

    public Carro(int id, String audi_r8, String audi, int i, Double valueOf, Drawable drawable) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
