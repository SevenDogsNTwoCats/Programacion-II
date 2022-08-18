public class Nodos {
    private Alumnos alumno;
    private Nodos siguienteAlumno;

    public Nodos(Alumnos alumno, Nodos siguienteAlumno) {
        this.alumno = alumno;
        this.siguienteAlumno = siguienteAlumno;
    }

    public Nodos(Alumnos alumno){
        this(alumno, null);
    }
    
    public Alumnos getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumnos alumno) {
        this.alumno = alumno;
    }

    public Nodos getSiguienteAlumno() {
        return siguienteAlumno;
    }

    public void setSiguienteAlumno(Nodos siguienteAlumno) {
        this.siguienteAlumno = siguienteAlumno;
    }

    
    
}
