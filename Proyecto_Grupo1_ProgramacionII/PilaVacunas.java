package Proyecto_Grupo1_ProgramacionII;

/**
 * Estructura de la pila vacunas
 * (hereda de la lista enlazada para no volver a crear ciertos metodos y su nodo)
 */
public class PilaVacunas extends ListaEnlazada {

    /**
     * Constructor
     * 
     * @param nombreLista
     */
    public PilaVacunas(String nombreLista) {
        super(nombreLista);
    }

    /**
     * Metodo para insertar al final de la pila
     */
    @Override
    public void insertarAlFinal(Object archivo) {
        super.insertarAlFinal(archivo);
    }

    /**
     * Metodo para eliminar al final de la pila
     */
    @Override
    public Object EliminardelFinal() throws ExcepcionLista {
        return super.EliminardelFinal();
    }
}
