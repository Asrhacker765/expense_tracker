package java_project;
import javax.imageio.ImageIO;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class CreateBudgetScreen extends javax.swing.JFrame implements BudgetObserver {
    private double Total;
    private double HomeExpenses;
    private double Transportation;
    private double Health;
    private double Charity;
    private double DailyLiving;
    private double Entertainment;
    private double Financial;

    public CreateBudgetScreen() {
        initComponents();
        main.currentUser.getBudgetPlan().addObserver(this);
        main.currentUser.getCheckingAccount().addObserver(this);
        main.currentUser.getSavingsAccount().addObserver(this);
    }
    
    @Override
    
    public void updateBudget() {
        // Update the total label
        double total = HomeExpenses + Transportation + Health + Charity + DailyLiving + Entertainment + Financial;
        lblTotal.setText(String.valueOf(total));

        // Update text fields with the current values
        txtHomeExpenses.setText(String.valueOf(HomeExpenses));
        txtTransportation.setText(String.valueOf(Transportation));
        txtHealth.setText(String.valueOf(Health));
        txtCharity.setText(String.valueOf(Charity));
        txtDailyLiving.setText(String.valueOf(DailyLiving));
        txtEntertainment.setText(String.valueOf(Entertainment));
        txtFinancial.setText(String.valueOf(Financial));
    }


    //GENERATED CODE ===========================================================
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        dialogNot100 = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        btnOKPercentages = new javax.swing.JButton();
        dialogSavingsWrong = new javax.swing.JDialog();
        jLabel27 = new javax.swing.JLabel();
        btnOKSavings = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        dialogCheckingWrong = new javax.swing.JDialog();
        jLabel30 = new javax.swing.JLabel();
        btnOKChecking = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        dialogPercentageWrong = new javax.swing.JDialog();
        jLabel28 = new javax.swing.JLabel();
        btnOKPercentages1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtHomeExpenses = new javax.swing.JTextField();
        txtTransportation = new javax.swing.JTextField();
        txtHealth = new javax.swing.JTextField();
        txtCharity = new javax.swing.JTextField();
        txtDailyLiving = new javax.swing.JTextField();
        txtEntertainment = new javax.swing.JTextField();
        txtFinancial = new javax.swing.JTextField();
        btnNext = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtChecking = new javax.swing.JTextField();
        txtSavings = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            try {
                Image backgroundImage = ImageIO.read(new File("C:\\Users\\Lenovo\\Pictures\\Saved Pictures\\img22.jpg"));
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                System.out.println("Image loaded successfully!");
            } catch (IOException e) {
                System.out.println("Failed to load image: " + e.getMessage());
                e.printStackTrace();
            }
        }
    };
    setContentPane(contentPane);
    contentPane.setLayout(new GridBagLayout());

    jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jLabel1.setText("Create your budget plan!");

    jLabel2.setText("Choose what percentage you would like to spend in each 7");

    jLabel3.setText("categories. The total must equal 100.");

    jLabel4.setText("Total:");

    lblTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    lblTotal.setText("100");

    jLabel6.setText("%");

    jLabel8.setText("%");

    jLabel10.setText("%");

    jLabel11.setText("%");

    jLabel12.setText("%");

    jLabel13.setText("%");

    jLabel14.setText("Home Expenses");

    jLabel15.setText("Transportation");

    jLabel16.setText("Health");

    jLabel17.setText("Charity");

    jLabel18.setText("%");

    jLabel19.setText("Daily Living");

    jLabel20.setText("Entertainment");

    jLabel21.setText("Financial");

    txtHomeExpenses.setText("20");

    txtTransportation.setText("5");

    txtHealth.setText("20");

    txtCharity.setText("10");

    txtDailyLiving.setText("15");

    txtEntertainment.setText("10");

    txtFinancial.setText("20");

    btnNext.setText("Next");
    btnNext.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnNextActionPerformed(evt);
        }
    });

    btnReset.setText("Reset");
    btnReset.setName(""); // NOI18N
    btnReset.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnResetActionPerformed(evt);
        }
    });

    jLabel7.setText("");

    jLabel22.setText("Enter checking and savings balance.");

    jLabel23.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
    jLabel23.setText("Checking");

    jLabel24.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
    jLabel24.setText("Savings");

    txtChecking.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    txtChecking.setText("0.00");

    txtSavings.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    txtSavings.setText("0.00");

    jLabel25.setText("$");

    jLabel26.setText("$");

    // Group layout code
    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1)
                .addComponent(jLabel2)
                .addComponent(jLabel3)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblTotal))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addComponent(jLabel17)
                                .addComponent(jLabel16)
                                .addComponent(jLabel15))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtHomeExpenses, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                .addComponent(txtTransportation)
                                .addComponent(txtHealth)
                                .addComponent(txtCharity))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel11)
                                .addComponent(jLabel6)
                                .addComponent(jLabel10))
                            .addGap(49, 49, 49)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel20)
                                        .addComponent(jLabel19)
                                        .addComponent(jLabel21))
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtFinancial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtDailyLiving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEntertainment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel12)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel22)
                                    .addGap(79, 79, 79))))
                        .addComponent(jLabel7))
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel25)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel23)
                        .addComponent(txtChecking, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(27, 27, 27)
                    .addComponent(jLabel26)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel24)
                        .addComponent(txtSavings, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(btnReset)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNext)))
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel3)
            .addGap(5, 5, 5)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4)
                .addComponent(lblTotal))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel14)
                        .addComponent(txtHomeExpenses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel15)
                        .addComponent(txtTransportation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel16)
                        .addComponent(txtHealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel17)
                        .addComponent(txtCharity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel19)
                        .addComponent(txtDailyLiving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(jLabel20)
                        .addComponent(txtEntertainment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(jLabel21)
                        .addComponent(txtFinancial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jLabel7)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel22)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel23)
                .addComponent(jLabel24))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtChecking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtSavings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel25)
                .addComponent(jLabel26))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnReset)
                .addComponent(btnNext))
            .addContainerGap())
    );

        
        jLabel1.setForeground(Color.WHITE);
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 14));
    jLabel1.setText("Create your budget plan!");

    jLabel2.setForeground(Color.WHITE);
    jLabel2.setText("Choose what percentage you would like to spend in each 7");

    jLabel3.setForeground(Color.WHITE);
    jLabel3.setText("categories. The total must equal 100.");

    jLabel4.setForeground(Color.WHITE);
    jLabel4.setText("Total:");

    lblTotal.setForeground(Color.WHITE);
    lblTotal.setFont(new java.awt.Font("Dialog", 1, 14));
    lblTotal.setText("100");

    jLabel6.setForeground(Color.WHITE);
    jLabel8.setForeground(Color.WHITE);
    jLabel10.setForeground(Color.WHITE);
    jLabel11.setForeground(Color.WHITE);
    jLabel12.setForeground(Color.WHITE);
    jLabel13.setForeground(Color.WHITE);
    jLabel14.setForeground(Color.WHITE);
    jLabel15.setForeground(Color.WHITE);
    jLabel16.setForeground(Color.WHITE);
    jLabel17.setForeground(Color.WHITE);
    jLabel18.setForeground(Color.WHITE);
    jLabel19.setForeground(Color.WHITE);
    jLabel20.setForeground(Color.WHITE);
    jLabel21.setForeground(Color.WHITE);
    jLabel22.setForeground(Color.WHITE);
    jLabel23.setForeground(Color.WHITE);
    jLabel24.setForeground(Color.WHITE);
    jLabel25.setForeground(Color.WHITE);
    jLabel26.setForeground(Color.WHITE);
    jLabel27.setForeground(Color.WHITE);
    jLabel28.setForeground(Color.WHITE);
    jLabel29.setForeground(Color.WHITE);
    jLabel30.setForeground(Color.WHITE);
    jLabel31.setForeground(Color.WHITE);
    



        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }// </editor-fold>//GEN-END:initComponents

    //RESET BUTTON =============================================================
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed

        if (evt.getSource() == btnReset) {
            txtHomeExpenses.setText("20");
            txtTransportation.setText("5");
            txtHealth.setText("20");
            txtCharity.setText("10");
            txtDailyLiving.setText("15");
            txtEntertainment.setText("10");
            txtFinancial.setText("20");
        }
    }//GEN-LAST:event_btnResetActionPerformed

    //NEXT BUTTON ==============================================================
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed

        if (evt.getSource() == btnNext) {
            //Check Percentage Input
            if (main.intIsParsable(txtHomeExpenses.getText()) == false
                    | main.intIsParsable(txtTransportation.getText()) == false
                    | main.intIsParsable(txtHealth.getText()) == false
                    | main.intIsParsable(txtCharity.getText()) == false
                    | main.intIsParsable(txtDailyLiving.getText()) == false
                    | main.intIsParsable(txtEntertainment.getText()) == false
                    | main.intIsParsable(txtFinancial.getText()) == false) {
                dialogPercentageWrong.setVisible(true);
                return;
            }

            //Parse Percentage Input
            HomeExpenses = Double.parseDouble(txtHomeExpenses.getText());
            Transportation = Double.parseDouble(txtTransportation.getText());
            Health = Double.parseDouble(txtHealth.getText());
            Charity = Double.parseDouble(txtCharity.getText());
            DailyLiving = Double.parseDouble(txtDailyLiving.getText());
            Entertainment = Double.parseDouble(txtEntertainment.getText());
            Financial = Double.parseDouble(txtFinancial.getText());

            Total = HomeExpenses + Transportation + Health + Charity + DailyLiving + Entertainment + Financial;

            //Check total to be 100
            if (Total != 100) {
                dialogNot100.setVisible(true);
                return;
            }

            //Check Ckecking and Savings Account Input
            if (main.doubleIsParsable(txtChecking.getText()) == false | main.doubleIsParsable(txtSavings.getText()) == false) {
                if (main.doubleIsParsable(txtSavings.getText()) == false) {
                    dialogSavingsWrong.setVisible(true);
                }

                if (main.doubleIsParsable(txtChecking.getText()) == false) {
                    dialogCheckingWrong.setVisible(true);
                }
                return;
            }

            //Set all variables into a temporary object
            BudgetPlan tempBudget = new BudgetPlan();
            tempBudget.setHomeExpenses(HomeExpenses);
            tempBudget.setTransportation(Transportation);
            tempBudget.setHealth(Health);
            tempBudget.setDailyLiving(DailyLiving);
            tempBudget.setEntertainment(Entertainment);
            tempBudget.setFinancial(Financial);

            //Send temp object into CurrentUser
            main.currentUser.setBudgetPlan(tempBudget);

            //Set all bank account attributes to temp object
            BankAccount tempChecking = new BankAccount();
            tempChecking.setAccountName("Checking");
            tempChecking.setBalance(Double.parseDouble(txtChecking.getText()));
            BankAccount tempSavings = new BankAccount();
            tempSavings.setAccountName("Savings");
            tempSavings.setBalance(Double.parseDouble(txtSavings.getText()));

            //Send temp account object
            main.currentUser.setCheckingAccount(tempChecking);
            main.currentUser.setSavingsAccount(tempSavings);

            //Creating a new file based on the Username
            File mkdirs = new File("./users/" + main.currentUser.getUserID());
            if (mkdirs.mkdirs()) {
                System.out.println("New Directory was created!");
            } else {
                System.out.println("New Directory was NOT created!");
            }

            //Use the new directory to find user data file
            main.currentUserFile = new File("./users/" + main.currentUser.getUserID() + "/" + main.currentUser.getUserID() + ".dat");

            //Write the user Information into the file
            main.WriteObjectToFile(main.currentUser, main.currentUserFile);

            //Instantiate Database (Creates Database in this case)
            main.database = new Database();

            //Save budget plan to database
            main.database.InsertStatement("BUDGET_PLANS", txtHomeExpenses.getText() + ", " + txtTransportation.getText()
                    + ", " + txtHealth.getText() + ", " + txtCharity.getText() + ", "
                    + txtDailyLiving.getText() + ", " + txtEntertainment.getText()
                    + ", " + txtFinancial.getText());

            //Save account balances to database
            main.database.InsertStatement("BANK_ACCOUNTS", "'Savings', " + txtSavings.getText());
            main.database.InsertStatement("BANK_ACCOUNTS", "'Checking', " + txtChecking.getText());

            //Go to next screen
            //PurchaseViewerScreen PurchaseViewerWindow = new PurchaseViewerScreen();
            PurchaseViewerScreen PurchaseViewerWindow = PurchaseViewerScreen.getInstance();
            this.dispose();
            PurchaseViewerWindow.setVisible(true);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    //DIALOG BOXES OK BUTTON ===================================================
    //<editor-fold defaultstate="collapsed" desc=" Dialog Box OK Button Event Handing ">
    private void btnOKPercentagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKPercentagesActionPerformed

        dialogNot100.dispose();
    }//GEN-LAST:event_btnOKPercentagesActionPerformed

    private void btnOKSavingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKSavingsActionPerformed

        dialogSavingsWrong.dispose();
    }//GEN-LAST:event_btnOKSavingsActionPerformed

    private void btnOKCheckingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKCheckingActionPerformed

        dialogCheckingWrong.dispose();
    }//GEN-LAST:event_btnOKCheckingActionPerformed

    private void btnOKPercentages1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKPercentages1ActionPerformed

        dialogPercentageWrong.dispose();
    }//GEN-LAST:event_btnOKPercentages1ActionPerformed
    //</editor-fold>

    //MAIN METHOD FOR THIS CLASS ===============================================
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(CreateBudgetScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateBudgetScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateBudgetScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateBudgetScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //Display Form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateBudgetScreen().setVisible(true);
            }
        });
    }

    //JFRAME VARIABLES =========================================================
    //<editor-fold defaultstate="collapsed" desc=" JFrame Varables ">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnOKChecking;
    private javax.swing.JButton btnOKPercentages;
    private javax.swing.JButton btnOKPercentages1;
    private javax.swing.JButton btnOKSavings;
    private javax.swing.JButton btnReset;
    private javax.swing.JDialog dialogCheckingWrong;
    private javax.swing.JDialog dialogNot100;
    private javax.swing.JDialog dialogPercentageWrong;
    private javax.swing.JDialog dialogSavingsWrong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtCharity;
    private javax.swing.JTextField txtChecking;
    private javax.swing.JTextField txtDailyLiving;
    private javax.swing.JTextField txtEntertainment;
    private javax.swing.JTextField txtFinancial;
    private javax.swing.JTextField txtHealth;
    private javax.swing.JTextField txtHomeExpenses;
    private javax.swing.JTextField txtSavings;
    private javax.swing.JTextField txtTransportation;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
