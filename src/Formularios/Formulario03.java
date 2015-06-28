package Formularios;

import Clases.Persona;
import Sistema.Principal;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencias.Persistenciapersona;
/**
 * 
 * @author YESSENIA MONTALVO
 */
public class Formulario03 extends javax.swing.JInternalFrame {

   

    public Formulario03() {
        initComponents();
        LimpiarTabla();
       LlenarTable();
       
    }
     void LimpiarTabla() {
        DefaultTableModel df = (DefaultTableModel) datos.getModel();
        int a = df.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            df.removeRow(i);
        }

    }

    public void LlenarTable() {
        LimpiarTabla();
        ArrayList<Persona> listaPersona = Persistenciapersona.LoadData();
        DefaultTableModel df = ((DefaultTableModel) datos.getModel());
         for (Persona p : listaPersona) {
            df.addRow(new Object[]{p.getNombre(), p.getApellido(), p.getEdad(), p.getDni(), p.getSexo(), p.getTelefono(), p.getMovil()});
            }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtdocumento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtcelular = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbedad = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        datos = new javax.swing.JTable();
        btnInsertar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnconsultar = new javax.swing.JButton();
        cbSexo = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("REGISTRO DE PERSONAS");

        jLabel1.setText("NOMBRE:");

        jLabel2.setText("APELLIDOS");

        jLabel3.setText("TELEFONO:");

        jLabel4.setText("EDAD");

        jLabel5.setText("DOCUMENTO/DNI: ");

        jLabel6.setText("CELULAR:");

        cbedad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONAR:", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));
        cbedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbedadActionPerformed(evt);
            }
        });

        datos.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        datos.setForeground(new java.awt.Color(102, 102, 255));
        datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "APELLIDOS", "EDAD", "DOCUMENTO", "GENERO", "TELEFONO", "CELULAR"
            }
        ));
        jScrollPane1.setViewportView(datos);

        btnInsertar.setText("INSERTAR PERSONA");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btneliminar.setText("ELIMINAR PERSONA");

        btnconsultar.setText("CONSULTAR PERSONA");
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONAR:", "MASCULINO", "FEMENINO" }));
        cbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSexoActionPerformed(evt);
            }
        });

        jLabel7.setText("SEXO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtapellido, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                    .addComponent(txtnombre)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbSexo, 0, 125, Short.MAX_VALUE)
                                    .addComponent(txtdocumento))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnInsertar)
                        .addGap(135, 135, 135)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btneliminar)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcelular)
                            .addComponent(txttelefono)
                            .addComponent(cbedad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnconsultar)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cbedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btneliminar)
                    .addComponent(btnconsultar)
                    .addComponent(btnInsertar))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        LimpiarTabla();
        ArrayList<Persona> listaUsuario = Persistenciapersona.LoadData();
        Persona p = new Persona();
        p.setNombre(txtnombre.getText());
        p.setApellido(txtapellido.getText());
        p.setEdad(cbedad.getSelectedIndex());
        p.setDni(txtdocumento.getText());
        p.setTelefono(txttelefono.getText());
        p.setMovil(txtcelular.getText());
        p.setSexo((String) cbSexo.getSelectedItem());
        listaUsuario.add(p);
        Persistenciapersona.SaveData(listaUsuario);
        //limpiamos los controles
        txtnombre.setText("");
        txtapellido.setText("");
        txtcelular.setText("");
        txtdocumento.setText("");
        txttelefono.setText("");
        cbedad.setSelectedItem(0);
        cbSexo.setSelectedItem(0);
        
        LlenarTable();
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void cbedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbedadActionPerformed
        int edad = cbedad.getSelectedIndex();
        if (edad > 0) {
            JOptionPane.showMessageDialog(this, "CONFIRMAR EDAD");

        } else {
            JOptionPane.showMessageDialog(this, "SELECCIONA UNA EDAD");
        }
    }//GEN-LAST:event_cbedadActionPerformed

    private void cbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSexoActionPerformed
        String sexo = (String) cbSexo.getSelectedItem();
        if (cbSexo.getSelectedItem().equals(0) && sexo.equals(0)) {
            JOptionPane.showMessageDialog(this, "SELECCIONE SU SEXO");

        } else {
            JOptionPane.showMessageDialog(this, "CONFIRMAR SELECCION");
        }
    }//GEN-LAST:event_cbSexoActionPerformed

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        String codigocopiado = txtnombre.getText().trim();//obtengo el valos
        Persona p= new Persona();
        if (codigocopiado.equals(p.getNombre())) {
            txtnombre.setText(p.getNombre());
            txtapellido.setText(p.getApellido());
            txtdocumento.setText(p.getDni());
            txtcelular.setText(p.getTelefono());
            txttelefono.setText(p.getMovil());
            cbedad.setSelectedItem(p.getEdad());
            cbSexo.setSelectedItem(p.getSexo());
           
        } else {
            JOptionPane.showMessageDialog(this, "NO EXISTE PERSONA REGISTRADO CON ESE NOMBRE");
                   }
    }//GEN-LAST:event_btnconsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JComboBox cbSexo;
    private javax.swing.JComboBox cbedad;
    private javax.swing.JTable datos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtdocumento;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
