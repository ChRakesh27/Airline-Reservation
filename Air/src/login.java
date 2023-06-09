	
import java.sql.*;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.util.Calendar;
import java.awt.event.*;
import java.text.SimpleDateFormat;
/*
 * Airline Reservation system
 * Designed and Developed by cbsecsnip.in.
 */

/**
 *
 * @author Vishal, Vaishali, Urmee
 */
public class login extends javax.swing.JFrame {
	
	
    
    
    Connection con;
    Statement smt;
    ResultSet rs;
    public static searchFrame sf;
    public static bookingFrame bookfrm;

    /**
     * Creates new form login
     */
    public login() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Rakesh\\eclipse\\Air\\src\\1.jpg"));
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setBounds(450, 190, 1014, 597);
//        setResizable(false);
        
    	initComponents();
        javax.swing.Timer t = new javax.swing.Timer(1000, new ClockListener());
        t.start();
        this.setLocationRelativeTo(null);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/a_r_s1", "root", "R6303396201r");

            sf = new searchFrame();
            bookfrm = new bookingFrame();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
///////inner class ClockListener

    class ClockListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
    		//... Whenever this is called, get the current time and
            //    display it in the textfield.
            Calendar now = Calendar.getInstance();
            int dd = now.get(Calendar.DATE);
            int mm = now.get(Calendar.MONTH);
            int yy = now.get(Calendar.YEAR);
            int h = now.get(Calendar.HOUR_OF_DAY);
            int m = now.get(Calendar.MINUTE);
            int s = now.get(Calendar.SECOND);
            jTextField2.setText("Date : " + dd + "-" + mm + "-" + yy + " | Time : " + h + ":" + m + ":" + s);
            //... The following is an easier way to format the time,
            //    but requires knowing how to use the format method.
            //_timeField.setText(String.format("%1$tH:%1$tM:%1$tS", now));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AIRWAYS Ticket Reservation System");
        setResizable(false);
//        setBackground(new Color(52, 200, 237));

        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/A.jpg")));
//        jLabel1.setBackground(new Color(52, 200, 237));
        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(200, 17, 27));
//        jLabel2.setBackground(new Color(52, 200, 237));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Airline Reservation System");
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Authentication window", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.red));
        
//        jPanel1.setBackground(new Color(52, 200, 237));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Your ID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Your Password");

        jButton1.setText("Done");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }   
        });

        jButton1.setBackground(new Color(23, 2, 250));
        jButton1.setForeground(Color.yellow);

        jButton2.setText("Search flights");
        jButton2.setActionCommand("Inquire about  flights");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBackground(new Color(252, 3, 82));
        jButton2.setForeground(Color.yellow);
        

        jButton4.setText("Create Account");
//    jButton4.setActionCommand("Inquire about  flights");
    jButton4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt1) {
            jButton4ActionPerformed(evt1);
        }
    });
    jButton4.setBackground(new Color(252, 3, 82));
    jButton4.setForeground(Color.yellow);

    
    jButton3.setText("Exit");
    jButton3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
    		frame= new JFrame("Exit");
        	if(JOptionPane.showConfirmDialog(frame, "Confirm You Want To Exit", "Airline Reservation System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
        		System.exit(0);	
        		}
        }
    });
    jButton3.setBackground(new Color(252, 3, 82));
    jButton3.setForeground(Color.yellow);

        
        
        jPasswordField1.setToolTipText("User name is Case Sensative");

        jTextField1.setToolTipText("User name is Case Sensative");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ADMIN", "MANAGER", "OPERATOR" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("You are");

        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1.setBackground(new Color(52, 200, 237));
//-----------------------------------------------------------------
        
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(30, 30, 30))
                        .addComponent(jLabel4)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    		))

                
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)
                        )))

            .addGroup(jPanel1Layout.createSequentialGroup()
            		.addGap(10,10,10)
                    .addComponent(jButton2)
                    .addGap(10,10,10)
                    .addComponent(jButton4)
                    .addGap(10,10,10)
                    .addComponent(jButton3)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE))
        		);
        
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton1)
                    .addGap(50,50,50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jButton2)
                    .addGap(50, 50, 50)
                    .addComponent(jButton4)
                    .addGap(10, 10, 10)
                    .addComponent(jButton3))
                .addGap(80, 80, 80))
        );

        jTextField2.setEditable(false);
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    	.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
        		);
      
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            		)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    
    
    
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        search_flight sfwl = new search_flight(this);
        sfwl.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt1) {//GEN-FIRST:event_jButton2ActionPerformed
        create_acc sfwl1 = new create_acc(this);
        sfwl1.setVisible(true);

    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int flag = 0;
            String sql = "Select * from user_profile;";
            smt = con.createStatement();
            rs = smt.executeQuery(sql);
            String log = new String(jTextField1.getText());
            String pass = new String(jPasswordField1.getPassword());
            String utype = jComboBox1.getSelectedItem().toString();
            while (rs.next()) {
                if (utype.equals(rs.getString(3)) && log.equals(rs.getString(4)) && pass.equals(rs.getString(5))) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                nav_Frame navfrm = new nav_Frame(this);
                navfrm.setVisible(true);
                System.out.print(log + " " + utype + " " + pass);
            } else {
                JOptionPane.showMessageDialog(this, "Enter Correct Data ", "Acces Denied", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            System.out.printf(ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
	private JFrame frame;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
    
}
