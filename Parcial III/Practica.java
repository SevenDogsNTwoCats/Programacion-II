import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Practica {
    
    private static Alumnos[] alumnos=new Alumnos[10];
    public static void main(String[] args) {

        FileReader fr;
        BufferedReader br;
        String linea;

        try {
            fr=new FileReader("E:\\Documentos\\UNAH\\Programacion II\\Programas\\Parcial III\\Datos.txt");
            br=new BufferedReader(fr);
            linea=br.readLine();
            while (linea!=null) {
                crearObjetos(linea);
                linea=br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error al cargar el archivo"+e.getMessage());
        } catch (Exception e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        for (Alumnos x : alumnos) {
            if (x!=null) {
                System.out.println(x);
            }
        }
}

    public static void crearObjetos(String linea){
        String[] AlumnoDatos=linea.split("-");

        Alumnos alumno=new Alumnos(AlumnoDatos[0], AlumnoDatos[1]);

        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i]==null) {
                alumnos[i]=alumno;
                break;
            }
        }
    }
}
