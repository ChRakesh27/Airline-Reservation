//package com.javaguides.javaswing.reg;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.Color;


public class create_acc extends javax.swing.JFrame {
	
	
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField firstname;
    private JTextField lastname;
    private JTextField email;
    private JTextField username;
    private JTextField mob;
    private JPasswordField passwordField;
    private JButton btnNewButton;
    private javax.swing.JComboBox jComboBox1;
    /**
     * Create the frame.
     */
    
    

    public create_acc(login log1) {
        setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Rakesh\\eclipse\\Air\\src\\1.jpg"));
        
        //        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Account");
        setResizable(false);
        setBounds(450, 190, 800, 500);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(new Color(21, 252, 13));
//        contentPane.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a4.jpg")));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        
        
        JLabel lblNewUserRegister = new JLabel("New User Register");
        lblNewUserRegister.setFont(new Font("Times New Roman", Font.BOLD, 38));
        lblNewUserRegister.setForeground(new java.awt.Color(237, 19, 52));

        lblNewUserRegister.setBounds(262, 28, 325, 50);
        contentPane.add(lblNewUserRegister);

        JLabel lblName = new JLabel("First Name");
        lblName.setForeground(new Color(8, 0, 255));
        lblName.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        lblName.setBounds(30, 100, 99, 43);
        contentPane.add(lblName);

        JLabel lblNewLabel = new JLabel("Last Name");
        lblNewLabel.setForeground(new Color(8, 0, 255));
        lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        lblNewLabel.setBounds(30, 180, 110, 29);
        contentPane.add(lblNewLabel);

        JLabel lblEmailAddress = new JLabel("Email Address");
        lblEmailAddress.setForeground(new Color(8, 0, 255));
        lblEmailAddress.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        lblEmailAddress.setBounds(30, 260, 124, 36);
        contentPane.add(lblEmailAddress);

        firstname = new JTextField();
        firstname.setFont(new Font("Tahoma", Font.PLAIN, 18));
        firstname.setBounds(160, 100, 220, 40);
        contentPane.add(firstname);
        firstname.setColumns(10);

        lastname = new JTextField();
        lastname.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lastname.setBounds(160, 180, 220, 40);
        contentPane.add(lastname);
        lastname.setColumns(10);

        email = new JTextField();
        email.setFont(new Font("Tahoma", Font.PLAIN, 18));
        email.setBounds(160, 260, 220, 40);
        contentPane.add(email);
        email.setColumns(10);

        username = new JTextField();
        username.setFont(new Font("Tahoma", Font.PLAIN, 18));
        username.setBounds(550, 100, 220, 40);
        contentPane.add(username);
        username.setColumns(10);

        JLabel lblUsername = new JLabel("User Name");
        lblUsername.setForeground(new Color(8, 0, 255));
        lblUsername.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        lblUsername.setBounds(400, 100, 99, 29);
        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setForeground(new Color(8, 0, 255));
        lblPassword.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        lblPassword.setBounds(400, 260, 99, 24);
        contentPane.add(lblPassword);

        JLabel lblMobileNumber = new JLabel("Mobile Number");
        lblMobileNumber.setForeground(new Color(8, 0, 255));
        lblMobileNumber.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        lblMobileNumber.setBounds(400, 180, 139, 26);
        contentPane.add(lblMobileNumber);

        mob = new JTextField();
        mob.setFont(new Font("Tahoma", Font.PLAIN, 18));
        mob.setBounds(550, 180, 220, 40);
        contentPane.add(mob);
        mob.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
        passwordField.setBounds(550, 260, 220, 40);
        contentPane.add(passwordField);

        JLabel lblType = new JLabel("User Type");
        lblType.setForeground(new Color(8, 0, 255));
        lblType.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        lblType.setBounds(30, 340, 130, 26);
        contentPane.add(lblType);
        
        jComboBox1 = new JComboBox();        
        jComboBox1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        jComboBox1.setBounds(160, 340, 130, 40);
        contentPane.add(jComboBox1);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ADMIN", "MANAGER", "OPERATOR" }));

//        this.add(jComboBox1);
//     
//        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//        String utype = jComboBox1.getSelectedItem().toString();



        
        btnNewButton = new JButton("Register");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String firstName = firstname.getText();
                String lastName = lastname.getText();
                String emailId = email.getText();
                String userName = username.getText();
                String mobileNumber = mob.getText();
                Object type = jComboBox1.getSelectedItem();
                int len = mobileNumber.length();
                String password = passwordField.getText();

                String msg = "" + firstName;
                msg += " \n";
            
                
                if(len == 10 && firstName.length() != 0 && lastName.length() != 0 && userName.length() != 0 && password.length() != 0 && emailId.endsWith("@gmail.com")) {
                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/a_r_s1", "root", "R6303396201r");

                    String query = "INSERT INTO user_profile values('" + firstName + "','" + lastName + "','" + type + "','" + userName + "','" +
                        password + "','" + emailId + "','" + mobileNumber +  "')";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
                    }else {
                        JOptionPane.showMessageDialog(btnNewButton,
                            "Welcome, " + msg + "Your account is sucessfully created");
//                        System.exit(-1);
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                }else{
                    JOptionPane.showMessageDialog(btnNewButton, "Enter a valid Details");
                }
                }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(360, 350, 259, 74);
        btnNewButton.setBackground(new Color(252, 3, 82));
        btnNewButton.setForeground(Color.yellow);
        contentPane.add(btnNewButton);

    }
    public double getScaleFactor(int iMasterSize, int iTargetSize)
    {
        double dScale = 1;
        if (iMasterSize > iTargetSize)
        {
            dScale = (double) iTargetSize / (double) iMasterSize;
        } 
        else
        {
            dScale = (double) iTargetSize / (double) iMasterSize;
        }
        return dScale;
    }
    public double getScaleFactorToFit(Dimension original, Dimension toFit)
    {
        double dScale = 1d;
        if (original != null && toFit != null)
        {
            double dScaleWidth = getScaleFactor(original.width, toFit.width);
            double dScaleHeight = getScaleFactor(original.height, toFit.height);
            dScale = Math.min(dScaleHeight, dScaleWidth);
        }
        return dScale;
    }
}



