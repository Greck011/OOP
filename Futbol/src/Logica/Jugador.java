
package Logica;

/**
 *
 * @author greiv
 */
public class Jugador {
    private String fecha;
    private String nombreJugador;
    private int numero;
    private String posicion;
    private int peso;
    private float porcentajeGrasa;

    public Jugador(String fecha, String nombreJugador, int numero, String posicion, int peso, float porcentajeGrasa) {
        this.fecha = fecha;
        this.nombreJugador = nombreJugador;
        this.numero = numero;
        this.posicion = posicion;
        this.peso = peso;
        this.porcentajeGrasa = porcentajeGrasa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getPorcentajeGrasa() {
        return porcentajeGrasa;
    }

    public void setPorcentajeGrasa(float porcentajeGrasa) {
        this.porcentajeGrasa = porcentajeGrasa;
    }

    @Override
    public String toString() {
        return "Jugador { " + " fecha = " + fecha + ", nombreJugador = " 
                + nombreJugador + ", numero = " + numero + ", posicion = "
                + posicion + ", peso = " + peso + ", porcentajeGrasa = " 
                + porcentajeGrasa + '}';
    } 
}
