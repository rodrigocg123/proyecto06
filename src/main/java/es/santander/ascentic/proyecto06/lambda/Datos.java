package es.santander.ascentic.proyecto06.lambda;

public class Datos {
    private int edad;
   
    private String nombre;
    
    public Datos (int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;

    }



    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

} 