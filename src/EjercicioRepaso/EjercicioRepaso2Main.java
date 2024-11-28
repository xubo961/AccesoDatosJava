package EjercicioRepaso;

class Alternados {
    private String palabra;
    private boolean alternos = false;

    public synchronized void palabraPing() throws InterruptedException {
        while (this.alternos) {
            wait();
        }

        this.palabra = "PING";
        System.out.println(palabra);
        this.alternos = true;
        notify();
    }

    public synchronized void palabraPong() throws InterruptedException {
        while (!this.alternos) {
            wait();
        }
        this.palabra = "PONG";
        System.out.println(palabra);
        this.alternos = false;
        notify();
    }
}

public class EjercicioRepaso2Main {

    public static void main(String[] args) {
        Alternados alternados = new Alternados();

        Thread palabraPing = new Thread(() -> {
           for (int i = 0; i < 10; i++) {
               try {
                   alternados.palabraPing();
                   Thread.sleep(1000);
               }
               catch (InterruptedException e) {
                   System.out.println("Error" + e);
               }
           }
        });

        Thread palabraPong = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    alternados.palabraPong();
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    System.out.println("Error" + e);
                }
            }
        });

        palabraPing.start();
        palabraPong.start();

    }
}
