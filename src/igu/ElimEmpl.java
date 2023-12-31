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
public class ElimEmpl extends javax.swing.JFrame {
    ImportarExportar modeloE = new ImportarExportar();
    DefaultTableModel nuevTabl;
    /**
     * Creates new form ElimEmpl
     */
    public ElimEmpl() {
        initComponents();
        nuevTabl=new DefaultTableModel();
        nuevTabl.addColumn("Usuario");
        nuevTabl.addColumn("Contraseña");
        nuevTabl.addColumn("Rol");
        nuevTabl.addColumn("Sede");
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
        ElimEmplBtn = new javax.swing.JButton();
        UsuTf = new javax.swing.JTextField();
        UsuLb = new javax.swing.JLabel();
        ElimEmpLb = new javax.swing.JLabel();
        VolverBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ElimEmplBtn.setBackground(new java.awt.Color(0, 0, 0));
        ElimEmplBtn.setForeground(new java.awt.Color(255, 255, 255));
        ElimEmplBtn.setText("Eliminar Empleado");
        ElimEmplBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElimEmplBtnActionPerformed(evt);
            }
        });

        UsuLb.setBackground(new java.awt.Color(255, 255, 255));
        UsuLb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        UsuLb.setText("Usuario:");

        ElimEmpLb.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        ElimEmpLb.setText("Eliminar Empleado");

        VolverBtn.setBackground(new java.awt.Color(0, 0, 0));
        VolverBtn.setForeground(new java.awt.Color(255, 255, 255));
        VolverBtn.setText("Volver");
        VolverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverBtnActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ElimEmpLb)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ElimEmplBtn)
                                .addGap(18, 18, 18)
                                .addComponent(VolverBtn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(UsuLb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(UsuTf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(292, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ElimEmpLb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsuTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsuLb))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ElimEmplBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VolverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(107, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ElimEmplBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElimEmplBtnActionPerformed
        String nombreArchivo = "Datos.xlsx";
        File archivo = new File(nombreArchivo);
        if (archivo.getName().endsWith("xls") || archivo.getName().endsWith("xlsx")) {
            modeloE.Importar(archivo, jtDatos);
        } else {
            JOptionPane.showMessageDialog(null, "Elija un formato valido.");
        }
        String []info=new String[4];
        for (int i=0; i<jtDatos.getRowCount(); i++){
            String Usuario = String.valueOf(jtDatos.getValueAt(i, 0));
            String Contraseña = String.valueOf(jtDatos.getValueAt(i, 1));
            String Rol = String.valueOf(jtDatos.getValueAt(i, 2));
            String Sede = String.valueOf(jtDatos.getValueAt(i, 3));
            info[0]=Usuario;
            info[1]=Contraseña;
            info[2]=Rol;
            info[3]=Sede;
            if (UsuTf.getText().equals(Usuario)&&("Empleado".equals(Rol))){
                JOptionPane.showMessageDialog(null, "Se ha eliminado el empleado del sistema.");
            } else{
                nuevTabl.addRow(info);
            }
        }
        this.jtDatos.setModel(nuevTabl);
        if (archivo.getName().endsWith("xls") || archivo.getName().endsWith("xlsx")) {
            modeloE.Exportar(archivo, jtDatos);
        } else {
            JOptionPane.showMessageDialog(this, "Elija un formato valido.");
        }
        AdminLocal ventaAdminLoc = new AdminLocal();
        ventaAdminLoc.setVisible(true);
        ventaAdminLoc.setLocationRelativeTo(null);
        this.setVisible(false);
        
    }//GEN-LAST:event_ElimEmplBtnActionPerformed

    private void VolverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBtnActionPerformed
        AdminLocal ventaAdminLoc = new AdminLocal();
        ventaAdminLoc.setVisible(true);
        ventaAdminLoc.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_VolverBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ElimEmpLb;
    private javax.swing.JButton ElimEmplBtn;
    private javax.swing.JLabel UsuLb;
    private javax.swing.JTextField UsuTf;
    private javax.swing.JButton VolverBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtDatos;
    // End of variables declaration//GEN-END:variables
}
