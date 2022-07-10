/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author mauricio
 */
public class Window extends javax.swing.JFrame {

    /**
     * Creates new form Window
     */
    public Window() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JFrame();
        jPanel12 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txtBusModelo = new javax.swing.JTextField();
        txtBusMarca = new javax.swing.JTextField();
        txtBusKilometraje = new javax.swing.JTextField();
        txtBusFechaCr = new javax.swing.JTextField();
        btnEliminarBus = new javax.swing.JButton();
        btnGuardarBus = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        txtChoferDireccion = new javax.swing.JTextField();
        txtChoferDni = new javax.swing.JTextField();
        cbxChoferGradoIns = new javax.swing.JComboBox<>();
        btnEliminarChofer = new javax.swing.JButton();
        btnGuardarChofer = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        txtHojaRutaSalida = new javax.swing.JTextField();
        txtHojaRutaIngreso = new javax.swing.JTextField();
        btnEliminarHojaRuta = new javax.swing.JButton();
        btnGuardarHojaRuta = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        txtRutaTransporteNumeroR = new javax.swing.JTextField();
        txtRutaTransporteInicioR = new javax.swing.JTextField();
        txtRutaTransporteDestinoR = new javax.swing.JTextField();
        btnEliminarRutaTransporte = new javax.swing.JButton();
        btnGuardarRutaTransporte = new javax.swing.JButton();
        cbxRutaTransporteTipoR = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();

        Login.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(204, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Login.getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 409, 310));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 204, 204));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(153, 255, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBusModelo.setBackground(new java.awt.Color(255, 255, 255));
        txtBusModelo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtBusModelo.setForeground(new java.awt.Color(0, 0, 0));
        txtBusModelo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 51, 153)), "MODELO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        txtBusModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusModeloActionPerformed(evt);
            }
        });
        jPanel6.add(txtBusModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 150, 50));

        txtBusMarca.setBackground(new java.awt.Color(255, 255, 255));
        txtBusMarca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtBusMarca.setForeground(new java.awt.Color(0, 0, 0));
        txtBusMarca.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 51, 153)), "MARCA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        txtBusMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusMarcaActionPerformed(evt);
            }
        });
        jPanel6.add(txtBusMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 150, 50));

        txtBusKilometraje.setBackground(new java.awt.Color(255, 255, 255));
        txtBusKilometraje.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtBusKilometraje.setForeground(new java.awt.Color(0, 0, 0));
        txtBusKilometraje.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 51, 153)), "KILOMETRAJE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        txtBusKilometraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusKilometrajeActionPerformed(evt);
            }
        });
        jPanel6.add(txtBusKilometraje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 40));

        txtBusFechaCr.setBackground(new java.awt.Color(255, 255, 255));
        txtBusFechaCr.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtBusFechaCr.setForeground(new java.awt.Color(0, 0, 0));
        txtBusFechaCr.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 51, 153)), "FECHA DE CREACIÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        txtBusFechaCr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusFechaCrActionPerformed(evt);
            }
        });
        jPanel6.add(txtBusFechaCr, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 170, 40));

        btnEliminarBus.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminarBus.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEliminarBus.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarBus.setText("ELIMINAR");
        jPanel6.add(btnEliminarBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 110, 30));

        btnGuardarBus.setBackground(new java.awt.Color(51, 0, 153));
        btnGuardarBus.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGuardarBus.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarBus.setText("GUARDAR");
        jPanel6.add(btnGuardarBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 110, 30));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 390, 180));

        jTabbedPane2.addTab("BUS", jPanel4);

        jPanel5.setBackground(new java.awt.Color(153, 255, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtChoferDireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtChoferDireccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtChoferDireccion.setForeground(new java.awt.Color(0, 0, 0));
        txtChoferDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 51, 153)), "DIRECCIÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        txtChoferDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChoferDireccionActionPerformed(evt);
            }
        });
        jPanel7.add(txtChoferDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 40));

        txtChoferDni.setBackground(new java.awt.Color(255, 255, 255));
        txtChoferDni.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtChoferDni.setForeground(new java.awt.Color(0, 0, 0));
        txtChoferDni.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 51, 153)), "DNI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        txtChoferDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChoferDniActionPerformed(evt);
            }
        });
        jPanel7.add(txtChoferDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 170, 40));

        cbxChoferGradoIns.setBackground(new java.awt.Color(255, 255, 255));
        cbxChoferGradoIns.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbxChoferGradoIns.setForeground(new java.awt.Color(0, 0, 0));
        cbxChoferGradoIns.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SECUNDARIA", "TÉCNICO", "UNIVERSITARIO" }));
        cbxChoferGradoIns.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GRADO INSTRUCCIÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 51, 153))); // NOI18N
        jPanel7.add(cbxChoferGradoIns, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 170, -1));

        btnEliminarChofer.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminarChofer.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEliminarChofer.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarChofer.setText("ELIMINAR");
        jPanel7.add(btnEliminarChofer, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 110, 30));

        btnGuardarChofer.setBackground(new java.awt.Color(51, 0, 153));
        btnGuardarChofer.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGuardarChofer.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarChofer.setText("GUARDAR");
        jPanel7.add(btnGuardarChofer, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 110, 30));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 390, 180));

        jTabbedPane2.addTab("CHOFER", jPanel5);

        jPanel8.setBackground(new java.awt.Color(153, 255, 204));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtHojaRutaSalida.setBackground(new java.awt.Color(255, 255, 255));
        txtHojaRutaSalida.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtHojaRutaSalida.setForeground(new java.awt.Color(0, 0, 0));
        txtHojaRutaSalida.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 51, 153)), "SALIDA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        txtHojaRutaSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHojaRutaSalidaActionPerformed(evt);
            }
        });
        jPanel9.add(txtHojaRutaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 150, 50));

        txtHojaRutaIngreso.setBackground(new java.awt.Color(255, 255, 255));
        txtHojaRutaIngreso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtHojaRutaIngreso.setForeground(new java.awt.Color(0, 0, 0));
        txtHojaRutaIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 51, 153)), "INGRESO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        txtHojaRutaIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHojaRutaIngresoActionPerformed(evt);
            }
        });
        jPanel9.add(txtHojaRutaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 40));

        btnEliminarHojaRuta.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminarHojaRuta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEliminarHojaRuta.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarHojaRuta.setText("ELIMINAR");
        jPanel9.add(btnEliminarHojaRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 110, 30));

        btnGuardarHojaRuta.setBackground(new java.awt.Color(51, 0, 153));
        btnGuardarHojaRuta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGuardarHojaRuta.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarHojaRuta.setText("GUARDAR");
        jPanel9.add(btnGuardarHojaRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 110, 30));

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 510, 130));

        jTabbedPane2.addTab("HOJA DE RUTA", jPanel8);

        jPanel10.setBackground(new java.awt.Color(153, 255, 204));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRutaTransporteNumeroR.setBackground(new java.awt.Color(255, 255, 255));
        txtRutaTransporteNumeroR.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtRutaTransporteNumeroR.setForeground(new java.awt.Color(0, 0, 0));
        txtRutaTransporteNumeroR.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 51, 153)), "NÚMERO RUTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        txtRutaTransporteNumeroR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutaTransporteNumeroRActionPerformed(evt);
            }
        });
        jPanel11.add(txtRutaTransporteNumeroR, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 150, 50));

        txtRutaTransporteInicioR.setBackground(new java.awt.Color(255, 255, 255));
        txtRutaTransporteInicioR.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtRutaTransporteInicioR.setForeground(new java.awt.Color(0, 0, 0));
        txtRutaTransporteInicioR.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 51, 153)), "INICIO RUTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        txtRutaTransporteInicioR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutaTransporteInicioRActionPerformed(evt);
            }
        });
        jPanel11.add(txtRutaTransporteInicioR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 40));

        txtRutaTransporteDestinoR.setBackground(new java.awt.Color(255, 255, 255));
        txtRutaTransporteDestinoR.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtRutaTransporteDestinoR.setForeground(new java.awt.Color(0, 0, 0));
        txtRutaTransporteDestinoR.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 51, 153)), "DESTINO RUTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        txtRutaTransporteDestinoR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutaTransporteDestinoRActionPerformed(evt);
            }
        });
        jPanel11.add(txtRutaTransporteDestinoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 170, 40));

        btnEliminarRutaTransporte.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminarRutaTransporte.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEliminarRutaTransporte.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarRutaTransporte.setText("ELIMINAR");
        jPanel11.add(btnEliminarRutaTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 110, 30));

        btnGuardarRutaTransporte.setBackground(new java.awt.Color(51, 0, 153));
        btnGuardarRutaTransporte.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGuardarRutaTransporte.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarRutaTransporte.setText("GUARDAR");
        jPanel11.add(btnGuardarRutaTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 110, 30));

        cbxRutaTransporteTipoR.setBackground(new java.awt.Color(255, 255, 255));
        cbxRutaTransporteTipoR.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbxRutaTransporteTipoR.setForeground(new java.awt.Color(0, 0, 0));
        cbxRutaTransporteTipoR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxRutaTransporteTipoR.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TIPO RUTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 51, 153))); // NOI18N
        jPanel11.add(cbxRutaTransporteTipoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 68, 170, -1));

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 390, 180));

        jTabbedPane2.addTab("RUTA DE TRANSPORTE", jPanel10);

        jPanel2.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 380));

        jTabbedPane1.addTab("GESTIÓN UNIDADES", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("OPERACIONES", jPanel3);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 380));

        jTabbedPane1.addTab("REPORTES", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBusModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusModeloActionPerformed

    private void txtBusMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusMarcaActionPerformed

    private void txtBusKilometrajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusKilometrajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusKilometrajeActionPerformed

    private void txtBusFechaCrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusFechaCrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusFechaCrActionPerformed

    private void txtChoferDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChoferDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChoferDireccionActionPerformed

    private void txtChoferDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChoferDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChoferDniActionPerformed

    private void txtHojaRutaSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHojaRutaSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHojaRutaSalidaActionPerformed

    private void txtHojaRutaIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHojaRutaIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHojaRutaIngresoActionPerformed

    private void txtRutaTransporteNumeroRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutaTransporteNumeroRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutaTransporteNumeroRActionPerformed

    private void txtRutaTransporteInicioRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutaTransporteInicioRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutaTransporteInicioRActionPerformed

    private void txtRutaTransporteDestinoRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutaTransporteDestinoRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutaTransporteDestinoRActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Login;
    public javax.swing.JButton btnEliminarBus;
    public javax.swing.JButton btnEliminarChofer;
    public javax.swing.JButton btnEliminarHojaRuta;
    public javax.swing.JButton btnEliminarRutaTransporte;
    public javax.swing.JButton btnGuardarBus;
    public javax.swing.JButton btnGuardarChofer;
    public javax.swing.JButton btnGuardarHojaRuta;
    public javax.swing.JButton btnGuardarRutaTransporte;
    public javax.swing.JComboBox<String> cbxChoferGradoIns;
    public javax.swing.JComboBox<String> cbxRutaTransporteTipoR;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    public javax.swing.JTextField txtBusFechaCr;
    public javax.swing.JTextField txtBusKilometraje;
    public javax.swing.JTextField txtBusMarca;
    public javax.swing.JTextField txtBusModelo;
    public javax.swing.JTextField txtChoferDireccion;
    public javax.swing.JTextField txtChoferDni;
    public javax.swing.JTextField txtHojaRutaIngreso;
    public javax.swing.JTextField txtHojaRutaSalida;
    public javax.swing.JTextField txtRutaTransporteDestinoR;
    public javax.swing.JTextField txtRutaTransporteInicioR;
    public javax.swing.JTextField txtRutaTransporteNumeroR;
    // End of variables declaration//GEN-END:variables
}