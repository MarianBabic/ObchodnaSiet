/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.paz1c.obchodnaSiet.forms;

import sk.upjs.ics.paz1c.obchodnaSiet.dao.DaoFactory;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.Nastavenia;

/**
 *
 * @author Student
 */
public class NastaveniaForm extends javax.swing.JFrame {

    /**
     * Creates new form NastaveniaForm
     */
    public NastaveniaForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        Nastavenia nastavenia= DaoFactory.INSTANCE.getNastaveniaDao().nacitajNastavenia(1);
        nazovObchodnejSieteTextField.setText(nastavenia.getNazovObchodnejSiete());
        menaTextField.setText(nastavenia.getMena());
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
        jLabel2 = new javax.swing.JLabel();
        nazovObchodnejSieteTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        menaTextField = new javax.swing.JTextField();
        spatButton = new javax.swing.JButton();
        ulozitZmenyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nastavenia");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Názov obchodnej siete:");

        nazovObchodnejSieteTextField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nazovObchodnejSieteTextField.setToolTipText("Názov obchodnej siete");
        nazovObchodnejSieteTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nazovObchodnejSieteTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Mena:");

        menaTextField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        menaTextField.setToolTipText("Mena obchodnej siete (max 5 znakov)");

        spatButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        spatButton.setText("Späť");
        spatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spatButtonActionPerformed(evt);
            }
        });

        ulozitZmenyButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ulozitZmenyButton.setText("Uložiť zmeny");
        ulozitZmenyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ulozitZmenyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nazovObchodnejSieteTextField)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menaTextField)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ulozitZmenyButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                        .addComponent(spatButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nazovObchodnejSieteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ulozitZmenyButton)
                    .addComponent(spatButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spatButtonActionPerformed
        new HlavneOknoForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_spatButtonActionPerformed

    private void ulozitZmenyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ulozitZmenyButtonActionPerformed
        // TODO add your handling code here:
        Nastavenia nastavenia = new Nastavenia();
        nastavenia.setNazovObchodnejSiete(nazovObchodnejSieteTextField.getText());
        nastavenia.setMena(menaTextField.getText());

        DaoFactory.INSTANCE.getNastaveniaDao().pridajUpravNastavenia(nastavenia);

        new HlavneOknoForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ulozitZmenyButtonActionPerformed

    private void nazovObchodnejSieteTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nazovObchodnejSieteTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nazovObchodnejSieteTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(NastaveniaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NastaveniaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NastaveniaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NastaveniaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NastaveniaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField menaTextField;
    private javax.swing.JTextField nazovObchodnejSieteTextField;
    private javax.swing.JButton spatButton;
    private javax.swing.JButton ulozitZmenyButton;
    // End of variables declaration//GEN-END:variables
}
