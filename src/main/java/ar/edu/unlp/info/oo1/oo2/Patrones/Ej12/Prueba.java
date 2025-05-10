package ar.edu.unlp.info.oo1.oo2.Patrones.Ej12;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Prueba {
	public static void main(String[] args) {
        // Creo archivos
        Archivo archivo1 = new Archivo("Archivo1.txt", LocalDate.of(2024, 5, 1), 100);
        Archivo archivo2 = new Archivo("Archivo2.txt", LocalDate.of(2024, 6, 1), 200);
        Archivo archivo3 = new Archivo("Archivo3.txt", LocalDate.of(2024, 7, 1), 300);
        Archivo archivo4 = new Archivo("Archivo4.txt", LocalDate.of(2024, 8, 1), 400);

        // Creo subdirectorios
        Directorio subDirA1 = new Directorio("DirectorioA1", LocalDate.of(2024, 5, 10), Arrays.asList(archivo1, archivo2));
        Directorio subDirA2 = new Directorio("DirectorioA2", LocalDate.of(2024, 5, 20), List.of(archivo3));

        // Creo un directorio principal
        Directorio mainDir = new Directorio("main", LocalDate.now(), Arrays.asList(subDirA1, subDirA2, archivo4));

        // Mostrar listado de contenido
        System.out.println("Listado de Contenido:");
        System.out.println(mainDir.listadoDeContenido());

        // Probar tamaño total ocupado
        System.out.println("\nTamaño total ocupado: " + mainDir.tamanoTotalOcupado() + " bytes");

        // Archivo más grande
        Archivo masGrande = mainDir.archivoMasGrande();
        System.out.println("\nArchivo más grande: " + (masGrande != null ? masGrande.getNombre() : "Ninguno"));

        // Archivo más nuevo
        Archivo masNuevo = mainDir.archivoMasNuevo();
        System.out.println("\nArchivo más nuevo: " + (masNuevo != null ? masNuevo.getNombre() : "Ninguno"));
    }
}
