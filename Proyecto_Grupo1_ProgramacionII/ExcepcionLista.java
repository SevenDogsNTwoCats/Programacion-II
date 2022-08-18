package Proyecto_Grupo1_ProgramacionII;

public class ExcepcionLista extends RuntimeException {
    /**
     * Serial de la clase excepcion
     */
    private static final long serialVersionUID=1L;

    public ExcepcionLista(){
        this("Lista");
    }

    public ExcepcionLista(String nombreLista){
        super(nombreLista + "Esta vacia");
    }

}
