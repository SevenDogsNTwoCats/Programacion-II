public class Lista {
    private Nodos  primerNodo;
    private Nodos ultimoNodo;
    private String nombreLista;
    
    public Lista(String nombreLista) {
        this.nombreLista = nombreLista;
    }

    public Nodos getPrimerNodo() {
        return primerNodo;
    }

    public void setPrimerNodo(Nodos primerNodo) {
        this.primerNodo = primerNodo;
    }

    public Nodos getUltimoNodo() {
        return ultimoNodo;
    }

    public void setUltimoNodo(Nodos ultimoNodo) {
        this.ultimoNodo = ultimoNodo;
    }

    public String getNombreLista() {
        return nombreLista;
    }

    public void setNombreLista(String nombreLista) {
        this.nombreLista = nombreLista;
    }

    public boolean listaVacia(){
        return (this.primerNodo==null);
    }

    public void insertarFrente(Alumnos alumno){
        if(listaVacia()){
            this.primerNodo=this.ultimoNodo=new Nodos(alumno);
        }else{
            Nodos newNodo= new Nodos(alumno, this.primerNodo);
            this.primerNodo=newNodo;
        }
    }

    public void insertarFinal(Alumnos alumno){
        if (listaVacia()) {
            this.primerNodo=this.ultimoNodo=new Nodos(alumno);
        }else{
            Nodos newNodo= new Nodos(alumno);
            this.ultimoNodo.setSiguienteAlumno(newNodo);
            this.ultimoNodo=newNodo;
        }
    }

    public void eliminarFrente(){
        try {
            Nodos x;
            x=this.primerNodo.getSiguienteAlumno();
            this.primerNodo.setAlumno(null);
            this.primerNodo.setSiguienteAlumno(null);
            this.primerNodo=x;
        } catch (Exception e) {
            System.err.println("Error al eliminar al Frente"+e.getMessage());
        }
    }
    public void eliminarFinal(){
        try {
            this.ultimoNodo.setAlumno(null);
            this.ultimoNodo=null;
        } catch (Exception e) {
            System.err.println("Error al eliminar al Final"+e.getMessage());
        }
    }
}
