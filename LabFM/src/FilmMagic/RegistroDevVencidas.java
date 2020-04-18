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
public class RegistroDevVencidas extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegistroDevVencidas
     */
    public RegistroDevVencidas() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodigoDevV = new javax.swing.JTextField();
        txtCodigCliente = new javax.swing.JTextField();
        txtCodigoPeli = new javax.swing.JTextField();
        textCodVideoJ = new javax.swing.JTextField();
        txtFRenta = new javax.swing.JTextField();
        textFDev = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFvencida = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPimporte = new javax.swing.JTextField();
        registro = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        label_status = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setVisible(true);

        jLabel1.setText("Codigo Devolucion Vencida");

        jLabel2.setText("Codigo Cliente");

        jLabel3.setText("Codigo Pelicula");

        jLabel4.setText("Codigo VideoJuego");

        jLabel5.setText("Fecha Renta");

        jLabel6.setText("Fecha Devolucion");

        jLabel7.setText("Fecha Vencida");

        jLabel8.setText("Pago Importe");

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

        jLabel9.setText("Codigo Vencida Devolucion");

        buscar.setText("BUSCAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        label_status.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(82, 82, 82)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtCodigoDevV, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(110, 110, 110)
                                    .addComponent(txtCodigCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textCodVideoJ)
                                        .addComponent(jLabel7)
                                        .addComponent(txtFvencida, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                    .addComponent(registro))
                                .addGap(110, 110, 110)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eliminar)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtFRenta)
                                        .addComponent(txtPimporte)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel5))
                                            .addGap(0, 0, Short.MAX_VALUE))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(txtCodigoPeli)
                                    .addComponent(textFDev, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(modificar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscar)
                            .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoDevV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoPeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCodVideoJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFRenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFDev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFvencida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPimporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registro)
                    .addComponent(eliminar)
                    .addComponent(modificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscar)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroActionPerformed
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/labfm", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into fvencida values(?,?,?,?,?,?,?,?,?)");
            pst.setString(1, "0");
            pst.setString(2, txtCodigoDevV.getText().trim());
            pst.setString(3, txtCodigCliente.getText().trim());
            pst.setString(4, txtCodigoPeli.getText().trim());
            pst.setString(5, textCodVideoJ.getText().trim());
            pst.setString(6, txtFRenta.getText().trim());
            pst.setString(7, textFDev.getText().trim());
            pst.setString(8, txtFvencida.getText().trim());
            pst.setString(9, txtPimporte.getText().trim());
            pst.executeUpdate();
            txtCodigoDevV.setText("");
            txtCodigCliente.setText("");
            txtCodigoPeli.setText("");
            textCodVideoJ.setText("");
            txtFRenta.setText("");
            textFDev.setText("");
            txtFvencida.setText("");
            txtPimporte.setText("");
            label_status.setText("Registro exitoso.");
            {
                JOptionPane.showMessageDialog(null, "Registro Exitosamente Vencimiento.");
            }
        }catch (Exception e){

        }
    }//GEN-LAST:event_registroActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        //Codigo que permite borrar registros en la base de datos
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/labfm", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from fvencida where CodigoVideoJ = ?");

            pst.setString(1, txt_buscar.getText().trim());
            pst.executeUpdate();

            txtCodigoDevV.setText("");
            txtCodigCliente.setText("");
            txtCodigoPeli.setText("");
            textCodVideoJ.setText("");
            txtFRenta.setText("");
            textFDev.setText("");
            txtFvencida.setText("");
            txtPimporte.setText("");
            label_status.setText("Registro eliminado Exitosamente.");
            {
                JOptionPane.showMessageDialog(null, "Registro de Vencimiento Eliminado.");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        //Codigo que permite actualizar registros en la base de datos
        try {
            String ID = txt_buscar.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/labfm", "root", "");
            PreparedStatement pst = cn.prepareStatement("update fvencida set CodigoDevVencida = ?, CodigoCliente = ?, CodigoPelicula = ?, CodigoVideoJ = ?, FechaRenta = ?, FechaDevolucion = ?, FechaVencida = ?, PagoImporte = ? where ID = " + ID);

            pst.setString(1, "0");
            pst.setString(1, txtCodigoDevV.getText().trim());
            pst.setString(2, txtCodigCliente.getText().trim());
            pst.setString(3, txtCodigoPeli.getText().trim());
            pst.setString(4, textCodVideoJ.getText().trim());
            pst.setString(5, txtFRenta.getText().trim());
            pst.setString(6, textFDev.getText().trim());
            pst.setString(7, txtFvencida.getText().trim());
            pst.setString(8, txtPimporte.getText().trim());
            pst.executeUpdate();

            label_status.setText("Modificación exitosa.");
            {
                JOptionPane.showMessageDialog(null, "Registro Actualizado Exitosamente.");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        //Codigo que permite consultar registros en la base de datos
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/labfm", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from fvencida where ID = ?");
            pst.setString(1, txt_buscar.getText().trim());

            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                txtCodigoDevV.setText(rs.getString("CodigoDevVencida"));
                txtCodigCliente.setText(rs.getString("CodigoCliente"));
                txtCodigoPeli.setText(rs.getString("CodigoPelicula"));
                textCodVideoJ.setText(rs.getString("CodigoVideoJ"));
                txtFRenta.setText(rs.getString("FechaRenta"));
                textFDev.setText(rs.getString("FechaDevolucion"));
                txtFvencida.setText(rs.getString("FechaVencida"));
                txtPimporte.setText(rs.getString("PagoImporte"));
            } else {
                JOptionPane.showMessageDialog(null, "Registro de Vencimiento no Registrado.");
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel label_status;
    private javax.swing.JButton modificar;
    private javax.swing.JButton registro;
    private javax.swing.JTextField textCodVideoJ;
    private javax.swing.JTextField textFDev;
    private javax.swing.JTextField txtCodigCliente;
    private javax.swing.JTextField txtCodigoDevV;
    private javax.swing.JTextField txtCodigoPeli;
    private javax.swing.JTextField txtFRenta;
    private javax.swing.JTextField txtFvencida;
    private javax.swing.JTextField txtPimporte;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
