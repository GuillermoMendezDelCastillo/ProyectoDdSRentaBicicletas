/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package PantallasAdmin;

import control.ControlRenta;
import dto.EmpleadoDTO;
import dto.RentaDTO;
import javax.swing.JFrame;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import dto.BicicletaDTO;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author PC Gamer
 */
public class RentaConfirmada extends javax.swing.JDialog {

    private EmpleadoDTO empleado;
    private RentaDTO rentaDto;
    private ControlRenta controlRenta;
    private JFrame main;
    
    private BicicletaDTO bici;
    private boolean compra;
    
    /**
     * Creates new form RentaConfirmadaJFrame
     */
    public RentaConfirmada(java.awt.Frame parent, boolean modal, RentaDTO rentaDto, EmpleadoDTO empleado) {
        super(parent, modal);
        initComponents();
        this.rentaDto = rentaDto;
        this.empleado = empleado;
        this.main = (JFrame) parent;
        this.compra = false;
        this.setLocationRelativeTo(null);

        initInfoLabel();
        generarTicket();
    }
    
    public RentaConfirmada(java.awt.Frame parent, boolean modal, BicicletaDTO bici, EmpleadoDTO empleado) {
        super(parent, modal);
        initComponents();
        this.bici = bici;
        this.empleado = empleado;
        this.main = (JFrame) parent;
        this.compra = true; 
        this.setLocationRelativeTo(null);

        initInfoLabel();
        generarTicket();
    }

    private void initInfoLabel() {
        rentalInfoLabel = new JLabel(getInfoText());
        rentalInfoLabel.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 16));
        rentalInfoLabel.setForeground(new java.awt.Color(0, 0, 0)); 

        a.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        a.add(rentalInfoLabel);
        a.revalidate();
        a.repaint();
    }
    
    public void generarTicket() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fechaFormateada = sdf.format(new java.util.Date());
            Document document = new Document();

            String fileName = compra
                ? "CompraTicket " + bici.getId() + " " + fechaFormateada + ".pdf"
                : "RentaTicket " + rentaDto.getId() + " " + fechaFormateada + ".pdf";

            PdfWriter.getInstance(document, new FileOutputStream(fileName));
            document.open();

            document.add(new Paragraph(compra ? "Compra Confirmada" : "Renta Confirmada", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 24)));
            document.add(new Paragraph("\n"));

            if (compra) {
                document.add(new Paragraph("Bicicleta ID: " + bici.getId()));
                document.add(new Paragraph("Tipo de Bicicleta: " + bici.getTipo()));
                document.add(new Paragraph("Costo: " + bici.getPrecio()));
                document.add(new Paragraph("Cliente: " + bici.getCliente().getNombre()));
                document.add(new Paragraph("Correo del Cliente: " + bici.getCliente().getCorreo()));
                document.add(new Paragraph("Telefono del Cliente: " + bici.getCliente().getTelefono()));
                document.add(new Paragraph("Empleado: " + empleado.getNombre()));
                document.add(new Paragraph("Fecha de Compra: " + fechaFormateada));
                document.add(new Paragraph("\nGracias por su compra.", FontFactory.getFont(FontFactory.HELVETICA_OBLIQUE, 12)));
            } else {
                document.add(new Paragraph("Renta ID: " + rentaDto.getId()));
                document.add(new Paragraph("Cliente: " + rentaDto.getCliente().getNombre()));
                document.add(new Paragraph("Teléfono del Cliente: " + rentaDto.getCliente().getTelefono()));
                document.add(new Paragraph("Empleado: " + empleado.getNombre()));
                document.add(new Paragraph("Fecha de Renta: " + fechaFormateada));
                document.add(new Paragraph("Tipo de Bicicleta: " + rentaDto.getBicicleta().getTipo()));
                document.add(new Paragraph("Tipo de Pago: " + rentaDto.getMetodoPago()));
                document.add(new Paragraph("Costo Total: " + rentaDto.getCosto() + "$"));

                if (rentaDto.getTiempo() == 30) {
                    document.add(new Paragraph("Tiempo: 30 minutos"));
                } else {
                    document.add(new Paragraph("Tiempo: " + rentaDto.getTiempo() + " horas"));
                }

                document.add(new Paragraph("\nGracias por su preferencia.", FontFactory.getFont(FontFactory.HELVETICA_OBLIQUE, 12)));
            }

            document.close();
            JOptionPane.showMessageDialog(this, "PDF generado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al generar el PDF: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private String getInfoText() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fechaFormateada = sdf.format(new java.util.Date());

        StringBuilder infoText = new StringBuilder();
        infoText.append("<html>");

        if (compra) {
            infoText.append("<b>Bicicleta ID:</b> ").append(bici.getId()).append("<br>");
            infoText.append("<b>Tipo de Bicicleta:</b> ").append(bici.getTipo()).append("<br>");
            infoText.append("<b>Costo:</b> ").append(bici.getPrecio()).append("<br>");
            infoText.append("<b>Cliente:</b> ").append(bici.getCliente().getNombre()).append("<br>");
            infoText.append("<b>Correo del Cliente:</b> ").append(bici.getCliente().getCorreo()).append("<br>");
            infoText.append("<b>Telefono del Cliente:</b> ").append(bici.getCliente().getTelefono()).append("<br>");
            infoText.append("<b>Empleado:</b> ").append(empleado.getNombre()).append("<br>");
            infoText.append("<b>Fecha de Compra:</b> ").append(fechaFormateada).append("<br>");
        } else {
            infoText.append("<b>Renta ID:</b> ").append(rentaDto.getId()).append("<br>");
            infoText.append("<b>Cliente:</b> ").append(rentaDto.getCliente().getNombre()).append("<br>");
            infoText.append("<b>Teléfono del Cliente:</b> ").append(rentaDto.getCliente().getTelefono()).append("<br>");
            infoText.append("<b>Empleado:</b> ").append(empleado.getNombre()).append("<br>");
            infoText.append("<b>Fecha de Renta:</b> ").append(fechaFormateada).append("<br>");
            infoText.append("<b>Tipo de Bicicleta:</b> ").append(rentaDto.getBicicleta().getTipo()).append("<br>");
            infoText.append("<b>Tipo de Pago:</b> ").append(rentaDto.getMetodoPago()).append("<br>");
            infoText.append("<b>Costo Total:</b> ").append(rentaDto.getCosto()).append("<br>");

            if (rentaDto.getTiempo() == 30) {
                infoText.append("<b>Tiempo:</b> 30 minutos<br>");
            } else {
                infoText.append("<b>Tiempo:</b> ").append(rentaDto.getTiempo()).append(" horas<br>");
            }
        }

        infoText.append("</html>");
        return infoText.toString();
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
        a = new Utileria.PanelRound();
        rentalInfoLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Renta Confirmada");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        a.setBackground(new java.awt.Color(230, 230, 230));
        a.setRoundBottomLeft(50);
        a.setRoundBottomRight(50);
        a.setRoundTopLeft(50);
        a.setRoundTopRight(50);

        javax.swing.GroupLayout aLayout = new javax.swing.GroupLayout(a);
        a.setLayout(aLayout);
        aLayout.setHorizontalGroup(
            aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(rentalInfoLabel)
                .addContainerGap(614, Short.MAX_VALUE))
        );
        aLayout.setVerticalGroup(
            aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(rentalInfoLabel)
                .addContainerGap(230, Short.MAX_VALUE))
        );

        jPanel1.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 650, 270));

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 180, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PantallaMenu pM=(PantallaMenu) main;
        PanelRenta p=new PanelRenta(main,empleado);
        pM.showPanel(p);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    private String getRentalInfoText() {
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fechaFormateada = sdf.format(rentaDto.getFecha());
        StringBuilder infoText = new StringBuilder();
        
        infoText.append("<html>");
        if (compra) {
            infoText.append("<b>Bicicleta ID:</b> ").append(bici.getId()).append("<br>");
            infoText.append("<b>Tipo de Bicicleta:</b> ").append(bici.getTipo()).append("<br>");
            infoText.append("<b>Costo:</b> ").append(bici.getPrecio()).append("<br>");
            infoText.append("<b>Cliente:</b> ").append(bici.getCliente().getNombre()).append("<br>");
            infoText.append("<b>Correo del Cliente:</b> ").append(bici.getCliente().getCorreo()).append("<br>");
            infoText.append("<b>Telefono del Cliente:</b> ").append(bici.getCliente().getTelefono()).append("<br>");
            infoText.append("<b>Empleado:</b> ").append(empleado.getNombre()).append("<br>");
            infoText.append("<b>Fecha de Compra:</b> ").append(fechaFormateada).append("<br>");
        } else {
            // Info for "Renta"
            infoText.append("<b>Renta ID:</b> ").append(rentaDto.getId()).append("<br>");
            infoText.append("<b>Cliente:</b> ").append(rentaDto.getCliente().getNombre()).append("<br>");
            infoText.append("<b>Teléfono del Cliente:</b> ").append(rentaDto.getCliente().getTelefono()).append("<br>");
            infoText.append("<b>Empleado:</b> ").append(empleado.getNombre()).append("<br>");
            infoText.append("<b>Fecha de Renta:</b> ").append(fechaFormateada).append("<br>");
            infoText.append("<b>Tipo de Bicicleta:</b> ").append(rentaDto.getBicicleta().getTipo()).append("<br>");
            infoText.append("<b>Tipo de Pago:</b> ").append(rentaDto.getMetodoPago()).append("<br>");
            infoText.append("<b>Costo Total:</b> ").append(rentaDto.getCosto()).append("<br>");

            if (rentaDto.getTiempo() == 30) {
                infoText.append("<b>Tiempo:</b> 30 minutos<br>");
            } else {
                infoText.append("<b>Tiempo:</b> ").append(rentaDto.getTiempo()).append(" horas<br>");
            }
        }
        infoText.append("</html>");
        return infoText.toString();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Utileria.PanelRound a;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel rentalInfoLabel;
    // End of variables declaration//GEN-END:variables
}
