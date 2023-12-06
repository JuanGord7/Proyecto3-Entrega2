/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

/**
 *
 * @author jumag
 */
public class AdminGeneral extends javax.swing.JFrame {

    /**
     * Creates new form AdminGeneral
     */
    public AdminGeneral() {
        initComponents();
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
        AdminGenLb = new javax.swing.JLabel();
        AgrCarroBtn = new javax.swing.JButton();
        ElimCarroBtn = new javax.swing.JButton();
        CreaSedeBtn = new javax.swing.JButton();
        ModSedeBtn = new javax.swing.JButton();
        UbiVehBtn = new javax.swing.JButton();
        HistVehBtn = new javax.swing.JButton();
        CerrSesiBtn = new javax.swing.JButton();
        AdminBtn = new javax.swing.JButton();
        ModTarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(269, 300));

        AdminGenLb.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        AdminGenLb.setText("Administrador General");

        AgrCarroBtn.setBackground(new java.awt.Color(0, 0, 0));
        AgrCarroBtn.setForeground(new java.awt.Color(255, 255, 255));
        AgrCarroBtn.setText("Agregar Carro");
        AgrCarroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgrCarroBtnActionPerformed(evt);
            }
        });

        ElimCarroBtn.setBackground(new java.awt.Color(0, 0, 0));
        ElimCarroBtn.setForeground(new java.awt.Color(255, 255, 255));
        ElimCarroBtn.setText("Eliminar Carro");
        ElimCarroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElimCarroBtnActionPerformed(evt);
            }
        });

        CreaSedeBtn.setBackground(new java.awt.Color(0, 0, 0));
        CreaSedeBtn.setForeground(new java.awt.Color(255, 255, 255));
        CreaSedeBtn.setText("Crear Sede");
        CreaSedeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreaSedeBtnActionPerformed(evt);
            }
        });

        ModSedeBtn.setBackground(new java.awt.Color(0, 0, 0));
        ModSedeBtn.setForeground(new java.awt.Color(255, 255, 255));
        ModSedeBtn.setText("Modificar Sede");
        ModSedeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModSedeBtnActionPerformed(evt);
            }
        });

        UbiVehBtn.setBackground(new java.awt.Color(0, 0, 0));
        UbiVehBtn.setForeground(new java.awt.Color(255, 255, 255));
        UbiVehBtn.setText("Ubicación Vehículo");
        UbiVehBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbiVehBtnActionPerformed(evt);
            }
        });

        HistVehBtn.setBackground(new java.awt.Color(0, 0, 0));
        HistVehBtn.setForeground(new java.awt.Color(255, 255, 255));
        HistVehBtn.setText("Historial Vehículo");
        HistVehBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistVehBtnActionPerformed(evt);
            }
        });

        CerrSesiBtn.setBackground(new java.awt.Color(0, 0, 0));
        CerrSesiBtn.setForeground(new java.awt.Color(255, 255, 255));
        CerrSesiBtn.setText("Cerrar Sesión");
        CerrSesiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrSesiBtnActionPerformed(evt);
            }
        });

        AdminBtn.setBackground(new java.awt.Color(0, 0, 0));
        AdminBtn.setForeground(new java.awt.Color(255, 255, 255));
        AdminBtn.setText("Registrar Administrador");
        AdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminBtnActionPerformed(evt);
            }
        });

        ModTarBtn.setBackground(new java.awt.Color(0, 0, 0));
        ModTarBtn.setForeground(new java.awt.Color(255, 255, 255));
        ModTarBtn.setText("Modificar Tarifa");
        ModTarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModTarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(AdminGenLb))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(HistVehBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AdminBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(CerrSesiBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ModTarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addComponent(AgrCarroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ElimCarroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CreaSedeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ModSedeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(UbiVehBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(AdminGenLb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AgrCarroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ElimCarroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CreaSedeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ModSedeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UbiVehBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HistVehBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AdminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ModTarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CerrSesiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgrCarroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgrCarroBtnActionPerformed
        AgrVeh ventaAgrCarro = new AgrVeh();
        ventaAgrCarro.setVisible(true);
        ventaAgrCarro.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_AgrCarroBtnActionPerformed

    private void ElimCarroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElimCarroBtnActionPerformed
        ElimVeh ventaElimCarro = new ElimVeh();
        ventaElimCarro.setVisible(true);
        ventaElimCarro.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_ElimCarroBtnActionPerformed

    private void CreaSedeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreaSedeBtnActionPerformed
        CreaSede ventaCreaSede = new CreaSede();
        ventaCreaSede.setVisible(true);
        ventaCreaSede.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_CreaSedeBtnActionPerformed

    private void ModSedeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModSedeBtnActionPerformed
        ModSede ventaModSede = new ModSede();
        ventaModSede.setVisible(true);
        ventaModSede.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_ModSedeBtnActionPerformed

    private void UbiVehBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbiVehBtnActionPerformed
        UbiVehi ventaUbiVehi = new UbiVehi();
        ventaUbiVehi.setVisible(true);
        ventaUbiVehi.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_UbiVehBtnActionPerformed

    private void HistVehBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistVehBtnActionPerformed
        HistVehi ventaHistVehi = new HistVehi();
        ventaHistVehi.setVisible(true);
        ventaHistVehi.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_HistVehBtnActionPerformed

    private void CerrSesiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrSesiBtnActionPerformed
        MenuPrincipal ventaMenuPrinci = new MenuPrincipal();
        ventaMenuPrinci.setVisible(true);
        ventaMenuPrinci.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_CerrSesiBtnActionPerformed

    private void AdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminBtnActionPerformed
        RegAdmin ventaRegAdmin = new RegAdmin();
        ventaRegAdmin.setVisible(true);
        ventaRegAdmin.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_AdminBtnActionPerformed

    private void ModTarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModTarBtnActionPerformed
        ModTarifa ventaModTarifa = new ModTarifa();
        ventaModTarifa.setVisible(true);
        ventaModTarifa.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_ModTarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminBtn;
    private javax.swing.JLabel AdminGenLb;
    private javax.swing.JButton AgrCarroBtn;
    private javax.swing.JButton CerrSesiBtn;
    private javax.swing.JButton CreaSedeBtn;
    private javax.swing.JButton ElimCarroBtn;
    private javax.swing.JButton HistVehBtn;
    private javax.swing.JButton ModSedeBtn;
    private javax.swing.JButton ModTarBtn;
    private javax.swing.JButton UbiVehBtn;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
