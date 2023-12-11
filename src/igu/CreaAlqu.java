
package igu;

import java.io.File;
import javax.swing.*;
import logica.ImportarExportar;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CreaAlqu extends javax.swing.JFrame {
    ImportarExportar modeloE = new ImportarExportar();
    DefaultTableModel nuevTabl;

    public CreaAlqu() {
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
        llenarComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CreaAlquLb = new javax.swing.JLabel();
        CatYTipLb = new javax.swing.JLabel();
        FechRecLb = new javax.swing.JLabel();
        FecRecTf = new javax.swing.JTextField();
        UbiRecLb = new javax.swing.JLabel();
        UbiEntLb = new javax.swing.JLabel();
        FecEntTf = new javax.swing.JTextField();
        FecEnTemLb = new javax.swing.JLabel();
        CreAlquBtn = new javax.swing.JButton();
        UsuCliLb = new javax.swing.JLabel();
        ConCliLb = new javax.swing.JLabel();
        NumConAdiLb = new javax.swing.JLabel();
        ConCondLb = new javax.swing.JLabel();
        UsuCondLb = new javax.swing.JLabel();
        UsuCliTf = new javax.swing.JTextField();
        NumConAdiTf = new javax.swing.JTextField();
        UsuCondTf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDatos = new javax.swing.JTable();
        UbiRecJcb = new javax.swing.JComboBox<>();
        UbiEntJcb = new javax.swing.JComboBox<>();
        ConCliPf = new javax.swing.JPasswordField();
        VolverBtn = new javax.swing.JButton();
        CatYTipJcb = new javax.swing.JComboBox<>();
        Seg1Lb = new javax.swing.JLabel();
        Seg2Lb = new javax.swing.JLabel();
        Seg1Jcb = new javax.swing.JComboBox<>();
        Seg2Jcb = new javax.swing.JComboBox<>();
        ConCondPf = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CreaAlquLb.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        CreaAlquLb.setText("Crear Alquiler");

        CatYTipLb.setBackground(new java.awt.Color(255, 255, 255));
        CatYTipLb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        CatYTipLb.setText("Categoría Y Tipo:");

        FechRecLb.setBackground(new java.awt.Color(255, 255, 255));
        FechRecLb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        FechRecLb.setText("Fecha Recogida(DD/MM/AA):");

        UbiRecLb.setBackground(new java.awt.Color(255, 255, 255));
        UbiRecLb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        UbiRecLb.setText("Ubicación Recogida:");

        UbiEntLb.setBackground(new java.awt.Color(255, 255, 255));
        UbiEntLb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        UbiEntLb.setText("Ubicación Entrega:");

        FecEnTemLb.setBackground(new java.awt.Color(255, 255, 255));
        FecEnTemLb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        FecEnTemLb.setText("Fecha Entrega (DD/MM/AA):");

        CreAlquBtn.setBackground(new java.awt.Color(0, 0, 0));
        CreAlquBtn.setForeground(new java.awt.Color(255, 255, 255));
        CreAlquBtn.setText("Crear Alquiler");
        CreAlquBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreAlquBtnActionPerformed(evt);
            }
        });

        UsuCliLb.setBackground(new java.awt.Color(255, 255, 255));
        UsuCliLb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        UsuCliLb.setText("Usuario Cliente:");

        ConCliLb.setBackground(new java.awt.Color(255, 255, 255));
        ConCliLb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ConCliLb.setText("Contraseña Cliente:");

        NumConAdiLb.setBackground(new java.awt.Color(255, 255, 255));
        NumConAdiLb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        NumConAdiLb.setText("Número conductores adicionales:");

        ConCondLb.setBackground(new java.awt.Color(255, 255, 255));
        ConCondLb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ConCondLb.setText("Contraseña del conductor (\"No\" si no hay conductores adicionales):");

        UsuCondLb.setBackground(new java.awt.Color(255, 255, 255));
        UsuCondLb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        UsuCondLb.setText("Usuario del conductor (\"No\" si no hay conductores adicionales):");

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

        UbiRecJcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir" }));

        UbiEntJcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir" }));

        VolverBtn.setBackground(new java.awt.Color(0, 0, 0));
        VolverBtn.setForeground(new java.awt.Color(255, 255, 255));
        VolverBtn.setText("Volver");
        VolverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverBtnActionPerformed(evt);
            }
        });

        CatYTipJcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir" }));

        Seg1Lb.setBackground(new java.awt.Color(255, 255, 255));
        Seg1Lb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Seg1Lb.setText("Seguro 1:");

        Seg2Lb.setBackground(new java.awt.Color(255, 255, 255));
        Seg2Lb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Seg2Lb.setText("Seguro 2:");

        Seg1Jcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sí", "No" }));

        Seg2Jcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sí", "No" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Seg2Lb)
                            .addComponent(UbiEntLb)
                            .addComponent(CatYTipLb)
                            .addComponent(FechRecLb)
                            .addComponent(UbiRecLb)
                            .addComponent(FecEnTemLb)
                            .addComponent(UsuCliLb)
                            .addComponent(ConCliLb)
                            .addComponent(NumConAdiLb)
                            .addComponent(ConCondLb)
                            .addComponent(UsuCondLb)
                            .addComponent(Seg1Lb))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FecEntTf, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsuCliTf, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumConAdiTf, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsuCondTf, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UbiEntJcb, javax.swing.GroupLayout.Alignment.LEADING, 0, 246, Short.MAX_VALUE)
                            .addComponent(ConCliPf, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FecRecTf, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UbiRecJcb, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CatYTipJcb, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Seg1Jcb, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Seg2Jcb, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ConCondPf))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CreAlquBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(VolverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(CreaAlquLb)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(394, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CreaAlquLb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CatYTipJcb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CatYTipLb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FechRecLb)
                    .addComponent(FecRecTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FecEntTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FecEnTemLb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UbiRecJcb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UbiRecLb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UbiEntJcb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UbiEntLb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsuCliTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsuCliLb))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConCliPf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConCliLb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumConAdiTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumConAdiLb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsuCondLb)
                    .addComponent(UsuCondTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConCondPf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConCondLb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Seg1Lb)
                    .addComponent(Seg1Jcb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Seg2Jcb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Seg2Lb))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VolverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CreAlquBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(442, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreAlquBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreAlquBtnActionPerformed
        String FecRec = FecRecTf.getText();
        String FecEnt = FecEntTf.getText();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        long diferenciaEnDias = 0;
        try {
            Date date1 = formato.parse(FecRec);
            Date date2 = formato.parse(FecEnt);

            long diferenciaEnMillis = date2.getTime() - date1.getTime();

            diferenciaEnDias = TimeUnit.MILLISECONDS.toDays(diferenciaEnMillis);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        String nombreArchivo = "Tarifas.xlsx";
        File archivo = new File(nombreArchivo);
        modeloE.Importar(archivo, jtDatos);
        String tarifa;
        long CalTar=0;
        for (int i=0; i<jtDatos.getRowCount(); i++){
            String CatYTip = String.valueOf(jtDatos.getValueAt(i, 0));
            String TarDia = String.valueOf(jtDatos.getValueAt(i, 1));
            String SedDif = String.valueOf(jtDatos.getValueAt(i, 2));
            String Seg1 = String.valueOf(jtDatos.getValueAt(i, 3));
            String Seg2 = String.valueOf(jtDatos.getValueAt(i, 4));
            String ConAdi = String.valueOf(jtDatos.getValueAt(i, 5));
            if (CatYTip.equals(CatYTipJcb.getSelectedItem().toString())){
                CalTar = Integer.parseInt(TarDia)*diferenciaEnDias+(Integer.parseInt(ConAdi)*Integer.parseInt(NumConAdiTf.getText()));
                if (!UbiRecJcb.getSelectedItem().toString().equals(UbiEntJcb.getSelectedItem().toString())){
                    CalTar += Integer.parseInt(SedDif);
                }
                if (Seg1Jcb.getSelectedItem().equals("Sí")){
                    CalTar += Integer.parseInt(Seg1);
                }
                if (Seg2Jcb.getSelectedItem().equals("Sí")){
                    CalTar += Integer.parseInt(Seg2);
                }
            }
        }
        
        nombreArchivo = "Alquileres.xlsx";
        archivo = new File(nombreArchivo);
        modeloE.Importar(archivo, jtDatos);
        String []info=new String[14];
        for (int i=0; i<jtDatos.getRowCount(); i++){
            String Id = String.valueOf(jtDatos.getValueAt(i, 0));
            String CatYTip = String.valueOf(jtDatos.getValueAt(i, 1));
            FecRec = String.valueOf(jtDatos.getValueAt(i, 2));
            String UbiRec = String.valueOf(jtDatos.getValueAt(i, 3));
            String UbiEnt = String.valueOf(jtDatos.getValueAt(i, 4));
            FecEnt = String.valueOf(jtDatos.getValueAt(i, 5));
            String UsuCli = String.valueOf(jtDatos.getValueAt(i, 6));
            String ConCli = String.valueOf(jtDatos.getValueAt(i, 7));
            String CondEx = String.valueOf(jtDatos.getValueAt(i, 8));
            String UsuCond = String.valueOf(jtDatos.getValueAt(i, 9));
            String ConCond = String.valueOf(jtDatos.getValueAt(i, 10));
            String Reserva = String.valueOf(jtDatos.getValueAt(i, 11));
            String Pre = String.valueOf(jtDatos.getValueAt(i, 12));
            String Pag = String.valueOf(jtDatos.getValueAt(i, 13));
            info[0]= Id;
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
            nuevTabl.addRow(info);
        }
        info[0]= String.valueOf(nuevTabl.getRowCount()+1);
        info[1]= CatYTipJcb.getSelectedItem().toString();
        info[2]= FecRecTf.getText();
        info[3]= UbiRecJcb.getSelectedItem().toString();
        info[4]= UbiEntJcb.getSelectedItem().toString();
        info[5]= FecEntTf.getText();
        info[6]= UsuCliTf.getText();
        info[7]= ConCliPf.getText();
        info[8]= NumConAdiTf.getText();
        info[9]= UsuCondTf.getText();
        info[10]= ConCondPf.getText();
        info[11]= "No";
        tarifa = String.valueOf(CalTar);
        info[12]= tarifa;
        info[13]= "0";
        nuevTabl.addRow(info);
        this.jtDatos.setModel(nuevTabl);
        modeloE.Exportar(archivo, jtDatos);
        JOptionPane.showMessageDialog(null, "Ha agregado un alquiler al sistema.");
        Empleado ventaEmpl = new Empleado();
        ventaEmpl.setVisible(true);
        ventaEmpl.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_CreAlquBtnActionPerformed

    private void VolverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBtnActionPerformed
        Empleado ventaEmpl = new Empleado();
        ventaEmpl.setVisible(true);
        ventaEmpl.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_VolverBtnActionPerformed

    private void llenarComboBox() {
        String nombreArchivo = "Tarifas.xlsx";
        File archivo = new File(nombreArchivo);
        modeloE.Importar(archivo, jtDatos);
        for (int i=0; i<jtDatos.getRowCount(); i++){
            CatYTipJcb.addItem(String.valueOf(jtDatos.getValueAt(i, 0)));
        }
        
        nombreArchivo = "Sedes.xlsx";
        archivo = new File(nombreArchivo);
        modeloE.Importar(archivo, jtDatos);
        for (int i=0; i<jtDatos.getRowCount(); i++){
            UbiRecJcb.addItem(String.valueOf(jtDatos.getValueAt(i, 1)));
            UbiEntJcb.addItem(String.valueOf(jtDatos.getValueAt(i, 1)));
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CatYTipJcb;
    private javax.swing.JLabel CatYTipLb;
    private javax.swing.JLabel ConCliLb;
    private javax.swing.JPasswordField ConCliPf;
    private javax.swing.JLabel ConCondLb;
    private javax.swing.JPasswordField ConCondPf;
    private javax.swing.JButton CreAlquBtn;
    private javax.swing.JLabel CreaAlquLb;
    private javax.swing.JLabel FecEnTemLb;
    private javax.swing.JTextField FecEntTf;
    private javax.swing.JTextField FecRecTf;
    private javax.swing.JLabel FechRecLb;
    private javax.swing.JLabel NumConAdiLb;
    private javax.swing.JTextField NumConAdiTf;
    private javax.swing.JComboBox<String> Seg1Jcb;
    private javax.swing.JLabel Seg1Lb;
    private javax.swing.JComboBox<String> Seg2Jcb;
    private javax.swing.JLabel Seg2Lb;
    private javax.swing.JComboBox<String> UbiEntJcb;
    private javax.swing.JLabel UbiEntLb;
    private javax.swing.JComboBox<String> UbiRecJcb;
    private javax.swing.JLabel UbiRecLb;
    private javax.swing.JLabel UsuCliLb;
    private javax.swing.JTextField UsuCliTf;
    private javax.swing.JLabel UsuCondLb;
    private javax.swing.JTextField UsuCondTf;
    private javax.swing.JButton VolverBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtDatos;
    // End of variables declaration//GEN-END:variables
}
