package java_project;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

interface Command {
    void execute();
}

public class LogInScreen extends javax.swing.JFrame {

    private javax.swing.JDialog dialogFileNotFoundLoginError;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton btnOK_dialogFileNotFoundLoginError;
    private javax.swing.JDialog dialogCreateAccountError;
    private javax.swing.JLabel lblCreateAccountError;
    private javax.swing.JButton btnOK_dialogCreateAccountError;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnCancel;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtUserIDCreate;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtUserIDLogin;
    private javax.swing.JButton btnLogin;

    private Command nextCommand;
    private Command loginCommand;

    public LogInScreen() {
        initComponents();
        txtUserIDLogin.requestFocus();

        nextCommand = new NextCommand();
        loginCommand = new LoginCommand();

        btnNext.addActionListener(e -> nextCommand.execute());
        btnLogin.addActionListener(e -> loginCommand.execute());

        SwingUtilities.invokeLater(() -> {
            getRootPane().setDefaultButton(btnLogin);
        });
    }

    private class NextCommand implements Command {
        public void execute() {
            if (txtFirstName.getText().isEmpty()) {
                showErrorDialog("Please Enter your First Name!");
            } else if (txtLastName.getText().isEmpty()) {
                showErrorDialog("Please Enter your Last Name!");
            } else if (txtUserIDCreate.getText().isEmpty()) {
                showErrorDialog("Please Enter a username!");
            } else {
                File existTest = new File("./users/" + txtUserIDCreate.getText());
                if (existTest.exists()) {
                    showErrorDialog("That username already exists!");
                } else {
                    main.currentUser.setFirstName(txtFirstName.getText());
                    main.currentUser.setLastName(txtLastName.getText());
                    main.currentUser.setUserID(txtUserIDCreate.getText());
                    CreateBudgetScreen createBudgetScreen = new CreateBudgetScreen();
                    dispose();
                    createBudgetScreen.setVisible(true);
                }
            }
        }
    }

    private class LoginCommand implements Command {
        public void execute() {
            try {
                String userID = txtUserIDLogin.getText();
                main.currentUserFile = new File("./users/" + userID + "/" + userID + ".dat");
                Object tempObj = main.ReadObjectFromFile(main.currentUserFile);
                if (tempObj == null) {
                    showErrorDialog("User file not found!");
                } else {
                    main.currentUser = (User) tempObj;
                    main.database = new Database();
                    PurchaseViewerScreen purchaseViewerScreen = new PurchaseViewerScreen();
                    dispose();
                    purchaseViewerScreen.setVisible(true);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    private void showErrorDialog(String message) {
        dialogCreateAccountError.setVisible(true);
        lblCreateAccountError.setText(message);
        SwingUtilities.invokeLater(() -> {
            getRootPane().setDefaultButton(btnOK_dialogCreateAccountError);
        });
    }

    private void initComponents() {
        dialogFileNotFoundLoginError = new javax.swing.JDialog();
    jLabel8 = new javax.swing.JLabel();
    btnOK_dialogFileNotFoundLoginError = new javax.swing.JButton();
    dialogCreateAccountError = new javax.swing.JDialog();
    lblCreateAccountError = new javax.swing.JLabel();
    btnOK_dialogCreateAccountError = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    btnNext = new javax.swing.JButton();
    btnCancel = new javax.swing.JButton();
    txtFirstName = new javax.swing.JTextField();
    txtLastName = new javax.swing.JTextField();
    txtUserIDCreate = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    txtUserIDLogin = new javax.swing.JTextField();
    btnLogin = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Register / Login");

    JPanel contentPane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                try {
                    Image backgroundImage = ImageIO.read(new File("C:\\Users\\Lenovo\\Pictures\\Saved Pictures\\img8.jpg"));
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

        GridBagConstraints c = new GridBagConstraints();
    c.insets = new Insets(5, 5, 5, 5);
    c.anchor = GridBagConstraints.WEST;

    
    


    JLabel lblHeading = new JLabel("Tracker");
    lblHeading.setFont(new Font("SansSerif", Font.BOLD, 50));
    lblHeading.setForeground(Color.WHITE);
    c.gridx = 0;
    c.gridy = 0;
    c.gridwidth = 3;
    c.anchor = GridBagConstraints.PAGE_START;
    contentPane.add(lblHeading, c);

    JLabel lblRegister = new JLabel("Register");
    lblRegister.setFont(new Font("Dialog", Font.BOLD, 18));
        lblRegister.setForeground(Color.WHITE);
    c.gridx = 0;
    c.gridy = 1;
    c.gridwidth = 1;
    c.anchor = GridBagConstraints.LINE_START;
    contentPane.add(lblRegister, c);

    JLabel lblFirstName = new JLabel("First Name");
    lblFirstName.setForeground(Color.WHITE);
    lblFirstName.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 16));

    c.gridx = 0;
    c.gridy = 2;
    contentPane.add(lblFirstName, c);

    JLabel lblLastName = new JLabel("Last Name");
    lblLastName.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 16));

    c.gridx = 0;
    c.gridy = 3;
    contentPane.add(lblLastName, c);

    JLabel lblUserIDCreate = new JLabel("     User ID");
    lblUserIDCreate.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 16));
    
    c.gridx = 0;
    c.gridy = 4;
    contentPane.add(lblUserIDCreate, c);

    btnNext.setText("Next");
    c.gridx = 1;
    c.gridy = 5;
    contentPane.add(btnNext, c);

    btnCancel.setText("Cancel");
    c.gridx = 2;
    c.gridy = 5;
    contentPane.add(btnCancel, c);

    txtFirstName.setPreferredSize(new Dimension(150, 25));
    c.gridx = 1;
    c.gridy = 2;
    contentPane.add(txtFirstName, c);

    txtLastName.setPreferredSize(new Dimension(150, 25));
    c.gridx = 1;
    c.gridy = 3;
    contentPane.add(txtLastName, c);

    txtUserIDCreate.setPreferredSize(new Dimension(150, 25));
    c.gridx = 1;
    c.gridy = 4;
    contentPane.add(txtUserIDCreate, c);

    JLabel lblLogin = new JLabel("Log In");
    lblLogin.setFont(new Font("Dialog", Font.BOLD, 18));
    
    c.gridx = 0;
    c.gridy = 6;
    contentPane.add(lblLogin, c);

    JLabel lblUserIDLogin = new JLabel("User ID");
    lblUserIDLogin.setFont(new Font("Dialog", Font.BOLD, 16));
    c.gridx = 0;
    c.gridy = 7;
    contentPane.add(lblUserIDLogin, c);

    btnLogin.setText("Log In");
    c.gridx = 2;
    c.gridy = 7;
    contentPane.add(btnLogin, c);

    txtUserIDLogin.setPreferredSize(new Dimension(150, 25));
    c.gridx = 1;
    c.gridy = 7;
    contentPane.add(txtUserIDLogin, c);

    setExtendedState(JFrame.MAXIMIZED_BOTH);

        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnOK_dialogFileNotFoundLoginError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOK_dialogFileNotFoundLoginErrorActionPerformed(evt);
            }
        });

        btnOK_dialogCreateAccountError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOK_dialogCreateAccountErrorActionPerformed(evt);
            }
        });
    }

    private void centerFrame() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
    }

    public void btnNextActionPerformed(java.awt.event.ActionEvent evt) {
        if (txtFirstName.getText().equals("")) {
            dialogCreateAccountError.setVisible(true);
            lblCreateAccountError.setText("Please Enter your First Name!");
            System.out.println("First Name Textbox Empty");
            JRootPane dialog = SwingUtilities.getRootPane(btnOK_dialogCreateAccountError);
            dialog.setDefaultButton(btnOK_dialogCreateAccountError);
            return;
        } else if (txtLastName.getText().equals("")) {
            dialogCreateAccountError.setVisible(true);
            lblCreateAccountError.setText("Please Enter your Last Name!");
            System.out.println("Last Name Textbox Empty");
            JRootPane dialog = SwingUtilities.getRootPane(btnOK_dialogCreateAccountError);
            dialog.setDefaultButton(btnOK_dialogCreateAccountError);
            return;
        } else if (txtUserIDCreate.getText().equals("")) {
            dialogCreateAccountError.setVisible(true);
            lblCreateAccountError.setText("Please Enter a username!");
            System.out.println("Username Textbox Empty");
            JRootPane dialog = SwingUtilities.getRootPane(btnOK_dialogCreateAccountError);
            dialog.setDefaultButton(btnOK_dialogCreateAccountError);
            return;
        }

        //Setup File Path to use to test if the user already exists
        File existTest = new File("./users/" + txtUserIDCreate.getText());
        //Check if the username already exists
        if (existTest.exists()) {
            dialogCreateAccountError.setVisible(true);
            lblCreateAccountError.setText("That username already exists!");
            System.out.println("Username already exists");
            JRootPane dialog = SwingUtilities.getRootPane(btnOK_dialogCreateAccountError);
            dialog.setDefaultButton(btnOK_dialogCreateAccountError);
            return;
        }

        //Set the Current User's variables
        main.currentUser.setFirstName(txtFirstName.getText());
        main.currentUser.setLastName(txtLastName.getText());
        main.currentUser.setUserID(txtUserIDCreate.getText());

        
    }

    public void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {
        String userID;
        Object tempObj;

        try {
            //Grab Username from txtBox
            userID = txtUserIDLogin.getText();
            //Setup Filepaths using the username provided
            main.currentUserFile = new File("./users/" + userID + "/" + userID + ".dat");

            //Read Object and save into a temporary Object
            tempObj = main.ReadObjectFromFile(main.currentUserFile);

            //Checking the null of temp object
            if (tempObj == null) {
                dialogFileNotFoundLoginError.setVisible(true);
                JRootPane dialog = SwingUtilities.getRootPane(btnOK_dialogFileNotFoundLoginError);
                dialog.setDefaultButton(btnOK_dialogFileNotFoundLoginError);
                return;
            }

            //Cast the tempObject into the current user
            main.currentUser = (User) tempObj;

            //Instantiate Database
            main.database = new Database();

            //Show next Screen
            // PurchaseViewerScreen PurchaseViewerWindow = new PurchaseViewerScreen();
            // dispose();
            // PurchaseViewerWindow.setVisible(true);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == btnCancel) {
            dispose();
            System.exit(0);
        }
    }

    private void btnOK_dialogFileNotFoundLoginErrorActionPerformed(java.awt.event.ActionEvent evt) {
        dialogFileNotFoundLoginError.dispose();
    }

    private void btnOK_dialogCreateAccountErrorActionPerformed(java.awt.event.ActionEvent evt) {
        dialogCreateAccountError.dispose();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInScreen().setVisible(true);
            }
        });
    }
}


