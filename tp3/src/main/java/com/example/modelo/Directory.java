package com.example.modelo;
import java.util.ArrayList;
import java.util.List;
/** Esta clase representa un directorio que puede contener múltiples componentes, ya sean archivos u otros directorios. */
public class Directory extends FileSystemComponent {
    private List<FileSystemComponent> componentes = new ArrayList<>();

    /**
     * @param nombre para pasar el nombre del directorio
     */
    public Directory(String nombre) {
        super(nombre);
    }

    /**
     * Metodo para agregar un componente a un directorio
     * @param componente para pasar el componente que querramos agregar al directorio
     */
    public void agregarComponente(FileSystemComponent componente) {
        componentes.add(componente);
    }

    /**
     * metodo para eliminar un componente
     * @param componente para pasar el componente que querramos eliminar al directorio
     */
    public void eliminarComponente(FileSystemComponent componente) {
        componentes.remove(componente);
    }

    /**
     * imprime el nombre del directorio y luego recorre su lista de componentes, llamando a showDetails() de manera recursiva para mostrar el contenido de sus subdirectorios.
     * @param indent se usa para controlar la profundidad de los directorios y archivos dentro de la estructura jerárquica.
     */
    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "└── " + nombre);  /** Mostrar el nombre del directorio con indentación */ 
        String newIndent = indent + "   ";  /** Aumentar la indentación para los subcomponentes */
        for (int i = 0; i < componentes.size(); i++) {
            FileSystemComponent componente = componentes.get(i);
            if (i < componentes.size() - 1) {
                componente.showDetails(newIndent + "├── ");
            } else {
                componente.showDetails(newIndent + "└── ");
            }
        }
    }
    
}
