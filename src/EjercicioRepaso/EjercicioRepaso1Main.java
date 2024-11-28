package EjercicioRepaso;

class Recursos {
    private int numeroGenerado;
    private boolean disponible = false;

    public synchronized void producir() throws InterruptedException {
        while (this.disponible) {
            wait();
        }

        this.numeroGenerado = (int) (Math.random() * 100);
        System.out.println("Se ha generad un número");
        this.disponible = true;
        notify();

    }

    public synchronized void consumir() throws InterruptedException {
        while (!this.disponible) {
            wait();
        }
        System.out.println("El número generado es: " + this.numeroGenerado);
        this.disponible = false;
        notify();
    }
}

public class EjercicioRepaso1Main {

    public static void main(String[] args) {
        Recursos recursos = new Recursos();

        Thread productor = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    recursos.producir();
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    System.out.println("Error al producir el recurso" + e);
                }
            }
        });

        Thread consumidor = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    recursos.consumir();
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    System.out.println("Error" + e);
                }
            }
        });

        productor.start();
        consumidor.start();

    }
}
