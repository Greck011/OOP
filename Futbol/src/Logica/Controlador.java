package Logica;

import java.util.ArrayList;

/**
 *
 * @author greiv
 */
public class Controlador {

    ArrayList<Jugador> jugadores = new ArrayList<>();

    public void capturarArrayList(Jugador jugador) {
        jugadores.add(jugador);
    }

    //Metodo para retormar los datos.
    public String retornoArrayList(String retornar) {

        for (int contador = 0; contador < jugadores.size(); contador++) {
            retornar += jugadores.get(contador).toString();
        }
        return retornar;
    }
}
