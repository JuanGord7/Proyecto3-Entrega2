/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

import java.io.File;
import javax.swing.JOptionPane;
import logica.ImportarExportar;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author jumag
 */
public class AgrCarro extends javax.swing.JFrame {
    ImportarExportar modeloE = new ImportarExportar();
    DefaultTableModel nuevTabl;
    /**
     * Creates new form AgrCarro
     */
    public AgrCarro() {
        initComponents();
        nuevTabl=new DefaultTableModel();
        nuevTabl.addColumn("Placa");
        nuevTabl.addColumn("Marca");
        nuevTabl.addColumn("Color");
        nuevTabl.addColumn("Transmisión");
        nuevTabl.addColumn("Categoría");
        nuevTabl.addColumn("Número de sede");
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
        PlacaTf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        MarcaTf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ColorTf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TransTf = new javax.swing.JTextField();
        NumSeTf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CateTf = new javax.swing.JTextField();
        AgrCarroBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDatos = new javax.swing.JTable();
        VolverBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel1.setText("Agregar Carro");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("Placa:");

        PlacaTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlacaTfActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("Marca:");

        MarcaTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcaTfActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setText("Color:");

        ColorTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorTfActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setText("Transmisión:");

        TransTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransTfActionPerformed(evt);
            }
        });

        NumSeTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumSeTfActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setText("Categoría:");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setText("Número de sede:");

        CateTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CateTfActionPerformed(evt);
            }
        });

        AgrCarroBtn.setBackground(new java.awt.Color(0, 0, 0));
        AgrCarroBtn.setForeground(new java.awt.Color(255, 255, 255));
        AgrCarroBtn.setText("Agregar Carro");
        AgrCarroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgrCarroBtnActionPerformed(evt);
            }
        });

        jtDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Contraseña"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtDatos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtDatos);

        VolverBtn.setBackground(new java.awt.Color(0, 0, 0));
        VolverBtn.setForeground(new java.awt.Color(255, 255, 255));
        VolverBtn.setText("Volver");
        VolverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(AgrCarroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(VolverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CateTf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MarcaTf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PlacaTf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ColorTf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TransTf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NumSeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel1)))))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(329, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(PlacaTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(MarcaTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ColorTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(TransTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumSeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CateTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgrCarroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VolverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(243, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ColorTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ColorTfActionPerformed

    private void PlacaTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlacaTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlacaTfActionPerformed

    private void TransTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TransTfActionPerformed

    private void MarcaTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcaTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MarcaTfActionPerformed

    private void NumSeTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumSeTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumSeTfActionPerformed

    private void CateTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CateTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CateTfActionPerformed

    private void AgrCarroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgrCarroBtnActionPerformed
        String nombreArchivo = "Vehiculos.xlsx";
        File archivo = new File(nombreArchivo);
        if (archivo.getName().endsWith("xls") || archivo.getName().endsWith("xlsx")) {
            modeloE.Importar(archivo, jtDatos); // Elimina la línea que muestra el mensaje
        } else {
            JOptionPane.showMessageDialog(null, "Elija un formato valido.");
        }
        String []info=new String[6];
        for (int i=0; i<jtDatos.getRowCount(); i++){
            String Placa = String.valueOf(jtDatos.getValueAt(i, 0));
            String Marca = String.valueOf(jtDatos.getValueAt(i, 1));
            String Color = String.valueOf(jtDatos.getValueAt(i, 2));
            String Trans = String.valueOf(jtDatos.getValueAt(i, 3));
            String Cate = String.valueOf(jtDatos.getValueAt(i, 4));
            String Numse = String.valueOf(jtDatos.getValueAt(i, 5));
            info[0]=Placa;
            info[1]=Marca;
            info[2]=Color;
            info[3]=Trans;
            info[4]=Cate;
            info[5]=Numse;
            nuevTabl.addRow(info);
        }
        info[0]=PlacaTf.getText();
        info[1]=MarcaTf.getText();
        info[2]=ColorTf.getText();
        info[3]=TransTf.getText();
        info[4]=CateTf.getText();
        info[5]=NumSeTf.getText();
        nuevTabl.addRow(info);
        this.jtDatos.setModel(nuevTabl);
        if (archivo.getName().endsWith("xls") || archivo.getName().endsWith("xlsx")) {
            modeloE.Exportar(archivo, jtDatos); // Elimina la línea que muestra el mensaje
        } else {
            JOptionPane.showMessageDialog(null, "Elija un formato valido.");
        }
        JOptionPane.showMessageDialog(null, "Ha agregado un vehículo al sistema.");
        AdminGeneral ventaAdminGen = new AdminGeneral();
        ventaAdminGen.setVisible(true);
        ventaAdminGen.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_AgrCarroBtnActionPerformed

    private void VolverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBtnActionPerformed
        AdminGeneral ventaAdminGen = new AdminGeneral();
        ventaAdminGen.setVisible(true);
        ventaAdminGen.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_VolverBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgrCarroBtn;
    private javax.swing.JTextField CateTf;
    private javax.swing.JTextField ColorTf;
    private javax.swing.JTextField MarcaTf;
    private javax.swing.JTextField NumSeTf;
    private javax.swing.JTextField PlacaTf;
    private javax.swing.JTextField TransTf;
    private javax.swing.JButton VolverBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtDatos;
    // End of variables declaration//GEN-END:variables
}
