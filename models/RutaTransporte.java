/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author mauricio
 */
public class RutaTransporte {

    private int id;
    private String inicioRuta;
    private String destinoRuta;
    private String numeroRuta;
    private String tipoRuta;

    public static int instances = 0;

    public RutaTransporte() {
        RutaTransporte.instances ++;
    }

    public String getTipoRuta() {
        return tipoRuta;
    }

    public void setTipoRuta(String tipoRuta) {
        this.tipoRuta = tipoRuta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInicioRuta() {
        return inicioRuta;
    }

    public void setInicioRuta(String inicioRuta) {
        this.inicioRuta = inicioRuta;
    }

    public String getDestinoRuta() {
        return destinoRuta;
    }

    public void setDestinoRuta(String destinoRuta) {
        this.destinoRuta = destinoRuta;
    }

    public String getNumeroRuta() {
        return numeroRuta;
    }

    public void setNumeroRuta(String numeroRuta) {
        this.numeroRuta = numeroRuta;
    }

}
