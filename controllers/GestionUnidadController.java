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
import java.util.ArrayList;
import javax.swing.JOptionPane;
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

    public String getBusData() {
        String data = "";
        ArrayList<Bus> listaBus = Main.listaBus.getList();
        for (Bus bus : listaBus) {
            data += "\n"+bus;
            data += "\n--------------------";
        }
        return data;
    }

    public void resetBus() {
        view.txtAreaBus.setText(getBusData());
        view.txtBusFechaCr.setText("");
        view.txtBusBuscar.setText("");
        view.txtBusKilometraje.setText("");
        view.txtBusMarca.setText("");
        view.txtBusModelo.setText("");
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // ----------------- BUS -------------------
        // Registro 
        if (this.view.btnGuardarBus == e.getSource()) {
            Bus bus = new Bus();
            bus.setId(Bus.instances);
            bus.setFechaCreacion(this.view.txtBusFechaCr.getText());
            bus.setKilometraje(Float.parseFloat(this.view.txtBusKilometraje.getText()));
            bus.setMarca(this.view.txtBusMarca.getText());
            bus.setModelo(this.view.txtBusModelo.getText());

            Main.listaBus.crearBus(bus);
            resetBus();
            
        } else if (this.view.btnEliminarBus == e.getSource()) {
            int id = Integer.parseInt(this.view.txtBusBuscar.getText());

            if (Main.listaBus.eliminarBus(id)) {
                JOptionPane.showMessageDialog(null, "Eliminación exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar");
            }
            resetBus();
            
        } else if (this.view.btnModificarBus == e.getSource()) {
            int id = Integer.parseInt(this.view.txtBusBuscar.getText());

            Bus bus = new Bus();
            bus.setId(id);
            bus.setFechaCreacion(this.view.txtBusFechaCr.getText());
            bus.setKilometraje(Integer.parseInt(this.view.txtBusKilometraje.getText()));
            bus.setMarca(this.view.txtBusMarca.getText());
            bus.setModelo(this.view.txtBusModelo.getText());

            if (Main.listaBus.modificarBus(id, bus)) {
                JOptionPane.showMessageDialog(null, "Actualización exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar");
            }
            resetBus();
            
        } else if (this.view.btnBuscarBus == e.getSource()) {

            int id = Integer.parseInt(this.view.txtBusBuscar.getText());
            Bus bus = Main.listaBus.obtenerBus(id);
            if (bus != null) {
                view.txtBusFechaCr.setText(bus.getFechaCreacion());
                view.txtBusKilometraje.setText(String.valueOf(bus.getKilometraje()));
                view.txtBusMarca.setText(bus.getMarca());
                view.txtBusModelo.setText(bus.getModelo());
            }

        } // ---------------- CHOFER ------------------------
        // Registro
        else if (this.view.btnGuardarChofer == e.getSource()) {
            Chofer chofer = new Chofer();
            chofer.setId(Bus.instances);
            chofer.setDni(this.view.txtChoferDni.getText());
            chofer.setDireccion(this.view.txtChoferDireccion.getText());
            chofer.setGradoInstruccion(this.view.txtBusMarca.getText());

            Main.listaChofer.crearChofer(chofer);
        } // ---------------- HOJA RUTA ------------------------
        // Registro
        else if (this.view.btnGuardarHojaRuta == e.getSource()) {
            HojaRuta hojaRuta = new HojaRuta();
            hojaRuta.setId(Bus.instances);
            hojaRuta.setIngreso(this.view.txtHojaRutaIngreso.getText());
            hojaRuta.setSalida(this.view.txtHojaRutaSalida.getText());

            Main.listaHojaRuta.crearHojaRuta(hojaRuta);
        } // ---------------- RUTA DE TRANSPORTE ------------------------
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
