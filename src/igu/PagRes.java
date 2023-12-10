
package igu;

import java.io.File;
import logica.ImportarExportar;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class PagRes extends javax.swing.JFrame {
    ImportarExportar modeloE = new ImportarExportar();
    DefaultTableModel nuevTabl;
    String Id;
    String tarifa;
    public PagRes(String tarifa, String Id) {
        initComponents();
        nuevTabl=new DefaultTableModel();
        nuevTabl.addColumn("Id");
        nuevTabl.addColumn("Categoría Y Tipo");
        nuevTabl.addColumn("Fecha recogida");
        nuevTabl.addColumn("Ubicación recogida");
        nuevTabl.addColumn("Ubicación entrega");
        nuevTabl.addColumn("Fecha entrega");
        nuevTabl.addColumn("Usuario cliente");
        nuevTabl.addColumn("Contraseña cliente");
        nuevTabl.addColumn("Conductores extra");
        nuevTabl.addColumn("Usuario del conductor");
        nuevTabl.addColumn("Contraseña del conductor");
        nuevTabl.addColumn("Reserva");
        nuevTabl.addColumn("Precio");
        nuevTabl.addColumn("Pagado");
        PreLb.setText(tarifa);
        this.Id = Id;
        this.tarifa = tarifa;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Pag30Btn = new javax.swing.JButton();
        PagResLb = new javax.swing.JLabel();
        Pag100Btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDatos = new javax.swing.JTable();
        VolBtn = new javax.swing.JButton();
        ValTotLb = new javax.swing.JLabel();
        PreLb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pag30Btn.setBackground(new java.awt.Color(0, 0, 0));
        Pag30Btn.setForeground(new java.awt.Color(255, 255, 255));
        Pag30Btn.setText("Pagar 30%");
        Pag30Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pag30BtnActionPerformed(evt);
            }
        });

        PagResLb.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        PagResLb.setText("Pago de Reserva");

        Pag100Btn.setBackground(new java.awt.Color(0, 0, 0));
        Pag100Btn.setForeground(new java.awt.Color(255, 255, 255));
        Pag100Btn.setText("Pagar 100% (10% de descuento)");
        Pag100Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pag100BtnActionPerformed(evt);
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

        VolBtn.setBackground(new java.awt.Color(0, 0, 0));
        VolBtn.setForeground(new java.awt.Color(255, 255, 255));
        VolBtn.setText("Volver");
        VolBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolBtnActionPerformed(evt);
            }
        });

        ValTotLb.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        ValTotLb.setText("El valor total a pagar es de: ");

        PreLb.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        PreLb.setText("Precio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Pag100Btn)
                .addGap(66, 66, 66))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(PagResLb)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(VolBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Pag30Btn)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ValTotLb)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(PreLb)
                        .addGap(138, 138, 138))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(274, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(PagResLb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ValTotLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PreLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pag30Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pag100Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VolBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void Pag30BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pag30BtnActionPerformed
        String nombreArchivo = "Alquileres.xlsx";
        File archivo = new File(nombreArchivo);
        modeloE.Importar(archivo, jtDatos);
        String []info=new String[14];
        for (int i=0; i<jtDatos.getRowCount(); i++){
            String Id1 = String.valueOf(jtDatos.getValueAt(i, 0));
            String CatYTip = String.valueOf(jtDatos.getValueAt(i, 1));
            String FecRec = String.valueOf(jtDatos.getValueAt(i, 2));
            String UbiRec = String.valueOf(jtDatos.getValueAt(i, 3));
            String UbiEnt = String.valueOf(jtDatos.getValueAt(i, 4));
            String FecEnt = String.valueOf(jtDatos.getValueAt(i, 5));
            String UsuCli = String.valueOf(jtDatos.getValueAt(i, 6));
            String ConCli = String.valueOf(jtDatos.getValueAt(i, 7));
            String CondEx = String.valueOf(jtDatos.getValueAt(i, 8));
            String UsuCond = String.valueOf(jtDatos.getValueAt(i, 9));
            String ConCond = String.valueOf(jtDatos.getValueAt(i, 10));
            String Reserva = String.valueOf(jtDatos.getValueAt(i, 11));
            String Pre = String.valueOf(jtDatos.getValueAt(i, 12));
            String Pag = String.valueOf(jtDatos.getValueAt(i, 13));
            info[0]= Id1;
            info[1]= CatYTip;
            info[2]= FecRec;
            info[3]= UbiRec;
            info[4]= UbiEnt;
            info[5]= FecEnt;
            info[6]= UsuCli;
            info[7]= ConCli;
            info[8]= CondEx;
            info[9]= UsuCond;
            info[10]= ConCond;
            info[11]= Reserva;
            info[12]= Pre;
            info[13]= Pag;
            if (Id1.equals(Id)){
                float TarifaFlo = Float.parseFloat(tarifa)*0.3f;
                info[13]= Integer.toString(Math.round(TarifaFlo));
                JOptionPane.showMessageDialog(null, "Ha pagado "+Integer.toString(Math.round(TarifaFlo)));
            }
            nuevTabl.addRow(info);
        }
        this.jtDatos.setModel(nuevTabl);
        modeloE.Exportar(archivo, jtDatos);
        
        CliAppCli ventaCliAppCli = new CliAppCli();
        ventaCliAppCli.setVisible(true);
        ventaCliAppCli.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_Pag30BtnActionPerformed

    private void Pag100BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pag100BtnActionPerformed
        String nombreArchivo = "Alquileres.xlsx";
        File archivo = new File(nombreArchivo);
        modeloE.Importar(archivo, jtDatos);
        String []info=new String[14];
        for (int i=0; i<jtDatos.getRowCount(); i++){
            String Id1 = String.valueOf(jtDatos.getValueAt(i, 0));
            String CatYTip = String.valueOf(jtDatos.getValueAt(i, 1));
            String FecRec = String.valueOf(jtDatos.getValueAt(i, 2));
            String UbiRec = String.valueOf(jtDatos.getValueAt(i, 3));
            String UbiEnt = String.valueOf(jtDatos.getValueAt(i, 4));
            String FecEnt = String.valueOf(jtDatos.getValueAt(i, 5));
            String UsuCli = String.valueOf(jtDatos.getValueAt(i, 6));
            String ConCli = String.valueOf(jtDatos.getValueAt(i, 7));
            String CondEx = String.valueOf(jtDatos.getValueAt(i, 8));
            String UsuCond = String.valueOf(jtDatos.getValueAt(i, 9));
            String ConCond = String.valueOf(jtDatos.getValueAt(i, 10));
            String Reserva = String.valueOf(jtDatos.getValueAt(i, 11));
            String Pre = String.valueOf(jtDatos.getValueAt(i, 12));
            String Pag = String.valueOf(jtDatos.getValueAt(i, 13));
            info[0]= Id1;
            info[1]= CatYTip;
            info[2]= FecRec;
            info[3]= UbiRec;
            info[4]= UbiEnt;
            info[5]= FecEnt;
            info[6]= UsuCli;
            info[7]= ConCli;
            info[8]= CondEx;
            info[9]= UsuCond;
            info[10]= ConCond;
            info[11]= Reserva;
            info[12]= Pre;
            info[13]= Pag;
            if (Id1.equals(Id)){
                info[13]= tarifa;
                JOptionPane.showMessageDialog(null, "Ha pagado "+tarifa);
            }
            nuevTabl.addRow(info);
        }
        this.jtDatos.setModel(nuevTabl);
        modeloE.Exportar(archivo, jtDatos);
        
        CliAppCli ventaCliAppCli = new CliAppCli();
        ventaCliAppCli.setVisible(true);
        ventaCliAppCli.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_Pag100BtnActionPerformed

    private void VolBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolBtnActionPerformed
        CreResAppCli ventaCreResAppCli = new CreResAppCli();
        ventaCreResAppCli.setVisible(true);
        ventaCreResAppCli.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_VolBtnActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Pag100Btn;
    private javax.swing.JButton Pag30Btn;
    private javax.swing.JLabel PagResLb;
    private javax.swing.JLabel PreLb;
    private javax.swing.JLabel ValTotLb;
    private javax.swing.JButton VolBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtDatos;
    // End of variables declaration//GEN-END:variables
}
