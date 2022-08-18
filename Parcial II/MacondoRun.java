public class MacondoRun {
    public static void main(String[] args) {
        Macondo empleado1=new MacondoEmpleados(89091, "Juan Hernandez", 12, 172, 7,0);
        Macondo empleado2=new MacondoEmpleados(798271, "Manuel Zelaya", 13,172,8,2);
        Macondo cliente1=new MacondoCliente(9882992, "Pennywise", "Alcantarilla 301", "It.eso@outlook.es", "23416181", 10000, 1);
        Macondo cliente2=new MacondoCliente(9021091, "Pepa Pig", "La colina", "la_cerdita.pepa.pig@gmail.com", "290198091", 132, 879);

 
        Macondo[] array={empleado1,empleado2,cliente1,cliente2};

        for(Macondo actual: array){
            System.out.println(actual);
            if(actual instanceof MacondoCliente){
                System.out.println("CLIENTE");
            }
            if(actual instanceof MacondoEmpleados){
                System.out.println("EMPLEADO");
            }
        }
    }
}
