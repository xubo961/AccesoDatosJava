package EjercicioZoologico;

import java.io.Serializable;

public abstract class Animal implements Serializable{
    private static final long serialVersionUID = 1L;

    protected String nombre;
    protected int edad;

    public Animal () {}

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public void setEdad(int edad) {
        this.edad = edad;
    }


}
