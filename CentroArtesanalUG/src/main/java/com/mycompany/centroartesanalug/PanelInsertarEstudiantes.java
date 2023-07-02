package com.mycompany.centroartesanalug;

import java.awt.Choice;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;


public class PanelInsertarEstudiantes extends javax.swing.JPanel {


    public PanelInsertarEstudiantes() {
        initComponents();
        mostrarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        PanelBusqueda = new javax.swing.JPanel();
        lblBusqueda = new javax.swing.JLabel();
        TxtBuscarEstudiante = new javax.swing.JTextField();
        PanelAdmision = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblAdmision = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        TxtSegundoNombre = new javax.swing.JTextField();
        TxtSegundoApellido = new javax.swing.JTextField();
        TxtPrimerApellido = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        lblApellido2 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        TxtEdad = new javax.swing.JTextField();
        lblCorreoElectronico = new javax.swing.JLabel();
        TxtIdPersona = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        TxtCedula = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        TxtDireccion = new javax.swing.JTextField();
        lblCedula = new javax.swing.JLabel();
        TxtTelefono = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        TxtCorreoElectronico = new javax.swing.JTextField();
        lblNivelEducacion = new javax.swing.JLabel();
        ChcNivelEducacion = new java.awt.Choice();
        PanelBotonesAdmision = new javax.swing.JPanel();
        BtnRegistrarEstudiante = new javax.swing.JButton();
        BtnActualizarEstudiante = new javax.swing.JButton();
        BtnEliminarEstudiante = new javax.swing.JButton();
        TxtPrimerNombre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblEstudiantesBuscador = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        PanelBotonesExtras = new javax.swing.JPanel();
        BtnReconeccionServidor = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        BtnActualizarVentana = new javax.swing.JButton();

        setBackground(new java.awt.Color(38, 38, 38));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setToolTipText("");
        setAutoscrolls(true);
        setName("BusquedaIngresoEstudiantes"); // NOI18N

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        PanelBusqueda.setBackground(new java.awt.Color(68, 70, 84));
        PanelBusqueda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblBusqueda.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        lblBusqueda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBusqueda.setText("Busqueda");
        lblBusqueda.setToolTipText("");

        TxtBuscarEstudiante.setToolTipText("");

        javax.swing.GroupLayout PanelBusquedaLayout = new javax.swing.GroupLayout(PanelBusqueda);
        PanelBusqueda.setLayout(PanelBusquedaLayout);
        PanelBusquedaLayout.setHorizontalGroup(
            PanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBusquedaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblBusqueda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtBuscarEstudiante)
                .addContainerGap())
        );
        PanelBusquedaLayout.setVerticalGroup(
            PanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtBuscarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        PanelAdmision.setBackground(new java.awt.Color(68, 70, 84));
        PanelAdmision.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Primer Nombre");

        lblAdmision.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblAdmision.setForeground(new java.awt.Color(255, 255, 255));
        lblAdmision.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdmision.setText("ADMISION DE ESTUDIANTES");
        lblAdmision.setToolTipText("");

        lblNombre2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombre2.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre2.setText("Segundo Nombre");

        TxtSegundoNombre.setToolTipText("");

        TxtSegundoApellido.setToolTipText("");

        TxtPrimerApellido.setToolTipText("");

        lblApellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(255, 255, 255));
        lblApellido.setText("Primer Apellido");

        lblApellido2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblApellido2.setForeground(new java.awt.Color(255, 255, 255));
        lblApellido2.setText("Segundo Apellido");

        lblId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setText("ID");

        TxtEdad.setToolTipText("");

        lblCorreoElectronico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCorreoElectronico.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreoElectronico.setText("Correo Electronico");

        TxtIdPersona.setForeground(new java.awt.Color(153, 0, 0));
        TxtIdPersona.setText("0");
        TxtIdPersona.setToolTipText("");

        lblEdad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEdad.setForeground(new java.awt.Color(255, 255, 255));
        lblEdad.setText("Edad");

        TxtCedula.setToolTipText("");

        lblDireccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccion.setText("Direccion");

        TxtDireccion.setToolTipText("");

        lblCedula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(255, 255, 255));
        lblCedula.setText("Cedula");

        TxtTelefono.setToolTipText("");

        lblTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefono.setText("Telefono");

        TxtCorreoElectronico.setToolTipText("");

        lblNivelEducacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNivelEducacion.setForeground(new java.awt.Color(255, 255, 255));
        lblNivelEducacion.setText("Nivel de Educacion");

        ChcNivelEducacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ChcNivelEducacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChcNivelEducacionMouseClicked(evt);
            }
        });

        PanelBotonesAdmision.setBackground(new java.awt.Color(68, 70, 84));
        PanelBotonesAdmision.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BtnRegistrarEstudiante.setBackground(new java.awt.Color(169, 191, 78));
        BtnRegistrarEstudiante.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnRegistrarEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegistrarEstudiante.setText("REGISTRAR");
        BtnRegistrarEstudiante.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnRegistrarEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRegistrarEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRegistrarEstudianteMouseClicked(evt);
            }
        });

        BtnActualizarEstudiante.setBackground(new java.awt.Color(169, 191, 78));
        BtnActualizarEstudiante.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnActualizarEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        BtnActualizarEstudiante.setText("ACTUALIZAR");
        BtnActualizarEstudiante.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnActualizarEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BtnEliminarEstudiante.setBackground(new java.awt.Color(153, 0, 0));
        BtnEliminarEstudiante.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnEliminarEstudiante.setForeground(new java.awt.Color(204, 204, 204));
        BtnEliminarEstudiante.setText("ELIMINAR");
        BtnEliminarEstudiante.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnEliminarEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout PanelBotonesAdmisionLayout = new javax.swing.GroupLayout(PanelBotonesAdmision);
        PanelBotonesAdmision.setLayout(PanelBotonesAdmisionLayout);
        PanelBotonesAdmisionLayout.setHorizontalGroup(
            PanelBotonesAdmisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesAdmisionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnRegistrarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnActualizarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnEliminarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelBotonesAdmisionLayout.setVerticalGroup(
            PanelBotonesAdmisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesAdmisionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBotonesAdmisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnRegistrarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnActualizarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEliminarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TxtPrimerNombre.setToolTipText("");

        javax.swing.GroupLayout PanelAdmisionLayout = new javax.swing.GroupLayout(PanelAdmision);
        PanelAdmision.setLayout(PanelAdmisionLayout);
        PanelAdmisionLayout.setHorizontalGroup(
            PanelAdmisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAdmisionLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(PanelAdmisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelAdmisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAdmision))
                    .addGroup(PanelAdmisionLayout.createSequentialGroup()
                        .addComponent(TxtPrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelAdmisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(PanelAdmisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelAdmisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelAdmisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtEdad)))
                    .addComponent(TxtDireccion)
                    .addGroup(PanelAdmisionLayout.createSequentialGroup()
                        .addGroup(PanelAdmisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtIdPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelAdmisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelAdmisionLayout.createSequentialGroup()
                                .addComponent(TxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelAdmisionLayout.createSequentialGroup()
                                .addComponent(lblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(lblCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelAdmisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelAdmisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ChcNivelEducacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PanelAdmisionLayout.createSequentialGroup()
                                .addComponent(lblNivelEducacion)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(PanelBotonesAdmision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(722, Short.MAX_VALUE))
        );
        PanelAdmisionLayout.setVerticalGroup(
            PanelAdmisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAdmisionLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblAdmision)
                .addGap(23, 23, 23)
                .addGroup(PanelAdmisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelAdmisionLayout.createSequentialGroup()
                        .addGroup(PanelAdmisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre2)
                            .addComponent(lblApellido)
                            .addComponent(lblApellido2)
                            .addComponent(lblEdad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelAdmisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtPrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelAdmisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCorreoElectronico)
                            .addGroup(PanelAdmisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblId)
                                .addComponent(lblCedula)
                                .addComponent(lblTelefono)
                                .addComponent(lblNivelEducacion)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelAdmisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtIdPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ChcNivelEducacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDireccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelBotonesAdmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(259, Short.MAX_VALUE))
        );

        TblEstudiantesBuscador.setForeground(new java.awt.Color(0, 0, 0));
        TblEstudiantesBuscador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        TblEstudiantesBuscador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TblEstudiantesBuscador.setSelectionBackground(new java.awt.Color(204, 204, 204));
        TblEstudiantesBuscador.setSelectionForeground(new java.awt.Color(51, 51, 51));
        TblEstudiantesBuscador.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        TblEstudiantesBuscador.getTableHeader().setResizingAllowed(false);
        TblEstudiantesBuscador.getTableHeader().setReorderingAllowed(false);
        TblEstudiantesBuscador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblEstudiantesBuscadorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TblEstudiantesBuscador);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(PanelAdmision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelAdmision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        PanelBotonesExtras.setBackground(new java.awt.Color(68, 70, 84));
        PanelBotonesExtras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BtnReconeccionServidor.setBackground(new java.awt.Color(169, 191, 78));
        BtnReconeccionServidor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnReconeccionServidor.setForeground(new java.awt.Color(255, 255, 255));
        BtnReconeccionServidor.setText("RECONECTAR");
        BtnReconeccionServidor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnReconeccionServidor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BtnSalir.setBackground(new java.awt.Color(153, 0, 0));
        BtnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnSalir.setForeground(new java.awt.Color(204, 204, 204));
        BtnSalir.setText("SALIR");
        BtnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BtnActualizarVentana.setBackground(new java.awt.Color(169, 191, 78));
        BtnActualizarVentana.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnActualizarVentana.setForeground(new java.awt.Color(255, 255, 255));
        BtnActualizarVentana.setText("ACTUALIZAR");
        BtnActualizarVentana.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnActualizarVentana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout PanelBotonesExtrasLayout = new javax.swing.GroupLayout(PanelBotonesExtras);
        PanelBotonesExtras.setLayout(PanelBotonesExtrasLayout);
        PanelBotonesExtrasLayout.setHorizontalGroup(
            PanelBotonesExtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesExtrasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBotonesExtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnReconeccionServidor, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(BtnActualizarVentana, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelBotonesExtrasLayout.setVerticalGroup(
            PanelBotonesExtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesExtrasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnReconeccionServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnActualizarVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelBotonesExtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelBotonesExtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

    private void ChcNivelEducacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChcNivelEducacionMouseClicked
        
        ChcNivelEducacion.removeAll();

        // Agrega los nuevos elementos
        ChcNivelEducacion.addItem("Inicial");
        ChcNivelEducacion.addItem("Basica");
        ChcNivelEducacion.addItem("Media");
        ChcNivelEducacion.addItem("Superior");
        // Agrega tantos elementos como desees

        // Actualiza la interfaz gráfica
        ChcNivelEducacion.revalidate();
        ChcNivelEducacion.repaint();
    }//GEN-LAST:event_ChcNivelEducacionMouseClicked

    private void BtnRegistrarEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRegistrarEstudianteMouseClicked
        
        String primerNombre = (TxtPrimerNombre.getText());
        String segundoNombre = TxtSegundoNombre.getText();
        String primerApellido = TxtPrimerApellido.getText();
        String segundoApellido = TxtSegundoApellido.getText();
        int edad = Integer.parseInt(TxtEdad.getText());
        String cedula = TxtCedula.getText();
        String correoElectronico = TxtCorreoElectronico.getText();
        String telefono = TxtTelefono.getText();
        String nivelEducacion = ChcNivelEducacion.getSelectedItem();
        String direccion = TxtDireccion.getText();        
        
        Estudiante nuevoEstudiante = new Estudiante(primerNombre, segundoNombre, primerApellido, segundoApellido, edad, cedula,correoElectronico,telefono,nivelEducacion,direccion);

        Conexion conexion = new Conexion();
            
        
        try {
            //conexion.abriConnection();
            //Connection connection = DriverManager.getConnection(conexion.connectionUrl);
            EstudianteInsert estudiante = new EstudianteInsert(conexion.abriConnection());
            estudiante.insertarEstudiante(nuevoEstudiante);
            JOptionPane.showMessageDialog(null, "Usuario insertado correctamente.");
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al insertar el usuario: " + ex.getMessage());
        }finally{
            conexion.cerrarConnection();
        }                   
    }//GEN-LAST:event_BtnRegistrarEstudianteMouseClicked

    private void TblEstudiantesBuscadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblEstudiantesBuscadorMouseClicked
        
        
        
        
        
        
        
    }//GEN-LAST:event_TblEstudiantesBuscadorMouseClicked

    
void mostrarDatos() {
    try {
        
        Conexion conexion = new Conexion();
        Connection cn = conexion.abriConnection();

        String consulta = "EXECUTE MostrarAdmision";
        String[] cabecera = {"id","Primer Nombre","Segundo Nombre","Primer Apellido","Segundo Apellido","Edad","Cedula","Correo Electronico","Telefono","Nivel Educacion","Direccion","Estado"};
        DefaultTableModel tabla = new DefaultTableModel(null, cabecera){            
            public boolean isCellEditable(int row, int column) {
            return false;
            }          
        };
        Statement st = cn.createStatement();

        ResultSet rs = st.executeQuery(consulta);

        
        
        
        String[] datos = new String[12];
        
        while (rs.next()) {
            String idPersona = rs.getString("IdPersona");
            datos[0] = idPersona;          
            String primerNombre = rs.getString("PrimerNombre");
            datos[1] = primerNombre;
            String segundoNombre = rs.getString("SegundoNombre");
            datos[2] = segundoNombre;
            String primerApellido = rs.getString("PrimerApellido");
            datos[3] = primerApellido;          
            String segundoApellido = rs.getString("SegundoApellido");
            datos[4] = segundoApellido;
            String edad = rs.getString("Edad");
            datos[5] = edad;
            String cedula = rs.getString("Cedula");
            datos[6] = cedula;          
            String correoElectronico = rs.getString("CorreoElectronico");
            datos[7] = correoElectronico;
            String telefono = rs.getString("Telefono");
            datos[8] = telefono;
            String niverEducacion = rs.getString("NivelEducacion");
            datos[9] = niverEducacion;          
            String direccion = rs.getString("Direccion");
            datos[10] = direccion;
            String estado = rs.getString("Estado");
            datos[11] = estado;
            
            
            tabla.addRow(datos);            
        }

        TblEstudiantesBuscador.setModel(tabla);
    } catch (Exception ex) {
        System.out.print(ex.getMessage());
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton BtnActualizarEstudiante;
    javax.swing.JButton BtnActualizarVentana;
    javax.swing.JButton BtnEliminarEstudiante;
    javax.swing.JButton BtnReconeccionServidor;
    javax.swing.JButton BtnRegistrarEstudiante;
    javax.swing.JButton BtnSalir;
    java.awt.Choice ChcNivelEducacion;
    javax.swing.JPanel PanelAdmision;
    javax.swing.JPanel PanelBotonesAdmision;
    javax.swing.JPanel PanelBotonesExtras;
    javax.swing.JPanel PanelBusqueda;
    javax.swing.JTable TblEstudiantesBuscador;
    javax.swing.JTextField TxtBuscarEstudiante;
    javax.swing.JTextField TxtCedula;
    javax.swing.JTextField TxtCorreoElectronico;
    javax.swing.JTextField TxtDireccion;
    javax.swing.JTextField TxtEdad;
    javax.swing.JTextField TxtIdPersona;
    javax.swing.JTextField TxtPrimerApellido;
    javax.swing.JTextField TxtPrimerNombre;
    javax.swing.JTextField TxtSegundoApellido;
    javax.swing.JTextField TxtSegundoNombre;
    javax.swing.JTextField TxtTelefono;
    javax.swing.JPanel jPanel4;
    javax.swing.JPanel jPanel5;
    javax.swing.JScrollPane jScrollPane2;
    javax.swing.JLabel lblAdmision;
    javax.swing.JLabel lblApellido;
    javax.swing.JLabel lblApellido2;
    javax.swing.JLabel lblBusqueda;
    javax.swing.JLabel lblCedula;
    javax.swing.JLabel lblCorreoElectronico;
    javax.swing.JLabel lblDireccion;
    javax.swing.JLabel lblEdad;
    javax.swing.JLabel lblId;
    javax.swing.JLabel lblNivelEducacion;
    javax.swing.JLabel lblNombre;
    javax.swing.JLabel lblNombre2;
    javax.swing.JLabel lblTelefono;
    // End of variables declaration//GEN-END:variables
}