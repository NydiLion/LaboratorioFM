/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FilmMagic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author snake
 */
public class MantenimientoPeliculas extends javax.swing.JInternalFrame {

    /** Creates new form MantenimientoPeliculas */
    public MantenimientoPeliculas() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCodigoP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombreP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtClasiP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTipoP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtExisP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEstatusP = new javax.swing.JTextField();
        label_status = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        registro = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setVisible(true);

        jLabel1.setText("Codigo Pelicula");

        jLabel2.setText("Nombre Pelicula");

        jLabel3.setText("Clasificacion Pelicula");

        jLabel4.setText("Tipo de Pelicula");

        jLabel5.setText("Existencia Pelicula");

        jLabel6.setText("Estatus Pelicula");

        jLabel8.setText("Ingresar Codigo Pelicula");

        registro.setText("REGISTRO");
        registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroActionPerformed(evt);
            }
        });

        eliminar.setText("ELIMINAR");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        modificar.setText("MODIFICAR");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        buscar.setText("BUSCAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreP))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstatusP)
                            .addComponent(txtExisP)
                            .addComponent(txtTipoP)
                            .addComponent(txtClasiP))))
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(registro))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(modificar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(buscar)
                                        .addGap(2, 2, 2)))))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_buscar)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_status, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(eliminar)
                                .addGap(24, 24, 24)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(registro)
                        .addGap(34, 34, 34)
                        .addComponent(eliminar)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(modificar)
                                .addGap(46, 46, 46))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(buscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtClasiP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtTipoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtExisP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtEstatusP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 98, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroActionPerformed
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/labfm", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into peliculas values(?,?,?,?,?,?,?)");
            pst.setString(1, "0");
            pst.setString(2, txtCodigoP.getText().trim());
            pst.setString(3, txtNombreP.getText().trim());
            pst.setString(4, txtClasiP.getText().trim());
            pst.setString(5, txtTipoP.getText().trim());
            pst.setString(6, txtExisP.getText().trim());
            pst.setString(7, txtEstatusP.getText().trim());
            pst.executeUpdate();
            
            txtCodigoP.setText("");
            txtNombreP.setText("");
            txtClasiP.setText("");
            txtTipoP.setText("");
            txtExisP.setText("");
            txtEstatusP.setText("");
            
            label_status.setText("Registro exitoso.");
            {
                JOptionPane.showMessageDialog(null, "Pelicula Registrada Exitosamente.");
            }
        }catch (Exception e){

        }
    }//GEN-LAST:event_registroActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        //Codigo que permite borrar registros en la base de datos
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/labfm", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from peliculas where CodigoPelicula = ?");

            pst.setString(1, txt_buscar.getText().trim());
            pst.executeUpdate();

            txtCodigoP.setText("");
            txtNombreP.setText("");
            txtClasiP.setText("");
            txtTipoP.setText("");
            txtExisP.setText("");
            txtEstatusP.setText("");
            label_status.setText("Registro eliminado.");
            {
                JOptionPane.showMessageDialog(null, "Pelicula Eliminada.");
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_eliminarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        //Codigo que permite actualizar registros en la base de datos
        try {
            String ID = txt_buscar.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/labfm", "root", "");
            PreparedStatement pst = cn.prepareStatement("update peliculas set CodigoPelicula = ?, NombrePelicula = ?, AutorPelicula = ?, TipoPelicula = ?, ExistenciaPelicula = ?, EstatusPelicula = ? where ID = " + ID);

            pst.setString(1, "0");
            pst.setString(1, txtCodigoP.getText().trim());
            pst.setString(2, txtNombreP.getText().trim());
            pst.setString(3, txtClasiP.getText().trim());
            pst.setString(4, txtTipoP.getText().trim());
            pst.setString(5, txtExisP.getText().trim());
            pst.setString(6, txtEstatusP.getText().trim());
            pst.executeUpdate();

            label_status.setText("Modificación exitosa.");
            {
                JOptionPane.showMessageDialog(null, "Pelicula Modificada.");
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_modificarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        //Codigo que permite consultar registros en la base de datos
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/labfm", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from peliculas where ID = ?");
            pst.setString(1, txt_buscar.getText().trim());

            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                txtCodigoP.setText(rs.getString("CodigoPelicula"));
                txtNombreP.setText(rs.getString("NombrePelicula"));
                txtClasiP.setText(rs.getString("AutorPelicula"));
                txtTipoP.setText(rs.getString("TipoPelicula"));
                txtExisP.setText(rs.getString("ExistenciaPelicula"));
                txtEstatusP.setText(rs.getString("EstatusPelicula"));
            } else {
                JOptionPane.showMessageDialog(null, "Pelicula no registrada.");
            }

        }catch (Exception e){

        }

    }//GEN-LAST:event_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel label_status;
    private javax.swing.JButton modificar;
    private javax.swing.JButton registro;
    private javax.swing.JTextField txtClasiP;
    private javax.swing.JTextField txtCodigoP;
    private javax.swing.JTextField txtEstatusP;
    private javax.swing.JTextField txtExisP;
    private javax.swing.JTextField txtNombreP;
    private javax.swing.JTextField txtTipoP;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables

}
