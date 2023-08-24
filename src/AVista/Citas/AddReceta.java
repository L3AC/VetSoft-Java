
package AVista.Citas;

public class AddReceta extends javax.swing.JPanel {

    public AddReceta() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont2 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        txtIns = new Design.TextFieldSV();
        btnAg = new Design.ButtonGradient();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        PCont2.setBackground(new java.awt.Color(255, 255, 255));
        PCont2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        PCont2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 70, 60));

        txtIns.setBackground(new java.awt.Color(202, 233, 255));
        txtIns.setShadowColor(new java.awt.Color(0, 0, 51));
        txtIns.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtInsKeyReleased(evt);
            }
        });
        PCont2.add(txtIns, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 1090, 50));

        btnAg.setText("Agregar");
        btnAg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgActionPerformed(evt);
            }
        });
        PCont2.add(btnAg, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 130, 50));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Instrucciones a dar");
        PCont2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 170, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(27, 73, 101));
        jLabel3.setText("AGREGAR RECETA");
        PCont2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PCont2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PCont2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        /*try {
            CRUDAnimales subp = new CRUDAnimales(idTipoUs);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(HVacunas.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgActionPerformed
        /*try {
            ctVacunas ct=new ctVacunas();
            ct.idVac=Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
            ct.dosis=Integer.parseInt(txtDosis.getText());
            ct.upVac();
            loadD();
            loadData();
        } catch (SQLException ex) {
            Logger.getLogger(HVacunas.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_btnAgActionPerformed

    private void txtInsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInsKeyReleased
        /*try {
            loadD();
        } catch (SQLException ex) {
            Logger.getLogger(HVacunas.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_txtInsKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private javax.swing.JPanel PCont1;
    private javax.swing.JPanel PCont2;
    private Design.ButtonGradient btnAg;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private Design.TextFieldSV txtBusq;
    private Design.TextFieldSV txtBusq1;
    private Design.TextFieldSV txtIns;
    // End of variables declaration//GEN-END:variables
}
