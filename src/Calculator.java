
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Calculator extends javax.swing.JFrame 
{
    int posX,posY;
    
    boolean dotstatus=false,minusstatus=false;
    double number=0,number2;
    public Calculator() {
        initComponents();
        this.setLocationRelativeTo(null);
        jLabel1.setText(String.valueOf("0"));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ACpnl = new javax.swing.JPanel();
        AClbl = new javax.swing.JLabel();
        offpnl = new javax.swing.JPanel();
        offlbl = new javax.swing.JLabel();
        plusminuspnl = new javax.swing.JPanel();
        plusminuslbl = new javax.swing.JLabel();
        divisionpnl = new javax.swing.JPanel();
        lbl10 = new javax.swing.JLabel();
        pnl7 = new javax.swing.JPanel();
        lbl7 = new javax.swing.JLabel();
        pnl8 = new javax.swing.JPanel();
        lbl8 = new javax.swing.JLabel();
        pnl9 = new javax.swing.JPanel();
        lbl9 = new javax.swing.JLabel();
        multiplypnl = new javax.swing.JPanel();
        multiplylbl = new javax.swing.JLabel();
        minuspnl = new javax.swing.JPanel();
        minuslbl = new javax.swing.JLabel();
        pnl6 = new javax.swing.JPanel();
        lbl6 = new javax.swing.JLabel();
        pnl5 = new javax.swing.JPanel();
        lbl5 = new javax.swing.JLabel();
        pnl4 = new javax.swing.JPanel();
        lbl4 = new javax.swing.JLabel();
        pnl2 = new javax.swing.JPanel();
        lbl2 = new javax.swing.JLabel();
        pnl1 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        pluspnl = new javax.swing.JPanel();
        pluslbl = new javax.swing.JLabel();
        pnl3 = new javax.swing.JPanel();
        lbl3 = new javax.swing.JLabel();
        pnl0 = new javax.swing.JPanel();
        lbl0 = new javax.swing.JLabel();
        equalpnl = new javax.swing.JPanel();
        equallbl = new javax.swing.JLabel();
        pnldot = new javax.swing.JPanel();
        lbldot = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        uppersub = new javax.swing.JLabel();
        operator = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(35, 35, 35));
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
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        ACpnl.setBackground(new java.awt.Color(200, 200, 204));
        ACpnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));
        ACpnl.setForeground(new java.awt.Color(102, 102, 102));
        ACpnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ACpnlMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ACpnlMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ACpnlMouseEntered(evt);
            }
        });

        AClbl.setFont(getfont(24f)); // NOI18N
        AClbl.setText("AC");

        javax.swing.GroupLayout ACpnlLayout = new javax.swing.GroupLayout(ACpnl);
        ACpnl.setLayout(ACpnlLayout);
        ACpnlLayout.setHorizontalGroup(
            ACpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
            .addGroup(ACpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ACpnlLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AClbl)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        ACpnlLayout.setVerticalGroup(
            ACpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(ACpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ACpnlLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AClbl)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        offpnl.setBackground(new java.awt.Color(200, 200, 204));
        offpnl.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(50, 50, 50)));
        offpnl.setForeground(new java.awt.Color(102, 102, 102));
        offpnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                offpnlMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                offpnlMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                offpnlMouseEntered(evt);
            }
        });

        offlbl.setFont(getfont(24f)); // NOI18N
        offlbl.setText("Off");

        javax.swing.GroupLayout offpnlLayout = new javax.swing.GroupLayout(offpnl);
        offpnl.setLayout(offpnlLayout);
        offpnlLayout.setHorizontalGroup(
            offpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
            .addGroup(offpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(offpnlLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(offlbl)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        offpnlLayout.setVerticalGroup(
            offpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(offpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(offpnlLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(offlbl)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        plusminuspnl.setBackground(new java.awt.Color(200, 200, 204));
        plusminuspnl.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(50, 50, 50)));
        plusminuspnl.setForeground(new java.awt.Color(102, 102, 102));
        plusminuspnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plusminuspnlMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                plusminuspnlMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                plusminuspnlMouseEntered(evt);
            }
        });

        plusminuslbl.setFont(getfont(24f));
        plusminuslbl.setText("+/-");

        javax.swing.GroupLayout plusminuspnlLayout = new javax.swing.GroupLayout(plusminuspnl);
        plusminuspnl.setLayout(plusminuspnlLayout);
        plusminuspnlLayout.setHorizontalGroup(
            plusminuspnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
            .addGroup(plusminuspnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(plusminuspnlLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(plusminuslbl)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        plusminuspnlLayout.setVerticalGroup(
            plusminuspnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(plusminuspnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(plusminuspnlLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(plusminuslbl)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        divisionpnl.setBackground(new java.awt.Color(255, 102, 51));
        divisionpnl.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(50, 50, 50)));
        divisionpnl.setForeground(new java.awt.Color(102, 102, 102));
        divisionpnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                divisionpnlMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                divisionpnlMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                divisionpnlMouseEntered(evt);
            }
        });

        lbl10.setFont(getfont(24f));
        lbl10.setText("/");

        javax.swing.GroupLayout divisionpnlLayout = new javax.swing.GroupLayout(divisionpnl);
        divisionpnl.setLayout(divisionpnlLayout);
        divisionpnlLayout.setHorizontalGroup(
            divisionpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
            .addGroup(divisionpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(divisionpnlLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbl10)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        divisionpnlLayout.setVerticalGroup(
            divisionpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
            .addGroup(divisionpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(divisionpnlLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbl10)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pnl7.setBackground(new java.awt.Color(200, 200, 204));
        pnl7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(50, 50, 50)));
        pnl7.setForeground(new java.awt.Color(102, 102, 102));
        pnl7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl7MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl7MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl7MouseEntered(evt);
            }
        });

        lbl7.setFont(getfont(24f));
        lbl7.setText("7");

        javax.swing.GroupLayout pnl7Layout = new javax.swing.GroupLayout(pnl7);
        pnl7.setLayout(pnl7Layout);
        pnl7Layout.setHorizontalGroup(
            pnl7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl7Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(lbl7)
                .addGap(29, 29, 29))
        );
        pnl7Layout.setVerticalGroup(
            pnl7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        pnl8.setBackground(new java.awt.Color(200, 200, 204));
        pnl8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(50, 50, 50)));
        pnl8.setForeground(new java.awt.Color(102, 102, 102));
        pnl8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl8MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl8MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl8MouseEntered(evt);
            }
        });

        lbl8.setFont(getfont(24f));
        lbl8.setText("8");

        javax.swing.GroupLayout pnl8Layout = new javax.swing.GroupLayout(pnl8);
        pnl8.setLayout(pnl8Layout);
        pnl8Layout.setHorizontalGroup(
            pnl8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl8Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(lbl8)
                .addGap(29, 29, 29))
        );
        pnl8Layout.setVerticalGroup(
            pnl8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        pnl9.setBackground(new java.awt.Color(200, 200, 204));
        pnl9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(50, 50, 50)));
        pnl9.setForeground(new java.awt.Color(102, 102, 102));
        pnl9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl9MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl9MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl9MouseEntered(evt);
            }
        });

        lbl9.setFont(getfont(24f));
        lbl9.setText("9");

        javax.swing.GroupLayout pnl9Layout = new javax.swing.GroupLayout(pnl9);
        pnl9.setLayout(pnl9Layout);
        pnl9Layout.setHorizontalGroup(
            pnl9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl9Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(lbl9)
                .addGap(29, 29, 29))
        );
        pnl9Layout.setVerticalGroup(
            pnl9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        multiplypnl.setBackground(new java.awt.Color(255, 102, 51));
        multiplypnl.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(50, 50, 50)));
        multiplypnl.setForeground(new java.awt.Color(102, 102, 102));
        multiplypnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                multiplypnlMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                multiplypnlMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                multiplypnlMouseEntered(evt);
            }
        });

        multiplylbl.setFont(getfont(24f)); // NOI18N
        multiplylbl.setText("x");

        javax.swing.GroupLayout multiplypnlLayout = new javax.swing.GroupLayout(multiplypnl);
        multiplypnl.setLayout(multiplypnlLayout);
        multiplypnlLayout.setHorizontalGroup(
            multiplypnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(multiplypnlLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(multiplylbl)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        multiplypnlLayout.setVerticalGroup(
            multiplypnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(multiplypnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(multiplylbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        minuspnl.setBackground(new java.awt.Color(255, 102, 51));
        minuspnl.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(50, 50, 50)));
        minuspnl.setForeground(new java.awt.Color(102, 102, 102));
        minuspnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minuspnlMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minuspnlMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minuspnlMouseEntered(evt);
            }
        });

        minuslbl.setFont(getfont(24f)); // NOI18N
        minuslbl.setText("-");

        javax.swing.GroupLayout minuspnlLayout = new javax.swing.GroupLayout(minuspnl);
        minuspnl.setLayout(minuspnlLayout);
        minuspnlLayout.setHorizontalGroup(
            minuspnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
            .addGroup(minuspnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(minuspnlLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(minuslbl)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        minuspnlLayout.setVerticalGroup(
            minuspnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(minuspnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(minuspnlLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(minuslbl)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pnl6.setBackground(new java.awt.Color(200, 200, 204));
        pnl6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(50, 50, 50)));
        pnl6.setForeground(new java.awt.Color(102, 102, 102));
        pnl6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl6MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl6MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl6MouseEntered(evt);
            }
        });

        lbl6.setFont(getfont(24f)); // NOI18N
        lbl6.setText("6");

        javax.swing.GroupLayout pnl6Layout = new javax.swing.GroupLayout(pnl6);
        pnl6.setLayout(pnl6Layout);
        pnl6Layout.setHorizontalGroup(
            pnl6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl6Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(lbl6)
                .addGap(29, 29, 29))
        );
        pnl6Layout.setVerticalGroup(
            pnl6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        pnl5.setBackground(new java.awt.Color(200, 200, 204));
        pnl5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(50, 50, 50)));
        pnl5.setForeground(new java.awt.Color(102, 102, 102));
        pnl5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl5MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl5MouseEntered(evt);
            }
        });

        lbl5.setFont(getfont(24f)); // NOI18N
        lbl5.setText("5");

        javax.swing.GroupLayout pnl5Layout = new javax.swing.GroupLayout(pnl5);
        pnl5.setLayout(pnl5Layout);
        pnl5Layout.setHorizontalGroup(
            pnl5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl5Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(lbl5)
                .addGap(29, 29, 29))
        );
        pnl5Layout.setVerticalGroup(
            pnl5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        pnl4.setBackground(new java.awt.Color(200, 200, 204));
        pnl4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(50, 50, 50)));
        pnl4.setForeground(new java.awt.Color(102, 102, 102));
        pnl4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl4MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl4MouseEntered(evt);
            }
        });

        lbl4.setFont(getfont(24f)); // NOI18N
        lbl4.setText("4");

        javax.swing.GroupLayout pnl4Layout = new javax.swing.GroupLayout(pnl4);
        pnl4.setLayout(pnl4Layout);
        pnl4Layout.setHorizontalGroup(
            pnl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl4Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(lbl4)
                .addGap(28, 28, 28))
        );
        pnl4Layout.setVerticalGroup(
            pnl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        pnl2.setBackground(new java.awt.Color(200, 200, 204));
        pnl2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(50, 50, 50)));
        pnl2.setForeground(new java.awt.Color(102, 102, 102));
        pnl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl2MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl2MouseEntered(evt);
            }
        });

        lbl2.setFont(getfont(24f)); // NOI18N
        lbl2.setText("2");

        javax.swing.GroupLayout pnl2Layout = new javax.swing.GroupLayout(pnl2);
        pnl2.setLayout(pnl2Layout);
        pnl2Layout.setHorizontalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
            .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbl2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnl2Layout.setVerticalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbl2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pnl1.setBackground(new java.awt.Color(200, 200, 204));
        pnl1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(50, 50, 50)));
        pnl1.setForeground(new java.awt.Color(102, 102, 102));
        pnl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl1MouseEntered(evt);
            }
        });

        lbl1.setFont(getfont(24f)); // NOI18N
        lbl1.setText("1");

        javax.swing.GroupLayout pnl1Layout = new javax.swing.GroupLayout(pnl1);
        pnl1.setLayout(pnl1Layout);
        pnl1Layout.setHorizontalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
            .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbl1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnl1Layout.setVerticalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbl1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pluspnl.setBackground(new java.awt.Color(255, 102, 51));
        pluspnl.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(50, 50, 50)));
        pluspnl.setForeground(new java.awt.Color(102, 102, 102));
        pluspnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pluspnlMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pluspnlMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pluspnlMouseEntered(evt);
            }
        });

        pluslbl.setFont(getfont(24f)); // NOI18N
        pluslbl.setText("+");

        javax.swing.GroupLayout pluspnlLayout = new javax.swing.GroupLayout(pluspnl);
        pluspnl.setLayout(pluspnlLayout);
        pluspnlLayout.setHorizontalGroup(
            pluspnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
            .addGroup(pluspnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pluspnlLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pluslbl)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pluspnlLayout.setVerticalGroup(
            pluspnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
            .addGroup(pluspnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pluspnlLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pluslbl)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pnl3.setBackground(new java.awt.Color(200, 200, 204));
        pnl3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(50, 50, 50)));
        pnl3.setForeground(new java.awt.Color(102, 102, 102));
        pnl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl3MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl3MouseEntered(evt);
            }
        });

        lbl3.setFont(getfont(24f)); // NOI18N
        lbl3.setText("3");

        javax.swing.GroupLayout pnl3Layout = new javax.swing.GroupLayout(pnl3);
        pnl3.setLayout(pnl3Layout);
        pnl3Layout.setHorizontalGroup(
            pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
            .addGroup(pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbl3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnl3Layout.setVerticalGroup(
            pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbl3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pnl0.setBackground(new java.awt.Color(200, 200, 204));
        pnl0.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(50, 50, 50)));
        pnl0.setForeground(new java.awt.Color(102, 102, 102));
        pnl0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl0MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl0MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl0MouseEntered(evt);
            }
        });

        lbl0.setFont(getfont(24f)); // NOI18N
        lbl0.setText("0");

        javax.swing.GroupLayout pnl0Layout = new javax.swing.GroupLayout(pnl0);
        pnl0.setLayout(pnl0Layout);
        pnl0Layout.setHorizontalGroup(
            pnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl0Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbl0)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnl0Layout.setVerticalGroup(
            pnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl0Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbl0)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        equalpnl.setBackground(new java.awt.Color(255, 102, 51));
        equalpnl.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(50, 50, 50)));
        equalpnl.setForeground(new java.awt.Color(102, 102, 102));
        equalpnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                equalpnlMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                equalpnlMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                equalpnlMouseEntered(evt);
            }
        });

        equallbl.setFont(getfont(24f)); // NOI18N
        equallbl.setText("=");

        javax.swing.GroupLayout equalpnlLayout = new javax.swing.GroupLayout(equalpnl);
        equalpnl.setLayout(equalpnlLayout);
        equalpnlLayout.setHorizontalGroup(
            equalpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
            .addGroup(equalpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(equalpnlLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(equallbl)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        equalpnlLayout.setVerticalGroup(
            equalpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
            .addGroup(equalpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(equalpnlLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(equallbl)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pnldot.setBackground(new java.awt.Color(200, 200, 204));
        pnldot.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(50, 50, 50)));
        pnldot.setForeground(new java.awt.Color(102, 102, 102));
        pnldot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnldotMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnldotMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnldotMouseEntered(evt);
            }
        });

        lbldot.setFont(getfont(24f)); // NOI18N
        lbldot.setText(".");

        javax.swing.GroupLayout pnldotLayout = new javax.swing.GroupLayout(pnldot);
        pnldot.setLayout(pnldotLayout);
        pnldotLayout.setHorizontalGroup(
            pnldotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
            .addGroup(pnldotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnldotLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbldot)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnldotLayout.setVerticalGroup(
            pnldotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnldotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnldotLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbldot)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnl7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnl8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnl9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(multiplypnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(ACpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(offpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(plusminuspnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(divisionpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(pnl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(pnl5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(pnl6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(minuspnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pnl0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(pnl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(pnl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, 0)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(pnl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(pluspnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(pnldot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(equalpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(plusminuspnl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(offpnl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ACpnl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(divisionpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnl9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(multiplypnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnl6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(minuspnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnl3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pluspnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnldot, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(equalpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jPanel7.setBackground(new java.awt.Color(50, 50, 50));

        jLabel1.setFont(new java.awt.Font("Technodrome", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("0");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(50, 50, 50), 2, true));
        jLabel2.setText("X");
        //jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons8-filled_circle_red.png"))); // NOI18N
        jLabel2.setToolTipText("close");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jLabel3.setText("-");
        //jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons8-filled_circle_yellow.png"))); // NOI18N
        jLabel3.setToolTipText("minimize");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        //jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons8-filled_circle_green.png"))); // NOI18N
        jLabel4.setToolTipText("Maximize");
        jLabel5.setText("About");
        //jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons8-about.png"))); // NOI18N
        jLabel5.setToolTipText("Maximize");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        uppersub.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        uppersub.setForeground(new java.awt.Color(255, 255, 255));
        uppersub.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        operator.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        operator.setForeground(new java.awt.Color(255, 255, 255));
        operator.setText(" ");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(uppersub, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(operator)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uppersub)
                            .addComponent(operator))))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void ACpnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ACpnlMouseClicked
        jLabel1.setText("0");
        operator.setText("");
        uppersub.setText("");
        dotstatus=false;
    }//GEN-LAST:event_ACpnlMouseClicked

    private void offpnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_offpnlMouseClicked
        this.dispose();
    }//GEN-LAST:event_offpnlMouseClicked

    private void plusminuspnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusminuspnlMouseClicked
        if(jLabel1.getText().startsWith("-")==false && jLabel1.getText().equals("0")==false)
        {
            minusstatus=true;
            jLabel1.setText("-"+jLabel1.getText());
        }
        else
        {
            minusstatus=false;
            jLabel1.setText(jLabel1.getText().replace("-",""));
        }
    }//GEN-LAST:event_plusminuspnlMouseClicked

    private void divisionpnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divisionpnlMouseClicked
        if(uppersub.getText().isEmpty()==false)
        {
            System.out.println("false");
            applyoperation();
        }else
        {
            System.out.println("true");
            uppersub.setText(jLabel1.getText());
            operator.setText("/");
        }
        operator.setText("/");
        jLabel1.setText("0");
        dotstatus=false;
        minusstatus=false;
    }//GEN-LAST:event_divisionpnlMouseClicked

    private void pnl7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl7MouseClicked
        numop('7');
    }//GEN-LAST:event_pnl7MouseClicked

    private void pnl8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl8MouseClicked
        numop('8');
    }//GEN-LAST:event_pnl8MouseClicked

    private void pnl9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl9MouseClicked
        numop('9');
    }//GEN-LAST:event_pnl9MouseClicked

    private void multiplypnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplypnlMouseClicked
        if(uppersub.getText().isEmpty()==false)
        {
            System.out.println("false");
            applyoperation();
        }else
        {
            System.out.println("true");
            uppersub.setText(jLabel1.getText());
            operator.setText("x");
        }
        operator.setText("x");
        jLabel1.setText("0");
        dotstatus=false;
        minusstatus=false;
    }//GEN-LAST:event_multiplypnlMouseClicked

    private void pnl4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl4MouseClicked
        numop('4');
    }//GEN-LAST:event_pnl4MouseClicked

    private void pnl5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl5MouseClicked
        numop('5');
    }//GEN-LAST:event_pnl5MouseClicked

    private void pnl6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl6MouseClicked
        numop('6');
    }//GEN-LAST:event_pnl6MouseClicked

    private void minuspnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minuspnlMouseClicked
        if(uppersub.getText().isEmpty()==false)
        {
            System.out.println("false");
            applyoperation();
        }else
        {
            System.out.println("true");
            uppersub.setText(jLabel1.getText());
            operator.setText("-");
        }
        operator.setText("-");
        jLabel1.setText("0");
        dotstatus=false;
        minusstatus=false;
    }//GEN-LAST:event_minuspnlMouseClicked

    private void pnl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl1MouseClicked
        numop('1');
    }//GEN-LAST:event_pnl1MouseClicked

    private void pnl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl2MouseClicked
        numop('2');
    }//GEN-LAST:event_pnl2MouseClicked

    private void pnl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl3MouseClicked
        numop('3');
    }//GEN-LAST:event_pnl3MouseClicked

    private void pluspnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pluspnlMouseClicked
        if(uppersub.getText().isEmpty()==false)
        {
            System.out.println("false");
            applyoperation();
        }else
        {
            System.out.println("true");
            uppersub.setText(jLabel1.getText());
            operator.setText("+");
        }
        operator.setText("+");
        jLabel1.setText("0");
        dotstatus=false;
        minusstatus=false;
    }//GEN-LAST:event_pluspnlMouseClicked

    private void pnl0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl0MouseClicked
        if(jLabel1.getText().equals("0")==false && jLabel1.getText().length()<10)
        {
            jLabel1.setText(jLabel1.getText()+"0");
        }
    }//GEN-LAST:event_pnl0MouseClicked

    private void pnldotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnldotMouseClicked
        if(jLabel1.getText().length()<10 && dotstatus==false)
        {
            jLabel1.setText(jLabel1.getText()+".");
            dotstatus=true;
        }
    }//GEN-LAST:event_pnldotMouseClicked

    private void equalpnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equalpnlMouseClicked
        equalop();
    }//GEN-LAST:event_equalpnlMouseClicked

    private void ACpnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ACpnlMouseEntered
        ACpnl.setBackground(new Color(210,210,214));
    }//GEN-LAST:event_ACpnlMouseEntered

    private void ACpnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ACpnlMouseExited
        ACpnl.setBackground(new Color(200,200,204));
    }//GEN-LAST:event_ACpnlMouseExited

    private void offpnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_offpnlMouseEntered
        offpnl.setBackground(new Color(210,210,214));        
    }//GEN-LAST:event_offpnlMouseEntered

    private void offpnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_offpnlMouseExited
        offpnl.setBackground(new Color(200,200,204));
    }//GEN-LAST:event_offpnlMouseExited

    private void plusminuspnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusminuspnlMouseEntered
        plusminuspnl.setBackground(new Color(210,210,214));
    }//GEN-LAST:event_plusminuspnlMouseEntered

    private void plusminuspnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusminuspnlMouseExited
        plusminuspnl.setBackground(new Color(200,200,204));
    }//GEN-LAST:event_plusminuspnlMouseExited

    private void divisionpnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divisionpnlMouseEntered
        divisionpnl.setBackground(new Color(255,122,31));
    }//GEN-LAST:event_divisionpnlMouseEntered

    private void divisionpnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divisionpnlMouseExited
        divisionpnl.setBackground(new Color(255,102,51));
    }//GEN-LAST:event_divisionpnlMouseExited

    private void pnl7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl7MouseEntered
        pnl7.setBackground(new Color(210,210,214));
    }//GEN-LAST:event_pnl7MouseEntered

    private void pnl7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl7MouseExited
        pnl7.setBackground(new Color(200,200,204));
    }//GEN-LAST:event_pnl7MouseExited

    private void pnl8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl8MouseEntered
        pnl8.setBackground(new Color(210,210,214));
    }//GEN-LAST:event_pnl8MouseEntered

    private void pnl8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl8MouseExited
        pnl8.setBackground(new Color(200,200,204));
    }//GEN-LAST:event_pnl8MouseExited

    private void pnl9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl9MouseEntered
        pnl9.setBackground(new Color(210,210,214));
    }//GEN-LAST:event_pnl9MouseEntered

    private void pnl9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl9MouseExited
        pnl9.setBackground(new Color(200,200,204));
    }//GEN-LAST:event_pnl9MouseExited

    private void multiplypnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplypnlMouseEntered
        multiplypnl.setBackground(new Color(255,122,31));
    }//GEN-LAST:event_multiplypnlMouseEntered

    private void multiplypnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplypnlMouseExited
        multiplypnl.setBackground(new Color(255,102,51));
    }//GEN-LAST:event_multiplypnlMouseExited

    private void pnl4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl4MouseEntered
        pnl4.setBackground(new Color(210,210,214));
    }//GEN-LAST:event_pnl4MouseEntered

    private void pnl4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl4MouseExited
        pnl4.setBackground(new Color(200,200,204));
    }//GEN-LAST:event_pnl4MouseExited

    private void pnl5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl5MouseEntered
        pnl5.setBackground(new Color(210,210,214));
    }//GEN-LAST:event_pnl5MouseEntered

    private void pnl5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl5MouseExited
        pnl5.setBackground(new Color(200,200,204));
    }//GEN-LAST:event_pnl5MouseExited

    private void pnl6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl6MouseEntered
        pnl6.setBackground(new Color(210,210,214));
    }//GEN-LAST:event_pnl6MouseEntered

    private void pnl6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl6MouseExited
        pnl6.setBackground(new Color(200,200,204));
    }//GEN-LAST:event_pnl6MouseExited

    private void minuspnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minuspnlMouseEntered
        minuspnl.setBackground(new Color(255,122,31));
    }//GEN-LAST:event_minuspnlMouseEntered

    private void minuspnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minuspnlMouseExited
        minuspnl.setBackground(new Color(255,102,51));
    }//GEN-LAST:event_minuspnlMouseExited

    private void pnl1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl1MouseEntered
        pnl1.setBackground(new Color(210,210,214));
    }//GEN-LAST:event_pnl1MouseEntered

    private void pnl1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl1MouseExited
        pnl1.setBackground(new Color(200,200,204));
    }//GEN-LAST:event_pnl1MouseExited

    private void pnl2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl2MouseEntered
        pnl2.setBackground(new Color(210,210,214));
    }//GEN-LAST:event_pnl2MouseEntered

    private void pnl2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl2MouseExited
        pnl2.setBackground(new Color(200,200,204));
    }//GEN-LAST:event_pnl2MouseExited

    private void pnl3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl3MouseEntered
        pnl3.setBackground(new Color(210,210,214));
    }//GEN-LAST:event_pnl3MouseEntered

    private void pnl3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl3MouseExited
        pnl3.setBackground(new Color(200,200,204));
    }//GEN-LAST:event_pnl3MouseExited

    private void pnl0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl0MouseEntered
        pnl0.setBackground(new Color(210,210,214));
    }//GEN-LAST:event_pnl0MouseEntered

    private void pnl0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl0MouseExited
        pnl0.setBackground(new Color(200,200,204));
    }//GEN-LAST:event_pnl0MouseExited

    private void pnldotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnldotMouseEntered
        pnldot.setBackground(new Color(210,210,214));
    }//GEN-LAST:event_pnldotMouseEntered

    private void pnldotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnldotMouseExited
        pnldot.setBackground(new Color(200,200,204));
    }//GEN-LAST:event_pnldotMouseExited

    private void pluspnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pluspnlMouseEntered
        pluspnl.setBackground(new Color(255,122,31));
    }//GEN-LAST:event_pluspnlMouseEntered

    private void pluspnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pluspnlMouseExited
        pluspnl.setBackground(new Color(255,102,51));
    }//GEN-LAST:event_pluspnlMouseExited

    private void equalpnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equalpnlMouseEntered
        equalpnl.setBackground(new Color(255,122,31));
    }//GEN-LAST:event_equalpnlMouseEntered

    private void equalpnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equalpnlMouseExited
        equalpnl.setBackground(new Color(255,102,51));
    }//GEN-LAST:event_equalpnlMouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        JOptionPane.showMessageDialog(rootPane,"Program by : Vrushank Patel");
    }//GEN-LAST:event_jLabel5MouseClicked

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
         if(evt.getKeyChar()=='0')
        {
            if(jLabel1.getText().equals("0")==false && jLabel1.getText().length()<10)
            {
                jLabel1.setText(jLabel1.getText()+"0");
            }
        }else if(evt.getKeyChar()=='1' || evt.getKeyChar()=='2' || evt.getKeyChar()=='3' || evt.getKeyChar()=='4' || evt.getKeyChar()=='5' || evt.getKeyChar()=='6' || evt.getKeyChar()=='7' || evt.getKeyChar()=='8' || evt.getKeyChar()=='9')
        {
            numop(evt.getKeyChar());
        }else if(evt.getKeyChar()=='.')
        {
            if(jLabel1.getText().length()<10 && dotstatus==false)
            {
                jLabel1.setText(jLabel1.getText()+".");
                dotstatus=true;
            }
        }else if(evt.getKeyChar()=='/')
        {
            uppersub.setText(jLabel1.getText());
            operator.setText("/");
            jLabel1.setText("0");
        }else if(evt.getKeyChar()=='*')
        {
            uppersub.setText(jLabel1.getText());
            operator.setText("x");
            jLabel1.setText("0");
        }else if(evt.getKeyChar()=='+')
        {
            uppersub.setText(jLabel1.getText());
            operator.setText("+");
            jLabel1.setText("0");
        }else if(evt.getKeyChar()=='-')
        {
            uppersub.setText(jLabel1.getText());
            operator.setText("-");
            jLabel1.setText("0");
        }else if(evt.getKeyChar()=='\n')
        {
            equalop();
        }
    }//GEN-LAST:event_formKeyTyped

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked
    public void applyoperation()
    {
        if(operator.getText()=="+")
        {
            uppersub.setText(String.valueOf(Integer.parseInt(uppersub.getText())+Integer.parseInt(jLabel1.getText())));
        }else if(operator.getText()=="-")
        {
            uppersub.setText(String.valueOf(Integer.parseInt(uppersub.getText())-Integer.parseInt(jLabel1.getText())));
        }else if(operator.getText()=="/")
        {
            uppersub.setText(String.valueOf(Integer.parseInt(uppersub.getText())/Integer.parseInt(jLabel1.getText())));
        }else if(operator.getText()=="x")
        {
            uppersub.setText(String.valueOf(Integer.parseInt(uppersub.getText())*Integer.parseInt(jLabel1.getText())));
        }
        dotstatus=false;
        minusstatus=false;
    }
    public void equalop()
    {
        if(operator.getText()=="+")
        {
            jLabel1.setText(String.valueOf(Integer.parseInt(uppersub.getText())+Integer.parseInt(jLabel1.getText())));
            uppersub.setText("");
            operator.setText("");
        }else if(operator.getText()=="-")
        {
            jLabel1.setText(String.valueOf(Integer.parseInt(uppersub.getText())-Integer.parseInt(jLabel1.getText())));
            uppersub.setText("");
            operator.setText("");
        }else if(operator.getText()=="/")
        {
            jLabel1.setText(String.valueOf(Integer.parseInt(uppersub.getText())/Integer.parseInt(jLabel1.getText())));
            uppersub.setText("");
            operator.setText("");
        }else if(operator.getText()=="x")
        { 
            jLabel1.setText(String.valueOf((Integer.parseInt(uppersub.getText())*Integer.parseInt(jLabel1.getText()))));
            uppersub.setText("");
            operator.setText("");
        }
        dotstatus=false;
        minusstatus=false;
    }
    public void numop(char s)
    {
        if(jLabel1.getText().equals("0")==false)
        {
        if(dotstatus==true && minusstatus==true)
        {
            if(jLabel1.getText().length()<12)
            {
                jLabel1.setText(jLabel1.getText()+String.valueOf(s));
            }
        }else if(dotstatus==true && minusstatus==false)
        {
            if(jLabel1.getText().length()<11)
            {
                jLabel1.setText(jLabel1.getText()+String.valueOf(s));
            }
        }else if(minusstatus==true && dotstatus==false)
        {
            if(jLabel1.getText().length()<11)
            {
                jLabel1.setText(jLabel1.getText()+String.valueOf(s));
            }
        }else if(minusstatus==false && dotstatus==false)
        {
            if(jLabel1.getText().length()<10)
            {
                jLabel1.setText(jLabel1.getText()+String.valueOf(s));
            }
        }
        }
        else
        {
            jLabel1.setText(String.valueOf(s));
        }
    }
    public Font getfont(float a)
    {
        try
        {
            return Font.createFont(Font.TRUETYPE_FONT,Calculator.class.getResourceAsStream("Technodrome.ttf")).deriveFont(a);
        }
        catch(Exception e)
        {
            return new Font("Arial",0,(int)a);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AClbl;
    private javax.swing.JPanel ACpnl;
    private javax.swing.JPanel divisionpnl;
    private javax.swing.JLabel equallbl;
    private javax.swing.JPanel equalpnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lbl0;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lbldot;
    private javax.swing.JLabel minuslbl;
    private javax.swing.JPanel minuspnl;
    private javax.swing.JLabel multiplylbl;
    private javax.swing.JPanel multiplypnl;
    private javax.swing.JLabel offlbl;
    private javax.swing.JPanel offpnl;
    private javax.swing.JLabel operator;
    private javax.swing.JLabel pluslbl;
    private javax.swing.JLabel plusminuslbl;
    private javax.swing.JPanel plusminuspnl;
    private javax.swing.JPanel pluspnl;
    private javax.swing.JPanel pnl0;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnl2;
    private javax.swing.JPanel pnl3;
    private javax.swing.JPanel pnl4;
    private javax.swing.JPanel pnl5;
    private javax.swing.JPanel pnl6;
    private javax.swing.JPanel pnl7;
    private javax.swing.JPanel pnl8;
    private javax.swing.JPanel pnl9;
    private javax.swing.JPanel pnldot;
    private javax.swing.JLabel uppersub;
    // End of variables declaration//GEN-END:variables
}
