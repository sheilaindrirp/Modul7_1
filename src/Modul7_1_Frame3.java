
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Helga
 */
public class Modul7_1_Frame3 extends javax.swing.JFrame {

    /**
     * Creates new form Modul7_1_Frame3
     */
    public Modul7_1_Frame3() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Sekolah = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        Alamat = new javax.swing.JTextField();
        Kelas = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setText("Tabel Biodata");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 30, 80, 14);

        jLabel3.setText("Nama");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 70, 50, 30);

        jLabel4.setText("Kelas");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 120, 40, 20);

        jLabel5.setText("Alamat");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 160, 50, 30);
        getContentPane().add(Sekolah);
        Sekolah.setBounds(140, 210, 150, 30);

        jLabel6.setText("Sekolah");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 210, 60, 30);
        getContentPane().add(Nama);
        Nama.setBounds(140, 70, 150, 30);
        getContentPane().add(Alamat);
        Alamat.setBounds(140, 160, 150, 30);

        Kelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XI RPL 1", "XI RPL 2", "XI RPL 3", "XI RPL 4", "XI RPL 5", "XI RPL 5", "XI TKJ 1", "XI TKJ 2", "XI TKJ 3", "XI TKJ 4", "XI TKJ 5" }));
        getContentPane().add(Kelas);
        Kelas.setBounds(140, 110, 150, 30);

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(210, 280, 70, 30);

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(80, 280, 70, 30);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Kelas", "Alamat", "Sekolah"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setResizable(false);
            Table.getColumnModel().getColumn(1).setResizable(false);
            Table.getColumnModel().getColumn(2).setResizable(false);
            Table.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 350, 500, 130);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String nama = Nama.getText();
        String kelas = Kelas.getSelectedItem().toString();
        String alamat = Alamat.getText();
        String sekolah = Sekolah.getText();
        
        if (Kelas.getSelectedItem() == "XI RPL 1"){
        }if (Kelas.getSelectedItem() == "XI RPL 2"){            
        }if (Kelas.getSelectedItem() == "XI RPL 3"){
        }if (Kelas.getSelectedItem() == "XI RPL 4"){
        }if (Kelas.getSelectedItem() == "XI RPL 5"){
        }if (Kelas.getSelectedItem() == "XI RPL 6"){
        }if (Kelas.getSelectedItem() == "XI TKJ 1"){
        }if (Kelas.getSelectedItem() == "XI TKJ 2"){
        }if (Kelas.getSelectedItem() == "XI TKJ 3"){
        }if (Kelas.getSelectedItem() == "XI TKJ 4"){
        }if (Kelas.getSelectedItem() == "XI TKJ 5");
        
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
                model.addRow(new Object[]{
                    Nama.getText(),
                    Kelas.getSelectedItem(), 
                    Alamat.getText(),
                    Sekolah.getText()
                });
                
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Modul7_1_Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modul7_1_Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modul7_1_Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modul7_1_Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modul7_1_Frame3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat;
    private javax.swing.JComboBox<String> Kelas;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Sekolah;
    private javax.swing.JTable Table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
