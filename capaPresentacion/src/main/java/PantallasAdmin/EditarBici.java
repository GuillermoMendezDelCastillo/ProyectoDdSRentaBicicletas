/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package PantallasAdmin;

import control.ControlBicicleta;
import dto.BicicletaDTO;
import dto.EmpleadoDTO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author PC Gamer
 */
public class EditarBici extends javax.swing.JPanel {

    ControlBicicleta biciBO;
    BicicletaDTO bici;
    EmpleadoDTO em;
    JFrame main;
    
    /**
     * Creates new form EditarBici
     */
    public EditarBici(JFrame main,EmpleadoDTO em, BicicletaDTO bici) {
        initComponents();
        this.biciBO=new ControlBicicleta();
        this.em=em;
        this.main=main;
        this.bici=bici;
        cargarDatos();
    }
    
    public void cargarDatos(){
        String tipo = bici.getTipo(); 
        txtTipo.setSelectedItem(tipo);
        txtRodada.setText(String.valueOf(bici.getRodado()));
        txtPrecio.setText(String.valueOf(bici.getPrecio()));
        String estado=bici.getEstado();
        this.estado.setSelectedItem(estado);
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
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRodada = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        estado = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(243, 232, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancelar.setBackground(new java.awt.Color(250, 250, 250));
        btnCancelar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 120, 40));

        btnAceptar.setBackground(new java.awt.Color(250, 250, 250));
        btnAceptar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(0, 0, 0));
        btnAceptar.setText("Confirmar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, 120, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Estado: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, -1));

        txtPrecio.setBackground(new java.awt.Color(250, 250, 250));
        txtPrecio.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 150, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Rodada:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tipo: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        txtRodada.setBackground(new java.awt.Color(250, 250, 250));
        txtRodada.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtRodada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRodadaActionPerformed(evt);
            }
        });
        jPanel1.add(txtRodada, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 180, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Editar bicicleta");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        txtTipo.setBackground(new java.awt.Color(250, 250, 250));
        txtTipo.setForeground(new java.awt.Color(0, 0, 0));
        txtTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Urbana", "De ruta", "Triatlon", "Montaña" }));
        jPanel1.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 160, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Precio:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        estado.setBackground(new java.awt.Color(250, 250, 250));
        estado.setForeground(new java.awt.Color(0, 0, 0));
        estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "En Renta" }));
        estado.setToolTipText("");
        jPanel1.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 160, 30));

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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        PantallaMenu p=(PantallaMenu) main;
        AdminBicis b=new AdminBicis(main,em);
        p.showPanel(b);
        this.disable();
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this,
            "¿Deseas guardar los cambios?",
            "Confirmar Guardado",
            JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            try {

                bici=new BicicletaDTO(bici.getId(),txtRodada.getText(),String.valueOf(txtTipo.getSelectedItem()),String.valueOf(estado.getSelectedItem()),Float.valueOf(txtPrecio.getText()));
                biciBO.actualizarBicicleta(bici);

                JOptionPane.showMessageDialog(this,
                    "Los cambios se guardaron exitosamente.",
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);
                PantallaMenu p=(PantallaMenu) main;
                AdminBicis aB=new AdminBicis(main,em);
                p.showPanel(aB);
                this.disable();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,
                    "Ocurrió un error al guardar la bicicleta: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtRodadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRodadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRodadaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtRodada;
    private javax.swing.JComboBox<String> txtTipo;
    // End of variables declaration//GEN-END:variables
}
