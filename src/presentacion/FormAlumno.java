/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import base_de_datos.ConexionSQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class FormAlumno extends javax.swing.JFrame {

    /**
     * Creates new form FormAlumno
     */
    public FormAlumno() {
        initComponents();
        verConsulta();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_Id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_Cantidad = new javax.swing.JTextField();
        lbl_cantidad = new javax.swing.JLabel();
        btn_Guardar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn_Eliminar = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_contenido = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CRUD generico");

        txt_Id.setText("esto no existe");

        jLabel2.setText("id");

        jLabel3.setText("nombre");

        lbl_cantidad.setText("cantidad");

        btn_Guardar.setText("Guardar");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });

        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        btn_Editar.setText("Editar");
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Editar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Editar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(btn_Eliminar)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(lbl_cantidad)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txt_Id)
                            .addComponent(txt_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(txt_Cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cantidad)
                    .addComponent(txt_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btn_Guardar)
                .addGap(2, 2, 2)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tb_contenido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nombre", "cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_contenido);
        if (tb_contenido.getColumnModel().getColumnCount() > 0) {
            tb_contenido.getColumnModel().getColumn(0).setResizable(false);
            tb_contenido.getColumnModel().getColumn(1).setResizable(false);
            tb_contenido.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private boolean modoActualizar = false;
    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed

        String nombre = txt_Nombre.getText().trim();
        String cantidadTexto = txt_Cantidad.getText().trim();

        // Validar que no estén vacíos
        if (nombre.isEmpty() || cantidadTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Convertir cantidad a número entero
            int cantidad = Integer.parseInt(cantidadTexto);

            // Insertar el producto en la base de datos
            ConexionSQL conexionSQL = new ConexionSQL();
            boolean exito = conexionSQL.insertarProducto(nombre, cantidad);

            if (exito) {
                JOptionPane.showMessageDialog(this, "Producto guardado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                // Opcional: actualizar la tabla para mostrar el nuevo registro
                DefaultTableModel modelo = (DefaultTableModel) tb_contenido.getModel();
                int filas = modelo.getRowCount();
                for (int i = filas - 1; i >= 0; i--) {
                    modelo.removeRow(i); // Eliminar fila desde el final para evitar problemas con los índices
                }
                //int id =modelo.getRowCount();
                //id ++;
                //modelo.addRow(new Object[]{null, nombre, cantidad});
                verConsulta();
            } else {
                JOptionPane.showMessageDialog(this, "Error al guardar el producto.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La cantidad debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed

        if (!modoActualizar) {
            int seleccionado = tb_contenido.getSelectedRow();

            if (seleccionado != -1) {
                DefaultTableModel renacuajo = (DefaultTableModel) tb_contenido.getModel();
                btn_Editar.setText("Actualizar");
                String id_num = renacuajo.getValueAt(seleccionado, 0).toString();
                String nombre = renacuajo.getValueAt(seleccionado, 1).toString();
                String cantidad_num = renacuajo.getValueAt(seleccionado, 2).toString();
                txt_Id.setText(id_num);
                txt_Nombre.setText(nombre);
                txt_Cantidad.setText(cantidad_num);
                modoActualizar = true;

            } else {
                JOptionPane.showMessageDialog(null, "Por favor, selecciona un registro primero.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
            return;
        }
        if (modoActualizar) {
            
            String a = txt_Id.getText();
            String b = txt_Nombre.getText();
            String c = txt_Cantidad.getText();

            int a_id = Integer.parseInt(a);
            int c_cant = Integer.parseInt(c);
            ConexionSQL conexionSQL = new ConexionSQL();
            boolean exito = conexionSQL.editarProducto(a_id, b, c_cant);
            if (exito) {

                JOptionPane.showMessageDialog(null, "Producto editado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                
                DefaultTableModel modelo = (DefaultTableModel) tb_contenido.getModel();
                int filas = modelo.getRowCount();
                for (int i = filas - 1; i >= 0; i--) {
                    modelo.removeRow(i); // Eliminar fila desde el final para evitar problemas con los índices
                }
                modoActualizar = false;
                verConsulta();
                btn_Editar.setText("Editar");
            }

        }

        return;
    }//GEN-LAST:event_btn_EditarActionPerformed


    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        int seleccionado = tb_contenido.getSelectedRow();
        if (seleccionado != -1) {

            DefaultTableModel renacuajo = (DefaultTableModel) tb_contenido.getModel();

            String id_num = renacuajo.getValueAt(seleccionado, 0).toString();
            String cantidad_num = renacuajo.getValueAt(seleccionado, 2).toString();
            String nombre = renacuajo.getValueAt(seleccionado, 1).toString();
            int id = Integer.parseInt(id_num);
            int cantidad = Integer.parseInt(cantidad_num);
            ConexionSQL conexionSQL = new ConexionSQL();
            boolean exito = conexionSQL.eliminarProducto(id, nombre, cantidad);
            if (exito) {

                JOptionPane.showMessageDialog(null, "Producto borrado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                // Opcional: actualizar la tabla para mostrar el nuevo registro
                DefaultTableModel modelo = (DefaultTableModel) tb_contenido.getModel();
                int filas = modelo.getRowCount();
                for (int i = filas - 1; i >= 0; i--) {
                    modelo.removeRow(i); // Eliminar fila desde el final para evitar problemas con los índices
                }
                verConsulta();
            }

        } else {
            JOptionPane.showMessageDialog(null, "No se selecciono nada", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btn_EliminarActionPerformed

    public void consultaGenerica() {

        String Data[] = {"", txt_Nombre.getText(), txt_Cantidad.getText()};
        DefaultTableModel tabla = (DefaultTableModel) tb_contenido.getModel();
        tabla.addRow(Data);
    }

    public void verConsulta() {
        ConexionSQL conexionSQL = new ConexionSQL();
        Connection conn = conexionSQL.conectarMySQL();
        // Intentar conectar
        if (conn != null) {
            System.out.println("Conexión establecida. Ejecutando consulta...");
            try {
                // Crear un objeto Statement para ejecutar consultas
                Statement stmt = conn.createStatement();

                // Consulta SQL
                String query = "SELECT * FROM productos";

                // Ejecutar la consulta y obtener resultados
                ResultSet rs = stmt.executeQuery(query);

                // Iterar sobre los resultados
                System.out.println("Resultados:");
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String nombre = rs.getString("nombre");
                    int cantidad = rs.getInt("cantidad");
                    //System.out.println( "Nombre: " + nombre + ", Cantidad: " + cantidad);
                    String consulta[] = {String.valueOf(id), nombre, String.valueOf(cantidad)};
                    DefaultTableModel tabla = (DefaultTableModel) tb_contenido.getModel();
                    tabla.addRow(consulta);
                }
                rs.close();
                stmt.close();
            } catch (SQLException e) {
                System.err.println("Error al ejecutar la consulta.");
                e.printStackTrace();
            } finally {
                // Cerrar la conexión
                try {
                    conn.close();
                    System.out.println("Conexión cerrada.");
                } catch (SQLException e) {
                    System.err.println("Error al cerrar la conexión.");
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("No se pudo establecer la conexión.");
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_cantidad;
    private javax.swing.JTable tb_contenido;
    private javax.swing.JTextField txt_Cantidad;
    private javax.swing.JTextField txt_Id;
    private javax.swing.JTextField txt_Nombre;
    // End of variables declaration//GEN-END:variables
}
