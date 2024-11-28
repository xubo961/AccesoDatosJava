package EjercicioRepaso;

class Estacionar {
    private boolean estacionado = false;

    public synchronized void parkingLleno() throws InterruptedException {
        while (this.estacionado) {
            wait();
        }

        System.out.println("El parking está lleno, espere porfavor");
        estacionado = true;
        notify();
    }

    public synchronized void parkingConEstacionamiento() throws InterruptedException {
        while (!this.estacionado) {
            wait();
        }

        System.out.println("Ya hay hueco para estacionar");
        estacionado = false;
    }

}

public class EjercicioRepaso4Main {
}
