/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package adb_project;

/**
 *
 //* @author ASUS
 */
public class Adminpanel extends javax.swing.JFrame {
    public Player_info pl;
    public Phy_info ph;
    public Nut_info nut;
    public Trainer_info tr;
    public Match_info mat;
    /**
     * Creates new form Adminpanel
     */
    public Adminpanel() {
        pl=new Player_info();
        ph= new Phy_info();
        nut= new Nut_info();
        tr= new Trainer_info();
        mat= new Match_info();
        
        main = new javax.swing.JPanel();
        right = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        left = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        mat_info = new javax.swing.JLabel();
        playerinfo = new javax.swing.JLabel();
        physician_info = new javax.swing.JLabel();
        nu_info = new javax.swing.JLabel();
        trainerinfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main.setBackground(new java.awt.Color(255, 255, 255));

        right.setBackground(new java.awt.Color(255, 255, 255));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("Admin.jpg"))); // NOI18N

        javax.swing.GroupLayout rightLayout = new javax.swing.GroupLayout(right);
        right.setLayout(rightLayout);
        rightLayout.setHorizontalGroup(
            rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightLayout.createSequentialGroup()
                .addComponent(image)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        rightLayout.setVerticalGroup(
            rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightLayout.createSequentialGroup()
                .addComponent(image)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        left.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("NexaRegular", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Admin");

        mat_info.setFont(new java.awt.Font("NexaRegular", 0, 20)); // NOI18N
        mat_info.setForeground(new java.awt.Color(153, 0, 0));
        mat_info.setText("MATCH  INFORMATION");
        mat_info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mat_info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mat_infoMouseClicked(evt);
            }
        });

        playerinfo.setFont(new java.awt.Font("NexaRegular", 0, 20)); // NOI18N
        playerinfo.setForeground(new java.awt.Color(153, 0, 0));
        playerinfo.setText("PLAYER INFORMATION");
        playerinfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playerinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playerinfoMouseClicked(evt);
            }
        });

        physician_info.setFont(new java.awt.Font("NexaRegular", 0, 20)); // NOI18N
        physician_info.setForeground(new java.awt.Color(153, 0, 0));
        physician_info.setText("PHYSICIAN INFORMATION");
        physician_info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        physician_info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                physician_infoMouseClicked(evt);
            }
        });

        nu_info.setFont(new java.awt.Font("NexaRegular", 0, 20)); // NOI18N
        nu_info.setForeground(new java.awt.Color(153, 0, 0));
        nu_info.setText("NUTRITIONIST INFORMATION");
        nu_info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nu_info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nu_infoMouseClicked(evt);
            }
        });

        trainerinfo.setFont(new java.awt.Font("NexaRegular", 0, 20)); // NOI18N
        trainerinfo.setForeground(new java.awt.Color(153, 0, 0));
        trainerinfo.setText("TRAINER INFORMATION");
        trainerinfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trainerinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trainerinfoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout leftLayout = new javax.swing.GroupLayout(left);
        left.setLayout(leftLayout);
        leftLayout.setHorizontalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftLayout.createSequentialGroup()
                .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leftLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(trainerinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mat_info, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playerinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nu_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(physician_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        leftLayout.setVerticalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(playerinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(trainerinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nu_info, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(physician_info, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mat_info, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(298, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLayout.createSequentialGroup()
                .addComponent(left, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(right, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(right, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainLayout.createSequentialGroup()
                .addComponent(left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

       
    }// </editor-fold>//GEN-END:initComponents

    private void playerinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playerinfoMouseClicked
        pl.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_playerinfoMouseClicked

    private void trainerinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trainerinfoMouseClicked
        tr.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_trainerinfoMouseClicked

    private void nu_infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nu_infoMouseClicked
        nut.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_nu_infoMouseClicked

    private void physician_infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_physician_infoMouseClicked
        ph.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_physician_infoMouseClicked

    private void mat_infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mat_infoMouseClicked
        mat.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_mat_infoMouseClicked

    /**
     * @param args the command line arguments
     */
    
    /*
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
   /*     try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Adminpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adminpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adminpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adminpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    /*   java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adminpanel().setVisible(true);
            }
        });
    }
*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel left;
    private javax.swing.JPanel main;
    private javax.swing.JLabel mat_info;
    private javax.swing.JLabel nu_info;
    private javax.swing.JLabel physician_info;
    private javax.swing.JLabel playerinfo;
    private javax.swing.JPanel right;
    private javax.swing.JLabel trainerinfo;
    // End of variables declaration//GEN-END:variables
}
