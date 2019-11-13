import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.*;
public class aboutdev extends javax.swing.JFrame 
{
    int posX,posY,secret;
    Connection con;
    Statement st;
    String typ;
    public aboutdev() 
    {
        secret=0;
        initComponents();   
        this.setVisible(true);
        this.setLocationRelativeTo(null);         
    }
    
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Neurotyper");
        setBackground(new java.awt.Color(25, 25, 25));
        setBounds(new java.awt.Rectangle(400, 500, 640, 410));
        setIconImages(null);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(640, 410));
        setUndecorated(true);
        setOpacity(0.8F);
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

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new getfont().getone(18f));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Expertise in Technology    : ");

        jLabel3.setFont(new getfont().getone(22f));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Developed by : ");

        jLabel4.setFont(new getfont().getone(45f));
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setText("About developer");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        jLabel11.setFont(new getfont().getone(18f));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-java_coffee_cup_logo.png"))); // NOI18N
        jLabel11.setText("Java");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });

        jLabel12.setFont(new getfont().getone(18f));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red.png"))); // NOI18N
        jLabel12.setToolTipText("close");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
        });

        jLabel13.setFont(new getfont().getone(22f));
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vrushankphoto.png"))); // NOI18N
        jLabel13.setText("Vrushank Patel");

        jLabel1.setFont(new getfont().getone(18f));
        jLabel1.setForeground(new java.awt.Color(200, 200, 200));
        jLabel1.setText("Dear user, my name is Vrushank Patel. I am student of B.E. Information Technology.");

        jLabel6.setFont(new getfont().getone(18f));
        jLabel6.setForeground(new java.awt.Color(200, 200, 200));
        jLabel6.setText("I am going to create this software for those who are begineers in computer world or ");

        jLabel7.setFont(new getfont().getone(18f));
        jLabel7.setForeground(new java.awt.Color(200, 200, 200));
        jLabel7.setText("whose typing speed is too slow.");

        jLabel14.setFont(new getfont().getone(18f));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-python.png"))); // NOI18N
        jLabel14.setText("Python");

        jLabel15.setFont(new getfont().getone(18f));
        jLabel15.setForeground(new java.awt.Color(200, 200, 200));
        jLabel15.setText(",");

        jLabel16.setFont(new getfont().getone(18f));
        jLabel16.setForeground(new java.awt.Color(200, 200, 200));
        jLabel16.setText(",");

        jLabel17.setFont(new getfont().getone(18f));
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-android_os.png"))); // NOI18N
        jLabel17.setText("Android");

        jLabel8.setFont(new getfont().getone(18f));
        jLabel8.setForeground(new java.awt.Color(200, 200, 200));
        jLabel8.setText("Obviously this software is created to increase your keyboard typing speed but it is not enough to say about");

        jLabel9.setFont(new getfont().getone(18f));
        jLabel9.setForeground(new java.awt.Color(200, 200, 200));
        jLabel9.setText("this software.I designed this software for most user friendly UI design and interactive GUI components.");

        jLabel10.setFont(new getfont().getone(18f));
        jLabel10.setForeground(new java.awt.Color(200, 200, 200));
        jLabel10.setText("Not only alphabatic, but this software comes with numeric typing practice and alphanumeric practice to ");

        jLabel18.setFont(new getfont().getone(18f));
        jLabel18.setForeground(new java.awt.Color(200, 200, 200));
        jLabel18.setText("increase the numerical typing speed and alphanumerical words typing speed of user.there are also ");

        jLabel19.setFont(new getfont().getone(18f));
        jLabel19.setForeground(new java.awt.Color(200, 200, 200));
        jLabel19.setText("I tried to create this software very interactive and user friendly appearance with smart colored and bordered");

        jLabel20.setFont(new getfont().getone(18f));
        jLabel20.setForeground(new java.awt.Color(200, 200, 200));
        jLabel20.setText("UI components, still you have any doubts or any suggestion then write it to comment section on this project's ");

        jLabel21.setFont(new getfont().getone(18f));
        jLabel21.setForeground(new java.awt.Color(200, 200, 200));
        jLabel21.setText("Gujrati and hindi typing practice programmed to learn and increase the gujrati and hindi typing ");

        jLabel22.setFont(new getfont().getone(18f));
        jLabel22.setForeground(new java.awt.Color(200, 200, 200));
        jLabel22.setText("speed.");

        jLabel23.setFont(new getfont().getone(18f));
        jLabel23.setForeground(new java.awt.Color(200, 200, 200));
        jLabel23.setText("blog or on my all projects website www.vapsquare.tk");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newone(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel15)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel14)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17))
                    .addComponent(jLabel4)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel23)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel13))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel11)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jLabel6)
                .addGap(0, 0, 0)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(0, 0, 0)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(0, 0, 0)
                .addComponent(jLabel18)
                .addGap(0, 0, 0)
                .addComponent(jLabel21)
                .addGap(0, 0, 0)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addGap(0, 0, 0)
                .addComponent(jLabel20)
                .addGap(0, 0, 0)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        new Aboutus();
        this.dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red.png"))); // NOI18N
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red2.png"))); // NOI18N
    }//GEN-LAST:event_jLabel12MouseEntered

    private void newone(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newone
        if(secret==15)
        {
            JOptionPane.showMessageDialog(rootPane,"Program by : "+"v"+"r"+"u"+"s"+"h"+"a"+"n"+"k"+" "+"p"+"a"+"t"+"e"+"l", "Proof of developer",JOptionPane.PLAIN_MESSAGE,new ImageIcon(getClass().getResource("icons8_In_Progress_48px.png")));
            secret=0;
        }
        else
        {
            secret++;
        }
    }//GEN-LAST:event_newone

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        secret=0;
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        if(secret==15)
        {
            JOptionPane.showMessageDialog(rootPane,"Program by : "+"v"+"r"+"u"+"s"+"h"+"a"+"n"+"k"+" "+"p"+"a"+"t"+"e"+"l", "Proof of developer",JOptionPane.PLAIN_MESSAGE,new ImageIcon(getClass().getResource("icons8_In_Progress_48px.png")));
            secret=0;
        }
        else
        {
            secret++;
        }
    }//GEN-LAST:event_jLabel11MouseClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}