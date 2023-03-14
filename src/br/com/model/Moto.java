package br.com.model;

import java.util.Objects;

public class Moto {
    //Atributos
     private String cor;
     private String modelo;
     private Integer cilindradas;

     //Construtor

    public Moto() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moto moto = (Moto) o;
        return Objects.equals(cor, moto.cor) && Objects.equals(modelo, moto.modelo) && Objects.equals(cilindradas, moto.cilindradas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cor, modelo, cilindradas);
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cilindradas=" + cilindradas +
                '}';
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }
}
