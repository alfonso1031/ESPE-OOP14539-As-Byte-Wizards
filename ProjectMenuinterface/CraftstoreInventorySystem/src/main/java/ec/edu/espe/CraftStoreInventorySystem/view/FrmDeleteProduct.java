
package ec.edu.espe.CraftStoreInventorySystem.view;

import ec.edu.espe.CraftStoreInventory.utils.CloudDB;
import java.awt.Color;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

public class FrmDeleteProduct extends javax.swing.JFrame {
    
    private CloudDB cloudDB;
    private DefaultTableModel tableModel;
    
    public FrmDeleteProduct() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/logo.png")).getImage());
        cloudDB = new CloudDB();
        tableModel = (DefaultTableModel) ID.getModel();
        loadProducts();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bckgDelete = new javax.swing.JPanel();
        deleteBtn = new javax.swing.JPanel();
        deleteFldText = new javax.swing.JLabel();
        returnBtn = new javax.swing.JPanel();
        returnFldText = new javax.swing.JLabel();
        productTable = new javax.swing.JScrollPane();
        ID = new javax.swing.JTable();
        searchTextFld = new javax.swing.JTextField();
        searchBtn = new javax.swing.JPanel();
        searchBtnText = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bckgDelete.setBackground(new java.awt.Color(255, 255, 255));
        bckgDelete.setForeground(new java.awt.Color(255, 255, 255));
        bckgDelete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deleteBtn.setBackground(new java.awt.Color(110, 80, 159));

        deleteFldText.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        deleteFldText.setForeground(new java.awt.Color(255, 255, 255));
        deleteFldText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteFldText.setText("BORRAR");
        deleteFldText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteFldText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteFldTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteFldTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteFldTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout deleteBtnLayout = new javax.swing.GroupLayout(deleteBtn);
        deleteBtn.setLayout(deleteBtnLayout);
        deleteBtnLayout.setHorizontalGroup(
            deleteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deleteFldText, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        deleteBtnLayout.setVerticalGroup(
            deleteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deleteFldText, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bckgDelete.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 140, 40));

        returnBtn.setBackground(new java.awt.Color(110, 80, 159));

        returnFldText.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        returnFldText.setForeground(new java.awt.Color(255, 255, 255));
        returnFldText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        returnFldText.setText("REGRESAR");
        returnFldText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnFldText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnFldTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                returnFldTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                returnFldTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout returnBtnLayout = new javax.swing.GroupLayout(returnBtn);
        returnBtn.setLayout(returnBtnLayout);
        returnBtnLayout.setHorizontalGroup(
            returnBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(returnFldText, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        returnBtnLayout.setVerticalGroup(
            returnBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(returnFldText, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bckgDelete.add(returnBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 140, 40));

        ID.setBackground(new java.awt.Color(221, 137, 213));
        ID.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "DESCRIPCIÓN", "CANTIDAD", "TAMAÑO", "PRECIO", "CATEGORÍA"
            }
        ));
        productTable.setViewportView(ID);

        bckgDelete.add(productTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 680, 230));
        bckgDelete.add(searchTextFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 360, 30));

        searchBtn.setBackground(new java.awt.Color(110, 80, 159));

        searchBtnText.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        searchBtnText.setForeground(new java.awt.Color(255, 255, 255));
        searchBtnText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchBtnText.setText("Buscar");
        searchBtnText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBtnTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchBtnTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchBtnTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout searchBtnLayout = new javax.swing.GroupLayout(searchBtn);
        searchBtn.setLayout(searchBtnLayout);
        searchBtnLayout.setHorizontalGroup(
            searchBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchBtnText, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        searchBtnLayout.setVerticalGroup(
            searchBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchBtnText, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        bckgDelete.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, -1, 30));

        jPanel1.setBackground(new java.awt.Color(221, 137, 213));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ELIMINACIÓN DE PRODUCTO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bckgDelete.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bckgDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bckgDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteFldTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteFldTextMouseEntered
        deleteBtn.setBackground(new Color(174, 58, 166));
    }//GEN-LAST:event_deleteFldTextMouseEntered

    private void deleteFldTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteFldTextMouseExited
        deleteBtn.setBackground(new Color(110, 80, 159));
    }//GEN-LAST:event_deleteFldTextMouseExited

    private void returnFldTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnFldTextMouseEntered
        returnBtn.setBackground(new Color(174, 58, 166));
    }//GEN-LAST:event_returnFldTextMouseEntered

    private void returnFldTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnFldTextMouseExited
        returnBtn.setBackground(new Color(110, 80, 159));
    }//GEN-LAST:event_returnFldTextMouseExited

    private void searchBtnTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnTextMouseEntered
        searchBtn.setBackground(new Color(174, 58, 166));
    }//GEN-LAST:event_searchBtnTextMouseEntered

    private void searchBtnTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnTextMouseExited
        searchBtn.setBackground(new Color(110, 80, 159));
    }//GEN-LAST:event_searchBtnTextMouseExited

    private void searchBtnTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnTextMouseClicked
        searchProduct(searchTextFld.getText()); 
    }//GEN-LAST:event_searchBtnTextMouseClicked

    private void deleteFldTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteFldTextMouseClicked
            int selectedRow = ID.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Porfavor selecicione un producto para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String id = tableModel.getValueAt(selectedRow, 0).toString();

        try {
            cloudDB.deleteProduct(id);
            tableModel.removeRow(selectedRow);
            JOptionPane.showMessageDialog(this, "El producto se ha eliminado.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en la eliminación: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteFldTextMouseClicked

    private void returnFldTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnFldTextMouseClicked
        FrmUniversoDelFomix frmUniversoDelFomix = new FrmUniversoDelFomix();
        this.setVisible(false);
        frmUniversoDelFomix.setVisible(true);
    }//GEN-LAST:event_returnFldTextMouseClicked

        private void searchProduct(String searchCriteria) {
        tableModel.setRowCount(0); // Limpiar tabla
        List<Document> products = cloudDB.getAllProducts();
        for (Document doc : products) {
            if (doc.getString("name").toLowerCase().contains(searchCriteria.toLowerCase()) || 
                doc.getString("id").toLowerCase().contains(searchCriteria.toLowerCase())) {
                Object[] rowData = {
                    doc.getString("id"),
                    doc.getString("name"),
                    doc.getString("description"),
                    doc.getInteger("quantity"),
                    doc.getString("size"),
                    doc.getDouble("price"),
                    doc.getString("category")
                };
                tableModel.addRow(rowData);
            }
        }
    }
        
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
            java.util.logging.Logger.getLogger(FrmDeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDeleteProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ID;
    private javax.swing.JPanel bckgDelete;
    private javax.swing.JPanel deleteBtn;
    private javax.swing.JLabel deleteFldText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane productTable;
    private javax.swing.JPanel returnBtn;
    private javax.swing.JLabel returnFldText;
    private javax.swing.JPanel searchBtn;
    private javax.swing.JLabel searchBtnText;
    private javax.swing.JTextField searchTextFld;
    // End of variables declaration//GEN-END:variables

    private void loadProducts() {
        List<Document> products = cloudDB.getAllProducts();
    for (Document doc : products) {
        Object[] rowData = {
            doc.getString("id"),
            doc.getString("name"),
            doc.getString("description"),
            doc.getInteger("quantity"),
            doc.getString("size"),
            doc.getDouble("price"),
            doc.getString("category")
          
        };
        tableModel.addRow(rowData);
    }
}

}


