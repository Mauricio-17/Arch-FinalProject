/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Bus;
import Main.Main;
import models.Chofer;
import models.HojaRuta;
import models.RutaTransporte;
import view.Window;

/**
 *
 * @author mauricio
 */
public class GestionUnidadController implements ActionListener {

    private Window view;

    public GestionUnidadController(Window view) {
        this.view = view;

        // evento de los botones
        this.view.btnGuardarBus.addActionListener(this);
        this.view.btnEliminarBus.addActionListener(this);
        this.view.btnGuardarChofer.addActionListener(this);
        this.view.btnEliminarChofer.addActionListener(this);
        this.view.btnGuardarHojaRuta.addActionListener(this);
        this.view.btnEliminarHojaRuta.addActionListener(this);
        this.view.btnGuardarRutaTransporte.addActionListener(this);
        this.view.btnEliminarRutaTransporte.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // ----------------- BUS -------------------
        // Registro 
        if (this.view.btnGuardarBus == e.getSource()) {
            Bus bus = new Bus();
            bus.setId(Bus.instances);
            bus.setFechaCreacion(this.view.txtBusFechaCr.getText());
            bus.setKilometraje(Integer.parseInt(this.view.txtBusKilometraje.getText()));
            bus.setMarca(this.view.txtBusMarca.getText());
            bus.setModelo(this.view.txtBusModelo.getText());

            Main.listaBus.crearBus(bus);
        }

        // ---------------- CHOFER ------------------------
        // Registro
        else if (this.view.btnGuardarChofer == e.getSource()) {
            Chofer chofer = new Chofer();
            chofer.setId(Bus.instances);
            chofer.setDni(this.view.txtChoferDni.getText());
            chofer.setDireccion(this.view.txtChoferDireccion.getText());
            chofer.setGradoInstruccion(this.view.txtBusMarca.getText());

            Main.listaChofer.crearChofer(chofer);
        }
        
        // ---------------- HOJA RUTA ------------------------
        // Registro
        else if (this.view.btnGuardarHojaRuta == e.getSource()) {
            HojaRuta hojaRuta = new HojaRuta();
            hojaRuta.setId(Bus.instances);
            hojaRuta.setIngreso(this.view.txtHojaRutaIngreso.getText());
            hojaRuta.setSalida(this.view.txtHojaRutaSalida.getText());
            
            Main.listaHojaRuta.crearHojaRuta(hojaRuta);
        }
        
        // ---------------- RUTA DE TRANSPORTE ------------------------
        // Registro
        else if (this.view.btnGuardarChofer == e.getSource()) {
            RutaTransporte rutaTransporte = new RutaTransporte();
            rutaTransporte.setId(Bus.instances);
            rutaTransporte.setInicioRuta(this.view.txtRutaTransporteInicioR.getText());
            rutaTransporte.setDestinoRuta(this.view.txtRutaTransporteDestinoR.getText());
            rutaTransporte.setNumeroRuta(this.view.txtRutaTransporteNumeroR.getText());
            rutaTransporte.setTipoRuta(this.view.cbxRutaTransporteTipoR.getSelectedItem().toString());
            
            Main.listaRutaTransporte.crearRutaTransporte(rutaTransporte);
        }
    }

}
