/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author mauricio
 */
public class ListBus {

    private ArrayList<Bus> buses;
    
    public ListBus() {
        buses = new ArrayList<>();
    }

    public Bus buscarBus(int id) {
        Bus busResultado = null;
        for (Bus bus : buses) {
            if (bus.getId() == id) {
                busResultado = bus;
                break;
            }
        }
        return busResultado;
    }

    public void crearBus(Bus bus){
        buses.add(bus);
    }
    
    public Bus obtenerBus(int id) {
        return this.buscarBus(id);
    }

    public boolean eliminarBus(int id) {
        Bus bus = this.buscarBus(id);
        if (bus == null) {
            return false;
        }
        buses.remove(bus);
        return true;
    }

    public boolean modificarBus(int id, Bus actualBus) {
        Bus busRes = this.buscarBus(id);
        if (busRes == null) {
            return false;
        }
        for (int i = 0; i < buses.size(); i++) {
            if (buses.get(i) == busRes) {
                buses.get(i).setKilometraje(busRes.getKilometraje());
                buses.get(i).setFechaCreacion(busRes.getFechaCreacion());
                buses.get(i).setMarca(busRes.getMarca());
                buses.get(i).setModelo(busRes.getModelo());
                break;
            }
        }
        return true;
    }
    
    public int cantidad(){
        return buses.size();
    }
    public boolean sinBuses(){
        return buses.isEmpty();
    }
}
