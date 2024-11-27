/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package PantallasAdmin;

import control.ControlRenta;
import dto.EmpleadoDTO;
import dto.RentaDTO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author PC Gamer
 */
public class PagarConTarjeta extends javax.swing.JPanel {
    JFrame main;
    
    EmpleadoDTO empleado;
    RentaDTO renta;
    
    private javax.swing.Timer tiempo;
    private int posicion = 0;
    
    private ControlRenta controlR;
    
    /**
     * Creates new form PagarConTarjeta
     */
    public PagarConTarjeta(JFrame main, EmpleadoDTO empleado, RentaDTO renta) {
        initComponents();
        this.main=main;
        this.empleado=empleado;
        this.renta=renta;
        
        controlR=new ControlRenta();

        btnAceptar.setVisible(false);
        btnAceptar.setEnabled(false);
        
        tiempo();
        
        main.setFocusable(true);
    this.setFocusable(true);

    main.addKeyListener(new java.awt.event.KeyAdapter() {
        @Override
        public void keyPressed(java.awt.event.KeyEvent evt) {
            if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_P) {
                System.out.println("p");  
                jPanel2.setVisible(false);
                btnAceptar.setVisible(true);
                btnAceptar.setEnabled(true);
            }
        }
    });
    this.requestFocusInWindow();
    }   
    
    
    private void tiempo() {
        tiempo = new javax.swing.Timer(100, e -> barraCarga());
        tiempo.start();
    }
    
    private void barraCarga() {
        posicion += 10;

        if (posicion > 550) {
            posicion = 0; 
        }

        jPanel3.setSize(posicion, 40);
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
        jLabel1 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Inserte la tarjeta en la terminal");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        btnAceptar.setBackground(new java.awt.Color(173, 216, 230));
        btnAceptar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(0, 0, 0));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 180, 50));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 570, 60));

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

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        try{
        controlR.agregarRenta(renta);
           
        RentaConfirmada rC=new RentaConfirmada(main,true,renta,empleado);
        rC.show(); 
        
        JOptionPane.showMessageDialog(null, "Pago confirmado y renta exitosa", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        
        }catch(Exception  e){JOptionPane.showMessageDialog(null, "Ocurrió un error al procesar la renta: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_btnAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
