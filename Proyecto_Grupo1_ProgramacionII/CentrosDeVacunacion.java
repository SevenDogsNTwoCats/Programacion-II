package Proyecto_Grupo1_ProgramacionII;

public class CentrosDeVacunacion {
    /**
     * propiedades
     */
    private int codigo;
    private String ubicacion;
    private String nombre;
    private int capacidad;
    private PilaVacunas pilaDeVacunasPfizer;
    private PilaVacunas pilaDeVacunasModerna;
    private PilaVacunas pilaDeVacunasSputnik;
    private PilaVacunas pilaDeVacunasAstrazeneca;
    private int cantidadDeVacunasPfizer;
    private int cantidadDeVacunasModerna;
    private int cantidadDeVacunasSputnik;
    private int cantidadDeVacunasAstrazeneca;

    /**
     * constructor del centro de vacunacion
     * 
     * @param codigo
     * @param ubicacion
     * @param nombre
     * @param capacidad
     */
    public CentrosDeVacunacion(int codigo, String ubicacion, String nombre, int capacidad) {
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    /**
     * retorna el valor del codigo del centro
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Recibe el valor de codigo
     * 
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Retorna la ubicación del centro
     * 
     * @return
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Recibe la ubicación eel centro
     * 
     * @param ubicacion
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * Retorna el nombre del centro
     * 
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Recibe el nombre del centro
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Retorna la capacidad del centro
     * 
     * @return
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Recibe la capacidad del centro
     * 
     * @param capacidad
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * Metodos de Retorno y establecimoento de las pilas de vacunas
     *
     */
    /**
     * retona la pila pfizer
     * 
     * @return
     */
    public PilaVacunas getPilaDeVacunasPfizer() {
        return pilaDeVacunasPfizer;
    }

    /**
     * recibe la pila pfizer
     * 
     * @param pilaDeVacunasPfizer recibe la pila
     * @param cantidad            recibe el numero de vacunas que viene en la pila
     */
    public void setPilaDeVacunasPfizer(PilaVacunas pilaDeVacunasPfizer, int cantidad) {
        this.pilaDeVacunasPfizer = pilaDeVacunasPfizer;
        this.cantidadDeVacunasPfizer = cantidad;
    }

    /**
     * retona la pila moderna
     * 
     * @return
     */
    public PilaVacunas getPilaDeVacunasModerna() {
        return pilaDeVacunasModerna;
    }

    /**
     * retona la pila moderna
     * 
     * @param pilaDeVacunasModerna recibe la pila
     * @param cantidad             recibe el numero de vacunas que viene en la pila
     */
    public void setPilaDeVacunasModerna(PilaVacunas pilaDeVacunasModerna, int cantidad) {
        this.pilaDeVacunasModerna = pilaDeVacunasModerna;
        this.cantidadDeVacunasModerna = cantidad;
    }

    /**
     * retorna la pila sputnik
     * 
     * @return
     */
    public PilaVacunas getPilaDeVacunasSputnik() {
        return pilaDeVacunasSputnik;
    }

    /**
     * recibe la pila sputnik
     * 
     * @param pilaDeVacunasSputnik recibe la pila
     * @param cantidad             recibe el numero de vacunas que viene en la pila
     */
    public void setPilaDeVacunasSputnik(PilaVacunas pilaDeVacunasSputnik, int cantidad) {
        this.pilaDeVacunasSputnik = pilaDeVacunasSputnik;
        this.cantidadDeVacunasSputnik = cantidad;
    }

    /**
     * retona la pila astra zeneca
     * 
     * @return
     */
    public PilaVacunas getPilaDeVacunasAstrazeneca() {
        return pilaDeVacunasAstrazeneca;
    }

    /**
     * recibe la pila astra zeneca
     * 
     * @param pilaDeVacunasAstrazeneca recibe la pila
     * @param cantidad                 recibe el numero de vacunas que viene en la
     *                                 pila
     */
    public void setPilaDeVacunasAstrazeneca(PilaVacunas pilaDeVacunasAstrazeneca, int cantidad) {
        this.pilaDeVacunasAstrazeneca = pilaDeVacunasAstrazeneca;
        this.cantidadDeVacunasAstrazeneca = cantidad;
    }

    /**
     * recibe la pila pfizer
     * 
     * @param pilaDeVacunasPfizer
     */
    public void setPilaDeVacunasPfizer(PilaVacunas pilaDeVacunasPfizer) {
        this.pilaDeVacunasPfizer = pilaDeVacunasPfizer;
    }

    /**
     * recibe la pila moderna
     * 
     * @param pilaDeVacunasModerna
     */
    public void setPilaDeVacunasModerna(PilaVacunas pilaDeVacunasModerna) {
        this.pilaDeVacunasModerna = pilaDeVacunasModerna;
    }

    /**
     * rexibe la pila sputnik
     * 
     * @param pilaDeVacunasSputnik
     */
    public void setPilaDeVacunasSputnik(PilaVacunas pilaDeVacunasSputnik) {
        this.pilaDeVacunasSputnik = pilaDeVacunasSputnik;
    }

    /**
     * recibe la pila astrazeneca
     * 
     * @param pilaDeVacunasAstrazeneca
     */
    public void setPilaDeVacunasAstrazeneca(PilaVacunas pilaDeVacunasAstrazeneca) {
        this.pilaDeVacunasAstrazeneca = pilaDeVacunasAstrazeneca;
    }

    /**
     * retorna la cantidad de vacunas de la pila pfizer
     * 
     * @return
     */
    public int getCantidadDeVacunasPfizer() {
        return cantidadDeVacunasPfizer;
    }

    /**
     * recibe la cantidad de vacunas de la pila pfizer
     * 
     * @param cantidadDeVacunasPfizer
     */
    public void setCantidadDeVacunasPfizer(int cantidadDeVacunasPfizer) {
        this.cantidadDeVacunasPfizer = cantidadDeVacunasPfizer;
    }

    /**
     * retorna la cantidad de vacunas de la pila moderna
     * 
     * @return
     */
    public int getCantidadDeVacunasModerna() {
        return cantidadDeVacunasModerna;
    }

    /**
     * recibe la cantidad de vacuna de la pila moderna
     * 
     * @param cantidadDeVacunasModerna
     */
    public void setCantidadDeVacunasModerna(int cantidadDeVacunasModerna) {
        this.cantidadDeVacunasModerna = cantidadDeVacunasModerna;
    }

    /**
     * retorna la cantidad de vacunas de la pila sputnik
     * 
     * @return
     */
    public int getCantidadDeVacunasSputnik() {
        return cantidadDeVacunasSputnik;
    }

    /**
     * recibe la cantidad de vacunas de la pila sputnik
     * 
     * @param cantidadDeVacunasSputnik
     */
    public void setCantidadDeVacunasSputnik(int cantidadDeVacunasSputnik) {
        this.cantidadDeVacunasSputnik = cantidadDeVacunasSputnik;
    }

    /**
     * retorna la cantidad de vacunas de la pila astrazeneca
     * 
     * @return
     */
    public int getCantidadDeVacunasAstrazeneca() {
        return cantidadDeVacunasAstrazeneca;
    }

    /**
     * recibe la cantidad de vacunas de la pila astrazeneca
     * 
     * @param cantidadDeVacunasAstrazeneca
     */
    public void setCantidadDeVacunasAstrazeneca(int cantidadDeVacunasAstrazeneca) {
        this.cantidadDeVacunasAstrazeneca = cantidadDeVacunasAstrazeneca;
    }

    /**
     * imprime datos de los centros
     */
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\nCodigo: " + this.codigo + "\nUbicacion: " + this.ubicacion
                + "\nCapacidad: " + this.capacidad + "\nCantidad de Vacunas en la pila Pfizer: "
                + cantidadDeVacunasPfizer + "\nCantidad de Vacunas en la pila Moderna: " + cantidadDeVacunasModerna
                + "\nCantidad de Vacunas en la pila Sputnik: " + cantidadDeVacunasSputnik
                + "\nCantidad de Vacunas en la pila Astra Zeneca: " + cantidadDeVacunasAstrazeneca
                + "\n-----------------------------------------------------------------------";
    }
}
