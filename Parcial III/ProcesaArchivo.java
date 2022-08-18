import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProcesaArchivo {


    private static Producto[] productos = new Producto[4];

    /*
    P Cemento 123.95 54
    P Cerámica 350 60
    P Varilla 128.90 200
    */
    

    public static void main(String[] args) {
        
        FileReader fr;
        BufferedReader br;

        String linea;


        try {            
            fr = new FileReader("D:\\Prueba.txt");
            br = new BufferedReader(fr);
            
            linea = br.readLine();
            
            while(null != linea){
                crearProducto(linea);
                linea = br.readLine();
            }
           

        } catch (FileNotFoundException e) {
            System.err.println("Error al cargar el archivo: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }


        for(Producto actual : productos){
            System.out.println(actual);
        }

    }

    /**
     * Crea un nuevo producto por cada línea recibida
     * @param linea El string que contiene los datos del producto
     */
    private static void crearProducto(String linea){
        
        String[] elementosDelProducto = linea.split(" "); //Separa el string linea en elementos que se encuentren separados por coma

        /**
         * elementosDelProducto[0] = "P"
         * elementosDelProducto[1] = "Cemento"
         * elementosDelProducto[2] = "123.95"
         * elementosDelProducto[3] = "54"
         * 
         */

         Producto nvoProducto = new Producto(elementosDelProducto[0],
                                             elementosDelProducto[1],
                                             Double.parseDouble(elementosDelProducto[2]),
                                             Integer.parseInt(elementosDelProducto[3])
                                            );


        for(int i=0; i<productos.length; i++){
            if(productos[i] == null){
                productos[i] = nvoProducto;
                break;
            }
        }
        
    }

}
