package Proyecto_Grupo1_ProgramacionII;

/**
 * Estructura cola de pacientes
 * (hereda de la lista enlazada para no volver a crear ciertos metodos y su nodo)
 */

public class ColaPacientes extends ListaEnlazada {

    /**
     * Constructor de la super clase
     * 
     * @param nombreLista
     */
    public ColaPacientes(String nombreLista) {
        super(nombreLista);
    }

    /**
     * En la cola el paciente que llega se ubica al final
     */
    @Override
    public void insertarAlFinal(Object archivo) {
        super.insertarAlFinal(archivo);
    }

    /**
     * una vez que se inyecte se eliminara del frente
     */
    @Override
    public Object Eliminardelfrente() throws ExcepcionLista {
        return super.Eliminardelfrente();
    }

}
