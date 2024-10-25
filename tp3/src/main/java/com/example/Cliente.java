package com.example;

import com.example.modelo.Directory;
import com.example.modelo.File;

/**Clase cliente */
public class Cliente {
    /**
     * @param args parametro que usa el programa principal
     */
    
    public static void main(String[] args) {
        /**Crear archivos */ 
        File file1 = new File("File1.txt", 500);
        File file2 = new File("File2.txt", 200);
        File file3 = new File("File3.txt", 800);

        /**Crear directorios */ 
        Directory directorio1 = new Directory("Dir1");
        Directory directorio2 = new Directory("Dir2");
        Directory directorioPrincipal = new Directory("direcPrin");

        /**Construir la estructura jerárquica */ 
        directorio1.agregarComponente(file1);  // Añadir archivo a Dir1
        directorio2.agregarComponente(file2);  // Añadir archivo a Dir2
        directorio2.agregarComponente(file3);  // Añadir otro archivo a Dir2
        directorioPrincipal.agregarComponente(directorio1);  // Añadir Dir1 a Root
        directorioPrincipal.agregarComponente(directorio2);  // Añadir Dir2 a Root

        /**Mostrar la estructura completa antes de eliminar */ 
        System.out.println("Estructura antes de eliminar un archivo:");
        directorioPrincipal.showDetails("");  // Mostrar detalles desde el directorio raíz

        //**Eliminar un archivo de directorioPrincipal */ 
        directorio2.eliminarComponente(file3);

        /**  Mostrar la estructura después de eliminar*/
        System.out.println("\nEstructura después de eliminar File3.txt de Dir2:");
        directorioPrincipal.showDetails("");  /**Mostrar detalles después de la eliminación */
    }
}
