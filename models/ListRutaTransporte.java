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
public class ListRutaTransporte {
    
    private ArrayList<RutaTransporte> rutasTransporte;
    
    public ListRutaTransporte(){
        rutasTransporte = new ArrayList<>();
    }
    
    public void crearRutaTransporte(RutaTransporte rt){
        rutasTransporte.add(rt);
    }
}
