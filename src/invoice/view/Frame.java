
package invoice.view;

import invoice.controller.SalesController;
import invoice.model.InvoiceHeader;
import invoice.model.InvoiceHeaderTableModel;
import invoice.model.InvoiceLinesTableModel;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.JTextField;


public class Frame extends javax.swing.JFrame {

    public Frame() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        invoicesTable = new javax.swing.JTable();
        invoicesTable.getSelectionModel().addListSelectionListener(listener);
        createInvBtn = new javax.swing.JButton();
        createInvBtn.addActionListener(listener);
        deleteInvBtn = new javax.swing.JButton();
        deleteInvBtn.addActionListener(listener);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        custNameTF = new javax.swing.JTextField();
        invDateTF = new javax.swing.JTextField();
        invNumLbl = new javax.swing.JLabel();
        invTotalLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        invLinesTable = new javax.swing.JTable();
        createLineBtn = new javax.swing.JButton();
        createLineBtn.addActionListener(listener);
        deleteLineBtn = new javax.swing.JButton();
        deleteLineBtn.addActionListener(listener);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadMenuItem = new javax.swing.JMenuItem();
        loadMenuItem.addActionListener(listener);
        saveMenuItem = new javax.swing.JMenuItem();
        saveMenuItem.addActionListener(listener);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invoicesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(invoicesTable);

        createInvBtn.setText("Create New Invoice");
        createInvBtn.setActionCommand("CreateNewInvoice");

        deleteInvBtn.setText("Delete Invoice");
        deleteInvBtn.setActionCommand("DeleteInvoice");

        jLabel1.setText("Invoice_Number");

        jLabel2.setText("Invoice_Date");

        jLabel3.setText("Customer_name");

        jLabel4.setText("Invoice_Total");

        invLinesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(invLinesTable);

        createLineBtn.setText("Create New Line");
        createLineBtn.setActionCommand("CreateNewLine");
        createLineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createLineBtnActionPerformed(evt);
            }
        });

        deleteLineBtn.setText("Delete Line");
        deleteLineBtn.setActionCommand("DeleteLine");

        jMenu1.setText("File");

        loadMenuItem.setText("Load File");
        loadMenuItem.setActionCommand("LoadFile");
        jMenu1.add(loadMenuItem);

        saveMenuItem.setText("Save File");
        saveMenuItem.setActionCommand("SaveFile");
        jMenu1.add(saveMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout Invlayout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(Invlayout);
        Invlayout.setHorizontalGroup(
                Invlayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Invlayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Invlayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Invlayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(createLineBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(deleteLineBtn)
                        .addGap(120, 120, 120))
                    .addGroup(Invlayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(Invlayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Invlayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(Invlayout.createSequentialGroup()
                                .addGroup(Invlayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(Invlayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(custNameTF)
                                    .addComponent(invDateTF)
                                    .addGroup(Invlayout.createSequentialGroup()
                                        .addGroup(Invlayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(invTotalLbl)
                                            .addComponent(invNumLbl))
                                        .addGap(0, 349, Short.MAX_VALUE)))))))
                .addContainerGap())
            .addGroup(Invlayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(createInvBtn)
                .addGap(80, 80, 80)
                .addComponent(deleteInvBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Invlayout.setVerticalGroup(
                Invlayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Invlayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Invlayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Invlayout.createSequentialGroup()
                        .addGroup(Invlayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(invNumLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Invlayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(invDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Invlayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(custNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Invlayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(invTotalLbl))
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(Invlayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createLineBtn)
                            .addComponent(deleteLineBtn)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(Invlayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createInvBtn)
                    .addComponent(deleteInvBtn))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createLineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createLineBtnActionPerformed
        
    }
//main code  and try catch error 
   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration 
    private javax.swing.JButton createInvBtn;
    private javax.swing.JButton createLineBtn;
    private javax.swing.JTextField custNameTF;
    private javax.swing.JButton deleteInvBtn;
    private javax.swing.JButton deleteLineBtn;
    private javax.swing.JTextField invDateTF;
    private javax.swing.JTable invLinesTable;
    private javax.swing.JLabel invNumLbl;
    private javax.swing.JLabel invTotalLbl;
    private javax.swing.JTable invoicesTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem loadMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration

    private List<InvoiceHeader> invoicesList = new ArrayList<>();
    private InvoiceHeaderTableModel invoiceHeaderTableModel;
    private InvoiceLinesTableModel invoiceLinesTableModel;
    private InvHeaderDialog headerDialog;
    private InvLineDialog lineDialog;
    private SalesController listener = new SalesController(this);

    public SalesController getListener() {
        return listener;
    }

    public void setHeaderDialog(InvHeaderDialog headerDialog) {
        this.headerDialog = headerDialog;
    }

    public void setLineDialog(InvLineDialog lineDialog) {
        this.lineDialog = lineDialog;
    }

    public void setInvoiceHeaderTableModel(InvoiceHeaderTableModel invoiceHeaderTableModel) {
        this.invoiceHeaderTableModel = invoiceHeaderTableModel;
    }

    public void setInvoiceLinesTableModel(InvoiceLinesTableModel invoiceLinesTableModel) {
        this.invoiceLinesTableModel = invoiceLinesTableModel;
    }

    public JButton getCreateInvBtn() {
        return createInvBtn;
    }

    public JButton getCreateLineBtn() {
        return createLineBtn;
    }

    public JTextField getCustNameTF() {
        return custNameTF;
    }

    public JButton getDeleteInvBtn() {
        return deleteInvBtn;
    }

    public JButton getDeleteLineBtn() {
        return deleteLineBtn;
    }

    public JTextField getInvDateTF() {
        return invDateTF;
    }

    public JTable getInvLinesTable() {
        return invLinesTable;
    }

    public JLabel getInvNumLbl() {
        return invNumLbl;
    }

    public JLabel getInvTotalLbl() {
        return invTotalLbl;
    }

    public JTable getInvoicesTable() {
        return invoicesTable;
    }

    public JMenuItem getLoadMenuItem() {
        return loadMenuItem;
    }

    public JMenuItem getSaveMenuItem() {
        return saveMenuItem;
    }

    public List<InvoiceHeader> getInvoicesList() {
        return invoicesList;
    }

    public InvoiceHeaderTableModel getInvoiceHeaderTableModel() {
        return invoiceHeaderTableModel;
    }

    public InvoiceLinesTableModel getInvoiceLinesTableModel() {
        return invoiceLinesTableModel;
    }

    public InvHeaderDialog getHeaderDialog() {
        return headerDialog;
    }

    public InvLineDialog getLineDialog() {
        return lineDialog;
    }


}
