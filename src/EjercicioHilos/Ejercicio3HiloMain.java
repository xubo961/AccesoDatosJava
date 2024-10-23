package EjercicioHilos;

import java.util.LinkedList;

public class Ejercicio3HiloMain {
    public static void main(String[] args) {
        Ejercicio3Numeros numeros = new Ejercicio3Numeros();

        Thread Impares = new Thread(() -> {
            try {
                int valor = 1;
                while (true) {
                    numeros.numImpar(valor);
                    valor++;
                    Thread.sleep(1000);
                }
            }
            catch (InterruptedException e) {
                System.out.println("Error: " + e);
            }
        });

        Thread pares = new Thread(() -> {
            try {
                int valor = 2;
                while (true) {
                    numeros.numPar();
                    valor = valor + 2;
                    Thread.sleep(1000);
                }
            }
            catch (InterruptedException e) {
                System.out.println("Error: " + e);
            }
        });

        Impares.start();
        pares.start();
    }
}
