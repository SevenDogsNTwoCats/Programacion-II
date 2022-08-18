package Proyecto_Grupo1_ProgramacionII;

/**
 * Clase autoreferenciada Nodo de la Lista Enlazada
 */

public class Nodo {

    /**
     * propiedad que almacena el dato en el nodo
     */
    private Object archivo;

    /**
     * propiedad que guarda la referencia al siguiente nodo
     */
    private Nodo siguieNodo;

    /**
     * Constructor Nodo final
     * 
     * @param archivo
     */
    public Nodo(Object archivo) {
        this(archivo, null);
    }

    /**
     * Constructor Nodo
     * 
     * @param archivo
     * @param siguieNodo
     */
    public Nodo(Object archivo, Nodo siguieNodo) {
        this.archivo = archivo;
        this.siguieNodo = siguieNodo;
    }

    /**
     * Devuelve el valor de archivo
     * 
     * @return
     */
    public Object getObject() {
        return archivo;
    }

    /**
     * Cambia el valor de archivo
     * 
     * @param archivo
     */
    public void setObject(Object archivo) {
        this.archivo = archivo;
    }

    /**
     * 
     * @return el valor del siguiente nodo
     */
    public Nodo getSiguieNodo() {
        return siguieNodo;
    }

    /**
     * cambia el valor del siguiente nodo
     * 
     * @param siguieNodo
     */
    public void setSiguieNodo(Nodo siguieNodo) {
        this.siguieNodo = siguieNodo;
    }

    /**
     * retorna el archivo
     * 
     * @return
     */
    public Object getArchivo() {
        return archivo;
    }

    /**
     * cambia el valor de archivo
     * 
     * @param archivo
     */
    public void setArchivo(Object archivo) {
        this.archivo = archivo;
    }

}
