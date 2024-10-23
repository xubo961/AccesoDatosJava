package EjercicioZoologico;

public class Aves extends Animal {
    private boolean puedeVolar;

    public Aves() {}

    public Aves(String nombre, int edad, boolean puedeVolar) {
        super(nombre, edad);
        this.puedeVolar = puedeVolar;
    }

    public boolean getPuedeVolar() {
        return puedeVolar;
    }

    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }


    @Override
    public String toString() {
        return "Aves [puedeVolar=" + puedeVolar + ", nombre=" + nombre + ", edad=" + edad + "]";
    }
}
