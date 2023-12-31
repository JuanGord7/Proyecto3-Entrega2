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
public class CreaSede extends javax.swing.JFrame {
    ImportarExportar modeloE = new ImportarExportar();
    DefaultTableModel nuevTabl;
    /**
     * Creates new form CreaSede
     */
    public CreaSede() {
        initComponents();
        nuevTabl=new DefaultTableModel();
        nuevTabl.addColumn("Numero");
        nuevTabl.addColumn("Nombre");
        nuevTabl.addColumn("Ubicación");
        nuevTabl.addColumn("Hora Apertura");
        nuevTabl.addColumn("Hora Cierre");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        CreaSedLb = new javax.swing.JLabel();
        NomSedLb = new javax.swing.JLabel();
        UbiSedLb = new javax.swing.JLabel();
        HorApLb = new javax.swing.JLabel();
        HorCieLb = new javax.swing.JLabel();
        UbiTf = new javax.swing.JTextField();
        HorATf = new javax.swing.JTextField();
        HorCTf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDatos = new javax.swing.JTable();
        CreaSedeBtn = new javax.swing.JButton();
        NombTf = new javax.swing.JTextField();
        VolverBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CreaSedLb.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        CreaSedLb.setText("Crear Sede");

        NomSedLb.setBackground(new java.awt.Color(255, 255, 255));
        NomSedLb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        NomSedLb.setText("Nombre de la sede:");

        UbiSedLb.setBackground(new java.awt.Color(255, 255, 255));
        UbiSedLb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        UbiSedLb.setText("Ubicación de la sede:");

        HorApLb.setBackground(new java.awt.Color(255, 255, 255));
        HorApLb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        HorApLb.setText("Hora de apertura:");

        HorCieLb.setBackground(new java.awt.Color(255, 255, 255));
        HorCieLb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        HorCieLb.setText("Hora de cierre:");

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

        CreaSedeBtn.setBackground(new java.awt.Color(0, 0, 0));
        CreaSedeBtn.setForeground(new java.awt.Color(255, 255, 255));
        CreaSedeBtn.setText("Crear Sede");
        CreaSedeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreaSedeBtnActionPerformed(evt);
            }
        });

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
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(CreaSedeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                            .addComponent(VolverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(UbiSedLb)
                                .addComponent(NomSedLb, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(HorApLb, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(HorCieLb, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(UbiTf, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                .addComponent(HorATf)
                                .addComponent(HorCTf)
                                .addComponent(NombTf))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(CreaSedLb)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(359, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(CreaSedLb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomSedLb)
                    .addComponent(NombTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UbiSedLb)
                    .addComponent(UbiTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HorApLb)
                    .addComponent(HorATf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HorCieLb)
                    .addComponent(HorCTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CreaSedeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(VolverBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(262, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreaSedeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreaSedeBtnActionPerformed
        String nombreArchivo = "Sedes.xlsx";
        File archivo = new File(nombreArchivo);
        if (archivo.getName().endsWith("xls") || archivo.getName().endsWith("xlsx")) {
            modeloE.Importar(archivo, jtDatos);
        } else {
            JOptionPane.showMessageDialog(null, "Elija un formato valido.");
        }
        String []info=new String[5];
        for (int i=0; i<jtDatos.getRowCount(); i++){
            String Numero = String.valueOf(i+1);
            String Nombre = String.valueOf(jtDatos.getValueAt(i, 1));
            String Ubi = String.valueOf(jtDatos.getValueAt(i, 2));
            String HorA = String.valueOf(jtDatos.getValueAt(i, 3));
            String HorC = String.valueOf(jtDatos.getValueAt(i, 4));
            info[0]=Numero;
            info[1]=Nombre;
            info[2]=Ubi;
            info[3]=HorA;
            info[4]=HorC;
            nuevTabl.addRow(info);
        }
        info[0]=String.valueOf(nuevTabl.getRowCount()+1);
        info[1]=NombTf.getText();
        info[2]=UbiTf.getText();
        info[3]=HorATf.getText();
        info[4]=HorCTf.getText();
        nuevTabl.addRow(info);
        this.jtDatos.setModel(nuevTabl);
        if (archivo.getName().endsWith("xls") || archivo.getName().endsWith("xlsx")) {
            modeloE.Exportar(archivo, jtDatos);
        } else {
            JOptionPane.showMessageDialog(null, "Elija un formato valido.");
        }
        JOptionPane.showMessageDialog(null, "Ha agregado una sede al sistema.");
        AdminGeneral ventaAdminGen = new AdminGeneral();
        ventaAdminGen.setVisible(true);
        ventaAdminGen.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_CreaSedeBtnActionPerformed

    private void VolverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBtnActionPerformed
        AdminGeneral ventaAdminGen = new AdminGeneral();
        ventaAdminGen.setVisible(true);
        ventaAdminGen.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_VolverBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CreaSedLb;
    private javax.swing.JButton CreaSedeBtn;
    private javax.swing.JTextField HorATf;
    private javax.swing.JLabel HorApLb;
    private javax.swing.JTextField HorCTf;
    private javax.swing.JLabel HorCieLb;
    private javax.swing.JLabel NomSedLb;
    private javax.swing.JTextField NombTf;
    private javax.swing.JLabel UbiSedLb;
    private javax.swing.JTextField UbiTf;
    private javax.swing.JButton VolverBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    public javax.swing.JTable jtDatos;
    // End of variables declaration//GEN-END:variables
}
