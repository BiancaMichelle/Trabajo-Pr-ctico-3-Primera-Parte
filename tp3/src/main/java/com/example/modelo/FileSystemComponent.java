package com.example.modelo;
/**Es la clase base abstracta que representa tanto a los archivos como a los directorios. */
public abstract class FileSystemComponent {
    protected String nombre;

    /**
     * @param nombre atributo que cada subclase debera implementar. 
     */
    public FileSystemComponent(String nombre) {
        this.nombre = nombre;
    }

    /**
     *  método abstracto que cada subclase debe implementar
     */
    public abstract void showDetails(String indent);
}
