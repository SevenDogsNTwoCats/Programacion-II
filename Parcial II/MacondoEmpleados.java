enum areatrabajo{
    OPERATIVOS,ADMINISTRATIVOS,GERENCIALES;
}
public class MacondoEmpleados extends Macondo implements MacondoInterfaz {
    private int nhoras;
    private double phora;
    private int fechaIngreso;
    areatrabajo at;
    
   public MacondoEmpleados(int id, String nombre, int nhoras, double phora, int fechaIngreso,int a) {
    super(id, nombre);
    this.nhoras = nhoras;
    this.phora = phora;
    this.fechaIngreso = fechaIngreso;
    calcularIngreso(nhoras,phora);
    switch(a){
        case 0:
            at=areatrabajo.OPERATIVOS;
        break;
        case 1:
            at=areatrabajo.ADMINISTRATIVOS;
        break;
        case 2:
            at=areatrabajo.GERENCIALES;
        break;
    }
    }
    
    public int getNhoras() {
    return nhoras;
    }

    public void setNhoras(int nhoras) {
      this.nhoras = nhoras;
    }

    public double getPhora() {
        return phora;
    }

    public void setPhora(double phora) {
        this.phora = phora;
    }

    public int getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(int fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    @Override
    public void calcularIngreso(int a, double b) {
        setIngreso(a*b);
    }
    @Override
    public String toString() {
        return "\nID Nombre: "+getId()+
        "\nNombre: " + getNombre()+
        "\nArea de trabajo: "+at+
        "\nIngresos: "+getIngreso();
    }
}

