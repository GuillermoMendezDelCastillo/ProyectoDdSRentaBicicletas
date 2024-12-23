/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PantallasAdmin;

import dto.EmpleadoDTO;
import javax.swing.JPanel;

/**
 *
 * @author PC Gamer
 */
public class PantallaMenu extends javax.swing.JFrame {
    private EmpleadoDTO empleadoDto;
    private PanelRenta b;
    
    /**
     * Creates new form PantallaMenu
     */
    public PantallaMenu(EmpleadoDTO empleadoDto) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.empleadoDto = empleadoDto;
    }
    
    public PantallaMenu(EmpleadoDTO empleadoDto,JPanel panel) {
        initComponents();
        this.setLocationRelativeTo(null);
        showPanel(panel);
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
        panelRound4 = new Utileria.PanelRound();
        btnComprarBicicleta = new javax.swing.JButton();
        btnRentarBicicleta = new javax.swing.JButton();
        btnAdminBicicleta = new javax.swing.JButton();
        btnAdminClientes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        dashBoard = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelRound3.setBackground(new java.awt.Color(255, 255, 255));
        panelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound4.setBackground(new java.awt.Color(243, 232, 255));
        panelRound4.setRoundBottomLeft(50);
        panelRound4.setRoundBottomRight(50);
        panelRound4.setRoundTopLeft(50);
        panelRound4.setRoundTopRight(50);

        btnComprarBicicleta.setBackground(new java.awt.Color(204, 153, 255));
        btnComprarBicicleta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnComprarBicicleta.setText("Comprar bicicleta");
        btnComprarBicicleta.setPreferredSize(new java.awt.Dimension(200, 50));
        btnComprarBicicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarBicicletaActionPerformed(evt);
            }
        });

        btnRentarBicicleta.setBackground(new java.awt.Color(204, 153, 255));
        btnRentarBicicleta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRentarBicicleta.setText("Renta Bicicleta");
        btnRentarBicicleta.setPreferredSize(new java.awt.Dimension(200, 50));
        btnRentarBicicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentarBicicletaActionPerformed(evt);
            }
        });

        btnAdminBicicleta.setBackground(new java.awt.Color(204, 153, 255));
        btnAdminBicicleta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdminBicicleta.setText("Administrar bicicletas");
        btnAdminBicicleta.setPreferredSize(new java.awt.Dimension(200, 50));
        btnAdminBicicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminBicicletaActionPerformed(evt);
            }
        });

        btnAdminClientes.setBackground(new java.awt.Color(204, 153, 255));
        btnAdminClientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdminClientes.setText("Administrar clientes");
        btnAdminClientes.setPreferredSize(new java.awt.Dimension(200, 50));
        btnAdminClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound4Layout = new javax.swing.GroupLayout(panelRound4);
        panelRound4.setLayout(panelRound4Layout);
        panelRound4Layout.setHorizontalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnRentarBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnComprarBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdminBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdminClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );
        panelRound4Layout.setVerticalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComprarBicicleta, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(btnRentarBicicleta, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(btnAdminBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnAdminClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );

        panelRound3.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 900, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Bienvenido");
        panelRound3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        dashBoard.setBackground(new java.awt.Color(230, 230, 230));

        javax.swing.GroupLayout dashBoardLayout = new javax.swing.GroupLayout(dashBoard);
        dashBoard.setLayout(dashBoardLayout);
        dashBoardLayout.setHorizontalGroup(
            dashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        dashBoardLayout.setVerticalGroup(
            dashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        panelRound3.add(dashBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 850, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, 899, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprarBicicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarBicicletaActionPerformed
        // TODO add your handling code here:
        
        CompraRentaBicis c = new CompraRentaBicis(this,1,empleadoDto);
        showPanel(c);
    }//GEN-LAST:event_btnComprarBicicletaActionPerformed

    private void btnRentarBicicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentarBicicletaActionPerformed
        // TODO add your handling code here:
        b = new PanelRenta(this,empleadoDto);
        showPanel(b);
    }//GEN-LAST:event_btnRentarBicicletaActionPerformed

    private void btnAdminBicicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminBicicletaActionPerformed
        // TODO add your handling code here:
        AdminBicis c=new AdminBicis(this,empleadoDto);
        showPanel(c);
    }//GEN-LAST:event_btnAdminBicicletaActionPerformed

    private void btnAdminClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminClientesActionPerformed
        // TODO add your handling code here:
        AdminClientes c=new AdminClientes(this,empleadoDto);
        showPanel(c);
    }//GEN-LAST:event_btnAdminClientesActionPerformed
    
    public void showPanel(JPanel p){
        p.setSize(850, 550);
        p.setLocation(0, 0);
        dashBoard.removeAll();
        dashBoard.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        dashBoard.revalidate();
        dashBoard.repaint();
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminBicicleta;
    private javax.swing.JButton btnAdminClientes;
    private javax.swing.JButton btnComprarBicicleta;
    private javax.swing.JButton btnRentarBicicleta;
    private javax.swing.JPanel dashBoard;
    private javax.swing.JLabel jLabel2;
    private Utileria.PanelRound panelRound3;
    private Utileria.PanelRound panelRound4;
    // End of variables declaration//GEN-END:variables
}
