public class Uber {
    public static void main(String arg[]){
        //creando 5 condutores
        UberConductor conductor1 = new UberConductor(1, 0, 0);
        UberConductor conductor2 = new UberConductor(2, 0, 0);
        UberConductor conductor3 = new UberConductor(3, 0, 0);
        UberConductor conductor4 = new UberConductor(4, 0, 0);
        UberConductor conductor5 = new UberConductor(5, 0, 0);
        //enviadole las carreras y precios aletorios
        for(int i=0;i<100;i++){
            int carrera;
            carrera=(int)(Math.random()*5+1);
            switch(carrera){
                case 1:
                    conductor1.setnumerocarrera(1);
                    conductor1.setmontogenrado(Math.random()*20+15);
                break;
                case 2:
                    conductor2.setnumerocarrera(1);
                    conductor2.setmontogenrado(Math.random()*20+15);
                break;
                case 3:
                    conductor3.setnumerocarrera(1);
                    conductor3.setmontogenrado(Math.random()*20+15);
                break;
                case 4:
                    conductor4.setnumerocarrera(1);
                    conductor4.setmontogenrado(Math.random()*20+15);
                break;
                case 5:
                    conductor5.setnumerocarrera(1);
                    conductor5.setmontogenrado(Math.random()*20+15);
                break;
            }
        }
        //reporte
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("CODIGO CONDUCTOR\tNUMERO DE CARRERAS\tMONTO GENERADO");
        conductor1.reporte();
        conductor2.reporte();
        conductor3.reporte();
        conductor4.reporte();
        conductor5.reporte();
        System.out.println("\n--------------------------------------------------------------------------");
    }
}
