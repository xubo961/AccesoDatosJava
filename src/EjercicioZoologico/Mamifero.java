package EjercicioZoologico;

public class Mamifero extends Animal {
    private boolean tienePelo;

    public Mamifero() {}

    public Mamifero(String nombre, int edad, boolean tienePelo) {
        super(nombre, edad);
        this.tienePelo = tienePelo;
    }

    public boolean getTienePelo() {
        return tienePelo;
    }

    public void setTienePelo(boolean tienePelo) {
        this.tienePelo = tienePelo;
    }

    @Override
    public String toString() {
        return "Mamifero [tienePelo=" + tienePelo + ", nombre=" + nombre + ", edad=" + edad + "]";
    }



}
