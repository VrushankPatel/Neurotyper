import java.awt.*;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
public class Signupform extends javax.swing.JFrame 
{
    String current="";
    int posX,posY,index=-1,uniqueid=new java.util.Random().nextInt(100000);
    public Signupform() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        Orgnamefld.requestFocus(true);
        Backtologinpnl.setNextFocusableComponent(Orgnamefld);        
        Orgnamefld.setNextFocusableComponent(Passwordfld2);
        Passwordfld2.setNextFocusableComponent(conPasswordfld);
        conPasswordfld.setNextFocusableComponent(Signupforwardpnl);
        Signupforwardpnl.setNextFocusableComponent(Backtologinpnl);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Signuppnl1 = new javax.swing.JPanel();
        IDPanelpnl = new javax.swing.JPanel();
        IDTextfld = new javax.swing.JTextField();
        IDlabel = new javax.swing.JLabel();
        Orgnamepnl = new javax.swing.JPanel();
        Orgnamefld = new javax.swing.JTextField();
        Orgnamelbl = new javax.swing.JLabel();
        conPasswordpnl = new javax.swing.JPanel();
        conPasswordlbl = new javax.swing.JLabel();
        conPasswordfld = new javax.swing.JPasswordField();
        Passwordpnl = new javax.swing.JPanel();
        Passwordlbl = new javax.swing.JLabel();
        Passwordfld2 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Backtologinpnl = new javax.swing.JPanel();
        Backtologinlbl = new javax.swing.JLabel();
        Backtologinicon = new javax.swing.JLabel();
        Myicon = new javax.swing.JLabel();
        Signupforwardpnl = new javax.swing.JPanel();
        Signupforwardlbl = new javax.swing.JLabel();
        Signupforwardicon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        Signuppnl1.setBackground(new java.awt.Color(230, 230, 230));
        Signuppnl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(25, 35, 55)));

        IDPanelpnl.setBackground(new java.awt.Color(230, 230, 230));
        IDPanelpnl.setFocusable(false);

        IDTextfld.setEditable(false);
        IDTextfld.setBackground(new java.awt.Color(230, 230, 230));
        IDTextfld.setFont(new getfont().getone(20f));
        IDTextfld.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        IDTextfld.setText("_"+uniqueid);
        IDTextfld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        IDTextfld.setFocusable(false);
        IDTextfld.setName("idtxtfld"); // NOI18N

        IDlabel.setFont(new getfont().getone(14f)
        );
        IDlabel.setForeground(new java.awt.Color(102, 153, 255));
        IDlabel.setText("Please note that Your unique id is...");

        javax.swing.GroupLayout IDPanelpnlLayout = new javax.swing.GroupLayout(IDPanelpnl);
        IDPanelpnl.setLayout(IDPanelpnlLayout);
        IDPanelpnlLayout.setHorizontalGroup(
            IDPanelpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IDPanelpnlLayout.createSequentialGroup()
                .addGroup(IDPanelpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IDlabel)
                    .addComponent(IDTextfld, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        IDPanelpnlLayout.setVerticalGroup(
            IDPanelpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IDPanelpnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IDlabel)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(IDTextfld, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Orgnamepnl.setBackground(new java.awt.Color(230, 230, 230));

        Orgnamefld.setBackground(new java.awt.Color(230, 230, 230));
        Orgnamefld.setFont(new getfont().getone(20f));
        Orgnamefld.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Orgnamefld.setText("Enter Name          ");
        Orgnamefld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        Orgnamefld.setName("idtxtfld"); // NOI18N
        Orgnamefld.setTransferHandler(null);
        Orgnamefld.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                OrgnamefldMouseMoved(evt);
            }
        });
        Orgnamefld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                OrgnamefldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                OrgnamefldFocusLost(evt);
            }
        });
        Orgnamefld.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OrgnamefldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OrgnamefldMouseExited(evt);
            }
        });
        Orgnamefld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                OrgnamefldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                OrgnamefldKeyReleased(evt);
            }
        });

        Orgnamelbl.setFont(new getfont().getone(14f)
        );
        Orgnamelbl.setForeground(new java.awt.Color(102, 153, 255));
        Orgnamelbl.setText(" ");

        javax.swing.GroupLayout OrgnamepnlLayout = new javax.swing.GroupLayout(Orgnamepnl);
        Orgnamepnl.setLayout(OrgnamepnlLayout);
        OrgnamepnlLayout.setHorizontalGroup(
            OrgnamepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrgnamepnlLayout.createSequentialGroup()
                .addGroup(OrgnamepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Orgnamelbl)
                    .addComponent(Orgnamefld, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 35, Short.MAX_VALUE))
        );
        OrgnamepnlLayout.setVerticalGroup(
            OrgnamepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrgnamepnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Orgnamelbl)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Orgnamefld, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        conPasswordpnl.setBackground(new java.awt.Color(230, 230, 230));

        conPasswordlbl.setFont(new getfont().getone(14f)
        );
        conPasswordlbl.setForeground(new java.awt.Color(102, 153, 255));
        conPasswordlbl.setText(" ");

        conPasswordfld.setEchoChar((char)0);
        conPasswordfld.setBackground(new java.awt.Color(230, 230, 230));
        conPasswordfld.setFont(new getfont().getone(20f));
        conPasswordfld.setText("Confirm Password                             ");
        conPasswordfld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        conPasswordfld.setName("pwdtxfld"); // NOI18N
        conPasswordfld.setTransferHandler(null);
        conPasswordfld.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                conPasswordfldMouseMoved(evt);
            }
        });
        conPasswordfld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                conPasswordfldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                conPasswordfldFocusLost(evt);
            }
        });
        conPasswordfld.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                conPasswordfldMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                conPasswordfldMouseEntered(evt);
            }
        });

        Passwordpnl.setBackground(new java.awt.Color(230, 230, 230));

        Passwordlbl.setFont(new getfont().getone(14f)
        );
        Passwordlbl.setForeground(new java.awt.Color(102, 153, 255));
        Passwordlbl.setText(" ");

        Passwordfld2.setEchoChar((char)0);
        Passwordfld2.setBackground(new java.awt.Color(230, 230, 230));
        Passwordfld2.setFont(new getfont().getone(20f));
        Passwordfld2.setText("Choose Password                             ");
        Passwordfld2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        Passwordfld2.setName("pwdtxfld"); // NOI18N
        Passwordfld2.setTransferHandler(null);
        Passwordfld2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Passwordfld2MouseMoved(evt);
            }
        });
        Passwordfld2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Passwordfld2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Passwordfld2FocusLost(evt);
            }
        });
        Passwordfld2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Passwordfld2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Passwordfld2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout PasswordpnlLayout = new javax.swing.GroupLayout(Passwordpnl);
        Passwordpnl.setLayout(PasswordpnlLayout);
        PasswordpnlLayout.setHorizontalGroup(
            PasswordpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PasswordpnlLayout.createSequentialGroup()
                .addGroup(PasswordpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Passwordlbl)
                    .addComponent(Passwordfld2, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PasswordpnlLayout.setVerticalGroup(
            PasswordpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PasswordpnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Passwordlbl)
                .addGap(0, 0, 0)
                .addComponent(Passwordfld2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout conPasswordpnlLayout = new javax.swing.GroupLayout(conPasswordpnl);
        conPasswordpnl.setLayout(conPasswordpnlLayout);
        conPasswordpnlLayout.setHorizontalGroup(
            conPasswordpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conPasswordpnlLayout.createSequentialGroup()
                .addGroup(conPasswordpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(conPasswordlbl)
                    .addComponent(conPasswordfld, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Passwordpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        conPasswordpnlLayout.setVerticalGroup(
            conPasswordpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, conPasswordpnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Passwordpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conPasswordlbl)
                .addGap(0, 0, 0)
                .addComponent(conPasswordfld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setVisible(false);
        jLabel1.setFont(new getfont().getone(14f)
        );
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Invalid Name");

        javax.swing.GroupLayout Signuppnl1Layout = new javax.swing.GroupLayout(Signuppnl1);
        Signuppnl1.setLayout(Signuppnl1Layout);
        Signuppnl1Layout.setHorizontalGroup(
            Signuppnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Signuppnl1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(Signuppnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(conPasswordpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDPanelpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Orgnamepnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Signuppnl1Layout.setVerticalGroup(
            Signuppnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Signuppnl1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Orgnamepnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(IDPanelpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(conPasswordpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jPanel1.setBackground(new java.awt.Color(25, 35, 55));

        Backtologinpnl.setBackground(new java.awt.Color(25, 35, 55));
        Backtologinpnl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Backtologinpnl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BacktologinpnlMouseMoved(evt);
            }
        });
        Backtologinpnl.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BacktologinpnlFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BacktologinpnlFocusLost(evt);
            }
        });
        Backtologinpnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BacktologinpnlMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BacktologinpnlMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BacktologinpnlMouseEntered(evt);
            }
        });
        Backtologinpnl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BacktologinpnlKeyTyped(evt);
            }
        });

        Backtologinlbl.setBackground(new java.awt.Color(25, 35, 55));
        Backtologinlbl.setFont(new getfont().getone(24f)
        );
        Backtologinlbl.setForeground(new java.awt.Color(204, 204, 204));
        Backtologinlbl.setText("Back");

        Backtologinicon.setBackground(new java.awt.Color(25, 35, 55));
        Backtologinicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-left_4_1.png"))); // NOI18N

        javax.swing.GroupLayout BacktologinpnlLayout = new javax.swing.GroupLayout(Backtologinpnl);
        Backtologinpnl.setLayout(BacktologinpnlLayout);
        BacktologinpnlLayout.setHorizontalGroup(
            BacktologinpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BacktologinpnlLayout.createSequentialGroup()
                .addComponent(Backtologinicon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Backtologinlbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BacktologinpnlLayout.setVerticalGroup(
            BacktologinpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Backtologinicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Backtologinlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Myicon.setBackground(new java.awt.Color(25, 35, 55));
        Myicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-user_typing_using_typewriter.png"))); // NOI18N

        Signupforwardpnl.setBackground(new java.awt.Color(25, 35, 55));
        Signupforwardpnl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Signupforwardpnl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SignupforwardpnlMouseMoved(evt);
            }
        });
        Signupforwardpnl.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SignupforwardpnlFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SignupforwardpnlFocusLost(evt);
            }
        });
        Signupforwardpnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignupforwardpnlMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignupforwardpnlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignupforwardpnlMouseExited(evt);
            }
        });
        Signupforwardpnl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SignupforwardpnlKeyTyped(evt);
            }
        });

        Signupforwardlbl.setBackground(new java.awt.Color(25, 35, 55));
        Signupforwardlbl.setFont(new getfont().getone(24f)
        );
        Signupforwardlbl.setForeground(new java.awt.Color(204, 204, 204));
        Signupforwardlbl.setText("Next");

        Signupforwardicon.setBackground(new java.awt.Color(25, 35, 55));
        Signupforwardicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-right_4.png"))); // NOI18N

        javax.swing.GroupLayout SignupforwardpnlLayout = new javax.swing.GroupLayout(Signupforwardpnl);
        Signupforwardpnl.setLayout(SignupforwardpnlLayout);
        SignupforwardpnlLayout.setHorizontalGroup(
            SignupforwardpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignupforwardpnlLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(Signupforwardlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Signupforwardicon)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        SignupforwardpnlLayout.setVerticalGroup(
            SignupforwardpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Signupforwardicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Signupforwardlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Backtologinpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(Myicon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Signupforwardpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Backtologinpnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Signupforwardpnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(Myicon, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Signuppnl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Signuppnl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void conPasswordfldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conPasswordfldMouseEntered
        conPasswordfld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
    }//GEN-LAST:event_conPasswordfldMouseEntered

    private void conPasswordfldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conPasswordfldMouseExited
        if(current.equals("conPasswordfld")==false)
        {
            conPasswordfld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        }
    }//GEN-LAST:event_conPasswordfldMouseExited

    private void conPasswordfldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_conPasswordfldFocusLost
        if(conPasswordfld.getText().isEmpty())
        {
            conPasswordfld.setEchoChar((char)0);
            conPasswordfld.setText("Confirm Password                             ");
            conPasswordlbl.setText(" ");
            current="";
        }
        conPasswordfld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        if(Passwordfld2.getText().equals(conPasswordfld.getText())==false && Passwordfld2.getText().equals("Choose Password                             ")==false)
        {
            conPasswordfld.setEchoChar((char)0);
            conPasswordfld.setText("Confirm Password                             ");
            conPasswordlbl.setText(" ");
            current="";
            JOptionPane.showMessageDialog(rootPane,"Password doesn't match", "Passwords mismatch!",JOptionPane.ERROR_MESSAGE,new ImageIcon(getClass().getResource("/icons8-s.h.i.e.l.d.png")));
            Passwordfld2.requestFocus(true);
        }
    }//GEN-LAST:event_conPasswordfldFocusLost

    private void conPasswordfldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_conPasswordfldFocusGained
        if(Passwordfld2.getText().equals("Choose Password                             ")==false)
        {
            conPasswordlbl.setText("Confirm Password");
            conPasswordfld.setEchoChar('*');
            current="conPasswordfld";
            if(conPasswordfld.getText().equals("Confirm Password                             "))
            {
                conPasswordfld.setText(null);
            }
            conPasswordfld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
        }
        else
        {
            conPasswordfld.setText(null);
            conPasswordfld.setFocusable(false);
            JOptionPane.showMessageDialog(this,"Please Enter Password first", "Passwords not found!",JOptionPane.ERROR_MESSAGE,new ImageIcon(getClass().getResource("/icons8-s.h.i.e.l.d.png")));
            Passwordfld2.requestFocus();
        }        
       
    }//GEN-LAST:event_conPasswordfldFocusGained

    private void conPasswordfldMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conPasswordfldMouseMoved
        conPasswordfld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
    }//GEN-LAST:event_conPasswordfldMouseMoved

    private void Passwordfld2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Passwordfld2MouseEntered
        Passwordfld2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
    }//GEN-LAST:event_Passwordfld2MouseEntered

    private void Passwordfld2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Passwordfld2MouseExited
        if(current.equals("Passwordfld2")==false)
        {
            Passwordfld2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        }
    }//GEN-LAST:event_Passwordfld2MouseExited

    private void Passwordfld2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Passwordfld2FocusLost
        if(Passwordfld2.getText().isEmpty())
        {
            Passwordfld2.setEchoChar((char)0);
            Passwordfld2.setText("Choose Password                             ");
            Passwordlbl.setText(" ");
            current="";
        }
        Passwordfld2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
    }//GEN-LAST:event_Passwordfld2FocusLost

    private void Passwordfld2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Passwordfld2FocusGained
        Passwordlbl.setText("Create Password");
        conPasswordfld.setFocusable(true);
        Passwordfld2.setEchoChar('*');
        current="Passwordfld2";
        if(Passwordfld2.getText().equals("Choose Password                             "))
        {
            Passwordfld2.setText(null);
        }
        Passwordfld2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
    }//GEN-LAST:event_Passwordfld2FocusGained

    private void Passwordfld2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Passwordfld2MouseMoved
        Passwordfld2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
    }//GEN-LAST:event_Passwordfld2MouseMoved

    private void BacktologinpnlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BacktologinpnlKeyTyped
        // TODO add your handling code here:
        new Neurotyper();
        this.dispose();
    }//GEN-LAST:event_BacktologinpnlKeyTyped

    private void BacktologinpnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BacktologinpnlMouseEntered
        Backtologinicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-left_4.png"))); // NOI18N
        Backtologinlbl.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_BacktologinpnlMouseEntered

    private void BacktologinpnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BacktologinpnlMouseExited
        if(current.equals("backtologinpnl")==false)
        {
            Backtologinicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-left_4_1.png"))); // NOI18N
            Backtologinlbl.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_BacktologinpnlMouseExited

    private void BacktologinpnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BacktologinpnlMouseClicked
        // TODO add your handling code here:
        new Neurotyper();
        this.dispose();
    }//GEN-LAST:event_BacktologinpnlMouseClicked

    private void BacktologinpnlFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BacktologinpnlFocusLost
        current="";
        Backtologinicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-left_4_1.png"))); // NOI18N
        Backtologinlbl.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_BacktologinpnlFocusLost

    private void BacktologinpnlFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BacktologinpnlFocusGained
        current="backtologinpnl";
        Backtologinicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-left_4.png"))); // NOI18N
        Backtologinlbl.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_BacktologinpnlFocusGained

    private void BacktologinpnlMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BacktologinpnlMouseMoved
        Backtologinicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-left_4.png"))); // NOI18N
        Backtologinlbl.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_BacktologinpnlMouseMoved

    private void SignupforwardpnlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SignupforwardpnlKeyTyped
        if(Orgnamefld.getText().isEmpty()==false && IDTextfld.getText().isEmpty()==false && Passwordfld2.getText().isEmpty()==false && conPasswordfld.getText().isEmpty()==false && Passwordfld2.getText().equals(conPasswordfld.getText()))
        {
            Signup();
        }
    }//GEN-LAST:event_SignupforwardpnlKeyTyped

    private void SignupforwardpnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupforwardpnlMouseEntered
        Signupforwardicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-right_4_1.png"))); // NOI18N
        Signupforwardlbl.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_SignupforwardpnlMouseEntered

    private void SignupforwardpnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupforwardpnlMouseExited
        if(current.equals("Signupforward")==false)
        {
            Signupforwardicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-right_4.png"))); // NOI18N
            Signupforwardlbl.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_SignupforwardpnlMouseExited

    private void SignupforwardpnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupforwardpnlMouseClicked
        if(Orgnamefld.getText().isEmpty()==false && IDTextfld.getText().isEmpty()==false && Passwordfld2.getText().isEmpty()==false && conPasswordfld.getText().isEmpty()==false && Passwordfld2.getText().equals(conPasswordfld.getText()))
        {
        Signup();
        }
    }//GEN-LAST:event_SignupforwardpnlMouseClicked

    private void SignupforwardpnlFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SignupforwardpnlFocusLost
        current="";
        Signupforwardicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-right_4.png"))); // NOI18N
        Signupforwardlbl.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_SignupforwardpnlFocusLost

    private void SignupforwardpnlFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SignupforwardpnlFocusGained
        // TODO add your handling code here:
        current="Signupforward";
        Signupforwardicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-right_4_1.png"))); // NOI18N
        Signupforwardlbl.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_SignupforwardpnlFocusGained

    private void SignupforwardpnlMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupforwardpnlMouseMoved
        Signupforwardicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-right_4_1.png")));
    }//GEN-LAST:event_SignupforwardpnlMouseMoved

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Rectangle rectangle = getBounds();
        this.setBounds(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY, rectangle.width, rectangle.height);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        posX = evt.getX();
        posY = evt.getY();    }//GEN-LAST:event_formMousePressed

    private void OrgnamefldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OrgnamefldKeyReleased
        IDTextfld.setText(Orgnamefld.getText()+"_"+uniqueid);
    }//GEN-LAST:event_OrgnamefldKeyReleased

    private void OrgnamefldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OrgnamefldKeyPressed
        IDTextfld.setText(Orgnamefld.getText()+"_"+uniqueid);
    }//GEN-LAST:event_OrgnamefldKeyPressed

    private void OrgnamefldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrgnamefldMouseExited
        // TODO add your handling code here:
        if(current.equals("orgnamefld")==false)
        {
            Orgnamefld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        }
    }//GEN-LAST:event_OrgnamefldMouseExited

    private void OrgnamefldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrgnamefldMouseEntered
        // TODO add your handling code here:
        Orgnamefld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
    }//GEN-LAST:event_OrgnamefldMouseEntered

    private void OrgnamefldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_OrgnamefldFocusLost
        // TODO add your handling code here:
        for(int i=0;i<Orgnamefld.getText().length();i++)
        {
            if(!Character.isAlphabetic(Orgnamefld.getText().charAt(i)))
            {
                jLabel1.setText("Invalid name");
                jLabel1.setVisible(true);
                Orgnamefld.requestFocus(true);
                Orgnamefld.setText(null);
                JOptionPane.showMessageDialog(rootPane,"Name should not contain space or any special characters", "Invalid Name",JOptionPane.WARNING_MESSAGE,new ImageIcon(getClass().getResource("/icons8-s.h.i.e.l.d.png")));
                break;
            }
        }
        if(Orgnamefld.getText().length()<=100 && Orgnamefld.getText().isEmpty()==false)
        {
            jLabel1.setVisible(false);
            current="";
            if(Orgnamefld.getText().isEmpty())
            {
                Orgnamefld.setText("Enter Name          ");
                Orgnamelbl.setText(" ");
            }
            Orgnamefld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        }
        else
        {
            if(Orgnamefld.getText().isEmpty())
            {
                Orgnamefld.requestFocus(true);
                jLabel1.setText("Invalid name");
                jLabel1.setVisible(true);
            }
            else
            {
                Orgnamefld.setText(null);
                JOptionPane.showMessageDialog(rootPane,"Name should less than 100 charecters", "Invalid Name",JOptionPane.WARNING_MESSAGE,new ImageIcon(getClass().getResource("/icons8-stackoverflow.png")));
                Orgnamefld.requestFocus(true);
            }
        }
    }//GEN-LAST:event_OrgnamefldFocusLost

    private void OrgnamefldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_OrgnamefldFocusGained
        // TODO add your handling code here:
        current="orgnamefld";
        IDTextfld.setFocusable(false);
        Orgnamefld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
        Orgnamelbl.setText("Enter your Name [Max 100 charecters]");
        if(Orgnamefld.getText().equals("Enter Name          "))
        {
            Orgnamefld.setText(null);
        }
    }//GEN-LAST:event_OrgnamefldFocusGained

    private void OrgnamefldMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrgnamefldMouseMoved
        Orgnamefld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
    }//GEN-LAST:event_OrgnamefldMouseMoved
    public void Signup()
    {        
        try
        {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:Dataset.sqlite");
            Statement st=con.createStatement();
            try
            {
                ResultSet rs=st.executeQuery("select * from masterrecord");
                while(rs.next())
                {
                    if(rs.getString(1).equals(IDTextfld.getText()))
                    {
                        JOptionPane.showMessageDialog(rootPane,"Sorry, but your id is not unique. try to sign up again and let the id regenerate", "Same valued Multiple ID not allowed",JOptionPane.ERROR_MESSAGE,new ImageIcon(getClass().getResource("/icons8_ID_not_Verified_48px.png")));      
                        new Signupform();
                        this.dispose();
                    }
                }
            }                            
            catch(SQLException ew)
            {
                try
                {
                    st.executeUpdate("create table masterrecord(ID varchar(110),Password varchar(500),username varchar(101));");
                    st.executeUpdate("create table record(ID varchar(20),Practice varchar(25),Records varchar(25),Errors varchar(25),datetime varchar(40));");
                }
                catch(Exception tr)
                {
                    JOptionPane.showMessageDialog(rootPane,tr.toString(),"Unknown Error",JOptionPane.ERROR_MESSAGE,new ImageIcon(getClass().getResource("/icons8_Close_Window_50px.png")));                                      
                }
            }
            int result=st.executeUpdate("insert into masterrecord values('"+IDTextfld.getText()+"','"+new getfont().md5(Passwordfld2.getText())+"','"+Orgnamefld.getText()+"')");
            if(result==1)
            {
                JOptionPane.showMessageDialog(rootPane,"Account Successfully Created\nPlease Login to continue","Done",JOptionPane.PLAIN_MESSAGE,new ImageIcon(getClass().getResource("icons8_Task_Completed_48px_2.png"))); 
                new Neurotyper();
                this.dispose();
            }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Backtologinicon;
    private javax.swing.JLabel Backtologinlbl;
    private javax.swing.JPanel Backtologinpnl;
    private javax.swing.JPanel IDPanelpnl;
    private javax.swing.JTextField IDTextfld;
    private javax.swing.JLabel IDlabel;
    private javax.swing.JLabel Myicon;
    private javax.swing.JTextField Orgnamefld;
    private javax.swing.JLabel Orgnamelbl;
    private javax.swing.JPanel Orgnamepnl;
    private javax.swing.JPasswordField Passwordfld2;
    private javax.swing.JLabel Passwordlbl;
    private javax.swing.JPanel Passwordpnl;
    private javax.swing.JLabel Signupforwardicon;
    private javax.swing.JLabel Signupforwardlbl;
    private javax.swing.JPanel Signupforwardpnl;
    private javax.swing.JPanel Signuppnl1;
    private javax.swing.JPasswordField conPasswordfld;
    private javax.swing.JLabel conPasswordlbl;
    private javax.swing.JPanel conPasswordpnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}