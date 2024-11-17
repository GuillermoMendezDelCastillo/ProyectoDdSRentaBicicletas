/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package PantallasAdmin;

import control.ControlBicicleta;
import dto.EmpleadoDTO;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author PC Gamer
 */
public class PanelRenta extends javax.swing.JPanel {
    private JFrame main;
    private EmpleadoDTO empleadoDto;
    
    /**
     * Creates new form PanelRenta
     */
    public PanelRenta(JFrame main, EmpleadoDTO empleadoDto) {
        initComponents();
        this.main=main;
        this.empleadoDto = empleadoDto;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound3 = new Utileria.PanelRound();
        panelRound5 = new Utileria.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbTiempo = new javax.swing.JComboBox<>();
        txtTotal = new javax.swing.JTextField();
        botonRentar = new javax.swing.JToggleButton();
        btnSeleccionar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pswContrasena = new javax.swing.JPasswordField();
        txtCorreo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        panelRound2 = new Utileria.PanelRound();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        panelRound3.setBackground(new java.awt.Color(255, 255, 255));
        panelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound5.setBackground(new java.awt.Color(230, 230, 230));
        panelRound5.setRoundBottomLeft(50);
        panelRound5.setRoundBottomRight(50);
        panelRound5.setRoundTopLeft(50);
        panelRound5.setRoundTopRight(50);
        panelRound5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("Tiempo:");
        panelRound5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setText("Bicicleta:");
        panelRound5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setText("Total:");
        panelRound5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, -1, -1));

        cbTiempo.setBackground(new java.awt.Color(250, 250, 250));
        cbTiempo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelRound5.add(cbTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 254, -1));

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(250, 250, 250));
        txtTotal.setEnabled(false);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        panelRound5.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 244, -1));

        botonRentar.setBackground(new java.awt.Color(210, 210, 210));
        botonRentar.setText("Rentar");
        botonRentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRentarActionPerformed(evt);
            }
        });
        panelRound5.add(botonRentar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 138, -1));

        btnSeleccionar.setBackground(new java.awt.Color(255, 174, 105));
        btnSeleccionar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        panelRound5.add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 161, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("Correo");
        panelRound5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setText("Cliente:");
        panelRound5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setText("Contraseña");
        panelRound5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));
        panelRound5.add(pswContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 210, -1));
        panelRound5.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 240, -1));

        panelRound3.add(panelRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 800, 450));

        jPanel2.setBackground(new java.awt.Color(250, 210, 105));
        jPanel2.setForeground(new java.awt.Color(255, 138, 0));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel12.setText("Rentar Bicicleta");

        panelRound2.setBackground(new java.awt.Color(230, 230, 230));
        panelRound2.setRoundBottomLeft(100);
        panelRound2.setRoundBottomRight(100);
        panelRound2.setRoundTopLeft(100);
        panelRound2.setRoundTopRight(100);

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 591, Short.MAX_VALUE)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel12)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelRound3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 60));

        jButton4.setText("jButton1");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panelRound3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 4, 50, 50));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelRound3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 70, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void botonRentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRentarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRentarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        // TODO add your handling code here:
        
        ControlBicicleta c = new ControlBicicleta();// prueba
        System.out.println(c.obtenerBicicletasDisponibles());// prueba
        
        SeleccionarBicicleta sb= new SeleccionarBicicleta(main,true, main);
        sb.show();
        
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    
    public JPanel getFondo() {
            return this;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botonRentar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JComboBox<String> cbTiempo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private Utileria.PanelRound panelRound2;
    private Utileria.PanelRound panelRound3;
    private Utileria.PanelRound panelRound5;
    private javax.swing.JPasswordField pswContrasena;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
