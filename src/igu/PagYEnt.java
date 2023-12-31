
package igu;

import logica.CrearPdf;
import java.io.File;
import logica.ImportarExportar;

public class PagYEnt extends javax.swing.JFrame {
    ImportarExportar modeloE = new ImportarExportar();

    public PagYEnt() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PagarBtn = new javax.swing.JButton();
        IdAlqTf = new javax.swing.JTextField();
        IdResLb = new javax.swing.JLabel();
        FormAlqLb = new javax.swing.JLabel();
        VolverBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PagarBtn.setBackground(new java.awt.Color(0, 0, 0));
        PagarBtn.setForeground(new java.awt.Color(255, 255, 255));
        PagarBtn.setText("Pagar");
        PagarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagarBtnActionPerformed(evt);
            }
        });

        IdResLb.setBackground(new java.awt.Color(255, 255, 255));
        IdResLb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        IdResLb.setText("Id alquiler:");

        FormAlqLb.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        FormAlqLb.setText("Pago");

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(32, Short.MAX_VALUE)
                        .addComponent(IdResLb)
                        .addGap(18, 18, 18)
                        .addComponent(IdAlqTf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(PagarBtn)
                        .addGap(40, 40, 40)
                        .addComponent(VolverBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(FormAlqLb)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(274, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(FormAlqLb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdResLb)
                    .addComponent(IdAlqTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PagarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VolverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 162, Short.MAX_VALUE)))
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

    private void PagarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagarBtnActionPerformed
        String nombreArchivo = "Alquileres.xlsx";
        CrearPdf obj = new CrearPdf();
        File archivo = new File(nombreArchivo);
        modeloE.Importar(archivo, jtDatos);
        for (int i=0; i<jtDatos.getRowCount(); i++){
            String Id = String.valueOf(jtDatos.getValueAt(i, 0));
            String UsuCli = String.valueOf(jtDatos.getValueAt(i, 6));
            String Pre = String.valueOf(jtDatos.getValueAt(i, 12));
            if (Id.equals(IdAlqTf.getText())){
                obj.prueba(UsuCli, Pre);
            }
        }
        Empleado ventaEmpl = new Empleado();
        ventaEmpl.setVisible(true);
        ventaEmpl.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_PagarBtnActionPerformed

    private void VolverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBtnActionPerformed
        Empleado ventaEmpl = new Empleado();
        ventaEmpl.setVisible(true);
        ventaEmpl.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_VolverBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FormAlqLb;
    private javax.swing.JTextField IdAlqTf;
    private javax.swing.JLabel IdResLb;
    private javax.swing.JButton PagarBtn;
    private javax.swing.JButton VolverBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtDatos;
    // End of variables declaration//GEN-END:variables
}
