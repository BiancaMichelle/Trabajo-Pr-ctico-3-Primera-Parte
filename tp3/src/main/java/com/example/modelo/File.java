package com.example.modelo;
/**Esta clase representa un archivo. Hereda de FileSystemComponent */
public class File extends FileSystemComponent{
    /**
     *atributo del tamaño del archivo
     */
    private double tamaño;

    /**
     * @return tamaño del archivo
     */
    public double getTamaño() {
        return tamaño;
    }

    /**
     * @param tamaño tamaño del archivo
     */
    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    /**
     * @param nombre nombre identificatorio del archivo
     * @param tamaño tamaño en bytes del archivo
     */
    public File(String nombre, double tamaño) {
        super(nombre);
        this.tamaño = tamaño;
    }

    /**
     * Este metodo imprime los detalles del archivo, incluyendo su nombre y tamaño.
     * @param indent identación se usa para controlar la profundidad de los directorios y archivos dentro de una estructura jerárquica.
     */
    @Override
    public void showDetails(String indent) {
        System.out.println(indent + nombre + " (Size: " + tamaño + " bytes)");
    }
    
}
