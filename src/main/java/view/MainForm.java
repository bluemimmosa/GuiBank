/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Primax
 */
public class MainForm extends javax.swing.JFrame {
   
    
    /**
     * Creates new form MainForm
     */
    public MainForm() {
       
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

        dskPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jCreateAccount = new javax.swing.JMenuItem();
        jDeleteAccount = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jWithdraw = new javax.swing.JMenuItem();
        jDeposit = new javax.swing.JMenuItem();
        jSearch = new javax.swing.JMenuItem();
        jListAll = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dskPaneLayout = new javax.swing.GroupLayout(dskPane);
        dskPane.setLayout(dskPaneLayout);
        dskPaneLayout.setHorizontalGroup(
            dskPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );
        dskPaneLayout.setVerticalGroup(
            dskPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );

        jMenu1.setText("Accounts");

        jCreateAccount.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jCreateAccount.setText("Create New Account");
        jCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCreateAccountActionPerformed(evt);
            }
        });
        jMenu1.add(jCreateAccount);

        jDeleteAccount.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jDeleteAccount.setText("Delete Account");
        jDeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteAccountActionPerformed(evt);
            }
        });
        jMenu1.add(jDeleteAccount);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Operations");

        jWithdraw.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jWithdraw.setText("Withdraw");
        jWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jWithdrawActionPerformed(evt);
            }
        });
        jMenu2.add(jWithdraw);

        jDeposit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jDeposit.setText("Deposit");
        jDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDepositActionPerformed(evt);
            }
        });
        jMenu2.add(jDeposit);

        jSearch.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jSearch.setText("Search Account by Name");
        jSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchActionPerformed(evt);
            }
        });
        jMenu2.add(jSearch);

        jListAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jListAll.setText("List All Accounts");
        jListAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListAllActionPerformed(evt);
            }
        });
        jMenu2.add(jListAll);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("System");

        jExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jExit.setText("Exit");
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });
        jMenu3.add(jExit);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCreateAccountActionPerformed
        // TODO add your handling code here:
        CreateAccountView cav = new CreateAccountView(dskPane);
        dskPane.add(cav);
        cav.setVisible(true);
    }//GEN-LAST:event_jCreateAccountActionPerformed

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jExitActionPerformed

    private void jListAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListAllActionPerformed
        // TODO add your handling code here:
        ListAllAccountView list = new ListAllAccountView(dskPane);
        dskPane.add(list);
        list.setVisible(true);
    }//GEN-LAST:event_jListAllActionPerformed

    private void jSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchActionPerformed
        // TODO add your handling code here:
        ListAccountByNameView list = new ListAccountByNameView(dskPane);
        dskPane.add(list);
        list.setVisible(true);
    }//GEN-LAST:event_jSearchActionPerformed

    private void jWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jWithdrawActionPerformed
        // TODO add your handling code here:
        WithdrawView wv = new WithdrawView(dskPane);
        dskPane.add(wv);
        wv.setVisible(true);
    }//GEN-LAST:event_jWithdrawActionPerformed

    private void jDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDepositActionPerformed
        // TODO add your handling code here:
        DepositView dv = new DepositView(dskPane);
        dskPane.add(dv);
        dv.setVisible(true);
    }//GEN-LAST:event_jDepositActionPerformed

    private void jDeleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteAccountActionPerformed
        // TODO add your handling code here:
        DeleteAccView dav = new DeleteAccView(dskPane);
        dskPane.add(dav);
        dav.setVisible(true);
    }//GEN-LAST:event_jDeleteAccountActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dskPane;
    private javax.swing.JMenuItem jCreateAccount;
    private javax.swing.JMenuItem jDeleteAccount;
    private javax.swing.JMenuItem jDeposit;
    private javax.swing.JMenuItem jExit;
    private javax.swing.JMenuItem jListAll;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jSearch;
    private javax.swing.JMenuItem jWithdraw;
    // End of variables declaration//GEN-END:variables
}
