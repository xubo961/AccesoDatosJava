package EjercicioRepaso;

import java.io.File;
import java.util.Scanner;

public class GestorMain {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\ALUMNO\\ClaseJava\\src\\EjercicioRepaso\\GestionInventario.txt");

        GestorInventario gestorInventario = new GestorInventario();

        Scanner scanner = new Scanner(System.in);
        Boolean salida = false;

        while (!salida) {
            System.out.println("1 - Agregar producto: ");
            System.out.println("2 - Guardar producto: ");
            System.out.println("3 - Mostrar productos: ");
            System.out.println("0- Salir");

            String respuesta = scanner.next();

            switch (respuesta) {
                case "1": {
                    System.out.println("Ingresa el codigo del producto: ");
                    String cod = scanner.next();
                    System.out.println("Ingresa el nombre del producto: ");
                    String nombre = scanner.next();
                    System.out.println("Ingresa la cantidad del producto: ");
                    int cantidad = scanner.nextInt();
                    System.out.println("Ingresa el precio del producto: ");
                    double precio = scanner.nextDouble();

                    gestorInventario.addNewProducto(new Producto(cod, nombre, cantidad, precio));
                    break;
                }

                case "2": {
                    gestorInventario.agregarProductosArchivo(file);
                    System.out.println("Producto guardado");
                    break;
                }

                case "3": {
                    gestorInventario.leerArchivo(file);
                    break;
                }

                case "0": {
                    salida = true;
                    break;
                }

                default: {
                    System.out.println("Opción no válida.");
                }
            }

        }
    }
}
