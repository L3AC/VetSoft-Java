/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AVista.Clientes;

/**
 *
 * @author godna
 */
public class InfoCliente extends javax.swing.JPanel {

    /**
     * Creates new form InfoCliente
     */
    public InfoCliente() {
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

        PCont = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNom = new Design.TextFieldSV();
        txtSexo = new Design.TextFieldSV();
        txtNacimiento = new Design.TextFieldSV();
        txtDUI = new Design.TextFieldSV();
        txtDireccion = new Design.TextFieldSV();
        txtApellid = new Design.TextFieldSV();
        Nom = new javax.swing.JLabel();
        Apellido = new javax.swing.JLabel();
        DUI = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        Sexo = new javax.swing.JLabel();
        Direccion = new javax.swing.JLabel();

        PCont.setBackground(new java.awt.Color(190, 233, 232));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Informacion de Clientes");

        txtNom.setText("textFieldSV1");

        txtSexo.setText("textFieldSV1");

        txtNacimiento.setText("textFieldSV1");

        txtDUI.setText("textFieldSV1");

        txtDireccion.setText("textFieldSV1");

        txtApellid.setText("textFieldSV1");

        Nom.setText("Nombre:");

        Apellido.setText("Apellido");

        DUI.setText("DUI");

        Fecha.setText("Fecha de Nacimiento");

        Sexo.setText("Sexo");

        Direccion.setText("Direccion");

        javax.swing.GroupLayout PContLayout = new javax.swing.GroupLayout(PCont);
        PCont.setLayout(PContLayout);
        PContLayout.setHorizontalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PContLayout.createSequentialGroup()
                                .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PContLayout.createSequentialGroup()
                                .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtApellid, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PContLayout.createSequentialGroup()
                                .addComponent(txtDUI, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(294, 294, 294))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Nom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Apellido)
                        .addGap(518, 518, 518))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(DUI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Fecha)
                        .addGap(453, 453, 453))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(Sexo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Direccion)
                        .addGap(517, 517, 517))))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(458, 458, 458)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(157, 157, 157)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nom)
                    .addComponent(Apellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellid, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DUI, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Fecha, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDUI, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sexo)
                    .addComponent(Direccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(170, 170, 170))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PCont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PCont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private javax.swing.JLabel DUI;
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel Nom;
    private javax.swing.JPanel PCont;
    private javax.swing.JLabel Sexo;
    private javax.swing.JLabel jLabel1;
    private Design.TextFieldSV txtApellid;
    private Design.TextFieldSV txtDUI;
    private Design.TextFieldSV txtDireccion;
    private Design.TextFieldSV txtNacimiento;
    private Design.TextFieldSV txtNom;
    private Design.TextFieldSV txtSexo;
    // End of variables declaration//GEN-END:variables
}
