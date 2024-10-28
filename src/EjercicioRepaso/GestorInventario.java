package EjercicioRepaso;

import java.io.*;
import java.util.ArrayList;

public class GestorInventario implements Serializable{
    private  static  final long serialVersionUID = 1L;
    ArrayList<Producto> productos;

    public GestorInventario() {
        this.productos = new ArrayList<>();
    }

    public void addNewProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void mostrarGestion() {
        if (this.productos.isEmpty())
            System.out.println("No hay elementos");

        else {
            for (Producto producto : this.productos) {
                System.out.println(producto.toString());
            }
        }
    }

    public void agregarProductosArchivo(File file) {
        try (
                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(this.productos);
            System.out.println("Arvchivo creado");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public void leerArchivo(File file) {
        try (
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis)){
            ArrayList<Producto> lecturaProductos = (ArrayList<Producto>) ois.readObject();
            System.out.println(lecturaProductos);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    //*public static void GestionInventario() {
       // try {
         //   FileWriter fileWriter = new FileWriter("C:\\Users\\ALUMNO\\ClaseJava\\src\\EjercicioRepaso\\GestionInventario.txt");
           // fileWriter.write("1 ,Cocacola, 45, 45.3" );
            //fileWriter.close();
        //} catch (IOException e) {
          //  System.out.println("Error" + e);
        //}

        //try {
          //  FileReader fileReader = new FileReader("C:\\Users\\ALUMNO\\ClaseJava\\src\\EjercicioRepaso\\GestionInventario.txt");
           // int valor = fileReader.read();
            //while (valor != -1) {
               // System.out.println((char)valor);
             //   valor = fileReader.read();
           // }

         //   fileReader.close();
       // } catch (IOException e) {
        //    System.out.println("Error" + e);
      //  }
    //}

    //public static void FileReader() {

    //}

}
