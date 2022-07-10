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
public class ListHojaRuta {
    
    private ArrayList<HojaRuta> hojasRuta;
    
    public ListHojaRuta(){
        hojasRuta = new ArrayList<>();
    }
    
    public void crearHojaRuta(HojaRuta hr){
        hojasRuta.add(hr);
    }
}
