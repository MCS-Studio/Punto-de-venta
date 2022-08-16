/*
 * Descripccion: VENTANA ELIMINAR PROVEEDOR
 * Alumno: JOSÉ LUIS ROCHA LÓPEZ
 * Fecha: 26/06/2022
 */
package vista;

/**
 *
 * @author Ching
 */
public class eliminar extends javax.swing.JFrame {

    /**
     * Creates new form eliminar
     */
    public eliminar() {
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

        LBModificarProveedor = new javax.swing.JLabel();
        LBproveedor = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        BTTNuevoProveedor = new javax.swing.JButton();
        BTTEliminarProveedor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaprov = new javax.swing.JTable();
        BTTEliminarBuscado = new javax.swing.JButton();
        BTTMostrarPro = new javax.swing.JButton();
        LBNombreProveedor = new javax.swing.JLabel();
        TXTNombreProveedor = new javax.swing.JTextField();
        BTTBuscar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        BtnMenuVentas = new javax.swing.JMenu();
        BtnMenuClientes = new javax.swing.JMenu();
        BtnMenuProductos = new javax.swing.JMenu();
        BtnMenuProveedores = new javax.swing.JMenu();
        BtnMenuInventario = new javax.swing.JMenu();
        BtnMenuConfiguracion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eliminar Proveedor");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBModificarProveedor.setBackground(new java.awt.Color(255, 153, 51));
        LBModificarProveedor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LBModificarProveedor.setForeground(new java.awt.Color(255, 153, 51));
        LBModificarProveedor.setText("ELIMINAR PROVEEDOR");
        getContentPane().add(LBModificarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, -1));

        LBproveedor.setText("PROVEEDORES");
        getContentPane().add(LBproveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1020, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1020, 10));

        BTTNuevoProveedor.setText("Nuevo");
        getContentPane().add(BTTNuevoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        BTTEliminarProveedor.setText("Eliminar");
        getContentPane().add(BTTEliminarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        tablaprov.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdProveedores", "Nombre Proveedor", "RFC", "Telefonos", "Correo", "Calle Y Numero", "Colonia", "Municipio", "Estado", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaprov);
        if (tablaprov.getColumnModel().getColumnCount() > 0) {
            tablaprov.getColumnModel().getColumn(0).setResizable(false);
            tablaprov.getColumnModel().getColumn(1).setResizable(false);
            tablaprov.getColumnModel().getColumn(2).setResizable(false);
            tablaprov.getColumnModel().getColumn(3).setResizable(false);
            tablaprov.getColumnModel().getColumn(4).setResizable(false);
            tablaprov.getColumnModel().getColumn(5).setResizable(false);
            tablaprov.getColumnModel().getColumn(6).setResizable(false);
            tablaprov.getColumnModel().getColumn(7).setResizable(false);
            tablaprov.getColumnModel().getColumn(8).setResizable(false);
            tablaprov.getColumnModel().getColumn(9).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 1020, 400));

        BTTEliminarBuscado.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        BTTEliminarBuscado.setText("Eliminar proveedor");
        BTTEliminarBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTTEliminarBuscadoActionPerformed(evt);
            }
        });
        getContentPane().add(BTTEliminarBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 590, -1, -1));

        BTTMostrarPro.setText("Mostar Todo");
        BTTMostrarPro.setMaximumSize(new java.awt.Dimension(101, 22));
        BTTMostrarPro.setMinimumSize(new java.awt.Dimension(101, 22));
        getContentPane().add(BTTMostrarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, 240, 60));

        LBNombreProveedor.setText("Nombre del Proveedor");
        getContentPane().add(LBNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 116, -1, 30));

        TXTNombreProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTNombreProveedorActionPerformed(evt);
            }
        });
        getContentPane().add(TXTNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 200, -1));

        BTTBuscar.setText("Buscar");
        getContentPane().add(BTTBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 110, 30));

        BtnMenuVentas.setText("Ventas");
        jMenuBar1.add(BtnMenuVentas);

        BtnMenuClientes.setText("Clientes");
        jMenuBar1.add(BtnMenuClientes);

        BtnMenuProductos.setText("Productos");
        jMenuBar1.add(BtnMenuProductos);

        BtnMenuProveedores.setText("Proveedores");
        jMenuBar1.add(BtnMenuProveedores);

        BtnMenuInventario.setText("Inventario");
        jMenuBar1.add(BtnMenuInventario);

        BtnMenuConfiguracion.setText("Configuracion");
        jMenuBar1.add(BtnMenuConfiguracion);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTTEliminarBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTTEliminarBuscadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTTEliminarBuscadoActionPerformed

    private void TXTNombreProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTNombreProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTNombreProveedorActionPerformed

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
            java.util.logging.Logger.getLogger(eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new eliminar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTTBuscar;
    public javax.swing.JButton BTTEliminarBuscado;
    public javax.swing.JButton BTTEliminarProveedor;
    public javax.swing.JButton BTTMostrarPro;
    public javax.swing.JButton BTTNuevoProveedor;
    public javax.swing.JMenu BtnMenuClientes;
    public javax.swing.JMenu BtnMenuConfiguracion;
    public javax.swing.JMenu BtnMenuInventario;
    public javax.swing.JMenu BtnMenuProductos;
    public javax.swing.JMenu BtnMenuProveedores;
    public javax.swing.JMenu BtnMenuVentas;
    private javax.swing.JLabel LBModificarProveedor;
    private javax.swing.JLabel LBNombreProveedor;
    private javax.swing.JLabel LBproveedor;
    public javax.swing.JTextField TXTNombreProveedor;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JTable tablaprov;
    // End of variables declaration//GEN-END:variables
}
