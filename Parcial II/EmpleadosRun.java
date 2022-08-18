public class EmpleadosRun {
    public static void main(String[] args) {
        Empleados1 empleado1=new EmpleadosAsalariado("Juan","Molina", "00089102921", 12930);
        Empleados1 empleado2= new EmpleadosPorHora("Maria", "Garza", "093821891", 42, 150);
        Empleados1 empleado3=new EmpleadosPorComision("Daniel", "Hernadez", "029189191", 12839.90, 0.30);
        Empleados1 empleado4=new EmpleadosBMasComision("Rosa", "Olivo", "029100011", 0.30, 12000.90, 6000);

        Empleados1[] empleadosArray ={empleado1,empleado2,empleado3,empleado4};

        for(Empleados1 actual: empleadosArray){
            System.out.println(actual);
            actual.calcular();
       //     System.out.println(actual.getSalario());
            if(actual instanceof EmpleadosPorHora){
                EmpleadosPorHora tmp= (EmpleadosPorHora) actual;
                System.out.println("Horas Trabajadas: "+tmp.getHoras());
            }   

        }

    }
}