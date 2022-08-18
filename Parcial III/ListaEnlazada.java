public class ListaEnlazada {

    /**
     * Almacena el primer nodo en la lista
     */
    private Nodo primerNodo;

    /**
     * Almacena el ultimo nodo en la lista
     */
    private Nodo ultimoNodo;
    /**
     * Contiene el nombre de la lista
     */
    private String nombreLista;


    public ListaEnlazada(String nombreLista){
        this.nombreLista = nombreLista;
        this.primerNodo = null;
        this.ultimoNodo = null;
    }

    /**
     * Inserta un nodo al frente de la lista
     * @param dato  El dato a almacenar en el primer nodo
     */
    public void insertarAlFrente(Object dato){
        if(estaVacia())
            this.primerNodo = this.ultimoNodo = new Nodo(dato);
        else{
            Nodo nvoNodo = new Nodo(dato, this.primerNodo,null);
            this.primerNodo = nvoNodo;
        }
    }

    /**
     * Inserta un nuevo nodo al final
     * @param dato El dato a almacenar en el nodo
     */
    public void insertarAlFinal(Object dato){
        if(estaVacia())
            this.primerNodo = this.ultimoNodo = new Nodo(dato);
        else{
            Nodo nvoNodo = new Nodo(dato);
            this.ultimoNodo.setSiguienteNodo(nvoNodo);
            nvoNodo.setAnteriorNodo(this.ultimoNodo);
            this.ultimoNodo = nvoNodo;
        }
    }

    public void eliminarAlFrente(){
        try {
            Nodo tmp;
            tmp=this.primerNodo.getSiguienteNodo();
            this.primerNodo=tmp;
        } catch (Exception e) {
            System.err.println("Error al eliminar al Frente"+e.getMessage());
        }
    }
    public void eliminarAlFinal(){
        try {
            this.ultimoNodo=this.ultimoNodo.getAnteriorNodo();
        } catch (Exception e) {
            System.err.println("Error al eliminar al Final"+e.getMessage());
        }
    }
    

    public Nodo getPrimerNodo() {
        return primerNodo;
    }

    public void setPrimerNodo(Nodo primerNodo) {
        this.primerNodo = primerNodo;
    }

    public Nodo getUltimoNodo() {
        return ultimoNodo;
    }

    public void setUltimoNodo(Nodo ultimoNodo) {
        this.ultimoNodo = ultimoNodo;
    }

    public String getNombreLista() {
        return nombreLista;
    }

    public void setNombreLista(String nombreLista) {
        this.nombreLista = nombreLista;
    }

    /**
     * Valida si la lista está vacía
     * @return true o false dependiendo si el primer elemento está vacío
     */
    public boolean estaVacia(){
                //true o false
        return (null == this.primerNodo);
    }
    
}
