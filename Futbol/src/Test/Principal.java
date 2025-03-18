package Test;

import Logica.*;

/**
 *
 * @author greiv
 */
public class Principal {

    public static void main(String[] args) {

        Controlador controlador = new Controlador();
        
        //Arreglo mas claro y conciso
        Jugador[] jugadores = {
            new Jugador("04/02/2025", "Greivin", 5, "Medio Campista", 74, 9.0f),
            new Jugador("04/02/2025", "Ronny", 11, "Medio Campista", 80, 9.0f),
            new Jugador("04/02/2025", "Geovany", 7, "Media Punta", 76, 9.0f),
            new Jugador("04/02/2025", "Osvaldo", 10, "Medio Campista", 75, 9.0f),
            new Jugador("04/02/2025", "Dayan", 9, "Delantero", 68, 9.0f)
        };

        for (Jugador jugador : jugadores) {
            System.out.println(controlador.retornoArrayList(jugador.toString()));
        }
    }
}















/**
 * jugador = new Jugador("04/02/2025", "Greivin", 5, "Medio Campista", 74,
 * 9.0f); jugador = new Jugador("04/02/2025", "Ronny", 11, "Medio Campista", 80,
 * 9.0f); jugador = new Jugador("04/02/2025", "Geovany", 7, "Medi Punta", 76,
 * 9.0f); jugador = new Jugador("04/02/2025", "Osvaldo", 10, "Medio Campista",
 * 75, 9.0f); jugador = new Jugador("04/02/2025", "Dayan", 9, "Delantero", 68,
 * 9.0f);
 * System.out.println(controlador.retornoArrayList(Arrays.toString(jugador)) +
 * '\n');
 * Jugador[] j = {
 * new Jugador("","","","","","")
 * new Jugador("","","","","","")
 * new Jugador("","","","","","")
 * new Jugador("","","","","","")
 * new Jugador("","","","","","")
 * new Jugador("","","","","","")};
 */
