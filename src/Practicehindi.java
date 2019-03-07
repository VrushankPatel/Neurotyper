
import java.awt.*;
import java.awt.Rectangle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Vrushank
 */
public class Practicehindi extends javax.swing.JFrame {

    String s1, s2, maintext,pra,id,name2;
    int posX, posY,record,temp;
    int error;
    layout l=new layout("hindi");

    public Practicehindi(String st1, String st2,String practice,int rec,int err,String ID2,String name) {
        s1 = st1;
        s2 = st2;
        id=ID2;
        name2=name;
        pra=practice;
        record=rec+1;
        error=err;
        initComponents();
        jLabel1.setToolTipText(st1+"  ||  "+st2);
        for(Component cas:Group1.getComponents())
        {            
            if(cas instanceof JTextField)
            {                
                JTextField temp=(JTextField)cas;
                temp.setTransferHandler(null);                   
            }                       
        }
        for(Component cas:Group2.getComponents())
        {            
            if(cas instanceof JTextField)
            {                
                JTextField temp=(JTextField)cas;
                temp.setTransferHandler(null);                   
            }                       
        }
        element1lbl1.setNextFocusableComponent(element2lbl2);
        element2lbl2.setNextFocusableComponent(element3lbl3);
        element3lbl3.setNextFocusableComponent(element4lbl4);
        element4lbl4.setNextFocusableComponent(element5lbl5);
        element5lbl5.setNextFocusableComponent(element8lbl8);
        element8lbl8.setNextFocusableComponent(element6lbl6);
        element6lbl6.setNextFocusableComponent(element7lbl7);        
        element7lbl7.setNextFocusableComponent(element9lbl9);
        element9lbl9.setNextFocusableComponent(element10lbl10);
        element10lbl10.setNextFocusableComponent(element1fld1);
        element1fld1.setNextFocusableComponent(element2fld1);
        element2fld1.setNextFocusableComponent(element3fld4);
        element3fld4.setNextFocusableComponent(element4fld5);
        element4fld5.setNextFocusableComponent(element5fld6);
        element5fld6.setNextFocusableComponent(element8lbl9);
        element8lbl9.setNextFocusableComponent(element6lbl7);
        element6lbl7.setNextFocusableComponent(element7lbl8);
        element7lbl8.setNextFocusableComponent(element9lbl10);
        element9lbl10.setNextFocusableComponent(element10lbl11);
        element1lbl1.setFocusable(true);        
        Titlelbl.setText(practice);
        Racordlbl1.setText(String.valueOf(record));
        errorlbl1.setText(String.valueOf(error));
        this.setLocationRelativeTo(null);
        setVisible(true);
        element1lbl1.requestFocus(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titlelbl = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Racordlbl = new javax.swing.JLabel();
        Errorelbl = new javax.swing.JLabel();
        Racordlbl1 = new javax.swing.JLabel();
        errorlbl1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Group1 = new javax.swing.JPanel();
        element1 = new javax.swing.JLabel();
        element1lbl1 = new javax.swing.JTextField();
        element2 = new javax.swing.JLabel();
        element2lbl2 = new javax.swing.JTextField();
        element3 = new javax.swing.JLabel();
        element3lbl3 = new javax.swing.JTextField();
        element4 = new javax.swing.JLabel();
        element4lbl4 = new javax.swing.JTextField();
        element5 = new javax.swing.JLabel();
        element5lbl5 = new javax.swing.JTextField();
        element6 = new javax.swing.JLabel();
        element6lbl6 = new javax.swing.JTextField();
        element7 = new javax.swing.JLabel();
        element7lbl7 = new javax.swing.JTextField();
        element8lbl8 = new javax.swing.JTextField();
        element8 = new javax.swing.JLabel();
        element9 = new javax.swing.JLabel();
        element9lbl9 = new javax.swing.JTextField();
        element10 = new javax.swing.JLabel();
        element10lbl10 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Group2 = new javax.swing.JPanel();
        element11 = new javax.swing.JLabel();
        element1fld1 = new javax.swing.JTextField();
        element12 = new javax.swing.JLabel();
        element2fld1 = new javax.swing.JTextField();
        element13 = new javax.swing.JLabel();
        element3fld4 = new javax.swing.JTextField();
        element14 = new javax.swing.JLabel();
        element4fld5 = new javax.swing.JTextField();
        element15 = new javax.swing.JLabel();
        element5fld6 = new javax.swing.JTextField();
        element16 = new javax.swing.JLabel();
        element6lbl7 = new javax.swing.JTextField();
        element17 = new javax.swing.JLabel();
        element7lbl8 = new javax.swing.JTextField();
        element8lbl9 = new javax.swing.JTextField();
        element18 = new javax.swing.JLabel();
        element19 = new javax.swing.JLabel();
        element9lbl10 = new javax.swing.JTextField();
        element20 = new javax.swing.JLabel();
        element10lbl11 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        force = new javax.swing.JPanel();
        forcestop = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setFocusCycleRoot(false);
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

        Titlelbl.setFont(new getfont().getone(35f));
        Titlelbl.setForeground(new java.awt.Color(255, 255, 255));
        Titlelbl.setText("Practice");

        jPanel3.setBackground(new java.awt.Color(25, 35, 55));

        Racordlbl.setFont(new getfont().getone(35f));
        Racordlbl.setForeground(new java.awt.Color(255, 255, 255));
        Racordlbl.setText("Records :");

        Errorelbl.setFont(new getfont().getone(35f));
        Errorelbl.setForeground(new java.awt.Color(255, 255, 255));
        Errorelbl.setText("Errors :");

        Racordlbl1.setFont(new getfont().getone(35f));
        Racordlbl1.setForeground(new java.awt.Color(255, 255, 255));
        Racordlbl1.setText("0");

        errorlbl1.setFont(new getfont().getone(35f));
        errorlbl1.setForeground(new java.awt.Color(255, 255, 255));
        errorlbl1.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Racordlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Errorelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Racordlbl1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(errorlbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Racordlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Errorelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Racordlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(errorlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Titlelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titlelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(230, 230, 230));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(25, 35, 55)));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        Group1.setBackground(new java.awt.Color(230, 230, 230));

        element1.setFont(new getfont().getone3(Font.PLAIN,32f));
        element1.setForeground(new java.awt.Color(102, 153, 255));
        element1.setText(s1);

        element1lbl1.setBackground(new java.awt.Color(230, 230, 230));
        element1lbl1.setFont(new getfont().getone3(Font.PLAIN,32f));
        element1lbl1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
        element1lbl1.setFocusable(false);
        element1lbl1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                controlfld(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controlfld(evt);
            }
        });

        element2.setFont(new getfont().getone3(Font.PLAIN,32f));
        element2.setForeground(new java.awt.Color(102, 153, 255));
        element2.setText(s2);

        element2lbl2.setBackground(new java.awt.Color(230, 230, 230));
        element2lbl2.setFont(new getfont().getone3(Font.PLAIN,32f));
        element2lbl2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
        element2lbl2.setFocusable(false);
        element2lbl2.setFocusTraversalKeysEnabled(false);
        element2lbl2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                controlfld2(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controlfld2(evt);
            }
        });

        element3.setFont(new getfont().getone3(Font.PLAIN,32f));
        element3.setForeground(new java.awt.Color(102, 153, 255));
        element3.setText(s1);

        element3lbl3.setBackground(new java.awt.Color(230, 230, 230));
        element3lbl3.setFont(new getfont().getone3(Font.PLAIN,32f));
        element3lbl3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
        element3lbl3.setFocusable(false);
        element3lbl3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                controlfld(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controlfld(evt);
            }
        });

        element4.setFont(new getfont().getone3(Font.PLAIN,32f));
        element4.setForeground(new java.awt.Color(102, 153, 255));
        element4.setText(s2);

        element4lbl4.setBackground(new java.awt.Color(230, 230, 230));
        element4lbl4.setFont(new getfont().getone3(Font.PLAIN,32f));
        element4lbl4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
        element4lbl4.setFocusable(false);
        element4lbl4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                controlfld2(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controlfld2(evt);
            }
        });

        element5.setFont(new getfont().getone3(Font.PLAIN,32f));
        element5.setForeground(new java.awt.Color(102, 153, 255));
        element5.setText(s1);

        element5lbl5.setBackground(new java.awt.Color(230, 230, 230));
        element5lbl5.setFont(new getfont().getone3(Font.PLAIN,32f));
        element5lbl5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
        element5lbl5.setFocusable(false);
        element5lbl5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                controlfld(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controlfld(evt);
            }
        });

        element6.setFont(new getfont().getone3(Font.PLAIN,32f));
        element6.setForeground(new java.awt.Color(102, 153, 255));
        element6.setText(s1);

        element6lbl6.setBackground(new java.awt.Color(230, 230, 230));
        element6lbl6.setFont(new getfont().getone3(Font.PLAIN,32f));
        element6lbl6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
        element6lbl6.setFocusable(false);
        element6lbl6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                controlfld(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controlfld(evt);
            }
        });

        element7.setFont(new getfont().getone3(Font.PLAIN,32f));
        element7.setForeground(new java.awt.Color(102, 153, 255));
        element7.setText(s2);

        element7lbl7.setBackground(new java.awt.Color(230, 230, 230));
        element7lbl7.setFont(new getfont().getone3(Font.PLAIN,32f));
        element7lbl7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
        element7lbl7.setFocusable(false);
        element7lbl7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                controlfld2(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controlfld2(evt);
            }
        });

        element8lbl8.setBackground(new java.awt.Color(230, 230, 230));
        element8lbl8.setFont(new getfont().getone3(Font.PLAIN,32f));
        element8lbl8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
        element8lbl8.setFocusable(false);
        element8lbl8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                controlfld2(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controlfld2(evt);
            }
        });

        element8.setFont(new getfont().getone3(Font.PLAIN,32f));
        element8.setForeground(new java.awt.Color(102, 153, 255));
        element8.setText(s2);

        element9.setFont(new getfont().getone3(Font.PLAIN,32f));
        element9.setForeground(new java.awt.Color(102, 153, 255));
        element9.setText(s1);

        element9lbl9.setBackground(new java.awt.Color(230, 230, 230));
        element9lbl9.setFont(new getfont().getone3(Font.PLAIN,32f));
        element9lbl9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
        element9lbl9.setFocusable(false);
        element9lbl9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                controlfld(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controlfld(evt);
            }
        });

        element10.setFont(new getfont().getone3(Font.PLAIN,32f));
        element10.setForeground(new java.awt.Color(102, 153, 255));
        element10.setText(s2);

        element10lbl10.setBackground(new java.awt.Color(230, 230, 230));
        element10lbl10.setFont(new getfont().getone3(Font.PLAIN,32f));
        element10lbl10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
        element10lbl10.setFocusable(false);
        element10lbl10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                controlfld2(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controlfld2(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(230, 230, 230));
        jLabel1.setFont(new getfont().getone(28f));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("?");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout Group1Layout = new javax.swing.GroupLayout(Group1);
        Group1.setLayout(Group1Layout);
        Group1Layout.setHorizontalGroup(
            Group1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Group1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(Group1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Group1Layout.createSequentialGroup()
                        .addGroup(Group1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Group1Layout.createSequentialGroup()
                                .addComponent(element5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(element5lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Group1Layout.createSequentialGroup()
                                .addGroup(Group1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Group1Layout.createSequentialGroup()
                                        .addComponent(element6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(element6lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Group1Layout.createSequentialGroup()
                                        .addComponent(element9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(element9lbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(25, 25, 25)
                                .addGroup(Group1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Group1Layout.createSequentialGroup()
                                        .addComponent(element10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(element10lbl10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Group1Layout.createSequentialGroup()
                                        .addComponent(element7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(element7lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Group1Layout.createSequentialGroup()
                        .addGroup(Group1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Group1Layout.createSequentialGroup()
                                .addComponent(element3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(element3lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Group1Layout.createSequentialGroup()
                                .addComponent(element1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(element1lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(Group1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Group1Layout.createSequentialGroup()
                                .addComponent(element2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(element2lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Group1Layout.createSequentialGroup()
                                .addComponent(element8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(element8lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Group1Layout.createSequentialGroup()
                                .addComponent(element4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(element4lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))))
            .addGroup(Group1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Group1Layout.setVerticalGroup(
            Group1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Group1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(Group1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(element1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(element1lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(element2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(element2lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(Group1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(element3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(element3lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(element4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(element4lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(Group1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(element5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(element5lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(element8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(element8lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(Group1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(element6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(element6lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(element7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(element7lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(Group1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(element9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(element9lbl9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(element10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(element10lbl10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        Group2.setBackground(new java.awt.Color(230, 230, 230));
        Group2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                controlfld2(evt);
            }
        });

        element11.setFont(new getfont().getone3(Font.PLAIN,32f));
        element11.setForeground(new java.awt.Color(102, 153, 255));
        element11.setText(s1);

        element1fld1.setBackground(new java.awt.Color(230, 230, 230));
        element1fld1.setFont(new getfont().getone3(Font.PLAIN,32f));
        element1fld1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
        element1fld1.setFocusable(false);
        element1fld1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                controlfld(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controlfld(evt);
            }
        });

        element12.setFont(new getfont().getone3(Font.PLAIN,32f));
        element12.setForeground(new java.awt.Color(102, 153, 255));
        element12.setText(s2);

        element2fld1.setBackground(new java.awt.Color(230, 230, 230));
        element2fld1.setFont(new getfont().getone3(Font.PLAIN,32f));
        element2fld1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
        element2fld1.setFocusable(false);
        element2fld1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                controlfld2(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controlfld2(evt);
            }
        });

        element13.setFont(new getfont().getone3(Font.PLAIN,32f));
        element13.setForeground(new java.awt.Color(102, 153, 255));
        element13.setText(s1);

        element3fld4.setBackground(new java.awt.Color(230, 230, 230));
        element3fld4.setFont(new getfont().getone3(Font.PLAIN,32f));
        element3fld4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
        element3fld4.setFocusable(false);
        element3fld4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                controlfld(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controlfld(evt);
            }
        });

        element14.setFont(new getfont().getone3(Font.PLAIN,32f));
        element14.setForeground(new java.awt.Color(102, 153, 255));
        element14.setText(s2);

        element4fld5.setBackground(new java.awt.Color(230, 230, 230));
        element4fld5.setFont(new getfont().getone3(Font.PLAIN,32f));
        element4fld5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
        element4fld5.setFocusable(false);
        element4fld5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                controlfld2(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controlfld2(evt);
            }
        });

        element15.setFont(new getfont().getone3(Font.PLAIN,32f));
        element15.setForeground(new java.awt.Color(102, 153, 255));
        element15.setText(s1);

        element5fld6.setBackground(new java.awt.Color(230, 230, 230));
        element5fld6.setFont(new getfont().getone3(Font.PLAIN,32f));
        element5fld6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
        element5fld6.setFocusable(false);
        element5fld6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                controlfld(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controlfld(evt);
            }
        });

        element16.setFont(new getfont().getone3(Font.PLAIN,32f));
        element16.setForeground(new java.awt.Color(102, 153, 255));
        element16.setText(s1);

        element6lbl7.setBackground(new java.awt.Color(230, 230, 230));
        element6lbl7.setFont(new getfont().getone3(Font.PLAIN,32f));
        element6lbl7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
        element6lbl7.setFocusable(false);
        element6lbl7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                controlfld(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controlfld(evt);
            }
        });

        element17.setFont(new getfont().getone3(Font.PLAIN,32f));
        element17.setForeground(new java.awt.Color(102, 153, 255));
        element17.setText(s2);

        element7lbl8.setBackground(new java.awt.Color(230, 230, 230));
        element7lbl8.setFont(new getfont().getone3(Font.PLAIN,32f));
        element7lbl8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
        element7lbl8.setFocusable(false);
        element7lbl8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                controlfld2(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controlfld2(evt);
            }
        });

        element8lbl9.setBackground(new java.awt.Color(230, 230, 230));
        element8lbl9.setFont(new getfont().getone3(Font.PLAIN,32f));
        element8lbl9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
        element8lbl9.setFocusable(false);
        element8lbl9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                controlfld2(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controlfld2(evt);
            }
        });

        element18.setFont(new getfont().getone3(Font.PLAIN,32f));
        element18.setForeground(new java.awt.Color(102, 153, 255));
        element18.setText(s2);

        element19.setFont(new getfont().getone3(Font.PLAIN,32f));
        element19.setForeground(new java.awt.Color(102, 153, 255));
        element19.setText(s1);

        element9lbl10.setBackground(new java.awt.Color(230, 230, 230));
        element9lbl10.setFont(new getfont().getone3(Font.PLAIN,32f));
        element9lbl10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
        element9lbl10.setFocusable(false);
        element9lbl10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                controlfld(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controlfld(evt);
            }
        });

        element20.setFont(new getfont().getone3(Font.PLAIN,32f));
        element20.setForeground(new java.awt.Color(102, 153, 255));
        element20.setText(s2);

        element10lbl11.setBackground(new java.awt.Color(230, 230, 230));
        element10lbl11.setFont(new getfont().getone3(Font.PLAIN,32f));
        element10lbl11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 153, 255)));
        element10lbl11.setFocusable(false);
        element10lbl11.setFocusTraversalKeysEnabled(false);
        element10lbl11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                controlfld2(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controlfld2(evt);
            }
        });

        javax.swing.GroupLayout Group2Layout = new javax.swing.GroupLayout(Group2);
        Group2.setLayout(Group2Layout);
        Group2Layout.setHorizontalGroup(
            Group2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Group2Layout.createSequentialGroup()
                .addGroup(Group2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Group2Layout.createSequentialGroup()
                        .addGroup(Group2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Group2Layout.createSequentialGroup()
                                .addComponent(element15, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(element5fld6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Group2Layout.createSequentialGroup()
                                .addComponent(element16, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(element6lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Group2Layout.createSequentialGroup()
                                .addComponent(element19, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(element9lbl10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Group2Layout.createSequentialGroup()
                        .addGroup(Group2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Group2Layout.createSequentialGroup()
                                .addComponent(element13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(element3fld4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Group2Layout.createSequentialGroup()
                                .addComponent(element11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(element1fld1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)))
                .addGroup(Group2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Group2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Group2Layout.createSequentialGroup()
                            .addComponent(element20, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(element10lbl11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Group2Layout.createSequentialGroup()
                            .addComponent(element17, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(element7lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Group2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Group2Layout.createSequentialGroup()
                            .addComponent(element12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(element2fld1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Group2Layout.createSequentialGroup()
                            .addComponent(element18, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(element8lbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Group2Layout.createSequentialGroup()
                            .addComponent(element14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(element4fld5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );
        Group2Layout.setVerticalGroup(
            Group2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Group2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(Group2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(element11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(element1fld1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(element12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(element2fld1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(Group2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(element13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(element3fld4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(element14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(element4fld5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(Group2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(element15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(element5fld6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(element18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(element8lbl9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(Group2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(element16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(element6lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(element17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(element7lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(Group2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(element19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(element9lbl10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(element20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(element10lbl11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        force.setBackground(new java.awt.Color(230, 230, 230));
        force.setForeground(new java.awt.Color(230, 230, 230));
        force.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forceMouseExited(evt);
            }
        });

        forcestop.setBackground(new java.awt.Color(204, 0, 51));
        forcestop.setToolTipText("Emergency stop");
        forcestop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forcestopMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forcestopMouseExited(evt);
            }
        });

        javax.swing.GroupLayout forcestopLayout = new javax.swing.GroupLayout(forcestop);
        forcestop.setLayout(forcestopLayout);
        forcestopLayout.setHorizontalGroup(
            forcestopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        forcestopLayout.setVerticalGroup(
            forcestopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout forceLayout = new javax.swing.GroupLayout(force);
        force.setLayout(forceLayout);
        forceLayout.setHorizontalGroup(
            forceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forceLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(forcestop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        forceLayout.setVerticalGroup(
            forceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forceLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(forcestop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Group1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(force, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Group2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Group1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Group2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(force, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Rectangle ty = getBounds();
        setBounds(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY, ty.width, ty.height);
    }//GEN-LAST:event_formMouseDragged

    private void controlfld2(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_controlfld2
        JTextField jf = (JTextField) getFocusOwner();               
        if (jf.getText().length() == s2.length() && evt.getKeyChar() != 8) {
            if (jf.getText().equals(s2) && getFocusOwner()!=element10lbl11) {
                jf.getNextFocusableComponent().setFocusable(true);
                jf.getNextFocusableComponent().requestFocus();
                jf.setFocusable(false);
            }else if(jf.getText().equals(s2) && getFocusOwner()==element10lbl11)
            {
                l.dispose();
                int a=JOptionPane.showConfirmDialog(rootPane,"Do you want to do this practice again??", "Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,new ImageIcon(getClass().getResource("/icons8-ask_question.png")));                
                if(a==0)
                {
                    new Practicehindi(s1,s2,pra,record,error,id,name2);
                    this.dispose();                    
                }
                else
                {
                    if(!name2.equals("guest"))
                    {
                        save(id);
                    }
                    new Gujratilist(id,name2);
                    this.dispose();
                }                
            }
            else 
            {
                if (jf.isEditable()) {
                    error++;
                    errorlbl1.setText(String.valueOf(error));
                }
            }
            jf.setEditable(false);
        } 
        else {
            jf.setEditable(true);
        }
    }//GEN-LAST:event_controlfld2

    private void controlfld(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_controlfld
        JTextField jf = (JTextField) getFocusOwner();                
        if (jf.getText().length() == s1.length() && evt.getKeyChar() != 8) {
            if (jf.getText().equals(s1)) {
                jf.getNextFocusableComponent().setFocusable(true);
                jf.getNextFocusableComponent().requestFocus();
                jf.setFocusable(false);
            } else {
                if (jf.isEditable()) {
                    error++;
                    errorlbl1.setText(String.valueOf(error));
                }
            }
            jf.setEditable(false);
        } else {
            jf.setEditable(true);
        }
    }//GEN-LAST:event_controlfld

    private void forceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forceMouseEntered
        force.setBackground(new Color(25,35,55));
    }//GEN-LAST:event_forceMouseEntered

    private void forceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forceMouseExited
        force.setBackground(new Color(230,230,230));
    }//GEN-LAST:event_forceMouseExited

    private void forceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forceMouseClicked
        int a=JOptionPane.showConfirmDialog(rootPane,"Current Record will not be saved, Do you want to stop this Practice here??\nRemember, it can now or never..", "Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,new ImageIcon(getClass().getResource("/icons8-ask_question.png")));                
        if(a==0)
        {
            if(!name2.equals("guest") && record>0)
                    {
                        record--;
                        save(id);
                    }
            l.dispose();
            new hindilist(id, name2);
            this.dispose();
        }
    }//GEN-LAST:event_forceMouseClicked

    private void forcestopMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forcestopMouseEntered
        force.setBackground(new Color(25,35,55));
    }//GEN-LAST:event_forcestopMouseEntered

    private void forcestopMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forcestopMouseExited
        force.setBackground(new Color(230,230,230));
    }//GEN-LAST:event_forcestopMouseExited

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setForeground(new Color(25,35,55));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if(!l.isVisible())
        {
            l.setVisible(true);
            temp=1;
        }
    }//GEN-LAST:event_jLabel1MouseClicked
    public void save(String ID)
    {       
        record++;
        String sql="insert into record values('"+id+"','"+pra+"','"+record+"','"+error+"','"+DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss").format(LocalDateTime.now())+"');";                                    
        record--;
        try
        {
            Connection con = DriverManager.getConnection("jdbc:sqlite:Dataset.sqlite");
            Statement st=con.createStatement();  
            Class.forName("org.sqlite.JDBC");                        
            st.executeUpdate(sql);                
            }
            catch(Exception e)
            {
                try
                {
                    DriverManager.getConnection("jdbc:sqlite:Dataset.sqlite").createStatement().executeUpdate("create table record(ID varchar(20),Practice varchar(25),Records varchar(25),Errors varchar(25),datetime varchar(40));");
                    DriverManager.getConnection("jdbc:sqlite:Dataset.sqlite").createStatement().executeUpdate(sql);
                }
                catch(Exception ae)
                {                    
                    JOptionPane.showMessageDialog(rootPane,"Can not Save your record due to unknown error","Unknown Error",JOptionPane.ERROR_MESSAGE,new ImageIcon(getClass().getResource("/icons8_Close_Window_50px.png")));                                                      
                }                
            }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Errorelbl;
    private javax.swing.JPanel Group1;
    private javax.swing.JPanel Group2;
    private javax.swing.JLabel Racordlbl;
    private javax.swing.JLabel Racordlbl1;
    private javax.swing.JLabel Titlelbl;
    private javax.swing.JLabel element1;
    private javax.swing.JLabel element10;
    private javax.swing.JTextField element10lbl10;
    private javax.swing.JTextField element10lbl11;
    private javax.swing.JLabel element11;
    private javax.swing.JLabel element12;
    private javax.swing.JLabel element13;
    private javax.swing.JLabel element14;
    private javax.swing.JLabel element15;
    private javax.swing.JLabel element16;
    private javax.swing.JLabel element17;
    private javax.swing.JLabel element18;
    private javax.swing.JLabel element19;
    private javax.swing.JTextField element1fld1;
    private javax.swing.JTextField element1lbl1;
    private javax.swing.JLabel element2;
    private javax.swing.JLabel element20;
    private javax.swing.JTextField element2fld1;
    private javax.swing.JTextField element2lbl2;
    private javax.swing.JLabel element3;
    private javax.swing.JTextField element3fld4;
    private javax.swing.JTextField element3lbl3;
    private javax.swing.JLabel element4;
    private javax.swing.JTextField element4fld5;
    private javax.swing.JTextField element4lbl4;
    private javax.swing.JLabel element5;
    private javax.swing.JTextField element5fld6;
    private javax.swing.JTextField element5lbl5;
    private javax.swing.JLabel element6;
    private javax.swing.JTextField element6lbl6;
    private javax.swing.JTextField element6lbl7;
    private javax.swing.JLabel element7;
    private javax.swing.JTextField element7lbl7;
    private javax.swing.JTextField element7lbl8;
    private javax.swing.JLabel element8;
    private javax.swing.JTextField element8lbl8;
    private javax.swing.JTextField element8lbl9;
    private javax.swing.JLabel element9;
    private javax.swing.JTextField element9lbl10;
    private javax.swing.JTextField element9lbl9;
    private javax.swing.JLabel errorlbl1;
    private javax.swing.JPanel force;
    private javax.swing.JPanel forcestop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
