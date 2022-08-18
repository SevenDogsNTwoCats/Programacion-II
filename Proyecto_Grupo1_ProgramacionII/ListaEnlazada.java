package Proyecto_Grupo1_ProgramacionII;

public class ListaEnlazada {

    /**
     * Almacena el primer nodo en la lista
     */
    private Nodo primerNodo;

    /**
     * Almacena el ultimo nodo en la lista
     */
    private Nodo ultiNodo;

    /**
     * Nombre de la lista
     */
    private String nombreLista;

    /**
     * Constuctor de la lista enlazada
     * 
     * @param nombreLista
     */
    public ListaEnlazada(String nombreLista) {
        this.nombreLista = nombreLista;
        this.primerNodo = null;
        this.ultiNodo = null;
    }

    /**
     * Inserta un centro al frente de la lista
     * 
     * @param archivo
     */
    public void insertarAlFrente(Object archivo) {
        if (estaVacia()) {
            this.primerNodo = this.ultiNodo = new Nodo(archivo);
        } else {
            Nodo nvoNodo = new Nodo(archivo, this.primerNodo);
            this.primerNodo = nvoNodo;
        }
    }

    /**
     * Inserta un centro al final de lista
     * 
     * @param archivo
     */
    public void insertarAlFinal(Object archivo) {
        if (estaVacia()) {
            this.primerNodo = this.ultiNodo = new Nodo(archivo);
        } else {
            Nodo nvoNodo = new Nodo(archivo);
            this.ultiNodo.setSiguieNodo(nvoNodo);
            this.ultiNodo = nvoNodo;
        }
    }

    /**
     * Elimina centro del frente de lista
     * 
     * @return
     * @throws ExcepcionLista
     */
    public Object Eliminardelfrente() throws ExcepcionLista {
        if (estaVacia())
            throw new ExcepcionLista(this.nombreLista);

        Object archivo = this.primerNodo.getObject();
        if (this.primerNodo == this.ultiNodo)
            this.primerNodo = this.ultiNodo = null;
        else
            this.primerNodo = this.primerNodo.getSiguieNodo();

        return archivo;
    }

    /**
     * Elimina centro del final de la lista
     * 
     * @return
     * @throws ExcepcionLista
     */
    public Object EliminardelFinal() throws ExcepcionLista {
        if (estaVacia())
            throw new ExcepcionLista(this.nombreLista);

        Object archivo = this.ultiNodo.getObject();
        if (this.primerNodo == this.ultiNodo)
            this.primerNodo = this.ultiNodo = null;
        else {
            Nodo nodotmp = this.primerNodo;
            while (nodotmp.getSiguieNodo() != this.ultiNodo)
                nodotmp = nodotmp.getSiguieNodo();

            nodotmp.setSiguieNodo(null);
            this.ultiNodo = nodotmp;
        }

        return archivo;
    }

    /**
     * Imprime cada centro de la lista
     */
    public void imprimirLista() {
        if (estaVacia()) {
            System.out.println("LISTA VACIA");
            return;
        }
        
        Nodo temp = this.primerNodo;
        System.out.println(temp.getObject());
        while (temp.getSiguieNodo() != null) {
            temp = temp.getSiguieNodo();
            System.out.println(temp.getObject());
        }
        

    }

    /**
     * retorna el valor del primer nodo
     * 
     * @return
     */
    public Nodo getPrimernNodo() {
        return primerNodo;
    }

    /**
     * cambia el valor del primer nodo
     * 
     * @param primernNodo
     */
    public void setPrimernNodo(Nodo primernNodo) {
        this.primerNodo = primernNodo;
    }

    /**
     * Retorna el valor del último nodo
     */
    public Nodo getUltiNodo() {
        return ultiNodo;
    }

    /**
     * Cambia el valor del último nodo
     * 
     * @param ultiNodo
     */
    public void setUltiNodo(Nodo ultiNodo) {
        this.ultiNodo = ultiNodo;
    }

    /**
     * Retorna el nombre de la lista
     * 
     * @return
     */
    public String getNombreLista() {
        return nombreLista;
    }

    /**
     * retorna el valor del primer nodo
     * 
     * @return
     */
    public Nodo getPrimerNodo() {
        return primerNodo;
    }

    /**
     * establece el valor del primer nodo
     * 
     * @param primerNodo
     */
    public void setPrimerNodo(Nodo primerNodo) {
        this.primerNodo = primerNodo;
    }

    /**
     * Cambia el nombre de la lista
     * 
     * @param nombreLista
     */
    public void setNombreLista(String nombreLista) {
        this.nombreLista = nombreLista;
    }

    /**
     * Verifica si la lista esta vacia
     * 
     * @return
     */
    public boolean estaVacia() {
        return (this.primerNodo == null);
    }

}
