/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AccountHandler;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Primax
 */
public class ListAllAccountView extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListAllAccountView
     */
    private DefaultTableModel dtm;
    private int row = -1;
    public javax.swing.JDesktopPane dskPane;
    AccountHandler ach;

    public void refereshTable(){
        dtm.setRowCount(0);
        ArrayList<Object[]> data = ach.getAllAccounts();
        
        for(Object obj[] : data){
            dtm.addRow(obj);
        }
    }
    
    public ListAllAccountView(javax.swing.JDesktopPane dskPane) {
        this.dskPane = dskPane;
        initComponents();
        ach = new AccountHandler();
        dtm = (DefaultTableModel) tblAllAccounts.getModel();
        refereshTable();
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAllAccounts = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("All Accounts List");

        tblAllAccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Account Number", "Name", "Mobile Number", "Amount", "Account Type"
            }
        ));
        jScrollPane1.setViewportView(tblAllAccounts);

        jLabel1.setText("All Acounts present in system:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAllAccounts;
    // End of variables declaration//GEN-END:variables
}