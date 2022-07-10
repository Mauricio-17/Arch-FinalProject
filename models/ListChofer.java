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
public class ListChofer {
    
    private ArrayList<Chofer> choferes;
    
    public ListChofer(){
        choferes = new ArrayList<>();
    }
    
    public void crearChofer(Chofer chofer){
        choferes.add(chofer);
    }
}
