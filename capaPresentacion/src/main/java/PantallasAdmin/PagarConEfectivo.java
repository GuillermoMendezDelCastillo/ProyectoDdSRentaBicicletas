/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package PantallasAdmin;

import control.ControlBicicleta;
import control.ControlRenta;
import dto.BicicletaDTO;
import dto.EmpleadoDTO;
import dto.RentaDTO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author PC Gamer
 */
public class PagarConEfectivo extends javax.swing.JPanel {
    private JFrame main;
    
    private EmpleadoDTO empleado;
    private RentaDTO renta;
  
    private ControlBicicleta cB;
    private ControlRenta controlR;
    
    
    /**
     * Creates new form PagarConEfectivo
     */
    public PagarConEfectivo(JFrame main, EmpleadoDTO empleado, RentaDTO renta) {
        initComponents();
        
        cB=new ControlBicicleta();

        this.main=main;
        this.empleado=empleado;
        this.renta=renta;
        
        controlR=new ControlRenta();
        
        total.setText(renta.getCosto()+"$");
        
        listo.setVisible(false);
        listo.setEnabled(false);
        
        btnAceptar.setVisible(false);
        btnAceptar.setEnabled(false);
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
        jLabel2 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        listo = new javax.swing.JButton();
        entregado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cambio = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        calcular = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Has el cobro");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cambio a dar:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        total.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        total.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 90, 20));

        btnAceptar.setBackground(new java.awt.Color(180, 211, 178));
        btnAceptar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(0, 0, 0));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 220, 40));

        listo.setForeground(new java.awt.Color(0, 0, 0));
        listo.setText("Hecho");
        listo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listoActionPerformed(evt);
            }
        });
        jPanel1.add(listo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 80, 30));

        entregado.setBackground(new java.awt.Color(250, 250, 250));
        entregado.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(entregado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 280, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Pago:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        cambio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cambio.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 90, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Total: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        calcular.setForeground(new java.awt.Color(0, 0, 0));
        calcular.setText("Calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });
        jPanel1.add(calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 80, 30));

        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listoActionPerformed
        // TODO add your handling code here:
        btnAceptar.setVisible(true);
        btnAceptar.setEnabled(true);
    }//GEN-LAST:event_listoActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        BicicletaDTO b=cB.buscarBicicleta(renta.getBicicleta().getId());
        System.out.println(b.toString());
        b.setEstado("En Renta");
        cB.actualizarBicicleta(b);
        renta.setBicicleta(b);
        renta=controlR.agregarRenta(renta);
        JOptionPane.showMessageDialog(this, "Pago realizado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        
        RentaConfirmada rC=new RentaConfirmada(main,true,renta,empleado);
        rC.show();  
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        // TODO add your handling code here:
        
        try{
            float dineroEntregado=Float.valueOf(entregado.getText());
            if (dineroEntregado < renta.getCosto()) {
                JOptionPane.showMessageDialog(this, "La cantidad entregada no es suficiente.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                double cambioCalculado = dineroEntregado - renta.getCosto();
                cambio.setText(String.format("%.2f $", cambioCalculado));
                listo.setVisible(true);
                listo.setEnabled(true);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa una cantidad válida.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_calcularActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        PantallaMenu p=(PantallaMenu) main;
        PanelRenta panel=new PanelRenta(main,empleado);
        p.showPanel(panel);
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton calcular;
    private javax.swing.JLabel cambio;
    private javax.swing.JTextField entregado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listo;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}