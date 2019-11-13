import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.*;
public class Neurotyper extends javax.swing.JFrame 
{
    int posX,posY,secret;
    Connection con;
    Statement st;
    String typ;
    Calculator cal=new Calculator();
    public Neurotyper() 
    {
        secret=0;
        initComponents();   
        
        this.setVisible(true);
        this.setLocationRelativeTo(null); 
        pwd_txfld.setEchoChar((char)0);
        pwd_txfld.setNextFocusableComponent(Signin_pnl);
        Signin_pnl.setNextFocusableComponent(Signup_pnl);        
    }
    
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Content_pnl = new javax.swing.JPanel();
        mainlabel_pnl = new javax.swing.JPanel();
        Edu_lbl = new javax.swing.JLabel();
        wiz_lbl = new javax.swing.JLabel();
        icon_lbl = new javax.swing.JLabel();
        id_txfld = new javax.swing.JTextField();
        id_icon = new javax.swing.JLabel();
        pwd_txfld = new javax.swing.JPasswordField();
        pwd_icon = new javax.swing.JLabel();
        Notamember_lbl = new javax.swing.JLabel();
        Signup_pnl = new javax.swing.JPanel();
        Signup_lbl = new javax.swing.JLabel();
        Signin_pnl = new javax.swing.JPanel();
        Signin_lbl = new javax.swing.JLabel();
        aboutuslbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Neurotyper");
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(400, 500, 640, 410));
        setIconImages(null);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(640, 410));
        setUndecorated(true);
        setOpacity(0.85f);
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

        Content_pnl.setBackground(new java.awt.Color(0, 0, 0));
        Content_pnl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        mainlabel_pnl.setBackground(new java.awt.Color(0, 0, 0));
        mainlabel_pnl.setForeground(new java.awt.Color(43, 43, 43));

        Edu_lbl.setBackground(new java.awt.Color(43, 43, 43));
        Edu_lbl.setFont(new getfont().getone(36f));
        Edu_lbl.setForeground(new java.awt.Color(102, 153, 255));
        Edu_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Edu_lbl.setText("Neuro");

        wiz_lbl.setBackground(new java.awt.Color(43, 43, 43));
        wiz_lbl.setFont(new getfont().getone(36f));
        wiz_lbl.setForeground(new java.awt.Color(204, 204, 204));
        wiz_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wiz_lbl.setText("Typer");

        icon_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-user_typing_using_typewriter.png"))); // NOI18N
        icon_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_lblMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icon_lblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout mainlabel_pnlLayout = new javax.swing.GroupLayout(mainlabel_pnl);
        mainlabel_pnl.setLayout(mainlabel_pnlLayout);
        mainlabel_pnlLayout.setHorizontalGroup(
            mainlabel_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainlabel_pnlLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Edu_lbl)
                .addGap(0, 0, 0)
                .addComponent(wiz_lbl))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainlabel_pnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icon_lbl)
                .addGap(57, 57, 57))
        );
        mainlabel_pnlLayout.setVerticalGroup(
            mainlabel_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainlabel_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_lbl)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(mainlabel_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edu_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wiz_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        id_txfld.setBackground(new java.awt.Color(0, 0, 0));
        id_txfld.setFont(new getfont().getone(20f)
        );
        id_txfld.setForeground(new java.awt.Color(255, 255, 255));
        id_txfld.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        id_txfld.setText("Enter ID                                   ");
        id_txfld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        id_txfld.setName("idtxtfld"); // NOI18N
        id_txfld.setTransferHandler(null);
        id_txfld.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                id_txfldMouseMoved(evt);
            }
        });
        id_txfld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                id_txfldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                id_txfldFocusLost(evt);
            }
        });
        id_txfld.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                id_txfldMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                id_txfldMouseEntered(evt);
            }
        });

        id_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-user_1.png"))); // NOI18N

        pwd_txfld.setBackground(new java.awt.Color(0, 0, 0));
        pwd_txfld.setFont(new getfont().getone(20f)
        );
        pwd_txfld.setForeground(new java.awt.Color(255, 255, 255));
        pwd_txfld.setText("Password                                   ");
        pwd_txfld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        pwd_txfld.setName("pwdtxfld"); // NOI18N
        pwd_txfld.setTransferHandler(null);
        pwd_txfld.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pwd_txfldMouseMoved(evt);
            }
        });
        pwd_txfld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwd_txfldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwd_txfldFocusLost(evt);
            }
        });
        pwd_txfld.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pwd_txfldMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pwd_txfldMouseEntered(evt);
            }
        });

        pwd_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-key_2_1.png"))); // NOI18N

        Notamember_lbl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Notamember_lbl.setForeground(new java.awt.Color(204, 204, 204));
        Notamember_lbl.setText("Not a member ?");

        Signup_pnl.setBackground(new java.awt.Color(0, 0, 0));
        Signup_pnl.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,153,255)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30,30,30))));
        Signup_pnl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Signup_pnl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Signup_pnlMouseMoved(evt);
            }
        });
        Signup_pnl.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Signup_pnlFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Signup_pnlFocusLost(evt);
            }
        });
        Signup_pnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Signup_pnlMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Signup_pnlMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Signup_pnlMouseEntered(evt);
            }
        });
        Signup_pnl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Signup_pnlKeyTyped(evt);
            }
        });

        Signup_lbl.setBackground(new java.awt.Color(0, 0, 0));
        Signup_lbl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Signup_lbl.setForeground(new java.awt.Color(102, 153, 255));
        Signup_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Signup_lbl.setText("Sign up");

        javax.swing.GroupLayout Signup_pnlLayout = new javax.swing.GroupLayout(Signup_pnl);
        Signup_pnl.setLayout(Signup_pnlLayout);
        Signup_pnlLayout.setHorizontalGroup(
            Signup_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Signup_pnlLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Signup_lbl)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        Signup_pnlLayout.setVerticalGroup(
            Signup_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Signup_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Signin_pnl.setBackground(new java.awt.Color(0, 0, 0));
        Signin_pnl.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 30, 30)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255))));
        Signin_pnl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Signin_pnl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Signin_pnlMouseMoved(evt);
            }
        });
        Signin_pnl.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Signin_pnlFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Signin_pnlFocusLost(evt);
            }
        });
        Signin_pnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Signin_pnlMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Signin_pnlMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Signin_pnlMouseEntered(evt);
            }
        });
        Signin_pnl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Signin_pnlKeyTyped(evt);
            }
        });

        Signin_lbl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Signin_lbl.setForeground(new java.awt.Color(102, 153, 255));
        Signin_lbl.setText("Sign in");

        javax.swing.GroupLayout Signin_pnlLayout = new javax.swing.GroupLayout(Signin_pnl);
        Signin_pnl.setLayout(Signin_pnlLayout);
        Signin_pnlLayout.setHorizontalGroup(
            Signin_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Signin_pnlLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(Signin_lbl)
                .addGap(26, 26, 26))
        );
        Signin_pnlLayout.setVerticalGroup(
            Signin_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Signin_pnlLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Signin_lbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        aboutuslbl.setBackground(new java.awt.Color(255, 255, 255));
        aboutuslbl.setFont(new getfont().getone(18f));
        aboutuslbl.setForeground(new java.awt.Color(204, 204, 204));
        aboutuslbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-group_foreground_selected.png"))); // NOI18N
        aboutuslbl.setText("About  us");
        aboutuslbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aboutuslbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutuslblMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aboutuslblMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aboutuslblMouseEntered(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yellow.png"))); // NOI18N
        jLabel3.setToolTipText("minimize");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red.png"))); // NOI18N
        jLabel2.setToolTipText("close");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout Content_pnlLayout = new javax.swing.GroupLayout(Content_pnl);
        Content_pnl.setLayout(Content_pnlLayout);
        Content_pnlLayout.setHorizontalGroup(
            Content_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Content_pnlLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addGroup(Content_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(id_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pwd_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Content_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pwd_txfld, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_txfld, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(262, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Content_pnlLayout.createSequentialGroup()
                .addGroup(Content_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Content_pnlLayout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(Signin_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Content_pnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(307, 307, 307)
                        .addComponent(mainlabel_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Notamember_lbl)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Content_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aboutuslbl)
                    .addComponent(Signup_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );
        Content_pnlLayout.setVerticalGroup(
            Content_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Content_pnlLayout.createSequentialGroup()
                .addGroup(Content_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Content_pnlLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(Content_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pwd_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Content_pnlLayout.createSequentialGroup()
                                .addGroup(Content_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mainlabel_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Content_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Notamember_lbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                        .addComponent(Signup_pnl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(61, 61, 61)
                                .addGroup(Content_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id_txfld, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addComponent(pwd_txfld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(Signin_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(aboutuslbl)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Content_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Content_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Rectangle rectangle = getBounds();
        this.setBounds(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY, rectangle.width, rectangle.height);
    }//GEN-LAST:event_formMouseDragged

    private void id_txfldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_txfldFocusGained
        id_txfld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
        id_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-user_2.png"))); // NOI18N
        if(id_txfld.getText().equals("Enter ID                                   "))
        {
            id_txfld.setText(null);
        }
    }//GEN-LAST:event_id_txfldFocusGained

    private void id_txfldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_txfldMouseEntered
        id_txfld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
    }//GEN-LAST:event_id_txfldMouseEntered

    private void id_txfldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_txfldMouseExited
        if(getFocusOwner()!=id_txfld)
        {
            id_txfld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        }  
    }//GEN-LAST:event_id_txfldMouseExited

    private void id_txfldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_txfldFocusLost
        id_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-user_1.png"))); // NOI18N
        if(id_txfld.getText().isEmpty())
        {
            id_txfld.setText("Enter ID                                   ");
        }
        id_txfld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
    }//GEN-LAST:event_id_txfldFocusLost

    private void pwd_txfldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwd_txfldFocusGained
        pwd_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-key_2.png"))); // NOI18N
            pwd_txfld.setEchoChar('*');
            if(pwd_txfld.getText().equals("Password                                   "))
            {
                pwd_txfld.setText(null);
            }     
            pwd_txfld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
    }//GEN-LAST:event_pwd_txfldFocusGained

    private void pwd_txfldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwd_txfldFocusLost
        pwd_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-key_2_1.png"))); // NOI18N
        if(pwd_txfld.getText().isEmpty())
        {
            pwd_txfld.setEchoChar((char)0);
            pwd_txfld.setText("Password                                   ");
        }
        pwd_txfld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
    }//GEN-LAST:event_pwd_txfldFocusLost

    private void pwd_txfldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pwd_txfldMouseEntered
        pwd_txfld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
    }//GEN-LAST:event_pwd_txfldMouseEntered

    private void pwd_txfldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pwd_txfldMouseExited
        if(getFocusOwner()!=pwd_txfld)
        {
            pwd_txfld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        }
    }//GEN-LAST:event_pwd_txfldMouseExited

    private void Signup_pnlFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Signup_pnlFocusGained
        Signup_pnl.setBackground(new java.awt.Color(102,153,255));
        Signup_lbl.setForeground(new java.awt.Color(30,30,30));
        Signup_pnl.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,153,255)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30,30,30))));    }//GEN-LAST:event_Signup_pnlFocusGained

    private void Signup_pnlFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Signup_pnlFocusLost
        
            Signup_pnl.setBackground(new java.awt.Color(30,30,30));
            Signup_lbl.setForeground(new java.awt.Color(102,153,255));
            Signup_pnl.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30,30,30)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,153,255))));
    }//GEN-LAST:event_Signup_pnlFocusLost

    private void Signup_pnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Signup_pnlMouseEntered
        Signup_pnl.setBackground(new java.awt.Color(102,153,255));
        Signup_lbl.setForeground(new java.awt.Color(30,30,30));
        Signup_pnl.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,153,255)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30,30,30))));
    }//GEN-LAST:event_Signup_pnlMouseEntered

    private void Signup_pnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Signup_pnlMouseExited
        if(getFocusOwner()!=Signup_pnl)
        {
            Signup_pnl.setBackground(new java.awt.Color(30,30,30));
            Signup_lbl.setForeground(new java.awt.Color(102,153,255));
            Signup_pnl.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30,30,30)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,153,255))));
        }
    }//GEN-LAST:event_Signup_pnlMouseExited

    private void Signin_pnlFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Signin_pnlFocusGained
        Signin_pnl.setBackground(new java.awt.Color(102,153,255));
        Signin_lbl.setForeground(new java.awt.Color(30,30,30));
        Signin_pnl.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,153,255)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30,30,30))));
    }//GEN-LAST:event_Signin_pnlFocusGained

    private void Signin_pnlFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Signin_pnlFocusLost
        Signin_pnl.setBackground(new java.awt.Color(30,30,30));
        Signin_lbl.setForeground(new java.awt.Color(102,153,255));
        Signin_pnl.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30,30,30)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,153,255))));
    }//GEN-LAST:event_Signin_pnlFocusLost

    private void Signin_pnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Signin_pnlMouseEntered
        Signin_pnl.setBackground(new java.awt.Color(102,153,255));
        Signin_lbl.setForeground(new java.awt.Color(30,30,30));
        Signin_pnl.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,153,255)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30,30,30))));
    }//GEN-LAST:event_Signin_pnlMouseEntered

    private void Signin_pnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Signin_pnlMouseExited
        if(getFocusOwner()!=Signin_pnl)    
        {
            Signin_pnl.setBackground(new java.awt.Color(30,30,30));
            Signin_lbl.setForeground(new java.awt.Color(102,153,255));
            Signin_pnl.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30,30,30)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,153,255))));
        }
    }//GEN-LAST:event_Signin_pnlMouseExited

    private void id_txfldMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_txfldMouseMoved
            id_txfld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
    }//GEN-LAST:event_id_txfldMouseMoved

    private void pwd_txfldMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pwd_txfldMouseMoved
        pwd_txfld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
    }//GEN-LAST:event_pwd_txfldMouseMoved

    private void Signin_pnlMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Signin_pnlMouseMoved
        Signin_pnl.setBackground(new java.awt.Color(102,153,255));
        Signin_lbl.setForeground(new java.awt.Color(30,30,30));
        Signin_pnl.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,153,255)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30,30,30))));
    }//GEN-LAST:event_Signin_pnlMouseMoved

    private void Signup_pnlMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Signup_pnlMouseMoved
        // TODO add your handling code here:
        Signup_pnl.setBackground(new java.awt.Color(102,153,255));
        Signup_lbl.setForeground(new java.awt.Color(30,30,30));
        Signup_pnl.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,153,255)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30,30,30))));
    }//GEN-LAST:event_Signup_pnlMouseMoved

    private void Signup_pnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Signup_pnlMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new Signupform();
    }//GEN-LAST:event_Signup_pnlMouseClicked

    private void Signup_pnlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Signup_pnlKeyTyped
        // TODO add your handling code here:
        this.dispose();
        new Signupform();
    }//GEN-LAST:event_Signup_pnlKeyTyped

    private void aboutuslblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutuslblMouseEntered
        aboutuslbl.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_aboutuslblMouseEntered

    private void aboutuslblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutuslblMouseExited
        aboutuslbl.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_aboutuslblMouseExited

    private void Signin_pnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Signin_pnlMouseClicked
        signin();
    }//GEN-LAST:event_Signin_pnlMouseClicked

    private void Signin_pnlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Signin_pnlKeyTyped
        signin();
    }//GEN-LAST:event_Signin_pnlKeyTyped

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red2.png"))); // NOI18N
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red.png"))); // NOI18N
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yellow2.png"))); // NOI18N
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yellow.png"))); // NOI18N
    }//GEN-LAST:event_jLabel3MouseExited

    private void aboutuslblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutuslblMouseClicked
        new Aboutus();
        this.dispose();
    }//GEN-LAST:event_aboutuslblMouseClicked

    private void icon_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_lblMouseClicked
        if(secret==15 && !cal.isVisible())
        {            
            cal.setVisible(true);
            secret=0;
        }
        else
        {
            secret++;
        }
    }//GEN-LAST:event_icon_lblMouseClicked

    private void icon_lblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_lblMouseExited
        secret=0;
    }//GEN-LAST:event_icon_lblMouseExited
    void signin()
    {
        if(id_txfld.getText().equals("Enter ID                                   ") && pwd_txfld.getText().equals("Password                                   ") || id_txfld.getText().isEmpty() && pwd_txfld.getText().isEmpty() || id_txfld.getText().isEmpty() && pwd_txfld.getText().equals("Password                                   ") || pwd_txfld.getText().isEmpty() && id_txfld.getText().equals("Enter ID                                   "))
        {
            int a=JOptionPane.showConfirmDialog(rootPane,"Do you really want to enter guest mode??\nAny kind of your record will not saved\nPress yes to confirm and No to go back", "Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,new ImageIcon(getClass().getResource("/icons8-ask_question.png")));                
            if(a==0)
            {
                this.dispose();
                new Prcticelist("guest","guest");
            }
        }else if(id_txfld.getText().equals("Administrator") && pwd_txfld.getText().equals("Administrator"))
        {
            this.dispose();
            new Admin();
        }
        else
        {
            try
            {
                Class.forName("org.sqlite.JDBC");
                con = DriverManager.getConnection("jdbc:sqlite:Dataset.sqlite");
                st=con.createStatement();
                ResultSet rs=st.executeQuery("select * from masterrecord");               
                while(rs.next())
                {                   
                    if(id_txfld.getText().equals(rs.getString(1)))
                    {
                        if(new getfont().md5(pwd_txfld.getText()).equals(rs.getString(2)))
                        {
                            JOptionPane.showMessageDialog(rootPane,"Logged in successfully "+rs.getString(3), "Success",JOptionPane.PLAIN_MESSAGE,new ImageIcon(getClass().getResource("icons8_In_Progress_48px.png")));
                            this.setVisible(false);
                            this.dispose();
                            new Prcticelist(rs.getString(1),rs.getString(3));
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(rootPane,"Incorrect Password", "Bad Password",JOptionPane.PLAIN_MESSAGE,new ImageIcon(getClass().getResource("icons8_Scorecard_48px_1.png")));
                            rs.close();
                            st.close();                            
                            con.close();
                            pwd_txfld.setText(null);
                            pwd_txfld.requestFocus(true);
                        }
                    }                   
                }
                if(this.isVisible() && !con.isClosed())
                {
                        JOptionPane.showMessageDialog(rootPane,"There is no Account with this ID,\nPlease try to remember it or signup to continue","User Not found",JOptionPane.PLAIN_MESSAGE,new ImageIcon(getClass().getResource("icons8_ID_not_Verified_48px.png")));
                        rs.close();
                        st.close();                            
                        con.close();
                        pwd_txfld.setEchoChar((char)0);
                        pwd_txfld.setText("Password                                   ");
                        id_txfld.setText("Enter ID                                   ");
                        id_txfld.requestFocus(true);
                }
                
            }
            catch(Exception e)
            {
                try
                {
                    con = DriverManager.getConnection("jdbc:sqlite:Dataset.sqlite");
                    st=con.createStatement();
                    st.executeUpdate("create table record(ID varchar(20),Practice varchar(25),Records varchar(25),Errors varchar(25),datetime varchar(40));");
                    st.executeUpdate("create table masterrecord(ID varchar(110),Password varchar(500),username varchar(101));");
                }
                catch(Exception tr)
                {
                    
                }
            }
        }
    }
        

    public static void main(String args[]) 
    {
        new Neurotyper();           
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content_pnl;
    private javax.swing.JLabel Edu_lbl;
    private javax.swing.JLabel Notamember_lbl;
    private javax.swing.JLabel Signin_lbl;
    private javax.swing.JPanel Signin_pnl;
    private javax.swing.JLabel Signup_lbl;
    private javax.swing.JPanel Signup_pnl;
    private javax.swing.JLabel aboutuslbl;
    private javax.swing.JLabel icon_lbl;
    private javax.swing.JLabel id_icon;
    private javax.swing.JTextField id_txfld;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel mainlabel_pnl;
    private javax.swing.JLabel pwd_icon;
    private javax.swing.JPasswordField pwd_txfld;
    private javax.swing.JLabel wiz_lbl;
    // End of variables declaration//GEN-END:variables
}