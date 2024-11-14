package es.santander.ascentic.proyecto06;

public class Perro {
    
    private double peso;

    public Perro(double peso){
        this.peso = peso;
    }

    public void comer(double pesoComida) {
       //peso = peso +pesoComida
        peso += pesoComida;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
