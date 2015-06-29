package Formularios;

import Clases.Animal;
import Persistencias.PersistenciaAnimal;
import gestionarchivos.GestionA;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RAUL
 */
public class Formulario04 extends javax.swing.JInternalFrame {

    JFileChooser seleccionado = new JFileChooser();
    File archivo;
    byte[] bytesImg;
    GestionA gestion = new GestionA();

    public Formulario04() {
        initComponents();
        LimpiarTabla();
        LlenarTable();
    }

    void LimpiarTabla() {
        DefaultTableModel df = (DefaultTableModel) tabla.getModel();
        int a = df.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            df.removeRow(i);
        }

    }

    public void LlenarTable() {
        LimpiarTabla();
        ArrayList<Animal> lista = PersistenciaAnimal.LoadData();
        DefaultTableModel df = ((DefaultTableModel) tabla.getModel());
        for (Animal a : lista) {
           
                df.addRow(new Object[]{ a.getCodigo(), a.getNombre(), a.getColor(), a.getTipo(), a.getRaza(), a.getSexo()});

            
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        cbtipo = new javax.swing.JComboBox();
        cbraza = new javax.swing.JComboBox();
        cbsexo = new javax.swing.JComboBox();
        lblImagen = new javax.swing.JLabel();
        btnabrirImagen = new javax.swing.JButton();
        btnguardarFoto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnconsultar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btninsertar = new javax.swing.JButton();
        txtbuscador = new javax.swing.JTextField();
        txtcolor = new javax.swing.JTextField();
        lblcodigo = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("REGISTRO DE ANIMALES");

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        jLabel1.setText("NOMBRE DEL ANIMAL:");

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        jLabel2.setText("RAZA DEL ANIMAL");

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        jLabel3.setText("SEXO DEL ANIMAL:");

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        jLabel4.setText("COLOR DEL ANIMA:");

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        jLabel5.setText("FOTO DEL ANIMAL:");

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        jLabel6.setText("TIPO DE  MASCOTA:");

        cbtipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONAR:", "CONEJO", "PERRO", "GATO", "AVE", " " }));

        cbraza.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONAR:", "Alaskan Dwarf", "American Chinchilla", "American Sable", "Americano (American)", "Belgian Hare (Liebre Belga)", "Beveren", "Blanc Du Hotot (Blanco de Hotot)", "Britannian Petite o Polish Enano", "Californiano", "Cashmere Lop (Belier de Cachemira)", "Champagne D'Argent", "Checkered Giant", "Cinnamon", "Creme D'Argent", "Dutch", "Dwarf Hotot", "English Angora", "English Lop", "English Spot", "Flemish Giant", "Florida White", "French Angora", "French Lop", "Fuzzy Lop", "Giant Angora", "Giant Chinchilla", "Harlequín", "Havana", "Himalayo", "Holland Lop", "Jersey Wooly", "Lilac", "Lionhead", "Lionhead lop", "Mini Lop", "Mini Rex", "Mini Satin", "Mini Satin", "Netherland Dwarf", "New Zealand", "Palomino", "Polish o Brittanian Petite", "Rex", "Rhinelander", "Satin", "Satin Angora", "Silver", "Silver Fox", "Silver Marten", "Silver Plateado", "Standard Chinchilla", "Tan", "Thrianta", "Velveteen Lop", "Alano", "Basset Hound", "Beagle", "Bichon Frisé", "Bobtail", "Boxer", "Braco Alemán" }));

        cbsexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONAR:", "MACHO", "HEMBRA" }));

        btnabrirImagen.setText("OPEN");
        btnabrirImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnabrirImagenActionPerformed(evt);
            }
        });

        btnguardarFoto.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        btnguardarFoto.setText("SAVE");
        btnguardarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarFotoActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "COLOR", "TIPO", "RAZA", "SEXO"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        btnconsultar.setText("CONSULTAR");
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });

        btneliminar.setText("ELIMINAR ANIMAL");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btninsertar.setText("INSETAR");
        btninsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertarActionPerformed(evt);
            }
        });

        lblcodigo.setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        lblcodigo.setText("CODIGO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btninsertar)
                        .addGap(3, 3, 3)
                        .addComponent(btneliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtbuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnconsultar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbraza, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(28, 28, 28)
                                .addComponent(cbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(lblcodigo))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnombre)
                                    .addComponent(txtcodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5))
                            .addComponent(btnguardarFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnabrirImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(btnabrirImagen)
                                .addGap(32, 32, 32)
                                .addComponent(btnguardarFoto)
                                .addGap(82, 82, 82))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblcodigo)
                                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel1))
                                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtcolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cbraza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(26, 26, 26)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btninsertar)
                            .addComponent(btneliminar)
                            .addComponent(btnconsultar))))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnabrirImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnabrirImagenActionPerformed
        if (seleccionado.showDialog(null, "OPEN") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionado.getSelectedFile();
            if (archivo.getName().endsWith("jpeg") || archivo.getName().endsWith("jpg") || archivo.getName().endsWith("png") || archivo.getName().endsWith("gif")) {
                bytesImg = gestion.AbrirAImagen(archivo);
                lblImagen.setIcon(new ImageIcon(bytesImg));
            } else {
                JOptionPane.showMessageDialog(null, "Por favor seleccione un archivo  de imagen.");
            }
        }
    }//GEN-LAST:event_btnabrirImagenActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
            
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnguardarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarFotoActionPerformed
        if (seleccionado.showDialog(null, "SAVE") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionado.getSelectedFile();
            if (archivo.getName().endsWith("jpg") || archivo.getName().endsWith("png") || archivo.getName().endsWith("gif")) {
                String respuesta = gestion.GuardarAImagen(archivo, bytesImg);
                if (respuesta != null) {
                    JOptionPane.showMessageDialog(null, respuesta);
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar imagen.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "La imagen se debe guardar en formato de imagen.");
            }
        }
    }//GEN-LAST:event_btnguardarFotoActionPerformed

    private void btninsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertarActionPerformed
        LimpiarTabla();
        ArrayList<Animal> lista = PersistenciaAnimal.LoadData();
        Animal an = new Animal();
        an.setCodigo(Integer.parseInt(txtcodigo.getText()));
        an.setColor(txtcolor.getText());
        an.setNombre(txtnombre.getText());
        an.setRaza(("") + cbraza.getSelectedItem());
        an.setSexo(("") + cbsexo.getSelectedItem());
        an.setTipo(("") + cbtipo.getSelectedItem());
        lista.add(an);
        PersistenciaAnimal.SaveData(lista);
        txtcodigo.setText("");
        txtcolor.setText("");
        txtnombre.setText("");
        cbraza.setSelectedItem(null);
        cbsexo.setSelectedItem(null);
        cbtipo.setSelectedItem(null);
       LlenarTable();

    }//GEN-LAST:event_btninsertarActionPerformed

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        ArrayList<Animal> lista = PersistenciaAnimal.LoadData();
        String buscar = txtbuscador.getText();
        int buscar_1 = Integer.parseInt(buscar);
        for (Animal a : lista) {
            int busca = a.getCodigo();
            if (busca == buscar_1) {
               JOptionPane.showMessageDialog(this, "CODIGO ENCONTRADO");
                break;
            }else{
                JOptionPane.showMessageDialog(this, "NO EXISTE");
                 break;
            }
        } 
        
               
            
        
    }//GEN-LAST:event_btnconsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnabrirImagen;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardarFoto;
    private javax.swing.JButton btninsertar;
    private javax.swing.JComboBox cbraza;
    private javax.swing.JComboBox cbsexo;
    private javax.swing.JComboBox cbtipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblcodigo;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtbuscador;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcolor;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
