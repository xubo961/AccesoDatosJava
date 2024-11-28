package Ejercicio1Terminal;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuaradarInfoArchivoMain {
    public static void main(String[] args) {
        //Esta herramienta ejecuta operaciones en el sistema operativo o en el terminal
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("cmd.exe", "/c", "tasklist");

        File file = new File("C:\\Users\\ALUMNO\\Desktop\\tasklist.txt");

        try {
            if (!file.exists()) {
                file.createNewFile();

                processBuilder.redirectOutput(file);
                Process proceso = processBuilder.start();

                int estadoSalida = proceso.waitFor();//Esperar a que un proceso termine y así obtener ele stado de salida
                System.out.println("El proceso terminó con el código: " + estadoSalida);
            }

        } catch (IOException | InterruptedException e) {
            System.out.println("Error" + e);
        }

    }
}
