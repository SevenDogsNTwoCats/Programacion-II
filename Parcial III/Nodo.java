/**
 * Clase autoreferenciada Nodo
 * @Programmer: Harold Coello
 * @Date: 2021-07-29
 * @Version: 1.0
 */
public class Nodo{

    /**
     * Propiedad que almacena el dato en el nodo
     */
    private Object dato;


    /**
     * Propiedad que guarda la referencia al siguiente nodo
     */
    private Nodo siguienteNodo;

    /**
     * Almacena el nodo anterior en la lista
     */
    private Nodo anteriorNodo;

    /**
     * Constructor que solo crea un nodo con un dato
     * @param dato
     */
    public Nodo(Object dato){
        this(dato, null,null);
    }

    public Nodo(Object dato, Nodo siguienteNodo, Nodo anteriorNodo){
        this.dato = dato;
        this.siguienteNodo = siguienteNodo;
        this.anteriorNodo=anteriorNodo;
    }

    /**
     * Get Dato
     * @return el dato almacenado
     */
    public Object getDato() {
        return dato;
    }

    /**
     * Cambia el valor de la propiedad dato
     * @param dato El dato a almacenar
     */
    public void setDato(Object dato) {
        this.dato = dato;
    }

    /**
     * Devuelve el valor del siguiente Nodo 
     * @return siguienteNodo
     */
    public Nodo getSiguienteNodo() {
        return siguienteNodo;
    }

    /**
     * Cambia el valor del siguiente Nodo
     * @param siguienteNodo La referencia hacia el siguiente Nodo
     */
    public void setSiguienteNodo(Nodo siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }

    public Nodo getAnteriorNodo() {
        return anteriorNodo;
    }

    public void setAnteriorNodo(Nodo anteriorNodo) {
        this.anteriorNodo = anteriorNodo;
    }

    


}