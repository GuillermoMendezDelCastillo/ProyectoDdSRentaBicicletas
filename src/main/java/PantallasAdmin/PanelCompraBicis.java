/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package PantallasAdmin;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author PC Gamer
 */
public class PanelCompraBicis extends javax.swing.JPanel {

    JFrame main;
    ArrayList<JButton> botones;
    ArrayList<JButton> seleccionados;
    
    /**
     * Creates new form CompraBicis
     */
    public PanelCompraBicis(JFrame main) {
        initComponents();
        this.main=main;
        botones = new ArrayList<>();
        seleccionados = new ArrayList<>();
        crearBotones();
    }
    
    private void crearBotones() {
        int numeroOpciones = 50; 

        panelBotones.setLayout(new GridLayout(0, 3, 10, 10)); 

        for (int i = 0; i < numeroOpciones; i++) {
            JButton boton = new JButton("Opción " + (i + 1));
            boton.setPreferredSize(new Dimension(200, 300)); 
            boton.setBackground(Color.LIGHT_GRAY); 

            boton.addActionListener(e -> {
                if (seleccionados.contains(boton)) {
                    boton.setBackground(Color.LIGHT_GRAY); 
                    seleccionados.remove(boton);
                } else {
                    boton.setBackground(Color.GREEN);
                    seleccionados.add(boton); 
                }
            });

            panelBotones.add(boton); 
        }


        JScrollPane scrollPane = new JScrollPane(panelBotones);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 810, 460));
    }

    public JPanel getFondo() {
            return this;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelRound1 = new Utileria.PanelRound();
        panelBotones = new Utileria.PanelRound();

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(250, 210, 105));
        jPanel2.setForeground(new java.awt.Color(255, 138, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Compra bicicleta");

        panelRound1.setBackground(new java.awt.Color(230, 230, 230));
        panelRound1.setRoundBottomLeft(100);
        panelRound1.setRoundBottomRight(100);
        panelRound1.setRoundTopLeft(100);
        panelRound1.setRoundTopRight(100);

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 580, Short.MAX_VALUE)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 60));

        panelBotones.setRoundBottomLeft(50);
        panelBotones.setRoundBottomRight(50);
        panelBotones.setRoundTopLeft(50);
        panelBotones.setRoundTopRight(50);
        panelBotones.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(panelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 810, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private Utileria.PanelRound panelBotones;
    private Utileria.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
