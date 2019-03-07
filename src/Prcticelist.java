
import java.awt.Color;
import java.awt.Rectangle;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Prcticelist extends javax.swing.JFrame {
    String name2,ID2;
    int posX,posY;
    public Prcticelist(String ID,String name) {
        name2=name;
        ID2=ID;
        initComponents();
        jLabel6.setText(name2);
        jLabel7.setText(ID2);
        Atoz.requestFocus(true);      
        Atoz.setNextFocusableComponent(Gujaratitype);
        Gujaratitype.setNextFocusableComponent(Hinditype);
        Hinditype.setNextFocusableComponent(numeric);
        numeric.setNextFocusableComponent(alphanum);
        alphanum.setNextFocusableComponent(Atoz);
        this.setLocationRelativeTo(null);
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Atoz = new javax.swing.JPanel();
        Atozlbl = new javax.swing.JLabel();
        Atozlbl2 = new javax.swing.JLabel();
        numeric = new javax.swing.JPanel();
        numeric1 = new javax.swing.JLabel();
        numeric2 = new javax.swing.JLabel();
        Gujaratitype = new javax.swing.JPanel();
        Gujrati1 = new javax.swing.JLabel();
        Gujrati2 = new javax.swing.JLabel();
        Hinditype = new javax.swing.JPanel();
        hindi1 = new javax.swing.JLabel();
        hindi2 = new javax.swing.JLabel();
        alphanum = new javax.swing.JPanel();
        alphanum1 = new javax.swing.JLabel();
        alphanum2 = new javax.swing.JLabel();

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
        jLabel2.setToolTipText("Logout and close");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        jLabel1.setFont(new getfont().getone(49f)
        );
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Keep calm & start Typing");

        jLabel10.setFont(new getfont().getone(20f)
        );
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(" Increase your typing speed with this all new Neuro typer");

        jPanel3.setBackground(new java.awt.Color(25, 35, 55));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(82, 82, 82))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(230, 230, 230));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(25, 35, 55)));

        Atoz.setBackground(new java.awt.Color(230, 230, 230));
        Atoz.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
        Atoz.setFocusTraversalPolicyProvider(true);
        Atoz.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AtozFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AtozFocusLost(evt);
            }
        });
        Atoz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AtozMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AtozMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AtozMouseExited(evt);
            }
        });
        Atoz.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AtozKeyTyped(evt);
            }
        });

        Atozlbl.setFont(new getfont().getone(55f)
        );
        Atozlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Atozlbl.setText("Aa");
        Atozlbl.setFocusCycleRoot(true);

        Atozlbl2.setFont(new getfont().getone(14f)
        );
        Atozlbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Atozlbl2.setText("Alphabatic Practice");

        javax.swing.GroupLayout AtozLayout = new javax.swing.GroupLayout(Atoz);
        Atoz.setLayout(AtozLayout);
        AtozLayout.setHorizontalGroup(
            AtozLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AtozLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AtozLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Atozlbl2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(Atozlbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        AtozLayout.setVerticalGroup(
            AtozLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AtozLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Atozlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Atozlbl2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        numeric.setBackground(new java.awt.Color(230, 230, 230));
        numeric.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
        numeric.setFocusTraversalPolicyProvider(true);
        numeric.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                numericFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                numericFocusLost(evt);
            }
        });
        numeric.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numericMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                numericMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                numericMouseExited(evt);
            }
        });
        numeric.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numericKeyTyped(evt);
            }
        });

        numeric1.setFont(new getfont().getone(65f));
        numeric1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numeric1.setText("123");

        numeric2.setFont(new getfont().getone(14f)
        );
        numeric2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numeric2.setText("Numeric Practice");

        javax.swing.GroupLayout numericLayout = new javax.swing.GroupLayout(numeric);
        numeric.setLayout(numericLayout);
        numericLayout.setHorizontalGroup(
            numericLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(numericLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(numericLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeric2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(numeric1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        numericLayout.setVerticalGroup(
            numericLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(numericLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(numeric1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(numeric2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Gujaratitype.setBackground(new java.awt.Color(230, 230, 230));
        Gujaratitype.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
        Gujaratitype.setFocusTraversalPolicyProvider(true);
        Gujaratitype.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                GujaratitypeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                GujaratitypeFocusLost(evt);
            }
        });
        Gujaratitype.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GujaratitypeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GujaratitypeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GujaratitypeMouseExited(evt);
            }
        });
        Gujaratitype.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                GujaratitypeKeyTyped(evt);
            }
        });

        Gujrati1.setFont(new java.awt.Font("Gujrati Saral-1", 0, 95)); // NOI18N
        Gujrati1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Gujrati1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/g1.png"))); // NOI18N

        Gujrati2.setFont(new getfont().getone(14f)
        );
        Gujrati2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Gujrati2.setText("Gujarati Typing Practice");

        javax.swing.GroupLayout GujaratitypeLayout = new javax.swing.GroupLayout(Gujaratitype);
        Gujaratitype.setLayout(GujaratitypeLayout);
        GujaratitypeLayout.setHorizontalGroup(
            GujaratitypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GujaratitypeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GujaratitypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Gujrati2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(Gujrati1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        GujaratitypeLayout.setVerticalGroup(
            GujaratitypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GujaratitypeLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Gujrati1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Gujrati2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Hinditype.setBackground(new java.awt.Color(230, 230, 230));
        Hinditype.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
        Hinditype.setFocusTraversalPolicyProvider(true);
        Hinditype.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                HinditypeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                HinditypeFocusLost(evt);
            }
        });
        Hinditype.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HinditypeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HinditypeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HinditypeMouseExited(evt);
            }
        });
        Hinditype.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                HinditypeKeyTyped(evt);
            }
        });

        hindi1.setFont(new java.awt.Font("Hindi Saral-1", 0, 60)); // NOI18N
        hindi1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hindi1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/h1.png"))); // NOI18N

        hindi2.setFont(new getfont().getone(14f)
        );
        hindi2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hindi2.setText("Hindi Typing Practice");

        javax.swing.GroupLayout HinditypeLayout = new javax.swing.GroupLayout(Hinditype);
        Hinditype.setLayout(HinditypeLayout);
        HinditypeLayout.setHorizontalGroup(
            HinditypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HinditypeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HinditypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hindi2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(hindi1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        HinditypeLayout.setVerticalGroup(
            HinditypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HinditypeLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(hindi1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hindi2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        alphanum.setBackground(new java.awt.Color(230, 230, 230));
        alphanum.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
        alphanum.setFocusTraversalPolicyProvider(true);
        alphanum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                alphanumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                alphanumFocusLost(evt);
            }
        });
        alphanum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alphanumMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                alphanumMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                alphanumMouseExited(evt);
            }
        });
        alphanum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                alphanumKeyTyped(evt);
            }
        });

        alphanum1.setFont(new getfont().getone(55f));
        alphanum1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alphanum1.setText("A1");

        alphanum2.setFont(new getfont().getone(14f)
        );
        alphanum2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alphanum2.setText("AlphaNumeric Practice");

        javax.swing.GroupLayout alphanumLayout = new javax.swing.GroupLayout(alphanum);
        alphanum.setLayout(alphanumLayout);
        alphanumLayout.setHorizontalGroup(
            alphanumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alphanumLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(alphanumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alphanum2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(alphanum1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        alphanumLayout.setVerticalGroup(
            alphanumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alphanumLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(alphanum1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(alphanum2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(Atoz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(Gujaratitype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(Hinditype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(numeric, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(alphanum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Atoz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numeric, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Gujaratitype, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Hinditype, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alphanum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
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

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
        new Neurotyper();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void numericFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numericFocusGained
        numeric.setBorder(new javax.swing.border.LineBorder(new Color(102,152,255), 1, true));
        numeric1.setForeground(new Color(102,153,255));
        numeric2.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_numericFocusGained

    private void AtozFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AtozFocusLost
        Atoz.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
        Atozlbl.setForeground(new Color(0,0,0));
        Atozlbl2.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_AtozFocusLost

    private void GujaratitypeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GujaratitypeFocusLost
        Gujaratitype.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
        Gujrati1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/g1.png"))); // NOI18N
        Gujrati2.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_GujaratitypeFocusLost

    private void AtozFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AtozFocusGained
        Atoz.setBorder(new javax.swing.border.LineBorder(new Color(102,152,255), 1, true));
        Atozlbl.setForeground(new Color(102,153,255));
        Atozlbl2.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_AtozFocusGained

    private void HinditypeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_HinditypeFocusGained
        Hinditype.setBorder(new javax.swing.border.LineBorder(new Color(102,152,255), 1, true));
        hindi2.setForeground(new Color(102,153,255));
        hindi1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/h2.png"))); // NOI18N
    }//GEN-LAST:event_HinditypeFocusGained

    private void HinditypeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_HinditypeFocusLost
        Hinditype.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
        hindi1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/h1.png"))); // NOI18N
        hindi2.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_HinditypeFocusLost

    private void numericFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numericFocusLost
        numeric.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
        numeric1.setForeground(new Color(0,0,0));
        numeric2.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_numericFocusLost

    private void GujaratitypeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GujaratitypeFocusGained
        Gujaratitype.setBorder(new javax.swing.border.LineBorder(new Color(102,152,255), 1, true));
        Gujrati1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/g2.png"))); // NOI18N
        Gujrati2.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_GujaratitypeFocusGained

    private void AtozMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtozMouseEntered
        Atoz.setBorder(new javax.swing.border.LineBorder(new Color(102,152,255), 1, true));
        Atozlbl.setForeground(new Color(102,153,255));
        Atozlbl2.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_AtozMouseEntered

    private void AtozMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtozMouseExited
        if(getFocusOwner()!=Atoz)
        {
            Atoz.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
            Atozlbl.setForeground(new Color(0,0,0));
            Atozlbl2.setForeground(new Color(0,0,0));
        }
        
    }//GEN-LAST:event_AtozMouseExited

    private void GujaratitypeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GujaratitypeMouseEntered
        Gujaratitype.setBorder(new javax.swing.border.LineBorder(new Color(102,152,255), 1, true));
        Gujrati1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/g2.png"))); // NOI18N
        Gujrati2.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_GujaratitypeMouseEntered

    private void GujaratitypeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GujaratitypeMouseExited
        if(getFocusOwner()!=Gujaratitype)
        {
            Gujaratitype.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
            Gujrati1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/g1.png"))); // NOI18N
            Gujrati2.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_GujaratitypeMouseExited

    private void HinditypeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HinditypeMouseEntered
        Hinditype.setBorder(new javax.swing.border.LineBorder(new Color(102,152,255), 1, true));
        hindi2.setForeground(new Color(102,153,255));
        hindi1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/h2.png"))); // NOI18N
    }//GEN-LAST:event_HinditypeMouseEntered

    private void HinditypeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HinditypeMouseExited
        if(getFocusOwner()!=Hinditype)
        {
            Hinditype.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
            hindi1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/h1.png"))); // NOI18N
            hindi2.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_HinditypeMouseExited

    private void numericMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numericMouseEntered
        numeric.setBorder(new javax.swing.border.LineBorder(new Color(102,152,255), 1, true));        
        numeric1.setForeground(new Color(102,153,255));
        numeric2.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_numericMouseEntered

    private void numericMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numericMouseExited
        if(getFocusOwner()!=numeric)
        {
            numeric.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
            numeric1.setForeground(new Color(0,0,0));
            numeric2.setForeground(new Color(0,0,0));            
        }
    }//GEN-LAST:event_numericMouseExited

    private void alphanumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_alphanumFocusGained
        alphanum.setBorder(new javax.swing.border.LineBorder(new Color(102,152,255), 1, true));        
        alphanum2.setForeground(new Color(102,153,255));
        alphanum1.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_alphanumFocusGained

    private void alphanumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_alphanumFocusLost
        alphanum.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
        alphanum1.setForeground(new Color(0,0,0));
        alphanum2.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_alphanumFocusLost

    private void alphanumMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alphanumMouseExited
        if(getFocusOwner()!=alphanum)
        {
            alphanum.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.controlShadow, 1, true));
            alphanum1.setForeground(new Color(0,0,0));
            alphanum2.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_alphanumMouseExited

    private void alphanumMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alphanumMouseEntered
        alphanum.setBorder(new javax.swing.border.LineBorder(new Color(102,152,255), 1, true));
        alphanum1.setForeground(new Color(102,153,255));
        alphanum2.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_alphanumMouseEntered

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

    private void AtozKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AtozKeyTyped
        new alphabaticlist(ID2,name2);  
        this.dispose();
    }//GEN-LAST:event_AtozKeyTyped

    private void AtozMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtozMouseClicked
        new alphabaticlist(ID2,name2);  
        this.dispose();
    }//GEN-LAST:event_AtozMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Rectangle rectangle = getBounds();
        this.setBounds(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY, rectangle.width, rectangle.height);
    }//GEN-LAST:event_formMouseDragged

    private void GujaratitypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GujaratitypeMouseClicked
        new Gujratilist(ID2, name2);
        this.dispose();
    }//GEN-LAST:event_GujaratitypeMouseClicked

    private void GujaratitypeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GujaratitypeKeyTyped
        new Gujratilist(ID2, name2);
        this.dispose();
    }//GEN-LAST:event_GujaratitypeKeyTyped

    private void numericKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numericKeyTyped
        new numpractice("Numeric Practice",-1,0,ID2,name2);
        this.dispose();        
    }//GEN-LAST:event_numericKeyTyped

    private void numericMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numericMouseClicked
        new numpractice("Numeric Practice",-1,0,ID2,name2);
        this.dispose();
    }//GEN-LAST:event_numericMouseClicked

    private void alphanumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alphanumMouseClicked
        new alphanumpractice("AlphaNumeric Practice", -1, 0, ID2,name2);
        this.dispose();
    }//GEN-LAST:event_alphanumMouseClicked

    private void alphanumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_alphanumKeyTyped
        new alphanumpractice("AlphaNumeric Practice", -1, 0, ID2,name2);
        this.dispose();
    }//GEN-LAST:event_alphanumKeyTyped

    private void HinditypeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HinditypeKeyTyped
        new hindilist(ID2, name2);
        this.dispose();
    }//GEN-LAST:event_HinditypeKeyTyped

    private void HinditypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HinditypeMouseClicked
        new hindilist(ID2, name2);
        this.dispose();
    }//GEN-LAST:event_HinditypeMouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Atoz;
    private javax.swing.JLabel Atozlbl;
    private javax.swing.JLabel Atozlbl2;
    private javax.swing.JPanel Gujaratitype;
    private javax.swing.JLabel Gujrati1;
    private javax.swing.JLabel Gujrati2;
    private javax.swing.JPanel Hinditype;
    private javax.swing.JPanel alphanum;
    private javax.swing.JLabel alphanum1;
    private javax.swing.JLabel alphanum2;
    private javax.swing.JLabel hindi1;
    private javax.swing.JLabel hindi2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel numeric;
    private javax.swing.JLabel numeric1;
    private javax.swing.JLabel numeric2;
    // End of variables declaration//GEN-END:variables
}
