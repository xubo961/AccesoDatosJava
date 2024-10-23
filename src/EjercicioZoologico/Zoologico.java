package EjercicioZoologico;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Zoologico {
    public static void main(String[] args) {

        ArrayList<Animal> animales = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Boolean salida = false;
        while (!salida) {
            System.out.println("Ingresa mamífero(m) o ave(a): ");
            String respuesta = scanner.next();

            if (respuesta.equalsIgnoreCase("m")) {
                Mamifero mamifero = new Mamifero();
                System.out.println("Ingresa el nombre del mamífero: ");
                mamifero.setNombre(scanner.next());
                System.out.println("Ingresa la edad del mamífero: ");
                mamifero.setEdad(scanner.nextInt());
                System.out.println("Ingresa si el mamífero tiene pelo o no (s/n): ");
                String respuestaPelo = scanner.next();

                if (respuestaPelo.equalsIgnoreCase("s")) {
                    mamifero.setTienePelo(true);
                } else if (respuestaPelo.equalsIgnoreCase("n")){
                    mamifero.setTienePelo(false);
                }

                animales.add(mamifero);
            } else if (respuesta.equalsIgnoreCase("a")) {
                Aves aves = new Aves();
                System.out.println("Ingresa el nombre del ave: ");
                aves.setNombre(scanner.next());
                System.out.println("Ingresa la edad del ave: ");
                aves.setEdad(scanner.nextInt());
                System.out.println("Ingresa si el ave puede volar o no (s/n): ");
                String respuestaVolar = scanner.next();

                if (respuestaVolar.equalsIgnoreCase("s")) {
                    aves.setPuedeVolar(true);
                } else if (respuestaVolar.equalsIgnoreCase("n")) {
                    aves.setPuedeVolar(false);
                }

                animales.add(aves);
            }
            System.out.println("¿Quieres seguir añadiendo cosas?(s/n): ");
            String respuesta2 = scanner.next();
            if (respuesta2.equalsIgnoreCase("s")) {
                salida = false;
            } else if (respuesta2.equalsIgnoreCase("n")) {
                salida = true;
            }
        }
    }
}
