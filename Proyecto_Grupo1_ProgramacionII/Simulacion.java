package Proyecto_Grupo1_ProgramacionII;

/**
 *      PROGRAMADOR                                CORREO
 * Alhanis Carolina Espinal Flores     alhanis.espinal@unah.hn (Coordinadora)
 * Victor Miguel Barahona Licona       vmbarahona@unah.hn
 * Franklin Joel Amador López          famadorl@unah.hn
 * Oscar Emanuel Espinoza Martinez     Oespinozam@unah.hn
 * Darwin Iván Romero Galeas           darwinromero224@gmail.com
 */

/**
 * librerias 
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import Proyecto_Grupo1_ProgramacionII.Paciente.VacunaAplicada;

public class Simulacion {
    /**
     * para crear numeros aleatorios
     */
    public static Random aleatorio = new Random();
    /**
     * Lista enlazada para los centros de vacunacion
     */
    public static ListaEnlazada lista = new ListaEnlazada("Centros De Vacunacion");

    /**
     * Simulacion aplicacion de las vacunas
     * 
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Llama al metodo para que lee el txt de los centros de vacunacion
         */
        LeerArchivo();
        /**
         * Llama al metodo para que cree una pila de cada tipo de vacuna por cada tipo
         * de vacuna
         */
        crearPilasDeVacunas();
        /**
         * Imprimir informacion de cada centro
         */
        System.out.println("\n-----------------------------------------------------------------------");
        System.out.println("            INFORMACION DE LOS CENTROS DE VACUNACION");
        System.out.println("-----------------------------------------------------------------------");
        lista.imprimirLista();

        /**
         * Para la tabla del reporte de los centros una vez atendidos los pacientes
         */
        System.out.println();
        System.out.println("\n                                   REPORTE DE LOS CENTROS DE VACUNACION");
        System.out.println(
                "\n------------------------------------------------------------------------------------------------------------------");
        System.out.println("NOMBRE DEL CENTRO\t\tVACUNA\t\tPRIMERA DOSIS\tSEGUNDA DOSIS\t ATENDIDOS\tNO ATENDIDOS");
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------");
        /**
         * llama al metodo para que lleguen las colas de pacientes
         */
        CrearColaPacientes();

    }

    /**
     * Creacion de los Centros de Vacunacion
     * 
     * @param linea
     */
    public static void crearCentrosDeVacunacion(String linea) {

        String[] elementosDelCentro = linea.split(",");

        CentrosDeVacunacion nvoCentro = new CentrosDeVacunacion(Integer.parseInt(elementosDelCentro[0]),
                elementosDelCentro[1], elementosDelCentro[2], Integer.parseInt(elementosDelCentro[3]));
        /**
         * Envia el centro creado a la lista
         */
        lista.insertarAlFinal(nvoCentro);

    }

    /**
     * lee el archivo txt con los datos de los centros de vacunacion
     */
    public static void LeerArchivo() {
        FileReader fr;
        BufferedReader br;
        String linea;
        /**
         * Leer txt de Centros de Vacunacion
         */
        try {
            /**
             * Ubicacion del archivo que contenga los datos de los centros de vacunacion
             */
            fr = new FileReader("Proyecto_Grupo1_ProgramacionII\\CentrosDeVacunacion.txt");
            br = new BufferedReader(fr);

            linea = br.readLine();
            while (null != linea) {
                crearCentrosDeVacunacion(linea.replace(" ", ""));
                linea = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error al cargar el archivo: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    /**
     * crea una pila de vacunas de cada tipo para cada centro
     */
    public static void crearPilasDeVacunas() {
        /**
         * una pila por cada tipo de vacuna
         */
        PilaVacunas pilaPfizer = new PilaVacunas("Pila De Vacunas Pfizer");
        PilaVacunas pilaModerna = new PilaVacunas("Pila De Vacunas Moderna");
        PilaVacunas pilaSputnik = new PilaVacunas("Pila De Vacunas Sputnik");
        PilaVacunas pilaAstrazeneca = new PilaVacunas("Pila De Vacunas Astra Zeneca");
        /**
         * las pilas se guardan en un arreglo para que se creen en un ciclo for
         */
        PilaVacunas[] arrayVacunas = { pilaPfizer, pilaModerna, pilaSputnik, pilaAstrazeneca };
        /**
         * selecciona el primer centro de vacunacion de la lista enlazada
         */
        Nodo tmp = lista.getPrimerNodo();
        do {
            /**
             * selecciona el centro de vacunacion
             */
            if (tmp.getArchivo() instanceof CentrosDeVacunacion) {
                CentrosDeVacunacion centroTmp = (CentrosDeVacunacion) tmp.getArchivo();
                /**
                 * ciclo for que se repite con cada pila del arreglo
                 */
                for (int i = 0; i < arrayVacunas.length; i++) {
                    /**
                     * crea un numero aleatorio entre 500 y 1000
                     */
                    int x = (int) (Math.random() * 500 + 500);
                    /**
                     * crea la cantidad de vacunas dependiendo del numero aleatorio e inserta la
                     * vacuna en la pila correspondiente
                     */
                    for (int j = 0; j < x; j++) {
                        /**
                         * A la vacuna se le envia la fecha de vencimiento y un entero que sirve para
                         * colocarle el nombre del enum
                         */
                        Vacuna nvaVacuna = new Vacuna("10/10/2022", i + 1);
                        /**
                         * la vacuna se inserta en la pila correspondiente
                         */
                        arrayVacunas[i].insertarAlFinal(nvaVacuna);
                    }

                    /**
                     * envia la pila de vacunas al centro de vacunacion NOTA: el entero x que solo
                     * sirve para saber cuantas vacunas se crearon en la pila que se envio
                     */
                    switch (i) {
                        case 0:
                            centroTmp.setPilaDeVacunasPfizer(arrayVacunas[i], x);
                            break;
                        case 1:
                            centroTmp.setPilaDeVacunasModerna(arrayVacunas[i], x);
                            break;
                        case 2:
                            centroTmp.setPilaDeVacunasSputnik(arrayVacunas[i], x);
                            break;
                        case 3:
                            centroTmp.setPilaDeVacunasAstrazeneca(arrayVacunas[i], x);
                            break;
                    }

                }
            }
            /**
             * si hay mas centro de vacunacion tambien les creara pila de vacunas por cada
             * tipo
             */
            tmp = tmp.getSiguieNodo();
        } while (tmp != null);
    }

    /**
     * creación de la cola y sus datos de manera aleatoria
     */
    public static void CrearColaPacientes() {

        /**
         * arreglos que contienen los datos para generar aleatoriamente
         */
        String[] nombres = { "Andrea", "David", "Baldomero", "Balduino", "Baldwin", "Baltasar", "Barry", "Bartolo",
                "Bartolomé", "Baruc", "Baruj", "Candelaria", "Cándida", "Canela", "Caridad", "Carina", "Carisa",
                "Caritina", "Carlota", "Baltazar" };
        String[] apellidos = { "Gomez", "Guerrero", "Cardenas", "Cardiel", "Cardona", "Cardoso", "Cariaga", "Carillo",
                "Carion", "Castiyo", "Castorena", "Castro", "Grande", "Grangenal", "Grano", "Grasia", "Griego",
                "Grigalva" };
        String[] residencias = { "La Peña", "Kenedy", "Flor del campo", "Las uvas", "La cañada", "Monterrey",
                "Los llanos", "Sinaí", "Los alpes", "La esperanza", "Las casitas", "Los hidalgos", "Nueva concepción",
                "Colonia satelite", "15 de septiembre", "Miraflores", "Villa nueva", "Hato de enmedio", "Villa vieja",
                "ccolonia vista hermosa", "Buenos aires sur", "colonia San Miguel", "colonia los rosales",
                "El pedregal", "Tiloarque", "Los robles", "Los pinos", "El trapiche", "colonia Suyapa",
                "colonia miramesí", "colonia la sagastume", "3 de mayo", "14 de amrzo", "Lomas del guijarro",
                "Lomas lindas", "Colonia venecia", "La vega", "La sosa", "Divino paraíso", "Colonia los laureles",
                "Campo cielo", "Las torres", "Las palmas", "La honduras", "colonia san Francisco", "villa union",
                "colonia las campanas", "El carrizal", "La era", "Cerro garnde", "Tierra sol", "San Isidro",
                "Colonia torocagua", "La leona", "Colonia Divanna", "Colonia Lincoln" };

        Nodo tmp = lista.getPrimerNodo();
        do {
            /**
             * selecciona el centro de vacunacion
             */
            if (tmp.getArchivo() instanceof CentrosDeVacunacion) {

                CentrosDeVacunacion centroTmp = (CentrosDeVacunacion) tmp.getArchivo();
                /**
                 * se crea una cola de pacientes que se llenara con pacientes para que sean
                 * atendidos en el centro
                 */
                ColaPacientes colaPacientes = new ColaPacientes("pacientes");

                /**
                 * crea un numero aleatorio entre 3000 y 10000
                 */
                int x = aleatorio.nextInt(7000) + 3000;

                /**
                 * Crea la cantidad de pacientes dependiendo del numero aleatorio
                 */
                for (int i = 0; i < x; i++) {
                    // crea un paciente con un nombre y apellido aleatorio, edad aleatoria,
                    // residencia aleatoria, y la dosis que necesita aleatoria
                    Paciente paciente = new Paciente(
                            nombres[aleatorio.nextInt(nombres.length)] + apellidos[aleatorio.nextInt(apellidos.length)],
                            aleatorio.nextInt(95) + 12, aleatorio.nextInt(2) + 1,
                            residencias[aleatorio.nextInt(residencias.length)]);
                    /**
                     * Inserta los pacientes a la cola
                     */
                    colaPacientes.insertarAlFinal(paciente);
                }
                /**
                 * llama al metodo para que la cola de pacientes sea atendida Le envia el centro
                 * y la cola de pacientes que se creo
                 */
                atenderPacientes(centroTmp, colaPacientes);
            }

            tmp = tmp.getSiguieNodo();
        } while (tmp != null);
    }

    /**
     * Metodo que simula Atender a los pacientes
     * 
     * @param centro recibe el centro
     * @param cola   y la cola que llego para vacunarlos
     */
    public static void atenderPacientes (CentrosDeVacunacion centro, ColaPacientes cola) {

        Nodo tmp = cola.getPrimerNodo();

        /** ciclo de elección y aplicacion de vacuna para cada paciente de la cola
         */
        do {

            if (tmp.getArchivo() instanceof Paciente) {
                Paciente pacienteActual = (Paciente) tmp.getArchivo();
                /**
                 * numero aleatoria para asignarle una vacuna aleatoria al paciente
                 */
                int x = aleatorio.nextInt(4) + 1;
                switch (x) {

                    case 1:
                        /** revisa si hay vacunas pfizer en existencia 
                         * si la hay vacuna al paciente y elimina la vacuna
                        */
                        pacienteActual.setVacunaAplicada(1);
                        PilaVacunas pilaP = centro.getPilaDeVacunasPfizer();
                        if (centro.getCantidadDeVacunasPfizer() > 0) {
                            pacienteActual.setVacunado(true);
                            pilaP.EliminardelFinal();
                            centro.setCantidadDeVacunasPfizer(centro.getCantidadDeVacunasPfizer() - 1);
                        }
                        break;
                    case 2:
                        /** revisa si hay vacunas moderna en existencia 
                         * si la hay vacuna al paciente y elimina la vacuna
                        */
                        pacienteActual.setVacunaAplicada(2);
                        PilaVacunas pilaM = centro.getPilaDeVacunasModerna();
                        if (centro.getCantidadDeVacunasModerna() > 0) {
                            pacienteActual.setVacunado(true);
                            pilaM.EliminardelFinal();
                            centro.setCantidadDeVacunasModerna(centro.getCantidadDeVacunasModerna() - 1);
                        }
                        break;
                    case 3:
                        pacienteActual.setVacunaAplicada(3);
                        PilaVacunas pilaS = centro.getPilaDeVacunasSputnik();
                        /** revisa si hay vacunas sputnik en existencia 
                         * si la hay vacuna al paciente y elimina la vacuna
                        */
                        if (centro.getCantidadDeVacunasSputnik() > 0) {
                            pacienteActual.setVacunado(true);
                            pilaS.EliminardelFinal();
                            centro.setCantidadDeVacunasSputnik(centro.getCantidadDeVacunasSputnik() - 1);
                        }
                        break;
                    case 4:
                        /** revisa si hay vacunas astrrazeneca en existencia  
                         * si la hay vacuna al paciente y elimina la vacuna
                        */
                        pacienteActual.setVacunaAplicada(4);
                        PilaVacunas pilaA = centro.getPilaDeVacunasAstrazeneca();
                        if (centro.getCantidadDeVacunasAstrazeneca() > 0) {
                            pacienteActual.setVacunado(true);
                            pilaA.EliminardelFinal();
                            centro.setCantidadDeVacunasAstrazeneca(centro.getCantidadDeVacunasAstrazeneca() - 1);
                        }
                        break;
                }
            }

            tmp = tmp.getSiguieNodo();
        } while (tmp != null);

        /**
         * genera el reporte con el nombre de este centro, enviandole la cola de las
         * personas
         */
        Reporte(cola, centro.getNombre());

    }

    /**
     * Metdo que genera el reporte
     * 
     * @param cola   recibe la cola de pacientes para obtener los datos de si se
     *               atendio, que vacuna, y que dosis
     * @param centro recibe el nombre del centro donde se atendio
     */
    public static void Reporte(ColaPacientes cola, String centro) {
        /**
         * cuenta cuantas primeras dosis de cada vacuna se pusieron
         */
        int PfizerPrimD = 0, ModernaPrimD = 0, SputnikPrimD = 0, AstrazenecaPrimD = 0;
        /**
         * cuenta cuantas vacunas de segunda dosis se pusieron dependiendo la vacuna
         */
        int PfizerSegD = 0, ModernaSegD = 0, SputnikSegD = 0, AstrazenecaSegD = 0;
        /**
         * cuenta cuantos pacientes que necesitaban cierta vacuna se atendieron
         */
        int APfizer = 0, AModerna = 0, ASputnik = 0, AAstrazeneca = 0;
        /**
         * cuenta cuantos pacientes no se atendieron
         */
        int NPfizer = 0, NModerna = 0, NSputnik = 0, NAstrazeneca = 0;

        Nodo tmp = cola.getPrimerNodo();
        /**
         * ciclo para generar el reporte
         */
        do {
            if (tmp.getArchivo() instanceof Paciente) {
                Paciente pacienteActual = (Paciente) tmp.getArchivo();

                /**
                 * ciclo de reporte de vacuna pfizer
                 */
                if (pacienteActual.getVacunaAplicadaNombre() == VacunaAplicada.PFIZER) {
                    if (pacienteActual.isVacunado()) {
                        switch (pacienteActual.getDosis()) {
                            case 1:
                                PfizerPrimD++;
                                break;

                            case 2:
                                PfizerSegD++;
                                break;
                        }
                        APfizer++;
                    } else
                        NPfizer++;
                }

                /**
                 * ciclo de reporte de vacuna moderna
                 */
                if (pacienteActual.getVacunaAplicadaNombre() == VacunaAplicada.MODERNA) {
                    if (pacienteActual.isVacunado()) {
                        switch (pacienteActual.getDosis()) {
                            case 1:
                                ModernaPrimD++;
                                break;

                            case 2:
                                ModernaSegD++;
                                break;
                        }
                        AModerna++;
                    } else
                        NModerna++;
                }

                /**
                 * ciclo de reporte de vacuna sputnik
                 */
                if (pacienteActual.getVacunaAplicadaNombre() == VacunaAplicada.SPUTNIK) {
                    if (pacienteActual.isVacunado()) {
                        switch (pacienteActual.getDosis()) {
                            case 1:
                                SputnikPrimD++;
                                break;

                            case 2:
                                SputnikSegD++;
                                break;
                        }
                        ASputnik++;
                    } else
                        NSputnik++;
                }

                /**
                 * ciclo de reporte de vacuna astrazeneca
                 */
                if (pacienteActual.getVacunaAplicadaNombre() == VacunaAplicada.ASTRAZENECA) {
                    if (pacienteActual.isVacunado()) {
                        switch (pacienteActual.getDosis()) {
                            case 1:
                                AstrazenecaPrimD++;
                                break;

                            case 2:
                                AstrazenecaSegD++;
                                break;
                        }
                        AAstrazeneca++;
                    } else
                        NAstrazeneca++;
                }

            }
            tmp = tmp.getSiguieNodo();
        } while (tmp != null);

        /**
         * reporta el informe del centro
         */
        System.out.println(centro);
        System.out.println(
                "\t\t\t\tPfizer" + "\t\t\t" + PfizerPrimD + "\t\t" + PfizerSegD + "\t\t" + APfizer + "\t\t" + NPfizer);
        System.out.println("\t\t\t\tModerna" + "\t\t\t" + ModernaPrimD + "\t\t" + ModernaSegD + "\t\t" + AModerna
                + "\t\t" + NModerna);
        System.out.println("\t\t\t\tSputnik" + "\t\t\t" + SputnikPrimD + "\t\t" + SputnikSegD + "\t\t" + ASputnik
                + "\t\t" + NSputnik);
        System.out.println("\t\t\t\tAstra Zeneca" + "\t\t" + AstrazenecaPrimD + "\t\t" + AstrazenecaSegD + "\t\t"
                + AAstrazeneca + "\t\t" + NAstrazeneca);
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------");
    }

}