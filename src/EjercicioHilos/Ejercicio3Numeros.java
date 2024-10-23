package EjercicioHilos;

import java.util.LinkedList;

public class Ejercicio3Numeros {
    private LinkedList<Integer> lista = new LinkedList<>();
    private  final  int CAPACIDAD = 5;

    public void setElementoLista(LinkedList<Integer> listaNum) {
        this.lista = listaNum;
    }

    public void numImpar(int valor) throws InterruptedException {
        synchronized (this) {
            while (lista.size() == CAPACIDAD) {
                wait();
            }

            this.lista.add(valor);
            System.out.println("Número impar: " + valor);
            notify();
        }
    }

    public void numPar() throws InterruptedException {
        synchronized (this) {
            while (this.lista.isEmpty()) {
                wait();
            }
            int valor = this.lista.removeFirst();
            System.out.println("Número par: " + valor);
            notify();
        }
    }
}
