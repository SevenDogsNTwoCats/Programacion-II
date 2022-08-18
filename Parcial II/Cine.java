public class Cine extends CinePelicula{
    private String nombre;
    private int precioentrada;
    public Cine(String nombre, String titulo, int duracion,int edadmin,String director, int precioentrada) {
        super(titulo, duracion, edadmin, director);
        this.nombre = nombre;
        this.precioentrada = precioentrada;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioentrada() {
        return precioentrada;
    }
    public void setPrecioentrada(int precioentrada) {
        this.precioentrada = precioentrada;
    }

    @Override
    public String toString() {
        
        return nombre+
                "\nPelicula: " + getTitulo()+
                "\nDirector: " + getDirector()+
                "\nDuracion: " + getDuracion()+"min"+
                "\nEdad: +"+getEdadmin()+
                "\nEntrada: "+getPrecioentrada()+"$";
        
    }
    
}
