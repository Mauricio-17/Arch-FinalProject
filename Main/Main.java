/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import controllers.GestionUnidadController;
import models.ListBus;
import models.ListChofer;
import models.ListHojaRuta;
import models.ListRutaTransporte;
import view.Window;

/**
 *
 * @author mauricio
 */
public class Main {
    
    public static ListBus listaBus = new ListBus();
    public static ListChofer listaChofer = new ListChofer();
    public static ListHojaRuta listaHojaRuta = new ListHojaRuta();
    public static ListRutaTransporte listaRutaTransporte = new ListRutaTransporte();    
    public static Window vista = new Window();
    
    public static void main(String[] args) {
        
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        GestionUnidadController guc = new GestionUnidadController(vista);
        
    }
}
