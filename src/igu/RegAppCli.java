
package igu;

import java.io.File;
import logica.ImportarExportar;
import javax.swing.table.DefaultTableModel;

public class RegAppCli extends javax.swing.JFrame {
    ImportarExportar modeloE = new ImportarExportar();
    DefaultTableModel nuevTabl;
    public RegAppCli() {
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
        RegCliLb = new javax.swing.JLabel();
        UsuLb = new javax.swing.JLabel();
        UsuTf = new javax.swing.JTextField();
        ConLb = new javax.swing.JLabel();
        ConTf = new javax.swing.JTextField();
        NomLb = new javax.swing.JLabel();
        NomTf = new javax.swing.JTextField();
        NumTelLb = new javax.swing.JLabel();
        NumTelTf = new javax.swing.JTextField();
        DirTf = new javax.swing.JTextField();
        FecNacLb = new javax.swing.JLabel();
        DirLb = new javax.swing.JLabel();
        FecNacTf = new javax.swing.JTextField();
        RegCliBtn = new javax.swing.JButton();
        NacLb = new javax.swing.JLabel();
        ImIdLb = new javax.swing.JLabel();
        NumLicLb = new javax.swing.JLabel();
        FecVenLb = new javax.swing.JLabel();
        PaiExpLb = new javax.swing.JLabel();
        NacTf = new javax.swing.JTextField();
        ImIdTf = new javax.swing.JTextField();
        NumLicTf = new javax.swing.JTextField();
        PaiExpTf = new javax.swing.JTextField();
        FecVenTf = new javax.swing.JTextField();
        ImLicLb = new javax.swing.JLabel();
        NumTarLb = new javax.swing.JLabel();
        FecVenTarLb = new javax.swing.JLabel();
        CvvLb = new javax.swing.JLabel();
        ImLicTf = new javax.swing.JTextField();
        NumTarTf = new javax.swing.JTextField();
        FecVenTarTf = new javax.swing.JTextField();
        CvvTf = new javax.swing.JTextField();
        VolBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RegCliLb.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        RegCliLb.setText("Registrar Cliente");

        UsuLb.setBackground(new java.awt.Color(255, 255, 255));
        UsuLb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        UsuLb.setText("Usuario:");

        ConLb.setBackground(new java.awt.Color(255, 255, 255));
        ConLb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ConLb.setText("Contraseña:");

        NomLb.setBackground(new java.awt.Color(255, 255, 255));
        NomLb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        NomLb.setText("Nombre completo:");

        NumTelLb.setBackground(new java.awt.Color(255, 255, 255));
        NumTelLb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        NumTelLb.setText("Número de teléfono:");

        FecNacLb.setBackground(new java.awt.Color(255, 255, 255));
        FecNacLb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        FecNacLb.setText("Fecha de nacimiento:");

        DirLb.setBackground(new java.awt.Color(255, 255, 255));
        DirLb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        DirLb.setText("Dirección:");

        RegCliBtn.setBackground(new java.awt.Color(0, 0, 0));
        RegCliBtn.setForeground(new java.awt.Color(255, 255, 255));
        RegCliBtn.setText("Registrar Cliente");
        RegCliBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegCliBtnActionPerformed(evt);
            }
        });

        NacLb.setBackground(new java.awt.Color(255, 255, 255));
        NacLb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        NacLb.setText("Nacionalidad:");

        ImIdLb.setBackground(new java.awt.Color(255, 255, 255));
        ImIdLb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ImIdLb.setText("Imagen ID:");

        NumLicLb.setBackground(new java.awt.Color(255, 255, 255));
        NumLicLb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        NumLicLb.setText("Número de licencia:");

        FecVenLb.setBackground(new java.awt.Color(255, 255, 255));
        FecVenLb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        FecVenLb.setText("Fecha de vencimiento:");

        PaiExpLb.setBackground(new java.awt.Color(255, 255, 255));
        PaiExpLb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        PaiExpLb.setText("País de expedición:");

        ImLicLb.setBackground(new java.awt.Color(255, 255, 255));
        ImLicLb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ImLicLb.setText("Imagen de licencia:");

        NumTarLb.setBackground(new java.awt.Color(255, 255, 255));
        NumTarLb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        NumTarLb.setText("Número de tarjeta de crédito:");

        FecVenTarLb.setBackground(new java.awt.Color(255, 255, 255));
        FecVenTarLb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        FecVenTarLb.setText("Fecha de vencimiento:");

        CvvLb.setBackground(new java.awt.Color(255, 255, 255));
        CvvLb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        CvvLb.setText("CVV:");

        VolBtn.setBackground(new java.awt.Color(0, 0, 0));
        VolBtn.setForeground(new java.awt.Color(255, 255, 255));
        VolBtn.setText("Volver");
        VolBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolBtnActionPerformed(evt);
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NumTelLb)
                            .addComponent(UsuLb)
                            .addComponent(ConLb)
                            .addComponent(NomLb)
                            .addComponent(DirLb)
                            .addComponent(FecNacLb)
                            .addComponent(NacLb)
                            .addComponent(ImIdLb)
                            .addComponent(NumLicLb)
                            .addComponent(FecVenLb)
                            .addComponent(PaiExpLb)
                            .addComponent(ImLicLb)
                            .addComponent(FecVenTarLb)
                            .addComponent(NumTarLb)
                            .addComponent(CvvLb))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FecNacTf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConTf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UsuTf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NomTf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumTelTf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DirTf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NacTf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ImIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumLicTf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PaiExpTf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FecVenTf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ImLicTf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumTarTf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FecVenTarTf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CvvTf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(RegCliLb))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(RegCliBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(VolBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)))
                .addContainerGap(15, Short.MAX_VALUE))
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
                .addComponent(RegCliLb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsuLb)
                    .addComponent(UsuTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConLb)
                    .addComponent(ConTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomLb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumTelTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumTelLb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DirTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DirLb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FecNacTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FecNacLb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NacTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NacLb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ImIdLb)
                    .addComponent(ImIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumLicTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumLicLb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PaiExpLb)
                    .addComponent(PaiExpTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FecVenLb)
                    .addComponent(FecVenTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ImLicLb)
                    .addComponent(ImLicTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumTarLb)
                    .addComponent(NumTarTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FecVenTarLb)
                    .addComponent(FecVenTarTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CvvLb)
                    .addComponent(CvvTf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegCliBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VolBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(605, Short.MAX_VALUE)))
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

    private void RegCliBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegCliBtnActionPerformed
        String nombreArchivo = "Datos.xlsx";
        File archivo = new File(nombreArchivo);
        modeloE.Importar(archivo, jtDatos);
        String[] info=new String[4];
        for (int i=0; i<jtDatos.getRowCount(); i++){
            String Usuario = String.valueOf(jtDatos.getValueAt(i, 0));
            String Contraseña = String.valueOf(jtDatos.getValueAt(i, 1));
            String Rol = String.valueOf(jtDatos.getValueAt(i, 2));
            String Sede = String.valueOf(jtDatos.getValueAt(i, 3));
            info[0]=Usuario;
            info[1]=Contraseña;
            info[2]=Rol;
            info[3]=Sede;
            nuevTabl.addRow(info);
        }
        info[0]=UsuTf.getText();
        info[1]=ConTf.getText();
        info[2]="Cliente";
        info[3]="1";
        nuevTabl.addRow(info);
        this.jtDatos.setModel(nuevTabl);
        modeloE.Exportar(archivo, jtDatos);
        IniSesCli ventaIniSesCli = new IniSesCli();
        ventaIniSesCli.setVisible(true);
        ventaIniSesCli.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_RegCliBtnActionPerformed

    private void VolBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolBtnActionPerformed
        MenPriAppCli ventaMenPriAppCli = new MenPriAppCli();
        ventaMenPriAppCli.setVisible(true);
        ventaMenPriAppCli.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_VolBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ConLb;
    private javax.swing.JTextField ConTf;
    private javax.swing.JLabel CvvLb;
    private javax.swing.JTextField CvvTf;
    private javax.swing.JLabel DirLb;
    private javax.swing.JTextField DirTf;
    private javax.swing.JLabel FecNacLb;
    private javax.swing.JTextField FecNacTf;
    private javax.swing.JLabel FecVenLb;
    private javax.swing.JLabel FecVenTarLb;
    private javax.swing.JTextField FecVenTarTf;
    private javax.swing.JTextField FecVenTf;
    private javax.swing.JLabel ImIdLb;
    private javax.swing.JTextField ImIdTf;
    private javax.swing.JLabel ImLicLb;
    private javax.swing.JTextField ImLicTf;
    private javax.swing.JLabel NacLb;
    private javax.swing.JTextField NacTf;
    private javax.swing.JLabel NomLb;
    private javax.swing.JTextField NomTf;
    private javax.swing.JLabel NumLicLb;
    private javax.swing.JTextField NumLicTf;
    private javax.swing.JLabel NumTarLb;
    private javax.swing.JTextField NumTarTf;
    private javax.swing.JLabel NumTelLb;
    private javax.swing.JTextField NumTelTf;
    private javax.swing.JLabel PaiExpLb;
    private javax.swing.JTextField PaiExpTf;
    private javax.swing.JButton RegCliBtn;
    private javax.swing.JLabel RegCliLb;
    private javax.swing.JLabel UsuLb;
    private javax.swing.JTextField UsuTf;
    private javax.swing.JButton VolBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtDatos;
    // End of variables declaration//GEN-END:variables
}