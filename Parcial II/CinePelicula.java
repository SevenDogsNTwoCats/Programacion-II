public abstract class CinePelicula {
    private String titulo;
    private int duracion;
    private int edadmin;
    private String director;
    public CinePelicula(String titulo, int duracion, int edadmin, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadmin = edadmin;
        this.director = director;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public int getEdadmin() {
        return edadmin;
    }
    public void setEdadmin(int edadmin) {
        this.edadmin = edadmin;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
}
