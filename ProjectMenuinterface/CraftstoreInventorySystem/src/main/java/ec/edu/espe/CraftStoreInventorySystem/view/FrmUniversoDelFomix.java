/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.CraftStoreInventorySystem.view;

/**
 *
 * @author Mario Anrrango, A-Byte Wizards, DCCO - ESPE
 */
public class FrmUniversoDelFomix extends javax.swing.JFrame {

    /**
     * Creates new form FrmUniversoFomix
     */
    public FrmUniversoDelFomix() {
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

        jMenu4 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuUniversoDelFomix = new javax.swing.JMenu();
        mnuItemWelcome = new javax.swing.JMenuItem();
        submnuConfiguration = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        mnuItemHelp = new javax.swing.JMenuItem();
        mnuItemLogOut = new javax.swing.JMenuItem();
        mnuItemExit = new javax.swing.JMenuItem();
        mnuInvoice = new javax.swing.JMenu();
        mnuItemInvoice = new javax.swing.JMenuItem();
        mnuItemDeleteInvoice = new javax.swing.JMenuItem();
        mnuItemNewInvoice = new javax.swing.JMenuItem();
        mnuInventory = new javax.swing.JMenu();
        submnuManagementInventory = new javax.swing.JMenu();
        subMnuItemAddProduct = new javax.swing.JMenuItem();
        subMnuItemEditProduct = new javax.swing.JMenuItem();
        subMnuItemDeleteProduct = new javax.swing.JMenuItem();
        mnuItemInventory = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mnuAddCustomer = new javax.swing.JMenuItem();
        mnuEditCustomer = new javax.swing.JMenuItem();
        mnuDeleteCustomer = new javax.swing.JMenuItem();
        mnuSeeCustomer = new javax.swing.JMenuItem();

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuUniversoDelFomix.setText("Universo del Fomix");

        mnuItemWelcome.setText("Bienvenido !");
        mnuItemWelcome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemWelcomeActionPerformed(evt);
            }
        });
        mnuUniversoDelFomix.add(mnuItemWelcome);

        submnuConfiguration.setText("Configuración");

        jMenuItem7.setText("Usuario");
        submnuConfiguration.add(jMenuItem7);

        jMenuItem8.setText("Cambiar Usuario");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        submnuConfiguration.add(jMenuItem8);

        mnuUniversoDelFomix.add(submnuConfiguration);

        mnuItemHelp.setText("Ayuda");
        mnuUniversoDelFomix.add(mnuItemHelp);

        mnuItemLogOut.setText("Cerrar Sesión");
        mnuItemLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemLogOutActionPerformed(evt);
            }
        });
        mnuUniversoDelFomix.add(mnuItemLogOut);

        mnuItemExit.setText("Salir");
        mnuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemExitActionPerformed(evt);
            }
        });
        mnuUniversoDelFomix.add(mnuItemExit);

        jMenuBar1.add(mnuUniversoDelFomix);

        mnuInvoice.setText("Factura");

        mnuItemInvoice.setText("Facturas");
        mnuItemInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemInvoiceActionPerformed(evt);
            }
        });
        mnuInvoice.add(mnuItemInvoice);

        mnuItemDeleteInvoice.setText("Eliminar Factura");
        mnuItemDeleteInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemDeleteInvoiceActionPerformed(evt);
            }
        });
        mnuInvoice.add(mnuItemDeleteInvoice);

        mnuItemNewInvoice.setText("Nueva Factura");
        mnuItemNewInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemNewInvoiceActionPerformed(evt);
            }
        });
        mnuInvoice.add(mnuItemNewInvoice);

        jMenuBar1.add(mnuInvoice);

        mnuInventory.setText("Inventario");
        mnuInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuInventoryActionPerformed(evt);
            }
        });

        submnuManagementInventory.setText("Administrar Inventario");
        submnuManagementInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submnuManagementInventoryActionPerformed(evt);
            }
        });

        subMnuItemAddProduct.setText("Añadir Producto");
        subMnuItemAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMnuItemAddProductActionPerformed(evt);
            }
        });
        submnuManagementInventory.add(subMnuItemAddProduct);

        subMnuItemEditProduct.setText("Editar Producto");
        subMnuItemEditProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMnuItemEditProductActionPerformed(evt);
            }
        });
        submnuManagementInventory.add(subMnuItemEditProduct);

        subMnuItemDeleteProduct.setText("Eliminar Producto");
        subMnuItemDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMnuItemDeleteProductActionPerformed(evt);
            }
        });
        submnuManagementInventory.add(subMnuItemDeleteProduct);

        mnuInventory.add(submnuManagementInventory);

        mnuItemInventory.setText("Inventario");
        mnuItemInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemInventoryActionPerformed(evt);
            }
        });
        mnuInventory.add(mnuItemInventory);

        jMenuBar1.add(mnuInventory);

        jMenu1.setText("Clientes");

        mnuAddCustomer.setText("Añadir Cliente");
        mnuAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAddCustomerActionPerformed(evt);
            }
        });
        jMenu1.add(mnuAddCustomer);

        mnuEditCustomer.setText("Editar Cliente");
        mnuEditCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEditCustomerActionPerformed(evt);
            }
        });
        jMenu1.add(mnuEditCustomer);

        mnuDeleteCustomer.setText("Borrar Cliente");
        mnuDeleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDeleteCustomerActionPerformed(evt);
            }
        });
        jMenu1.add(mnuDeleteCustomer);

        mnuSeeCustomer.setText("Ver Clientes");
        mnuSeeCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSeeCustomerActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSeeCustomer);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed

    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void mnuItemWelcomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemWelcomeActionPerformed
       FrmPrincipalScreen frmPrincipalScreen = new FrmPrincipalScreen();
       this.setVisible(false);
       frmPrincipalScreen.setVisible(true);
    }//GEN-LAST:event_mnuItemWelcomeActionPerformed

    private void mnuItemLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemLogOutActionPerformed
        FrmLogin frmLogin = new FrmLogin();
        this.setVisible(false);
        frmLogin.setVisible(true);
    }//GEN-LAST:event_mnuItemLogOutActionPerformed

    private void mnuItemInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemInventoryActionPerformed
        FrmViewInventory frmViewInventory = new FrmViewInventory();
        this.setVisible(false);
        frmViewInventory.setVisible(true);
    }//GEN-LAST:event_mnuItemInventoryActionPerformed

    private void mnuInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuInventoryActionPerformed
        
    }//GEN-LAST:event_mnuInventoryActionPerformed

    private void submnuManagementInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submnuManagementInventoryActionPerformed

    }//GEN-LAST:event_submnuManagementInventoryActionPerformed

    private void mnuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuItemExitActionPerformed

    private void subMnuItemAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMnuItemAddProductActionPerformed
        FrmAddProduct frmAddProduct = new FrmAddProduct();
        this.setVisible(false);
        frmAddProduct.setVisible(true);
    }//GEN-LAST:event_subMnuItemAddProductActionPerformed

    private void subMnuItemEditProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMnuItemEditProductActionPerformed
        FrmEditProduct frmEditProduct = new FrmEditProduct();
        this.setVisible(false);
        frmEditProduct.setVisible(true);
    }//GEN-LAST:event_subMnuItemEditProductActionPerformed

    private void subMnuItemDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMnuItemDeleteProductActionPerformed
        FrmDeleteProduct frmDeleteProduct = new FrmDeleteProduct();
        this.setVisible(false);
        frmDeleteProduct.setVisible(true);
    }//GEN-LAST:event_subMnuItemDeleteProductActionPerformed

    private void mnuItemInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemInvoiceActionPerformed
        FrmViewInvoice frmViewInvoice = new FrmViewInvoice();
        this.setVisible(false);
        frmViewInvoice.setVisible(true);
    }//GEN-LAST:event_mnuItemInvoiceActionPerformed

    private void mnuItemDeleteInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemDeleteInvoiceActionPerformed
        FrmDeleteInvoice frmDeleteInvoice = new FrmDeleteInvoice();
        this.setVisible(false);
        frmDeleteInvoice.setVisible(true);
    }//GEN-LAST:event_mnuItemDeleteInvoiceActionPerformed

    private void mnuItemNewInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemNewInvoiceActionPerformed
        FrmNewInvoice frmNewInvoice = new FrmNewInvoice();
        this.setVisible(false);
        frmNewInvoice.setVisible(true);
    }//GEN-LAST:event_mnuItemNewInvoiceActionPerformed

    private void mnuAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAddCustomerActionPerformed
        // TODO add your handling code here:
        FrmAddCustomer frmAddCustomer = new FrmAddCustomer();
        frmAddCustomer.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_mnuAddCustomerActionPerformed

    private void mnuSeeCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSeeCustomerActionPerformed
        // TODO add your handling code here:
        FrmViewCustomer frmViewCustomer = new FrmViewCustomer();
        frmViewCustomer.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuSeeCustomerActionPerformed

    private void mnuDeleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDeleteCustomerActionPerformed
        // TODO add your handling code here:
        FrmDeleteCustomer frmDeleteCustomer = new FrmDeleteCustomer();
        frmDeleteCustomer.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuDeleteCustomerActionPerformed

    private void mnuEditCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEditCustomerActionPerformed
        // TODO add your handling code here:
        FrmEditCustomer frmEditCustomer = new FrmEditCustomer();
        frmEditCustomer.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuEditCustomerActionPerformed

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
            java.util.logging.Logger.getLogger(FrmUniversoDelFomix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUniversoDelFomix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUniversoDelFomix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUniversoDelFomix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUniversoDelFomix().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem mnuAddCustomer;
    private javax.swing.JMenuItem mnuDeleteCustomer;
    private javax.swing.JMenuItem mnuEditCustomer;
    private javax.swing.JMenu mnuInventory;
    private javax.swing.JMenu mnuInvoice;
    private javax.swing.JMenuItem mnuItemDeleteInvoice;
    private javax.swing.JMenuItem mnuItemExit;
    private javax.swing.JMenuItem mnuItemHelp;
    private javax.swing.JMenuItem mnuItemInventory;
    private javax.swing.JMenuItem mnuItemInvoice;
    private javax.swing.JMenuItem mnuItemLogOut;
    private javax.swing.JMenuItem mnuItemNewInvoice;
    private javax.swing.JMenuItem mnuItemWelcome;
    private javax.swing.JMenuItem mnuSeeCustomer;
    private javax.swing.JMenu mnuUniversoDelFomix;
    private javax.swing.JMenuItem subMnuItemAddProduct;
    private javax.swing.JMenuItem subMnuItemDeleteProduct;
    private javax.swing.JMenuItem subMnuItemEditProduct;
    private javax.swing.JMenu submnuConfiguration;
    private javax.swing.JMenu submnuManagementInventory;
    // End of variables declaration//GEN-END:variables
}
