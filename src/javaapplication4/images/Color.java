package javaapplication4.images;
import jaco.mp3.player.MP3Player;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;


public class Color extends javax.swing.JFrame {

    /**
     * Creates new form Color
     */
    public Color() {
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
        scaleImage10();
        scaleImage11();
        scaleImage12();


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
        String str = new File("images/red.png").toString();
       Dimension screenSize = jLabel2. getSize();
        ImageIcon icon = new ImageIcon (str);
        Image img = icon.getImage();
        Image imgScaled = img.getScaledInstance((int)screenSize. getWidth(),(int)screenSize. getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ScaledIcon = new ImageIcon(imgScaled);
        jLabel2.setIcon(ScaledIcon);     
    }
public void scaleImage2()
    {
        String str = new File("images/pink.png").toString();
       Dimension screenSize = jLabel3. getSize();
        ImageIcon icon = new ImageIcon (str);
        Image img = icon.getImage();
        Image imgScaled = img.getScaledInstance((int)screenSize. getWidth(),(int)screenSize. getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ScaledIcon = new ImageIcon(imgScaled);
        jLabel3.setIcon(ScaledIcon);     
    }
public void scaleImage3()
    {
        String str = new File("images/orange.png").toString();
       Dimension screenSize = jLabel4. getSize();
        ImageIcon icon = new ImageIcon (str);
        Image img = icon.getImage();
        Image imgScaled = img.getScaledInstance((int)screenSize. getWidth(),(int)screenSize. getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ScaledIcon = new ImageIcon(imgScaled);
        jLabel4.setIcon(ScaledIcon);     
    }
public void scaleImage4()
    {
        String str = new File("images/yellow.png").toString();
       Dimension screenSize = jLabel5. getSize();
        ImageIcon icon = new ImageIcon (str);
        Image img = icon.getImage();
        Image imgScaled = img.getScaledInstance((int)screenSize. getWidth(),(int)screenSize. getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ScaledIcon = new ImageIcon(imgScaled);
        jLabel5.setIcon(ScaledIcon);     
    }
public void scaleImage5()
    {
        String str = new File("images/green.png").toString();
       Dimension screenSize = jLabel6. getSize();
        ImageIcon icon = new ImageIcon (str);
        Image img = icon.getImage();
        Image imgScaled = img.getScaledInstance((int)screenSize. getWidth(),(int)screenSize. getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ScaledIcon = new ImageIcon(imgScaled);
        jLabel6.setIcon(ScaledIcon);     
    }
public void scaleImage6()
    {
        String str = new File("images/blue.png").toString();
       Dimension screenSize = jLabel7. getSize();
        ImageIcon icon = new ImageIcon (str);
        Image img = icon.getImage();
        Image imgScaled = img.getScaledInstance((int)screenSize. getWidth(),(int)screenSize. getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ScaledIcon = new ImageIcon(imgScaled);
        jLabel7.setIcon(ScaledIcon);     
    }
public void scaleImage7()
    {
        String str = new File("images/purp.png").toString();
       Dimension screenSize = jLabel8. getSize();
        ImageIcon icon = new ImageIcon (str);
        Image img = icon.getImage();
        Image imgScaled = img.getScaledInstance((int)screenSize. getWidth(),(int)screenSize. getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ScaledIcon = new ImageIcon(imgScaled);
        jLabel8.setIcon(ScaledIcon);     
    }
public void scaleImage8()
    {
        String str = new File("images/brown.png").toString();
       Dimension screenSize = jLabel9. getSize();
        ImageIcon icon = new ImageIcon (str);
        Image img = icon.getImage();
        Image imgScaled = img.getScaledInstance((int)screenSize. getWidth(),(int)screenSize. getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ScaledIcon = new ImageIcon(imgScaled);
        jLabel9.setIcon(ScaledIcon);     
    }
/*public void scaleImage9()
    {
        String str = new File("images/black.png").toString();
       Dimension screenSize = jLabel10. getSize();
        ImageIcon icon = new ImageIcon (str);
        Image img = icon.getImage();
        Image imgScaled = img.getScaledInstance((int)screenSize. getWidth(),(int)screenSize. getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ScaledIcon = new ImageIcon(imgScaled);
        jLabel10.setIcon(ScaledIcon);     
    }*/
public void scaleImage10()
    {
        String str = new File("images/back.png").toString();
       Dimension screenSize = jLabel10. getSize();
        ImageIcon icon = new ImageIcon (str);
        Image img = icon.getImage();
        Image imgScaled = img.getScaledInstance((int)screenSize. getWidth(),(int)screenSize. getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ScaledIcon = new ImageIcon(imgScaled);
        jLabel10.setIcon(ScaledIcon);     
    }
public void scaleImage11()
    {
        String str = new File("images/next3.png").toString();
       Dimension screenSize = jLabel11. getSize();
        ImageIcon icon = new ImageIcon (str);
        Image img = icon.getImage();
        Image imgScaled = img.getScaledInstance((int)screenSize. getWidth(),(int)screenSize. getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ScaledIcon = new ImageIcon(imgScaled);
        jLabel11.setIcon(ScaledIcon);     
    }
public void scaleImage12()
    {
        String str = new File("images/plAy.png").toString();
       Dimension screenSize = jLabel12. getSize();
        ImageIcon icon = new ImageIcon (str);
        Image img = icon.getImage();
        Image imgScaled = img.getScaledInstance((int)screenSize. getWidth(),(int)screenSize. getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ScaledIcon = new ImageIcon(imgScaled);
        jLabel12.setIcon(ScaledIcon);
     
            
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(180, 80, 150, 200);

        jButton2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(470, 80, 150, 200);

        jButton3.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(740, 80, 150, 200);

        jButton4.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(1010, 80, 150, 200);

        jButton5.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(180, 330, 150, 200);

        jButton6.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(470, 330, 150, 200);

        jButton7.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(740, 330, 150, 200);

        jButton8.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(1010, 330, 150, 200);

        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(180, 620, 150, 50);

        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(1010, 620, 150, 50);

        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(595, 620, 150, 50);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(180, 80, 150, 200);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(470, 80, 150, 200);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(740, 80, 150, 200);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1010, 80, 150, 200);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(180, 330, 150, 200);
        jPanel1.add(jLabel7);
        jLabel7.setBounds(470, 330, 150, 200);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(740, 330, 150, 200);
        jPanel1.add(jLabel9);
        jLabel9.setBounds(1010, 330, 150, 200);

        jLabel10.setToolTipText("");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(180, 620, 150, 50);

        jLabel11.setToolTipText("");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(1010, 620, 150, 50);
        jPanel1.add(jLabel12);
        jLabel12.setBounds(595, 620, 150, 50);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -140, 1920, 1080);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String h = "images/red.mp3";
        MP3Player plays = new MP3Player(new File(h));
        plays.play();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         String h = "images/pink.mp3";
        MP3Player plays = new MP3Player(new File(h));
        plays.play();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         String h = "images/orange.mp3";
        MP3Player plays = new MP3Player(new File(h));
        plays.play();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         String h = "images/yellow.mp3";
        MP3Player plays = new MP3Player(new File(h));
        plays.play();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         String h = "images/green.mp3";
        MP3Player plays = new MP3Player(new File(h));
        plays.play();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         String h = "images/blue.mp3";
        MP3Player plays = new MP3Player(new File(h));
        plays.play();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         String h = "images/purp.mp3";
        MP3Player plays = new MP3Player(new File(h));
        plays.play();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
         String h = "images/brown.mp3";
        MP3Player plays = new MP3Player(new File(h));
        plays.play();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
          Choice F3 = new Choice ();
      F3.setVisible(true);
      song_color.stop();
      dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        color_exam ce = new color_exam();
        ce.show();
        dispose();
    }//GEN-LAST:event_jButton10ActionPerformed
    public int q=0;
    String k = "images/songg.mp3";
    MP3Player song_color = new MP3Player(new File(k));
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        if (jButton11.getModel().isArmed())
        {

            if (q%2 == 0 && q != 0)
            {
                song_color.stop();
            }
            else 
            {
                song_color.play();
            }
            q++;

        }
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(Color.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Color.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Color.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Color.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Color().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
