
package ec.edu.espe.easyorder.view;

/**
 *
 * @author Esteban Quiroga
 */
public class FrmManager extends javax.swing.JFrame {

    /**
     * Creates new form FrmWorker
     */
    public FrmManager() {
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

        jPanel1 = new javax.swing.JPanel();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuInvoices = new javax.swing.JMenu();
        itmOpenInvoices = new javax.swing.JMenuItem();
        mnuExpenses = new javax.swing.JMenu();
        itmOpenExpenses = new javax.swing.JMenuItem();
        mnuReports = new javax.swing.JMenu();
        itmOpenReports = new javax.swing.JMenuItem();
        mnuClients = new javax.swing.JMenu();
        itmOpenClients = new javax.swing.JMenuItem();
        itmMenu = new javax.swing.JMenu();
        itmOpenMenu = new javax.swing.JMenuItem();
        mnuOrders = new javax.swing.JMenu();
        itmOpenOrders = new javax.swing.JMenuItem();
        mnuConfigurations = new javax.swing.JMenu();
        itmGoToLogIn = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenuItem6.setText("jMenuItem6");

        jMenuItem7.setText("jMenuItem7");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu6.setText("File");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuInvoices.setText("Facturas");

        itmOpenInvoices.setText("Abrir Facturas");
        itmOpenInvoices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmOpenInvoicesActionPerformed(evt);
            }
        });
        mnuInvoices.add(itmOpenInvoices);

        jMenuBar1.add(mnuInvoices);

        mnuExpenses.setText("Gastos");

        itmOpenExpenses.setText("Abrir Gastos");
        itmOpenExpenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmOpenExpensesActionPerformed(evt);
            }
        });
        mnuExpenses.add(itmOpenExpenses);

        jMenuBar1.add(mnuExpenses);

        mnuReports.setText("Reportes");

        itmOpenReports.setText("Abrir Reportes");
        itmOpenReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmOpenReportsActionPerformed(evt);
            }
        });
        mnuReports.add(itmOpenReports);

        jMenuBar1.add(mnuReports);

        mnuClients.setText("Clientes");

        itmOpenClients.setText("Abrir Clientes");
        itmOpenClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmOpenClientsActionPerformed(evt);
            }
        });
        mnuClients.add(itmOpenClients);

        jMenuBar1.add(mnuClients);

        itmMenu.setText("Menu");

        itmOpenMenu.setText("Abrir Menú");
        itmOpenMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmOpenMenuActionPerformed(evt);
            }
        });
        itmMenu.add(itmOpenMenu);

        jMenuBar1.add(itmMenu);

        mnuOrders.setText("Ordenes");

        itmOpenOrders.setText("Abrir Ordenes");
        itmOpenOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmOpenOrdersActionPerformed(evt);
            }
        });
        mnuOrders.add(itmOpenOrders);

        jMenuBar1.add(mnuOrders);

        mnuConfigurations.setText("Ajustes");

        itmGoToLogIn.setText("Volver Al LogIn");
        itmGoToLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmGoToLogInActionPerformed(evt);
            }
        });
        mnuConfigurations.add(itmGoToLogIn);

        jMenuBar1.add(mnuConfigurations);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmOpenInvoicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmOpenInvoicesActionPerformed
        FrmInvoice frmInvoice = new FrmInvoice();
        frmInvoice.setVisible(true);
    }//GEN-LAST:event_itmOpenInvoicesActionPerformed

    private void itmOpenClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmOpenClientsActionPerformed
        FrmCustomer frmCustomer = new FrmCustomer();
        frmCustomer.setVisible(true);
    }//GEN-LAST:event_itmOpenClientsActionPerformed

    private void itmOpenReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmOpenReportsActionPerformed
        FrmAccountingReport frmAccountingReport = new FrmAccountingReport();
        frmAccountingReport.setVisible(true);
    }//GEN-LAST:event_itmOpenReportsActionPerformed

    private void itmOpenExpensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmOpenExpensesActionPerformed
        FrmExpense frmExpense = new FrmExpense();
        frmExpense.setVisible(true);
    }//GEN-LAST:event_itmOpenExpensesActionPerformed

    private void itmGoToLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmGoToLogInActionPerformed
        FrmLogIn frmLogIn = new FrmLogIn();
        frmLogIn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itmGoToLogInActionPerformed

    private void itmOpenMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmOpenMenuActionPerformed
        FrmMenu frmMenu = new FrmMenu();
        frmMenu.setVisible(true);
    }//GEN-LAST:event_itmOpenMenuActionPerformed

    private void itmOpenOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmOpenOrdersActionPerformed
        FrmOrder frmOrder = new FrmOrder();
        frmOrder.setVisible(true);
    }//GEN-LAST:event_itmOpenOrdersActionPerformed

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
            java.util.logging.Logger.getLogger(FrmManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JMenuItem itmGoToLogIn;
    private javax.swing.JMenu itmMenu;
    private javax.swing.JMenuItem itmOpenClients;
    private javax.swing.JMenuItem itmOpenExpenses;
    private javax.swing.JMenuItem itmOpenInvoices;
    private javax.swing.JMenuItem itmOpenMenu;
    private javax.swing.JMenuItem itmOpenOrders;
    private javax.swing.JMenuItem itmOpenReports;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mnuClients;
    private javax.swing.JMenu mnuConfigurations;
    private javax.swing.JMenu mnuExpenses;
    private javax.swing.JMenu mnuInvoices;
    private javax.swing.JMenu mnuOrders;
    private javax.swing.JMenu mnuReports;
    // End of variables declaration//GEN-END:variables
}
