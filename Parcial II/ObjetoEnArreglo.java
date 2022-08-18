public class ObjetoEnArreglo {
    String nombre;
    double precio;
    int litros;
    public ObjetoEnArreglo(String nombre, double precio, int litros){
        this.nombre=nombre;
        this.precio=precio;
        this.litros=litros;
    }
    public void setnombre (String nombre){
        this.nombre=nombre;
    }
    public void setprecio (double precio){
        this.precio=precio;
    }
    public void setlitros(int litros){
        this.litros=litros;
    }
    public String getnombre (){
        return this.nombre;
    }
    public double getprecio (){
        return this.precio;
    }
    public int getlitros(){
        return this.litros;
    }
}
