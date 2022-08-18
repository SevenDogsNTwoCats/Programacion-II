public class Test{

    public static void main (String args[]){
        
        //Tipos de datos primitivos
        int edad = 25;
        char caracterEspecial = '@';
        boolean estado = false;
        double precio = 125.65;
                
        //Clases envolturas de los tipos de datos primitivos (pueden manipularse como objetos)
        Double peso = 170.00;
        Integer IMC = 22;
        Character valorX = '|';
        valorX.toUpperCase(valorX);


        //Utilidad de las clases envolturas
        String valor = "2000";
        String valorNvo = "200.25";
        
        edad = Integer.parseInt(valor);
        precio = Double.parseDouble(valorNvo);


        
        Integer arreglo[] = new Integer[5];
        arreglo[0] = 5; // Autoboxing
        int x = arreglo[0]; //Autounboxing



    }

}