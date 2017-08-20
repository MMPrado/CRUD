/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Dell Latitude
 */
public class Mensaje {
    private int idMensaje;
    private String fecha;
    private String numeroOrogen;
    private String horaRecepcion;
    private String contenido;
    private String leido;
    private int tamaño;

    public Mensaje(int idMensaje, String fecha, String numeroOrogen, String horaRecepcion, String contenido, String leido, int tamaño) {
        this.idMensaje = idMensaje;
        this.fecha = fecha;
        this.numeroOrogen = numeroOrogen;
        this.horaRecepcion = horaRecepcion;
        this.contenido = contenido;
        this.leido = leido;
        this.tamaño = tamaño;
    }

    public int getIdMensaje() {
        return idMensaje;
    }

    public String getFecha() {
        return fecha;
    }

    public String getNumeroOrogen() {
        return numeroOrogen;
    }

    public String getHoraRecepcion() {
        return horaRecepcion;
    }

    public String getContenido() {
        return contenido;
    }

    public String getLeido() {
        return leido;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setNumeroOrogen(String numeroOrogen) {
        this.numeroOrogen = numeroOrogen;
    }

    public void setHoraRecepcion(String horaRecepcion) {
        this.horaRecepcion = horaRecepcion;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setLeido(String leido) {
        this.leido = leido;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    

    
    
    
            
}
