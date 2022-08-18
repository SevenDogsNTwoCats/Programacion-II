public class AppleSOiPodTouch implements AppleInterfaz{
    private int cantidadVideos;
    private int cantidadCanciones;
    private int cantidadPodCast;

    public AppleSOiPodTouch(int cantidadVideos, int cantidadCanciones, int cantidadPodCast) {
        this.cantidadVideos = cantidadVideos;
        this.cantidadCanciones = cantidadCanciones;
        this.cantidadPodCast = cantidadPodCast;
    }

    public int getCantidadVideos() {
        return cantidadVideos;
    }

    public void setCantidadVideos(int cantidadVideos) {
        this.cantidadVideos = cantidadVideos;
    }

    public int getCantidadCanciones() {
        return cantidadCanciones;
    }

    public void setCantidadCanciones(int cantidadCanciones) {
        this.cantidadCanciones = cantidadCanciones;
    }

    public int getCantidadPodCast() {
        return cantidadPodCast;
    }

    public void setCantidadPodCast(int cantidadPodCast) {
        this.cantidadPodCast = cantidadPodCast;
    }
    
    @Override
    public void reproducirCancion() {
        System.out.println("Reproduciendo Cancion");
    }
    @Override
    public String toString() {
        return "Informacion iPOD"+"\nVideos: "+cantidadVideos+
        "\nCanciones: "+cantidadCanciones+
        "\nPodCast: "+cantidadPodCast;
    }
}
