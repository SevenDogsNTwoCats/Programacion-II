public class SalarioRun {
    public static void main(String[] args) {
        SalarioEmpleadoAsalariado Empleado1=new SalarioEmpleadoAsalariado("Juan", "Martinez", 232454, 3000);
        SalarioEmpleadoPorHora Empleado2=new SalarioEmpleadoPorHora("Maria", "Amador", 232453, 48, 50);
        SalarioEmpleadoComision Empleado3=new SalarioEmpleadoComision("Ramon", "Amaya", 334522, 23, 8000);
        SalarioEmpleadoBaseComision Empleado4=new SalarioEmpleadoBaseComision("Rosa", "Rosales", 500032, 1200, 15, 6300);
        SalarioEmpleadoAsalariado Empleado5=new SalarioEmpleadoAsalariado("Tania", "Hernandez", 890782, 3000);

        System.out.println(Empleado1);
        System.out.println(Empleado2);
        System.out.println(Empleado3);
        System.out.println(Empleado4);
        System.out.println(Empleado5);
    }
}
