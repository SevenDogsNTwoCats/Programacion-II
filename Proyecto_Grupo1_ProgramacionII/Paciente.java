package Proyecto_Grupo1_ProgramacionII;

/**
 * Clase para la creacion de los pacientes
 */
public class Paciente {

    /**
     * Características del paciente
     */
    private String nombre;
    private int edad;
    private int dosis;
    private String residencia;
    private VacunaAplicada vacunaAplicadaNombre; // esta variable guarda el nombre de la vacuna que necesita aplicarse
    private boolean vacunado; // esta variable nos dira si se atendio o no
    /**
     * Lista de vacunas
     */
    enum VacunaAplicada {
        PFIZER, MODERNA, SPUTNIK, ASTRAZENECA;
    }

    /**
     * Constructor
     */
    public Paciente(String nombre, int edad, int dosis, String residencia) {
        this.nombre = nombre;
        this.edad = edad;
        this.dosis = dosis;
        this.residencia = residencia;
        
    }

    
    /**
     * retorna el nombre
     * 
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * recibe el nombre
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * retorna la edad
     * 
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     * recibe la edad
     * 
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * retorna la dosis por la que va
     * 
     * @return
     */
    public int getDosis() {
        return dosis;
    }

    /**
     * recibe el numero de dosis por la que va
     * 
     * @param dosis
     */
    public void setDosis(int dosis) {
        this.dosis = dosis;
    }

    /**
     * retona la residencia del paciente
     */
    public String getResidencia() {
        return residencia;
    }

    /**
     * recibe la residencia del paciente
     * 
     * @param residencia
     */
    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    /**
     * retorna si ya esta atendido o no
     * @return
     */
    public boolean isVacunado() {
        return vacunado;
    }
    /**
    * retorna el nombre de la vacuna aplicada
    * @return
     */
    public VacunaAplicada getVacunaAplicadaNombre() {
        return vacunaAplicadaNombre;
    }
    /**
    * recibe el nombre d ela vacuna aplicada
    * @param vacunaAplicadaNombre
    */
    public void setVacunaAplicadaNombre(VacunaAplicada vacunaAplicadaNombre) {
        this.vacunaAplicadaNombre = vacunaAplicadaNombre;
    }
    /**
     * recibe el nombre de la vacuna aplicada
     * @param vacunaAplicada
     */
    public void setVacunaAplicada(int v) {
        switch (v) {
            case 1:
                vacunaAplicadaNombre = VacunaAplicada.PFIZER;
                break;
            case 2:
                vacunaAplicadaNombre = VacunaAplicada.MODERNA;
                break;
            case 3:
                vacunaAplicadaNombre = VacunaAplicada.SPUTNIK;
                break;
            case 4:
                vacunaAplicadaNombre = VacunaAplicada.ASTRAZENECA;
                break;
        }
    }

    /**
     * cambia el valor si ya se atendio o no
     * @param vacunado
     */
    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    /**
     * Metodo toString de la clase (no se usa en la simulacion, pero por si llega a utilizar ya esta creado)
     */
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\nEdad: " + this.edad + "\nDosis: " + this.dosis + "\nResidencia: "
                + this.residencia;
    }

}