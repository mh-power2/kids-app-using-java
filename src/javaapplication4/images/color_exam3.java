package javaapplication4.images;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author hp
 */
public class color_exam3 extends javax.swing.JFrame {

    /**
     * Creates new form color_exam3
     */
    public color_exam3() {
        initComponents();
        scaleImage();
        scaleImage1();
        scaleImage2();
        scaleImage3();
        scaleImage4();
        scaleImage5();
        scaleImage6();
        scaleImage7();
        scaleImage8();



        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
    }
public void scaleImage()
    {
        String str = new File("images/bgcolor.jpg").toString();
       Dimension screenSize = Toolkit. getDefaultToolkit(). getScreenSize();
        ImageIcon icon = new ImageIcon (str);
        Image img = icon.getImage();
        Image imgScaled = img.getScaledInstance((int)screenSize. getWidth(),(int)screenSize. getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ScaledIcon = new ImageIcon(imgScaled);
        jLabel1.setIcon(ScaledIcon);
     
            
    }
public void scaleImage1()
    {
        String str = new File("images/let's play.png").toString();
       Dimension screenSize = jLabel2. getSize();
        ImageIcon icon = new ImageIcon (str);
        Image img = icon.getImage();
        Image imgScaled = img.getScaledInstance((int)screenSize. getWidth(),(int)screenSize. getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ScaledIcon = new ImageIcon(imgScaled);
        jLabel2.setIcon(ScaledIcon);
     
            
    }
    public int ct=0;
public void scaleImage2()
    {
        ct= 1+(int)(Math.random()*8);
        String str = new File("images/ct"+ct+".png").toString();
       Dimension screenSize = jLabel4. getSize();
        ImageIcon icon = new ImageIcon (str);
        Image img = icon.getImage();
        Image imgScaled = img.getScaledInstance((int)screenSize. getWidth(),(int)screenSize. getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ScaledIcon = new ImageIcon(imgScaled);
        jLabel4.setIcon(ScaledIcon);
     
            
    }
        public int j= 1+(int)(Math.random()*3);
public void scaleImage3()
    {
        if (j == 1){
        String str = new File("images/color"+ct+".png").toString();
       Dimension screenSize = jLabel6. getSize();
        ImageIcon icon = new ImageIcon (str);
        Image img = icon.getImage();
        Image imgScaled = img.getScaledInstance((int)screenSize. getWidth(),(int)screenSize. getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ScaledIcon = new ImageIcon(imgScaled);
        jLabel6.setIcon(ScaledIcon);
     }
        else if (j==2){
        String str = new File("images/color"+ct+".png").toString();
       Dimension screenSize = jLabel7. getSize();
        ImageIcon icon = new ImageIcon (str);
        Image img = icon.getImage();
        Image imgScaled = img.getScaledInstance((int)screenSize. getWidth(),(int)screenSize. getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ScaledIcon = new ImageIcon(imgScaled);
        jLabel7.setIcon(ScaledIcon);
        }
        else{
        String str = new File("images/color"+ct+".png").toString();
       Dimension screenSize = jLabel8. getSize();
        ImageIcon icon = new ImageIcon (str);
        Image img = icon.getImage();
        Image imgScaled = img.getScaledInstance((int)screenSize. getWidth(),(int)screenSize. getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ScaledIcon = new ImageIcon(imgScaled);
        jLabel8.setIcon(ScaledIcon);
        }
            
    }
public int colour1 =0;
public void scaleImage4()
    {
        if (j != 2){
        colour1 = 1+(int)(Math.random()*8);
        while(colour1 == ct){
        colour1 = 1+(int)(Math.random()*8);
}
        String str = new File("images/color"+colour1+".png").toString();
       Dimension screenSize = jLabel7. getSize();
        ImageIcon icon = new ImageIcon (str);
        Image img = icon.getImage();
        Image imgScaled = img.getScaledInstance((int)screenSize. getWidth(),(int)screenSize. getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ScaledIcon = new ImageIcon(imgScaled);
        jLabel7.setIcon(ScaledIcon);

      }      
    }
public int colour2=0;
public void scaleImage5()
    {
        if (j != 3){
        colour2 = 1+(int)(Math.random()*8);
        while(colour2 == ct || colour2 == colour1){
        colour2 = 1+(int)(Math.random()*8);
}
        String str = new File("images/color"+colour2+".png").toString();
       Dimension screenSize = jLabel8. getSize();
        ImageIcon icon = new ImageIcon (str);
        Image img = icon.getImage();
        Image imgScaled = img.getScaledInstance((int)screenSize. getWidth(),(int)screenSize. getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ScaledIcon = new ImageIcon(imgScaled);
        jLabel8.setIcon(ScaledIcon);
        
     }
            
    }
public int colour3=0;
public void scaleImage6()
    {
        if (j != 1){
        colour3 = 1+(int)(Math.random()*8);
        while(colour3 == colour2 || colour3 == colour1 || colour3 == ct){
        colour3 = 1+(int)(Math.random()*8);
        }
        String str = new File("images/color"+colour3+".png") .toString();
       Dimension screenSize = jLabel6. getSize();
        ImageIcon icon = new ImageIcon (str);
        Image img = icon.getImage();
        Image imgScaled = img.getScaledInstance((int)screenSize. getWidth(),(int)screenSize. getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ScaledIcon = new ImageIcon(imgScaled);
        jLabel6.setIcon(ScaledIcon);

    }
}
public void scaleImage7()
    {
        String str = new File("images/next3.png").toString();
       Dimension screenSize = jLabel10. getSize();
        ImageIcon icon = new ImageIcon (str);
        Image img = icon.getImage();
        Image imgScaled = img.getScaledInstance((int)screenSize. getWidth(),(int)screenSize. getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ScaledIcon = new ImageIcon(imgScaled);
        jLabel10.setIcon(ScaledIcon);     
    }
public void scaleImage8()
    {
        String str = new File("images/back.png").toString();
       Dimension screenSize = jLabel9. getSize();
        ImageIcon icon = new ImageIcon (str);
        Image img = icon.getImage();
        Image imgScaled = img.getScaledInstance((int)screenSize. getWidth(),(int)screenSize. getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ScaledIcon = new ImageIcon(imgScaled);
        jLabel9.setIcon(ScaledIcon);     
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(170, 400, 270, 210);

        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(560, 400, 270, 210);

        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(920, 400, 270, 210);

        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(180, 620, 150, 50);

        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(1010, 620, 150, 50);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(180, 620, 150, 50);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(1010, 620, 150, 50);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(920, 400, 270, 210);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(560, 400, 270, 210);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(170, 400, 270, 210);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("?");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(980, 260, 90, 100);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(820, 280, 150, 70);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Where is the");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(500, 260, 400, 100);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(530, -20, 350, 350);

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setMinimumSize(new java.awt.Dimension(0, 14));
        jLabel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -140, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (j == 1)
        {
            JOptionPane.showMessageDialog(this, "Excellent!");
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Wrong answer ,Try again!");

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (j == 2)
        {
            JOptionPane.showMessageDialog(this, "Excellent!");
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Wrong answer ,Try again!");

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (j == 3)
        {
            JOptionPane.showMessageDialog(this, "Excellent!");
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Wrong answer ,Try again!");

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        color_exam2 ce2 = new color_exam2();
        ce2.show();
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Color c = new Color();
        c.show();
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(color_exam3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(color_exam3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(color_exam3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(color_exam3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new color_exam3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
