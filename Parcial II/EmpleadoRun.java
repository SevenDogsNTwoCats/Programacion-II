public class EmpleadoRun {
    public static void main(String[] args) {
        EmpleadoComercial empleado1=new EmpleadoComercial("Juan Rodriguez", 29, 10000, 300);
        EmpleadoRepartidor empleado2=new EmpleadoRepartidor("Roberto Soza", 45, 9000, "Zona 2");
        EmpleadoComercial empleado3=new EmpleadoComercial("Karla Espinoza", 33, 10000, 300);
        EmpleadoRepartidor empleado4=new EmpleadoRepartidor("Walter Mejia", 24, 9000, "Zona 3");
        System.out.println("\n------------------------------");
        System.out.println(empleado1);
        System.out.println("\n------------------------------");
        System.out.println(empleado2);
        System.out.println("\n------------------------------");
        System.out.println(empleado3);
        System.out.println("\n------------------------------");
        System.out.println(empleado4);
        System.out.println("\n------------------------------");
    }
}
