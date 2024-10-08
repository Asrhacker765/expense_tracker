package java_project;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;


public class PurchaseViewerScreen extends javax.swing.JFrame {

    private static PurchaseViewerScreen instance;

    //BudgetScreen CONSTRUCTOR =================================================
    public PurchaseViewerScreen() {
        initComponents();

        //Set Username Label
        lblUsername.setText(main.currentUser.getUserID());
        //Set Account Amount Display
        lblAmount.setText(main.currentUser.getCheckingAccount().getBalance().toString());

        //SystemOutput the ArrayList DEBUG
        for (int index = 0; index < main.currentUser.getPurchaseArrayList().size(); index++) {
            System.out.println(main.currentUser.getPurchaseArrayList().get(index).getName());
        }

        //Set Shortcuts
        btnLog.setMnemonic('L');
        btnViewAll.setMnemonic('A');
        btnSearch.setMnemonic('S');
        btnEnter.setMnemonic('P');
        btnSend.setMnemonic('E');
        btnFix.setMnemonic('F');
        btnTips.setMnemonic('T');
    }

    public static PurchaseViewerScreen getInstance() {
        if (instance == null) {
            instance = new PurchaseViewerScreen();
        }
        return instance;
    }

    //GENERATED CODE ===========================================================
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogSavings = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblSavingsBalance = new javax.swing.JLabel();
        txtNewSavingsBalance = new javax.swing.JTextField();
        btnSavingsBalanceOK = new javax.swing.JButton();
        dialogChecking = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblCheckingBalance = new javax.swing.JLabel();
        txtNewCheckingBalance = new javax.swing.JTextField();
        btnCheckingBalanceOK = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        cboxBankAccount = new javax.swing.JComboBox();
        btnEnter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnViewAll = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        cboxSort = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResults = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        btnSend = new javax.swing.JButton();
        btnTips = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btnFix = new javax.swing.JButton();
        lblAmount = new javax.swing.JLabel();
    
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Budget Planner");
        setResizable(false);
    
        // Set the size of the JFrame to match the screen size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0, 0, screenSize.width, screenSize.height);

        //dialogSavings.setMinimumSize(new java.awt.Dimension(354, 170));
        dialogSavings.setResizable(false);

       
jLabel1.setFont(new Font("Dialog", Font.BOLD, 18));

jLabel2.setFont(new Font("Dialog", Font.BOLD, 24));



jLabel3.setFont(new Font("Dialog", Font.BOLD, 18));


jLabel6.setFont(new Font("Dialog", Font.BOLD, 18));



lblUsername.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 18));

lblAmount.setFont(lblAmount.getFont().deriveFont(16f)); // Set font size to 16


        // Set background image
    JPanel contentPane = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            try {
                Image backgroundImage = ImageIO.read(new File("C:\\Users\\Lenovo\\Pictures\\Saved Pictures\\img10.jpg"));
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                System.out.println("Image loaded successfully!");
            } catch (IOException e) {
                System.out.println("Failed to load image: " + e.getMessage());
                e.printStackTrace();
            }
        }
    };
    setContentPane(contentPane);
    contentPane.setLayout(new BorderLayout());

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Fix your SAVINGS account balance");

        jLabel10.setText("Current balance:");

        jLabel11.setText("New balance:");

        lblSavingsBalance.setText("balance");

        btnSavingsBalanceOK.setText("OK");
        btnSavingsBalanceOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavingsBalanceOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogSavingsLayout = new javax.swing.GroupLayout(dialogSavings.getContentPane());
dialogSavings.getContentPane().setLayout(dialogSavingsLayout);
dialogSavingsLayout.setHorizontalGroup(
    dialogSavingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(dialogSavingsLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(dialogSavingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(dialogSavingsLayout.createSequentialGroup()
                .addGroup(dialogSavingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dialogSavingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSavingsBalance)
                    .addComponent(txtNewSavingsBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogSavingsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSavingsBalanceOK)))
        .addContainerGap())
);
dialogSavingsLayout.setVerticalGroup(
    dialogSavingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(dialogSavingsLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel5)
        .addGap(18, 18, 18)
        .addGroup(dialogSavingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel10)
            .addComponent(lblSavingsBalance))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(dialogSavingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel11)
            .addComponent(txtNewSavingsBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnSavingsBalanceOK)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
);


        dialogChecking.setMinimumSize(new java.awt.Dimension(354, 170));
        dialogChecking.setResizable(false);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Fix your CHECKING account balance");

        jLabel12.setText("Current balance:");

        jLabel13.setText("New balance:");

        lblCheckingBalance.setText("balance");

        btnCheckingBalanceOK.setText("OK");
        btnCheckingBalanceOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckingBalanceOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogCheckingLayout = new javax.swing.GroupLayout(dialogChecking.getContentPane());
        dialogChecking.getContentPane().setLayout(dialogCheckingLayout);
        dialogCheckingLayout.setHorizontalGroup(
            dialogCheckingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogCheckingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dialogCheckingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(dialogCheckingLayout.createSequentialGroup()
                        .addGroup(dialogCheckingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(dialogCheckingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCheckingBalance)
                            .addComponent(txtNewCheckingBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 147, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogCheckingLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCheckingBalanceOK)))
                .addContainerGap())
        );
        dialogCheckingLayout.setVerticalGroup(
            dialogCheckingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogCheckingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(dialogCheckingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lblCheckingBalance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dialogCheckingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtNewCheckingBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCheckingBalanceOK)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Budget Planner");
        setResizable(false);

        lblUsername.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUsername.setText("username");

        cboxBankAccount.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Checking", "Savings" }));
        cboxBankAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxBankAccountActionPerformed(evt);
            }
        });

        btnEnter.setText("Enter Purchase");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        jLabel1.setText("Welcome");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel2.setText("Purchase Viewer");

        jLabel3.setText("Select your account:");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnSearch.setText("Search Purchases");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Search");

        btnViewAll.setText("View All");
        btnViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllActionPerformed(evt);
            }
        });

        jLabel7.setText("Sort by");

        cboxSort.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Date", "Category", "Price" }));

        txtResults.setColumns(20);
        txtResults.setRows(5);
        jScrollPane2.setViewportView(txtResults);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addGap(36, 36, 36)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboxSort, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(cboxSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewAll)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel6.setText("Amount   $");

        btnSend.setText("View Goals");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        btnTips.setText("Budget Visualization");
        btnTips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipsActionPerformed(evt);
            }
        });

        btnLog.setText("Log Out");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        btnFix.setText("Fix Amount");
        btnFix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFixActionPerformed(evt);
            }
        });

        lblAmount.setText("<amount>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnFix, javax.swing.GroupLayout.PREFERRED_SIZE, 97, Short.MAX_VALUE)
                                    .addComponent(cboxBankAccount, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnTips, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEnter, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE) // Add more space here
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLog, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLog))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cboxBankAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEnter))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(btnSend)
                            .addComponent(lblAmount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFix)
                            .addComponent(btnTips)))) 
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );


        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }// </editor-fold>//GEN-END:initComponents

    //SEARCH BUTTOM ============================================================
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String COLUMN;

        if (cboxSort.getSelectedItem() == "Date") {
            COLUMN = "DATETIME";
        } else if (cboxSort.getSelectedItem() == "Price") {
            COLUMN = "AMOUNT";
        } else if (cboxSort.getSelectedItem() == "Category") {
            COLUMN = "CATEGORY";
        } else {
            COLUMN = "ERROR";
        }

        String statement = "SELECT * FROM PURCHASES WHERE NAME LIKE '%" + txtSearch.getText() + "%' GROUP BY "
                + COLUMN + " UNION SELECT * FROM PURCHASES WHERE DESCRIPTION LIKE '%" + txtSearch.getText() + "%' "
                + "GROUP BY " + COLUMN;

        txtResults.setText("Date \t\t\t\t Name \t Amount \t Bank \t Category \t Description \n"
                + "==================================================================================================== \n");

        //ArrayList<String> Results = main.database.SelectPurchase(statement);
        for (String str : main.database.SelectPurchase(statement)) {
            txtResults.append(str + "\n");
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    //LOG OUT BUTTON ===========================================================
    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed

        if (evt.getSource() == btnLog) {
            //Save User Information
            main.WriteObjectToFile(main.currentUser, main.currentUserFile);

            //Go to next screen
            LogInScreen MainScreen = new LogInScreen();
            this.dispose();
            MainScreen.setVisible(true);
        }
    }//GEN-LAST:event_btnLogActionPerformed

    //ACCOUNT COMBO BOX ========================================================
    private void cboxBankAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxBankAccountActionPerformed

        //Select checking items if checking is selected
        if (cboxBankAccount.getSelectedItem() == "Checking") {
            lblAmount.setText(main.currentUser.getCheckingAccount().getBalance().toString());
        }

        //Select savings items if savings is selected
        if (cboxBankAccount.getSelectedItem() == "Savings") {
            lblAmount.setText(main.currentUser.getSavingsAccount().getBalance().toString());
        }
    }//GEN-LAST:event_cboxBankAccountActionPerformed

    //FIX ACCOUNT BALANCE BUTTON ===============================================
    private void btnFixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFixActionPerformed

        //load checking settings and dialog box
        if (cboxBankAccount.getSelectedItem() == "Checking") {
            lblCheckingBalance.setText(main.currentUser.getCheckingAccount().getBalance().toString());
            dialogChecking.setVisible(true);
        }

        //load savings settings and dialog box
        if (cboxBankAccount.getSelectedItem() == "Savings") {
            lblSavingsBalance.setText(main.currentUser.getSavingsAccount().getBalance().toString());
            dialogSavings.setVisible(true);
        }
    }//GEN-LAST:event_btnFixActionPerformed

    //SAVINGS ACCOUNT BALANCE FIX DIALOG BOX ===================================
    private void btnSavingsBalanceOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavingsBalanceOKActionPerformed

        //set balance, reset data for database, reset index, close dialog box
        main.currentUser.getSavingsAccount().setBalance(Double.parseDouble(txtNewSavingsBalance.getText()));
        main.database.GenericStatement("DELETE FROM BANK_ACCOUNTS WHERE ACCOUNT_NAME = 'Savings'");
        main.database.InsertStatement("BANK_ACCOUNTS", "'Savings', " + txtNewSavingsBalance.getText());

        cboxBankAccount.setSelectedIndex(1);
        dialogSavings.dispose();
    }//GEN-LAST:event_btnSavingsBalanceOKActionPerformed

    //CHECKING ACCOUNT BALANCE FIX DIALOG BOX ==================================
    private void btnCheckingBalanceOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckingBalanceOKActionPerformed

        //set balance, reset index, close dialog box
        main.currentUser.getCheckingAccount().setBalance(Double.parseDouble(txtNewCheckingBalance.getText()));
        main.database.GenericStatement("DELETE FROM BANK_ACCOUNTS WHERE ACCOUNT_NAME = 'Checking'");
        main.database.InsertStatement("BANK_ACCOUNTS", "'Checking', " + txtNewCheckingBalance.getText());

        cboxBankAccount.setSelectedIndex(0);
        dialogChecking.dispose();
    }//GEN-LAST:event_btnCheckingBalanceOKActionPerformed

    //ENTER PURCHASE BUTTON ====================================================
    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed

        //Open the EnterPurchaseScreen Window
        EnterPurchaseScreen purchase = new EnterPurchaseScreen();
        dispose();
        purchase.setVisible(true);
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnTipsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipsActionPerformed

        //Open the TwitteAPI Window
        BudgetVisualization budgetVis = new BudgetVisualization("Budget Visualization");
        dispose();
        budgetVis.setVisible(true);
    }//GEN-LAST:event_btnTipsActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        GoalsDisplayForm GoalForm = new GoalsDisplayForm();
        dispose();
        GoalForm.setVisible(true);
    }//GEN-LAST:event_btnSendActionPerformed

    //VIEW ALL BUTTON ==========================================================
    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed
        String COLUMN;

        if (cboxSort.getSelectedItem() == "Date") {
            COLUMN = "DATETIME";
        } else if (cboxSort.getSelectedItem() == "Price") {
            COLUMN = "AMOUNT";
        } else if (cboxSort.getSelectedItem() == "Category") {
            COLUMN = "CATEGORY";
        } else {
            COLUMN = "ERROR";
        }

        String statement = "SELECT * FROM PURCHASES ORDER BY " + COLUMN;

        txtResults.setText("Date \t Name \t Amount \t Bank \t Category \t Description \n"
                + "==================================================================================================== \n");

        //ArrayList<String> Results = main.database.SelectPurchase(statement);
        for (String str : main.database.SelectPurchase(statement)) {
            txtResults.append(str + "\n");
        }
    }//GEN-LAST:event_btnViewAllActionPerformed

    //MAIN METHOD ==============================================================
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PurchaseViewerScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchaseViewerScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchaseViewerScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchaseViewerScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //Display Form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PurchaseViewerScreen purchaseViewerScreen = new PurchaseViewerScreen();
                GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
                Rectangle bounds = env.getMaximumWindowBounds();
                purchaseViewerScreen.setSize(bounds.width, bounds.height); // Set size to screen dimensions
                purchaseViewerScreen.setVisible(true);
            }
        });
    }

    //JFRAME VARIABLES =========================================================
    // <editor-fold defaultstate="collapsed" desc=" JFrame Variables ">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckingBalanceOK;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnFix;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnSavingsBalanceOK;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnTips;
    private javax.swing.JToggleButton btnViewAll;
    private javax.swing.JComboBox cboxBankAccount;
    private javax.swing.JComboBox cboxSort;
    private javax.swing.JDialog dialogChecking;
    private javax.swing.JDialog dialogSavings;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblCheckingBalance;
    private javax.swing.JLabel lblSavingsBalance;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtNewCheckingBalance;
    private javax.swing.JTextField txtNewSavingsBalance;
    private javax.swing.JTextArea txtResults;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}

