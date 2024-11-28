package EjercicioRepaso;

import java.io.Serializable;

public class Producto implements Serializable {
    String cod;
    String nombre;
    int cantidad;
    double precio;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public Producto(String cod, String nombre, int cantidad, double precio) {
        this.cod = cod;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "Cantidad: " + cantidad + "Precio: " + precio;
    }
}
