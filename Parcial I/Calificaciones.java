public class Calificaciones {
    String nombrecurso;
    int estudiante;
    int calificacion[];
    double promedio;

    public Calificaciones(String nombrecurso, int calificacion[]){
        this.nombrecurso=nombrecurso;
        this.calificacion=calificacion;
    }

    public void setnombrecurso(String nombrecurso){
        this.nombrecurso=nombrecurso;
    }
    public String getnombrecurso(){
        return "\n\n**************Curso: "+this.nombrecurso+"**************";
    }

    public void imprimircalificacion(){
        for(int i=0;i<this.calificacion.length;i++)
        System.out.println("Estudiante "+(i+1)+": "+this.calificacion[i]);
    }

    public int getmincalificacion(){
        int mincalif=100;
        for(int i=0;i<this.calificacion.length;i++){
            if(mincalif>this.calificacion[i])
            mincalif=this.calificacion[i];
        }
        return mincalif;
    }
    public int getmaxcalificacion(){
        int maxcalif=0;
        for(int i=0;i<this.calificacion.length;i++){
            if(maxcalif<this.calificacion[i])
            maxcalif=this.calificacion[i];
        }
        return maxcalif;
    }
    public double getpromedio(){
        int a=0;
        for(int i=0;i<this.calificacion.length;i++)
        a+=this.calificacion[i];

        this.promedio=a/this.calificacion.length;

        return this.promedio;
    }

}
