package br.com.model;

public class Carro {

    private String marca;
    private String cor;
    private double quilometragem;

    public Carro(String marca, String cor, double quilometragem) {
        this.marca = marca;
        this.cor = cor;
        this.quilometragem = quilometragem;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", quilometragem=" + quilometragem +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }
}
