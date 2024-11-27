/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package PantallasAdmin;

import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import control.ControlBicicleta;
import control.ControlRenta;
import dto.BicicletaDTO;
import dto.EmpleadoDTO;
import dto.RentaDTO;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.FileOutputStream;
import java.sql.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author PC Gamer
 */
public class AdminBicis extends javax.swing.JPanel {
    //Controles
    ControlBicicleta biciBO;
    ControlRenta rentaBO;
    //Pantallas
    JFrame main;
    //DTOS
    EmpleadoDTO empleado;
    List<BicicletaDTO> bicis;
    //Tabla
    DefaultTableModel tableModel;
    
    /**
     * Creates new form AdminBicis
     */
    public AdminBicis(JFrame main,EmpleadoDTO empleado) {
        initComponents();
        
        rentaBO=new ControlRenta();
        biciBO=new ControlBicicleta();
        
        this.main=main;
        this.empleado=empleado;
        
        configurarTabla();
        cargarDatos();
    }

    
    
     public JPanel getFondo() {
            return this;
    }
     
    private void cargarDatos() {
        bicis = biciBO.obtenerTodasLasBicicletas();
        System.out.println("Bicicletas obtenidas: " + bicis);
        for (BicicletaDTO bici : bicis) {
            agregarFila(bici.getTipo(),bici.getEstado(), String.valueOf(bici.getPrecio()), bici.getRodado());
        }
    }

    private void configurarTabla() {
        tableModel = new DefaultTableModel(
            new Object[]{"Tipo","Estado", "Precio", "Servicio", "Acciones"},
            0
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 4; 
            }
        };

        jTable1.setModel(tableModel);
        
        //El tamaño de la linea de los datos
        jTable1.setRowHeight(30);
        
        
        jTable1.getColumn("Acciones").setCellRenderer((table, value, isSelected, hasFocus, row, column) -> {
            JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 0));
            JButton btnEditar = new JButton("Editar");
            JButton btnEliminar = new JButton("Eliminar");
            
            btnEditar.setBackground(new Color(173, 216, 230)); 
            btnEliminar.setBackground(new Color(255, 182, 193));

            btnEditar.addActionListener(e -> editarFila(row));
            btnEliminar.addActionListener(e -> eliminarFila(row));

            panel.add(btnEditar);
            panel.add(btnEliminar);

            return panel;
        });

        jTable1.getColumn("Acciones").setCellEditor(new DefaultCellEditor(new JCheckBox()) {
            private final JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 0));
            private final JButton btnEditar = new JButton("Editar");
            private final JButton btnEliminar = new JButton("Eliminar");

            {
                btnEditar.addActionListener(e -> {
                    int row = jTable1.getSelectedRow();
                    editarFila(row);
                    fireEditingStopped();
                });

                btnEliminar.addActionListener(e -> {
                    int row = jTable1.getSelectedRow();
                    eliminarFila(row);
                    fireEditingStopped();
                });

                panel.add(btnEditar);
                panel.add(btnEliminar);
            }

            @Override
            public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
                return panel;
            }
        });
    }

    private void editarFila(int row) {
        BicicletaDTO biciSeleccionada = bicis.get(row);
        EditarBici editarBici = new EditarBici(main, empleado, biciSeleccionada);
        PantallaMenu p=(PantallaMenu) main;
        p.showPanel(editarBici);
        this.disable();
    }

    private void eliminarFila(int row) {
        int confirm = JOptionPane.showConfirmDialog(this, "¿Eliminar esta bicicleta?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            biciBO.eliminarBicicleta(bicis.get(row).getId());
            configurarTabla();
            cargarDatos();
        }
    }

    private void agregarFila(String tipo,String estado, String precio, String servicio) {
        tableModel.addRow(new Object[]{tipo,estado, precio, servicio, "Acciones"});
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        rSDateChooser1 = new rojeru_san.componentes.RSDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rSDateChooser2 = new rojeru_san.componentes.RSDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(204, 169, 221));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Estado", "Precio", "Servicio", "Acciones"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 750, 350));

        jButton2.setBackground(new java.awt.Color(199, 254, 198));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Agregar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 120, -1));

        jPanel2.setBackground(new java.awt.Color(255, 194, 105));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSDateChooser1.setColorBackground(new java.awt.Color(0, 0, 0));
        rSDateChooser1.setColorButtonHover(new java.awt.Color(0, 0, 0));
        rSDateChooser1.setColorForeground(new java.awt.Color(255, 174, 105));
        jPanel2.add(rSDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 205, 28));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Fecha inicio:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fecha fin:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        rSDateChooser2.setColorBackground(new java.awt.Color(0, 0, 0));
        rSDateChooser2.setColorButtonHover(new java.awt.Color(0, 0, 0));
        rSDateChooser2.setColorForeground(new java.awt.Color(255, 174, 105));
        jPanel2.add(rSDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 229, 28));

        jButton1.setBackground(new java.awt.Color(255, 174, 105));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Generar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 96, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Generar reporte de las rentas: ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 760, 110));

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        AgregarBici aB=new AgregarBici(main,empleado);
         PantallaMenu pM=(PantallaMenu) main;
         pM.showPanel(aB.getFondo());
         this.disable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Date fechaInicioUtil = new Date(rSDateChooser1.getDatoFecha().getYear(),rSDateChooser1.getDatoFecha().getMonth(),rSDateChooser1.getDatoFecha().getDate()); 
        Date fechaFinUtil = new Date(rSDateChooser2.getDatoFecha().getYear(),rSDateChooser2.getDatoFecha().getMonth(),rSDateChooser2.getDatoFecha().getDate());

        if (fechaInicioUtil == null || fechaFinUtil == null) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione ambas fechas.");
            return;
        }

        if (fechaInicioUtil.after(fechaFinUtil)) {
            JOptionPane.showMessageDialog(this, "La fecha inicial debe ser antes de la fecha final.");
            return;
        }

        java.sql.Date fechaActual = new java.sql.Date(System.currentTimeMillis());
        if (fechaFinUtil.after(fechaActual)) {
            JOptionPane.showMessageDialog(this, "La fecha final no puede ser un día después de la fecha actual.");
            return;
        }

        java.sql.Date fechaInicio = new java.sql.Date(fechaInicioUtil.getTime());
        java.sql.Date fechaFin = new java.sql.Date(fechaFinUtil.getTime());

        generarReporte(fechaInicio, fechaFin);
    }                                    

    private void generarReporte(java.sql.Date fechaInicio, java.sql.Date fechaFin) {
        List<RentaDTO> rentas = rentaBO.buscarEntreFechas(fechaInicio, fechaFin);
        Double totalDia = 0.0,totalGeneral = 0.0;
        
        
        if (rentas != null && !rentas.isEmpty()) {
                try {
                     java.sql.Date fecha = new java.sql.Date(System.currentTimeMillis());
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    Document document = new Document();
                    PdfWriter.getInstance(document, new FileOutputStream("Reporte_Rentas_" + sdf.format(fechaInicio) + "_a_" + sdf.format(fechaFin) + ".pdf"));
                    document.open();

                    document.add(new Paragraph("Reporte de Rentas", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 24)));
                    document.add(new Paragraph("Fecha del Reporte: " + sdf.format(fecha)));
                    document.add(new Paragraph("\n"));

                    for (RentaDTO rentaDto : rentas) {
                        String fechaFormateada = sdf.format(rentaDto.getFecha());
                        double costoRenta = rentaDto.getCosto();

                        document.add(new Paragraph("Renta ID: " + rentaDto.getId()));
                        document.add(new Paragraph("Cliente: " + rentaDto.getCliente().getNombre()));
                        document.add(new Paragraph("Teléfono del Cliente: " + rentaDto.getCliente().getTelefono()));
                        document.add(new Paragraph("Empleado: " + rentaDto.getEmpleado().getNombre()));
                        document.add(new Paragraph("Fecha de Renta: " + fechaFormateada));

                        document.add(new Paragraph("Tipo de Bicicleta: " + rentaDto.getBicicleta().getTipo()));
                        document.add(new Paragraph("Tipo de Pago: " + rentaDto.getMetodoPago()));
                        document.add(new Paragraph("Costo Total: " + costoRenta + "$"));

                        if (rentaDto.getTiempo() == 30) {
                            document.add(new Paragraph("Tiempo: 30 minutos"));
                        } else {
                            document.add(new Paragraph("Tiempo: " + rentaDto.getTiempo() + " horas"));
                        }

                        totalDia += costoRenta;
                        totalGeneral += costoRenta;

                        document.add(new Paragraph("\n"));
                    }

                    document.add(new Paragraph("Total del día (" + sdf.format(fechaInicio) + "): " + totalDia + "$", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12)));
                    document.add(new Paragraph("\n"));

                    document.add(new Paragraph("Total General: " + totalGeneral + "$", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12)));
                    document.add(new Paragraph("\nGracias por su preferencia.", FontFactory.getFont(FontFactory.HELVETICA_OBLIQUE, 12)));

                    document.close();
                    JOptionPane.showMessageDialog(this, "PDF generado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al generar el PDF: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se encontraron rentas para el rango de fechas seleccionado.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private rojeru_san.componentes.RSDateChooser rSDateChooser1;
    private rojeru_san.componentes.RSDateChooser rSDateChooser2;
    // End of variables declaration//GEN-END:variables
}
