package Proyecto_Grupo1_ProgramacionII;

/**
 * Estructura para las Vacunas
 * 
 * Nombre: PFIZER, MODERNA, SPUTNIK, ASTRA ZENECA (Enum) Cantidad de dosis
 * requeridas (Double o Int) fecha de vencimiento (String)
 */
public class Vacuna {
    enum nombre {
        PFIZER, MODERNA, SPUTNIK, ASTRAZENECA;
    }

    /**
     * caracteristicas de la vacuna
     */
    private double CantidadDeDosis;
    private String vencimiento;
    private nombre nombreVacuna;

    /**
     * constructor
     * 
     * @param vencimiento recibe el vencimiento de la vacuna
     * @param a           recibe un entero que dependiendo su valor le pondra el
     *                    nombre a la vacuna
     */
    public Vacuna(String vencimiento, int a) {
        this.vencimiento = vencimiento;
        switch (a) {
            case 1:
                nombreVacuna = nombre.PFIZER;
                this.CantidadDeDosis = 2;
                break;
            case 2:
                nombreVacuna = nombre.MODERNA;
                this.CantidadDeDosis = 2;
                break;
            case 3:
                nombreVacuna = nombre.SPUTNIK;
                this.CantidadDeDosis = 2;
                break;
            case 4:
                nombreVacuna = nombre.ASTRAZENECA;
                this.CantidadDeDosis = 2;
                break;
            default:
                System.out.println("Valor invalido");
                break;
        }
    }

    /**
     * retona la cantidad de dosis
     * 
     * @return
     */
    public double getCantidadDeDosis() {
        return CantidadDeDosis;
    }

    /**
     * recibe la cantidad de dosis
     * 
     * @param cantidadDeDosis
     */
    public void setCantidadDeDosis(double cantidadDeDosis) {
        CantidadDeDosis = cantidadDeDosis;
    }

    /**
     * retona el fecha de vencimiento
     * 
     * @return
     */
    public String getVencimiento() {
        return vencimiento;
    }

    /**
     * recibe la fecha de vencimiento
     * 
     * @param vencimiento
     */
    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    /**
     * retona el nombre d ela vacuna
     * 
     * @return
     */
    public nombre getNombreVacuna() {
        return nombreVacuna;
    }

    /**
     * recibe el nombre de la vacuna
     * 
     * @param nombreVacuna
     */
    public void setNombreVacuna(nombre nombreVacuna) {
        this.nombreVacuna = nombreVacuna;
    }

}
