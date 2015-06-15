package Sistema;
import javax.swing.JOptionPane;
/** * * @author RAUL */
public class Formulario01 extends javax.swing.JInternalFrame {

    public Formulario01() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        lblIcono1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        lblpassword = new javax.swing.JLabel();
        Contraseña = new javax.swing.JPasswordField();
        btninicio = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/imagenes/fondo.jpg"))); // NOI18N

        lblIcono1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/imagenes/iconoName.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/imagenes/password.jpeg"))); // NOI18N

        lbluser.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbluser.setText("USERNAME");

        lblpassword.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblpassword.setText("PASSWORD");

        btninicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/imagenes/inicio.jpeg"))); // NOI18N
        btninicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIcono1)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbluser, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtuser)
                    .addComponent(lblpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btninicio, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(lblIcono1))
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(lbluser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblpassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btninicio)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btninicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninicioActionPerformed
         char clave[] = Contraseña.getPassword();

        String clavedef = new String(clave);

        if (txtuser.getText().equals("IBERO") && clavedef.equals("IBERO")) {

            this.dispose();

            JOptionPane.showMessageDialog(null, "Bienvenido\n"
                    + "Has ingresado satisfactoriamente al sistema", "Mensaje de bienvenida",
                    JOptionPane.INFORMATION_MESSAGE);

            Formulario2 a = new Formulario2();
        a.setVisible(true);

        } else {

            JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
                    + "Por favor ingrese un usuario y/o contraseña correctos", "Acceso denegado",
                    JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btninicioActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JButton btninicio;
    private javax.swing.JLabel jLabel1;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private javax.swing.JLabel lblIcono1;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lbluser;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
