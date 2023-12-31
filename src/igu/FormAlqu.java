
package igu;

import java.io.File;
import javax.swing.JOptionPane;
import logica.ImportarExportar;
import javax.swing.table.DefaultTableModel;

public class FormAlqu extends javax.swing.JFrame {
    ImportarExportar modeloE = new ImportarExportar();
    DefaultTableModel nuevTabl;
    DefaultTableModel nuevTabl1;
    String[] datoRese = new String[14];

    public FormAlqu() {
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
        nuevTabl1=new DefaultTableModel();
        nuevTabl1.addColumn("Placa");
        nuevTabl1.addColumn("Marca");
        nuevTabl1.addColumn("Color");
        nuevTabl1.addColumn("Transmisión");
        nuevTabl1.addColumn("Categoría");
        nuevTabl1.addColumn("Número de sede");
        nuevTabl1.addColumn("Id Alquiler");
        nuevTabl1.addColumn("Fecha Inicio Alquiler");
        nuevTabl1.addColumn("Fecha Final Alquiler");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        FormAlquBtn = new javax.swing.JButton();
        IdResTf = new javax.swing.JTextField();
        IdResLb = new javax.swing.JLabel();
        FormAlqLb = new javax.swing.JLabel();
        VolverBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FormAlquBtn.setBackground(new java.awt.Color(0, 0, 0));
        FormAlquBtn.setForeground(new java.awt.Color(255, 255, 255));
        FormAlquBtn.setText("Formalizar alquiler");
        FormAlquBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormAlquBtnActionPerformed(evt);
            }
        });

        IdResLb.setBackground(new java.awt.Color(255, 255, 255));
        IdResLb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        IdResLb.setText("Id reserva:");

        FormAlqLb.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        FormAlqLb.setText("Formalizar Alquiler");

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
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(FormAlqLb)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(FormAlquBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(VolverBtn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(IdResLb)
                                .addGap(18, 18, 18)
                                .addComponent(IdResTf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))))
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdResLb)
                    .addComponent(IdResTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FormAlquBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VolverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 169, Short.MAX_VALUE)))
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

    private void FormAlquBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormAlquBtnActionPerformed
        String nombreArchivo= "Alquileres.xlsx";
        File archivo = new File(nombreArchivo);
        modeloE.Importar(archivo, jtDatos);
        String[] info = new String[14];
        for (int i=0; i<jtDatos.getRowCount(); i++){
            String Id = String.valueOf(jtDatos.getValueAt(i, 0));
            String Cate = String.valueOf(jtDatos.getValueAt(i, 1));
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
            info[0]= Id;
            info[1]= Cate;
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
            if (Id.equals(IdResTf.getText())) {
                info[11] = "No";
                this.datoRese = info.clone(); 
            }
            nuevTabl.addRow(info);
        }
        this.jtDatos.setModel(nuevTabl);
        modeloE.Exportar(archivo, jtDatos);
        nombreArchivo = "Vehiculos.xlsx";
        archivo = new File(nombreArchivo);
        modeloE.Importar(archivo, jtDatos);
        info=new String[9];
        boolean Confirmar = false;
        for (int i=0; i<jtDatos.getRowCount(); i++){
            String Placa = String.valueOf(jtDatos.getValueAt(i, 0));
            String Marca = String.valueOf(jtDatos.getValueAt(i, 1));
            String Color = String.valueOf(jtDatos.getValueAt(i, 2));
            String Trans = String.valueOf(jtDatos.getValueAt(i, 3));
            String Cate = String.valueOf(jtDatos.getValueAt(i, 4));
            String Numse = String.valueOf(jtDatos.getValueAt(i, 5));
            String IdAlqu = String.valueOf(jtDatos.getValueAt(i, 6));
            String FecIni = String.valueOf(jtDatos.getValueAt(i, 7));
            String FecFin = String.valueOf(jtDatos.getValueAt(i, 8));
            info[0]=Placa;
            info[1]=Marca;
            info[2]=Color;
            info[3]=Trans;
            info[4]=Cate;
            info[5]=Numse;
            info[6]=IdAlqu;
            info[7]=FecIni;
            info[8]=FecFin;
            if (Cate.equals(this.datoRese[1])&&IdAlqu.equals("0")){
                info[6] = this.datoRese[0];
                info[7] = this.datoRese[2];
                info[8] = this.datoRese[5];
                Confirmar = true;
                JOptionPane.showMessageDialog(null, "El carro de alquiler tiene la placa " + Placa);
            }
            nuevTabl1.addRow(info);
        }
        if (Confirmar) {
            this.jtDatos.setModel(nuevTabl1);
            modeloE.Exportar(archivo, jtDatos);
            Empleado ventaEmpl = new Empleado();
            ventaEmpl.setVisible(true);
            ventaEmpl.setLocationRelativeTo(null);
            this.setVisible(false);
        } else{
            nuevTabl1=new DefaultTableModel();
            nuevTabl1.addColumn("Placa");
            nuevTabl1.addColumn("Marca");
            nuevTabl1.addColumn("Color");
            nuevTabl1.addColumn("Transmisión");
            nuevTabl1.addColumn("Categoría");
            nuevTabl1.addColumn("Número de sede");
            nuevTabl1.addColumn("Id Alquiler");
            nuevTabl1.addColumn("Fecha Inicial Alquiler");
            nuevTabl1.addColumn("Fecha Final Alquiler");
            for (int i=0; i<jtDatos.getRowCount(); i++){
                String Placa = String.valueOf(jtDatos.getValueAt(i, 0));
                String Marca = String.valueOf(jtDatos.getValueAt(i, 1));
                String Color = String.valueOf(jtDatos.getValueAt(i, 2));
                String Trans = String.valueOf(jtDatos.getValueAt(i, 3));
                String Cate = String.valueOf(jtDatos.getValueAt(i, 4));
                String Numse = String.valueOf(jtDatos.getValueAt(i, 5));
                String IdAlqu = String.valueOf(jtDatos.getValueAt(i, 6));
                String FecIni = String.valueOf(jtDatos.getValueAt(i, 7));
                String FecFin = String.valueOf(jtDatos.getValueAt(i, 8));
                info[0]=Placa;
                info[1]=Marca;
                info[2]=Color;
                info[3]=Trans;
                info[4]=Cate;
                info[5]=Numse;
                info[6]=IdAlqu;
                info[7]=FecIni;
                info[8]=FecFin;
                if (IdAlqu.equals("0")&&this.datoRese!=null){
                    info[6] = this.datoRese[0];
                    info[7] = this.datoRese[2];
                    info[8] = this.datoRese[5];
                    this.datoRese = null;
                    JOptionPane.showMessageDialog(null, "El carro de alquiler tiene la placa " + Placa);
                }
                nuevTabl1.addRow(info);
            }
            this.jtDatos.setModel(nuevTabl1);
            modeloE.Exportar(archivo, jtDatos);
            Empleado ventaEmpl = new Empleado();
            ventaEmpl.setVisible(true);
            ventaEmpl.setLocationRelativeTo(null);
            this.setVisible(false);
            }
    }//GEN-LAST:event_FormAlquBtnActionPerformed

    private void VolverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBtnActionPerformed
        Empleado ventaEmpl = new Empleado();
        ventaEmpl.setVisible(true);
        ventaEmpl.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_VolverBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FormAlqLb;
    private javax.swing.JButton FormAlquBtn;
    private javax.swing.JLabel IdResLb;
    private javax.swing.JTextField IdResTf;
    private javax.swing.JButton VolverBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtDatos;
    // End of variables declaration//GEN-END:variables
}
