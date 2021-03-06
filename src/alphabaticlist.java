import java.awt.Color;
import java.awt.Rectangle;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;



public class alphabaticlist extends javax.swing.JFrame {
    String name2,ID2;
    int posX,posY;
    public alphabaticlist(String ID,String name) {
        name2=name;
        ID2=ID;
        initComponents();
        jLabel6.setText(name2);
        jLabel7.setText(ID2);
        Practice1.requestFocus(true);
        Practice1.setNextFocusableComponent(Practice2);
        Practice2.setNextFocusableComponent(Practice3);
        Practice3.setNextFocusableComponent(Practice4);
        Practice4.setNextFocusableComponent(Practice5);
        Practice5.setNextFocusableComponent(Practice6);
        Practice6.setNextFocusableComponent(Practice7);
        Practice7.setNextFocusableComponent(Practice8);
        Practice8.setNextFocusableComponent(backbtn);
        backbtn.setNextFocusableComponent(Practice1);
        this.setLocationRelativeTo(null);
        
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backbtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        userinfo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Practice3 = new javax.swing.JPanel();
        Practice3lbl = new javax.swing.JLabel();
        Practice1 = new javax.swing.JPanel();
        Practice1lbl = new javax.swing.JLabel();
        Practice2 = new javax.swing.JPanel();
        Practice2lbl = new javax.swing.JLabel();
        Practice4 = new javax.swing.JPanel();
        Practice4lbl = new javax.swing.JLabel();
        Practice5 = new javax.swing.JPanel();
        Practice5lbl = new javax.swing.JLabel();
        Practice6 = new javax.swing.JPanel();
        Practice6lbl = new javax.swing.JLabel();
        Practice7 = new javax.swing.JPanel();
        Practice7lbl = new javax.swing.JLabel();
        Practice8 = new javax.swing.JPanel();
        Practice8lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
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

        jPanel1.setBackground(new java.awt.Color(25, 35, 55));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(25, 35, 55)));

        backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-left_4_1.png"))); // NOI18N
        backbtn.setToolTipText("Back");
        backbtn.setFocusTraversalPolicyProvider(true);
        backbtn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                backbtnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                backbtnFocusLost(evt);
            }
        });
        backbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backbtnMouseExited(evt);
            }
        });
        backbtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                backbtnKeyTyped(evt);
            }
        });

        jLabel1.setFont(new getfont().getone(49f)
        );
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Choose your Practice");

        jLabel10.setFont(new getfont().getone(20f)
        );
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Every Practice will train your fingers for different key-patterns of keyboard");

        userinfo.setBackground(new java.awt.Color(25, 35, 55));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Username :");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 153, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("UserID :");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 153, 255));
        jLabel6.setText(" ");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 153, 255));
        jLabel7.setText(" ");

        javax.swing.GroupLayout userinfoLayout = new javax.swing.GroupLayout(userinfo);
        userinfo.setLayout(userinfoLayout);
        userinfoLayout.setHorizontalGroup(
            userinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userinfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(82, 82, 82))
        );
        userinfoLayout.setVerticalGroup(
            userinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userinfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backbtn)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(userinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
            .addComponent(backbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(230, 230, 230));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(25, 35, 55)));

        Practice3.setBackground(new java.awt.Color(230, 230, 230));
        Practice3.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
        Practice3.setFocusTraversalPolicyProvider(true);
        Practice3.setMaximumSize(Practice8.getPreferredSize());
        Practice3.setMinimumSize(Practice8.getPreferredSize());
        Practice3.setPreferredSize(new java.awt.Dimension(220, 90));
        Practice3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Practice3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Practice3FocusLost(evt);
            }
        });
        Practice3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Practice3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Practice3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Practice3MouseExited(evt);
            }
        });
        Practice3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Practice3KeyTyped(evt);
            }
        });

        Practice3lbl.setBackground(new java.awt.Color(230, 230, 230));
        Practice3lbl.setFont(new getfont().getone(36f)
        );
        Practice3lbl.setForeground(new java.awt.Color(25, 35, 55));
        Practice3lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Practice3lbl.setText("Practice 3");

        javax.swing.GroupLayout Practice3Layout = new javax.swing.GroupLayout(Practice3);
        Practice3.setLayout(Practice3Layout);
        Practice3Layout.setHorizontalGroup(
            Practice3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Practice3lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        );
        Practice3Layout.setVerticalGroup(
            Practice3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Practice3lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Practice1.setBackground(new java.awt.Color(230, 230, 230));
        Practice1.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
        Practice1.setFocusTraversalPolicyProvider(true);
        Practice1.setMaximumSize(Practice8.getPreferredSize());
        Practice1.setMinimumSize(Practice8.getPreferredSize());
        Practice1.setPreferredSize(new java.awt.Dimension(220, 90));
        Practice1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Practice1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Practice1FocusLost(evt);
            }
        });
        Practice1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Practice1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Practice1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Practice1MouseExited(evt);
            }
        });
        Practice1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Practice1KeyTyped(evt);
            }
        });

        Practice1lbl.setBackground(new java.awt.Color(230, 230, 230));
        Practice1lbl.setFont(new getfont().getone(36f)
        );
        Practice1lbl.setForeground(new java.awt.Color(25, 35, 55));
        Practice1lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Practice1lbl.setText("Practice 1");
        Practice1lbl.setToolTipText("");
        Practice1lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Practice1lblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Practice1Layout = new javax.swing.GroupLayout(Practice1);
        Practice1.setLayout(Practice1Layout);
        Practice1Layout.setHorizontalGroup(
            Practice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Practice1lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        );
        Practice1Layout.setVerticalGroup(
            Practice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Practice1lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Practice2.setBackground(new java.awt.Color(230, 230, 230));
        Practice2.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
        Practice2.setFocusTraversalPolicyProvider(true);
        Practice2.setMaximumSize(Practice8.getPreferredSize());
        Practice2.setMinimumSize(Practice8.getPreferredSize());
        Practice2.setPreferredSize(new java.awt.Dimension(220, 90));
        Practice2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Practice2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Practice2FocusLost(evt);
            }
        });
        Practice2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Practice2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Practice2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Practice2MouseExited(evt);
            }
        });
        Practice2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Practice2KeyTyped(evt);
            }
        });

        Practice2lbl.setBackground(new java.awt.Color(230, 230, 230));
        Practice2lbl.setFont(new getfont().getone(36f)
        );
        Practice2lbl.setForeground(new java.awt.Color(25, 35, 55));
        Practice2lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Practice2lbl.setText("Practice 2");

        javax.swing.GroupLayout Practice2Layout = new javax.swing.GroupLayout(Practice2);
        Practice2.setLayout(Practice2Layout);
        Practice2Layout.setHorizontalGroup(
            Practice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Practice2lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        );
        Practice2Layout.setVerticalGroup(
            Practice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Practice2lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Practice4.setBackground(new java.awt.Color(230, 230, 230));
        Practice4.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
        Practice4.setFocusTraversalPolicyProvider(true);
        Practice4.setMaximumSize(Practice8.getPreferredSize());
        Practice4.setMinimumSize(Practice8.getPreferredSize());
        Practice4.setPreferredSize(new java.awt.Dimension(220, 90));
        Practice4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Practice4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Practice4FocusLost(evt);
            }
        });
        Practice4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Practice4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Practice4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Practice4MouseExited(evt);
            }
        });
        Practice4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Practice4KeyTyped(evt);
            }
        });

        Practice4lbl.setBackground(new java.awt.Color(230, 230, 230));
        Practice4lbl.setFont(new getfont().getone(36f)
        );
        Practice4lbl.setForeground(new java.awt.Color(25, 35, 55));
        Practice4lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Practice4lbl.setText("Practice 4");

        javax.swing.GroupLayout Practice4Layout = new javax.swing.GroupLayout(Practice4);
        Practice4.setLayout(Practice4Layout);
        Practice4Layout.setHorizontalGroup(
            Practice4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Practice4lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        );
        Practice4Layout.setVerticalGroup(
            Practice4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Practice4lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );

        Practice5.setBackground(new java.awt.Color(230, 230, 230));
        Practice5.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
        Practice5.setFocusTraversalPolicyProvider(true);
        Practice5.setMaximumSize(Practice8.getPreferredSize());
        Practice5.setMinimumSize(Practice8.getPreferredSize());
        Practice5.setPreferredSize(new java.awt.Dimension(220, 90));
        Practice5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Practice5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Practice5FocusLost(evt);
            }
        });
        Practice5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Practice5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Practice5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Practice5MouseExited(evt);
            }
        });
        Practice5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Practice5KeyTyped(evt);
            }
        });

        Practice5lbl.setBackground(new java.awt.Color(230, 230, 230));
        Practice5lbl.setFont(new getfont().getone(36f)
        );
        Practice5lbl.setForeground(new java.awt.Color(25, 35, 55));
        Practice5lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Practice5lbl.setText("Practice 5");

        javax.swing.GroupLayout Practice5Layout = new javax.swing.GroupLayout(Practice5);
        Practice5.setLayout(Practice5Layout);
        Practice5Layout.setHorizontalGroup(
            Practice5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Practice5lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        );
        Practice5Layout.setVerticalGroup(
            Practice5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Practice5lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Practice6.setBackground(new java.awt.Color(230, 230, 230));
        Practice6.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
        Practice6.setFocusTraversalPolicyProvider(true);
        Practice6.setMaximumSize(Practice8.getPreferredSize());
        Practice6.setMinimumSize(Practice8.getPreferredSize());
        Practice6.setPreferredSize(new java.awt.Dimension(220, 90));
        Practice6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Practice6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Practice6FocusLost(evt);
            }
        });
        Practice6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Practice6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Practice6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Practice6MouseExited(evt);
            }
        });
        Practice6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Practice6KeyTyped(evt);
            }
        });

        Practice6lbl.setBackground(new java.awt.Color(230, 230, 230));
        Practice6lbl.setFont(new getfont().getone(36f)
        );
        Practice6lbl.setForeground(new java.awt.Color(25, 35, 55));
        Practice6lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Practice6lbl.setText("Practice 6");

        javax.swing.GroupLayout Practice6Layout = new javax.swing.GroupLayout(Practice6);
        Practice6.setLayout(Practice6Layout);
        Practice6Layout.setHorizontalGroup(
            Practice6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Practice6lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        );
        Practice6Layout.setVerticalGroup(
            Practice6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Practice6lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Practice7.setBackground(new java.awt.Color(230, 230, 230));
        Practice7.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
        Practice7.setFocusTraversalPolicyProvider(true);
        Practice7.setMaximumSize(Practice8.getPreferredSize());
        Practice7.setMinimumSize(Practice8.getPreferredSize());
        Practice7.setPreferredSize(new java.awt.Dimension(220, 90));
        Practice7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Practice7FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Practice7FocusLost(evt);
            }
        });
        Practice7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Practice7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Practice7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Practice7MouseExited(evt);
            }
        });
        Practice7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Practice7KeyTyped(evt);
            }
        });

        Practice7lbl.setBackground(new java.awt.Color(230, 230, 230));
        Practice7lbl.setFont(new getfont().getone(36f)
        );
        Practice7lbl.setForeground(new java.awt.Color(25, 35, 55));
        Practice7lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Practice7lbl.setText("Practice 7");

        javax.swing.GroupLayout Practice7Layout = new javax.swing.GroupLayout(Practice7);
        Practice7.setLayout(Practice7Layout);
        Practice7Layout.setHorizontalGroup(
            Practice7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Practice7lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        );
        Practice7Layout.setVerticalGroup(
            Practice7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Practice7lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Practice8.setBackground(new java.awt.Color(230, 230, 230));
        Practice8.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
        Practice8.setFocusTraversalPolicyProvider(true);
        Practice8.setMaximumSize(Practice8.getPreferredSize());
        Practice8.setMinimumSize(Practice8.getPreferredSize());
        Practice8.setPreferredSize(new java.awt.Dimension(220, 90));
        Practice8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Practice8FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Practice8FocusLost(evt);
            }
        });
        Practice8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Practice8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Practice8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Practice8MouseExited(evt);
            }
        });
        Practice8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Practice8KeyTyped(evt);
            }
        });

        Practice8lbl.setBackground(new java.awt.Color(230, 230, 230));
        Practice8lbl.setFont(new getfont().getone(36f)
        );
        Practice8lbl.setForeground(new java.awt.Color(25, 35, 55));
        Practice8lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Practice8lbl.setText("SpeedTest");

        javax.swing.GroupLayout Practice8Layout = new javax.swing.GroupLayout(Practice8);
        Practice8.setLayout(Practice8Layout);
        Practice8Layout.setHorizontalGroup(
            Practice8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Practice8lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        );
        Practice8Layout.setVerticalGroup(
            Practice8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Practice8lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Practice5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(Practice6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(Practice7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(Practice8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Practice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(Practice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(Practice3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(Practice4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Practice3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Practice2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Practice1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Practice4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Practice7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Practice6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Practice5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Practice8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseClicked
        this.dispose();
        new Prcticelist(ID2, name2);
    }//GEN-LAST:event_backbtnMouseClicked

    private void Practice3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Practice3FocusGained
        Practice3.setBorder(new javax.swing.border.LineBorder(new Color(102,152,255), 1, true));        
        Practice3lbl.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_Practice3FocusGained

    private void Practice1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Practice1FocusLost
        Practice1.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
        Practice1lbl.setForeground(new Color(25,35,55));
    }//GEN-LAST:event_Practice1FocusLost

    private void Practice2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Practice2FocusGained
        Practice2.setBorder(new javax.swing.border.LineBorder(new Color(102,152,255), 1, true));        
        Practice2lbl.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_Practice2FocusGained

    private void Practice2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Practice2FocusLost
        Practice2.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));       
        Practice2lbl.setForeground(new Color(25,35,55));
    }//GEN-LAST:event_Practice2FocusLost

    private void Practice3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Practice3FocusLost
        Practice3.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));       
        Practice3lbl.setForeground(new Color(25,35,55));
    }//GEN-LAST:event_Practice3FocusLost

    private void Practice1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Practice1FocusGained
        Practice1.setBorder(new javax.swing.border.LineBorder(new Color(102,152,255), 1, true));        
        Practice1lbl.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_Practice1FocusGained

    private void Practice1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Practice1MouseEntered
        Practice1.setBorder(new javax.swing.border.LineBorder(new Color(102,152,255), 1, true));
        Practice1lbl.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_Practice1MouseEntered

    private void Practice1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Practice1MouseExited
        if(getFocusOwner()!=Practice1)
        {
            Practice1.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
            Practice1lbl.setForeground(new Color(25,35,55));
        }
    }//GEN-LAST:event_Practice1MouseExited

    private void Practice2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Practice2MouseEntered
        Practice2.setBorder(new javax.swing.border.LineBorder(new Color(102,152,255), 1, true));
        Practice2lbl.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_Practice2MouseEntered

    private void Practice2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Practice2MouseExited
        if(getFocusOwner()!=Practice2)
        {
            Practice2.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
            Practice2lbl.setForeground(new Color(25,35,55));
        }
    }//GEN-LAST:event_Practice2MouseExited

    private void Practice3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Practice3MouseEntered
        Practice3.setBorder(new javax.swing.border.LineBorder(new Color(102,152,255), 1, true));
        Practice3lbl.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_Practice3MouseEntered

    private void Practice3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Practice3MouseExited
        if(getFocusOwner()!=Practice3)
        {
            Practice3.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
            Practice3lbl.setForeground(new Color(25,35,55));
        }
    }//GEN-LAST:event_Practice3MouseExited

    private void backbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseEntered
        backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-left_4.png"))); // NOI18N
    }//GEN-LAST:event_backbtnMouseEntered

    private void backbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseExited
        if(getFocusOwner()!=backbtn)
        {
            backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-left_4_1.png"))); // NOI18N
        }
    }//GEN-LAST:event_backbtnMouseExited

    private void Practice5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Practice5FocusGained
        Practice5.setBorder(new javax.swing.border.LineBorder(new Color(102,152,255), 1, true));        
        Practice5lbl.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_Practice5FocusGained

    private void Practice5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Practice5FocusLost
        Practice5.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
        Practice5lbl.setForeground(new Color(25,35,55));
    }//GEN-LAST:event_Practice5FocusLost

    private void Practice5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Practice5MouseEntered
        Practice5.setBorder(new javax.swing.border.LineBorder(new Color(102,152,255), 1, true));
        Practice5lbl.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_Practice5MouseEntered

    private void Practice5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Practice5MouseExited
        if(getFocusOwner()!=Practice5)
        {
            Practice5.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
            Practice5lbl.setForeground(new Color(25,35,55));
        }
    }//GEN-LAST:event_Practice5MouseExited

    private void Practice6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Practice6FocusGained
        Practice6.setBorder(new javax.swing.border.LineBorder(new Color(102,152,255), 1, true));        
        Practice6lbl.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_Practice6FocusGained

    private void Practice6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Practice6FocusLost
        Practice6.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
        Practice6lbl.setForeground(new Color(25,35,55));
    }//GEN-LAST:event_Practice6FocusLost

    private void Practice6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Practice6MouseEntered
        Practice6.setBorder(new javax.swing.border.LineBorder(new Color(102,152,255), 1, true));
        Practice6lbl.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_Practice6MouseEntered

    private void Practice6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Practice6MouseExited
        if(getFocusOwner()!=Practice6)
        {
            Practice6.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
            Practice6lbl.setForeground(new Color(25,35,55));
        }
    }//GEN-LAST:event_Practice6MouseExited

    private void Practice7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Practice7FocusGained
        Practice7.setBorder(new javax.swing.border.LineBorder(new Color(102,152,255), 1, true));        
        Practice7lbl.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_Practice7FocusGained

    private void Practice7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Practice7FocusLost
        Practice7.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
        Practice7lbl.setForeground(new Color(25,35,55));
    }//GEN-LAST:event_Practice7FocusLost

    private void Practice7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Practice7MouseEntered
        Practice7.setBorder(new javax.swing.border.LineBorder(new Color(102,152,255), 1, true));
        Practice7lbl.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_Practice7MouseEntered

    private void Practice7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Practice7MouseExited
        if(getFocusOwner()!=Practice7)
        {
            Practice7.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
            Practice7lbl.setForeground(new Color(25,35,55));
        }
    }//GEN-LAST:event_Practice7MouseExited

    private void backbtnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_backbtnKeyTyped
        this.dispose();
        new Prcticelist(ID2, name2);
    }//GEN-LAST:event_backbtnKeyTyped

    private void Practice8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Practice8MouseExited
        if(getFocusOwner()!=Practice8)
        {
            Practice8.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
            Practice8lbl.setForeground(new Color(25,35,55));
        }
    }//GEN-LAST:event_Practice8MouseExited

    private void Practice8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Practice8MouseEntered
        Practice8.setBorder(new javax.swing.border.LineBorder(new Color(102,152,255), 1, true));
        Practice8lbl.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_Practice8MouseEntered

    private void Practice8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Practice8FocusLost
        Practice8.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
        Practice8lbl.setForeground(new Color(25,35,55));
    }//GEN-LAST:event_Practice8FocusLost

    private void Practice8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Practice8FocusGained
        Practice8.setBorder(new javax.swing.border.LineBorder(new Color(102,152,255), 1, true));        
        Practice8lbl.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_Practice8FocusGained

    private void Practice4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Practice4MouseExited
        if(getFocusOwner()!=Practice4)
        {
            Practice4.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
            Practice4lbl.setForeground(new Color(25,35,55));
        }
    }//GEN-LAST:event_Practice4MouseExited

    private void Practice4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Practice4MouseEntered
        Practice4.setBorder(new javax.swing.border.LineBorder(new Color(102,152,255), 1, true));
        Practice4lbl.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_Practice4MouseEntered

    private void Practice4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Practice4FocusLost
        Practice4.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
        Practice4lbl.setForeground(new Color(25,35,55));
    }//GEN-LAST:event_Practice4FocusLost

    private void Practice4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Practice4FocusGained
        Practice4.setBorder(new javax.swing.border.LineBorder(new Color(102,152,255), 1, true));
        Practice4lbl.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_Practice4FocusGained

    private void backbtnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_backbtnFocusGained
        backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-left_4.png"))); // NOI18N
    }//GEN-LAST:event_backbtnFocusGained

    private void backbtnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_backbtnFocusLost
        backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-left_4_1.png"))); // NOI18N
    }//GEN-LAST:event_backbtnFocusLost

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Rectangle rectangle = getBounds();
        this.setBounds(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY, rectangle.width, rectangle.height);
    }//GEN-LAST:event_formMouseDragged

    private void Practice1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Practice1MouseClicked
        new Practice("ASDFGF",";LKJHJ","Practice 1",-1,0,ID2,name2);
        this.dispose();
    }//GEN-LAST:event_Practice1MouseClicked

    private void Practice2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Practice2MouseClicked
        new Practice("AWERQFA",";OIUPJ;","Practice 2",-1,0,ID2,name2);
        this.dispose();
    }//GEN-LAST:event_Practice2MouseClicked

    private void Practice3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Practice3MouseClicked
        new Practice("GFTFRF","HJYJUJ","Practice 3",-1,0,ID2,name2);
        this.dispose();
    }//GEN-LAST:event_Practice3MouseClicked

    private void Practice4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Practice4MouseClicked
        new Practice("AZXCVF","LKMNBJ","Practice 4",-1,0,ID2,name2);
        this.dispose();
    }//GEN-LAST:event_Practice4MouseClicked

    private void Practice1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Practice1KeyTyped
        new Practice("ASDFGF",";LKJHJ","Practice 1",-1,0,ID2,name2);
        this.dispose();
    }//GEN-LAST:event_Practice1KeyTyped

    private void Practice2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Practice2KeyTyped
        new Practice("AWERQFA",";OIUPJ;","Practice 2",-1,0,ID2,name2);
        this.dispose();
    }//GEN-LAST:event_Practice2KeyTyped

    private void Practice3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Practice3KeyTyped
        new Practice("GFTFRF","HJYJUJ","Practice 3",-1,0,ID2,name2);
        this.dispose();
    }//GEN-LAST:event_Practice3KeyTyped

    private void Practice4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Practice4KeyTyped
        new Practice("AZXCVF","LKMNBJ","Practice 4",-1,0,ID2,name2);
        this.dispose();
    }//GEN-LAST:event_Practice4KeyTyped

    private void Practice5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Practice5KeyTyped
        new Practice2("ABCDEFGHIJKLMNOPQRSTUVWXYZ","Practice 5",-1,0,ID2,name2);
        this.dispose();
    }//GEN-LAST:event_Practice5KeyTyped

    private void Practice5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Practice5MouseClicked
        new Practice2("ABCDEFGHIJKLMNOPQRSTUVWXYZ","Practice 5",-1,0,ID2,name2);
        this.dispose();
    }//GEN-LAST:event_Practice5MouseClicked

    private void Practice7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Practice7MouseClicked
        new Practice3("The quick brown fox jumps over the lazy dog.","Practice 7",-1,0,ID2,name2);
        this.dispose();
    }//GEN-LAST:event_Practice7MouseClicked

    private void Practice6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Practice6MouseClicked
        new Practice2("ZYXWVUTSRQPONMLKJIHGFEDCBA","Practice 6",-1,0,ID2,name2);
        this.dispose();
    }//GEN-LAST:event_Practice6MouseClicked

    private void Practice7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Practice7KeyTyped
        new Practice3("The quick brown fox jumps over the lazy dog.","Practice 7",-1,0,ID2,name2);
        this.dispose();
    }//GEN-LAST:event_Practice7KeyTyped

    private void Practice8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Practice8MouseClicked
        new Practice4("Speed Test",-1,0,ID2,name2);
        this.dispose();
    }//GEN-LAST:event_Practice8MouseClicked

    private void Practice8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Practice8KeyTyped
        new Practice4("Speed Test",-1,0,ID2,name2);
        this.dispose();
    }//GEN-LAST:event_Practice8KeyTyped

    private void Practice6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Practice6KeyTyped
        new Practice2("ZYXWVUTSRQPONMLKJIHGFEDCBA","Practice 6",-1,0,ID2,name2);
        this.dispose();
    }//GEN-LAST:event_Practice6KeyTyped

    private void Practice1lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Practice1lblMouseClicked
        new Practice("ASDFGF",";LKJHJ","Practice 1",-1,0,ID2,name2);
        this.dispose();
    }//GEN-LAST:event_Practice1lblMouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Practice1;
    private javax.swing.JLabel Practice1lbl;
    private javax.swing.JPanel Practice2;
    private javax.swing.JLabel Practice2lbl;
    private javax.swing.JPanel Practice3;
    private javax.swing.JLabel Practice3lbl;
    private javax.swing.JPanel Practice4;
    private javax.swing.JLabel Practice4lbl;
    private javax.swing.JPanel Practice5;
    private javax.swing.JLabel Practice5lbl;
    private javax.swing.JPanel Practice6;
    private javax.swing.JLabel Practice6lbl;
    private javax.swing.JPanel Practice7;
    private javax.swing.JLabel Practice7lbl;
    private javax.swing.JPanel Practice8;
    private javax.swing.JLabel Practice8lbl;
    private javax.swing.JLabel backbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel userinfo;
    // End of variables declaration//GEN-END:variables
}
