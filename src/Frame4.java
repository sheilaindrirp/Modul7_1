
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irvina
 */
public class Frame4 extends javax.swing.JFrame {

    /**
     * Creates new form Frame4
     */
    public Frame4() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTinggiBalok = new javax.swing.JTextField();
        jLebarBalok = new javax.swing.JTextField();
        jPanjangBalok = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jSisiKubus = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jJariBola = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        getContentPane().setLayout(null);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 30, 240, 40);

        jTabbedPane1.setBackground(new java.awt.Color(255, 153, 204));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(null);

        jLabel2.setText("Masukkan Tinggi");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 170, 130, 30);

        jLabel3.setText("Masukkan Panjang");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 60, 130, 30);

        jLabel4.setText("Masukkan Lebar");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 110, 130, 30);
        jPanel1.add(jTinggiBalok);
        jTinggiBalok.setBounds(230, 170, 150, 30);
        jPanel1.add(jLebarBalok);
        jLebarBalok.setBounds(230, 110, 150, 30);

        jPanjangBalok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPanjangBalokActionPerformed(evt);
            }
        });
        jPanel1.add(jPanjangBalok);
        jPanjangBalok.setBounds(230, 60, 150, 30);

        jLabel5.setText("cm");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(400, 170, 30, 30);

        jLabel6.setText("cm");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(400, 110, 30, 30);

        jLabel7.setText("cm");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(400, 64, 30, 20);

        jButton1.setText("Hitung");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(180, 220, 110, 30);

        jTabbedPane1.addTab("Balok", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel8.setText("Masukkan Panjang Sisi");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(30, 30, 190, 40);
        jPanel2.add(jSisiKubus);
        jSisiKubus.setBounds(30, 90, 170, 30);

        jButton2.setText("Volume");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(70, 170, 100, 40);

        jTabbedPane1.addTab("Kubus", jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel9.setText("Masukkan Panjang Jari-jari");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(30, 20, 260, 60);

        jJariBola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jJariBolaActionPerformed(evt);
            }
        });
        jPanel3.add(jJariBola);
        jJariBola.setBounds(30, 80, 160, 30);

        jButton3.setText("Volume");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(60, 160, 90, 30);

        jTabbedPane1.addTab("Bola", jPanel3);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 90, 460, 300);

        setBounds(0, 0, 473, 418);
    }// </editor-fold>//GEN-END:initComponents

    private void jJariBolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jJariBolaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jJariBolaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            
        float jari;
        jari = Integer.parseInt(jJariBola.getText());
        float hasil1 = (float) (4/3*3.14*jari*jari*jari);
        
        try{
            JOptionPane.showMessageDialog(null, "Volume Bola Adalah : "
            +hasil1, "volume", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : "+e, "Gagal",
                    JOptionPane.WARNING_MESSAGE);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int panjang, lebar, tinggi;

        panjang = Integer.parseInt(jPanjangBalok.getText());
        lebar = Integer.parseInt(jLebarBalok.getText());
        tinggi = Integer.parseInt(jTinggiBalok.getText());

        int hasil = panjang * lebar * tinggi;
        try{
            JOptionPane.showMessageDialog(null, "Volume balok adalah :"+hasil,"volume",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e, "Gagal",
                    JOptionPane.WARNING_MESSAGE);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanjangBalokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPanjangBalokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanjangBalokActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int sisi;
        sisi = Integer.parseInt(jSisiKubus.getText());
        int hasil = sisi * sisi * sisi;

        try{
            JOptionPane.showMessageDialog(null, "Volume Kubus adalah :"
            +hasil, "volume", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : "+e, "Gagal",
                    JOptionPane.WARNING_MESSAGE);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JTextField jJariBola;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jLebarBalok;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jPanjangBalok;
    private javax.swing.JTextField jSisiKubus;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTinggiBalok;
    // End of variables declaration//GEN-END:variables
}
