public class UberConductor {
    int codigo;
    int numerocarrera;
    double montogenerado;
    //constructor conductor
    public UberConductor(int codigo,int numerocarrera, double montogenerado){
        this.codigo=codigo;
        this.numerocarrera=numerocarrera;
        this.montogenerado=montogenerado;
    }
    //recibir carreras y monto
    public void setnumerocarrera(int numerocarrera){
        this.numerocarrera+=numerocarrera;
    }
    public void setmontogenrado(double montogenerado){
        this.montogenerado+=montogenerado;
    }
    //reporte numero de carreras y monto generado
    public void reporte(){
        System.out.printf("\n\t%d\t\t\t%d\t\t   %.2f $",this.codigo,this.numerocarrera,this.montogenerado); 
    }
}
