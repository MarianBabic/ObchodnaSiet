package sk.upjs.ics.paz1c.obchodnaSiet.forms;

import sk.upjs.ics.paz1c.obchodnaSiet.entity.Prevadzka;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.Produkt;

public class ProdutkyForm extends javax.swing.JFrame {

    public ProdutkyForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        moznostiZobrazeniaButtonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        prevadzkyComboBox = new javax.swing.JComboBox<>();
        vsetkyProduktyRadioButton = new javax.swing.JRadioButton();
        produktyNaPrevadzkeRadioButton = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        produktyList = new javax.swing.JList<>();
        pridatProduktNaPredajnuButton = new javax.swing.JButton();
        pridatProduktButton = new javax.swing.JButton();
        spatButton = new javax.swing.JButton();
        odobratProduktButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Produkty");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Prevádzka:");

        prevadzkyComboBox.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        prevadzkyComboBox.setModel(new sk.upjs.ics.paz1c.obchodnaSiet.model.PrevadzkyComboBoxModel());

        moznostiZobrazeniaButtonGroup.add(vsetkyProduktyRadioButton);
        vsetkyProduktyRadioButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        vsetkyProduktyRadioButton.setSelected(true);
        vsetkyProduktyRadioButton.setText("Všetky produkty");
        vsetkyProduktyRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vsetkyProduktyRadioButtonActionPerformed(evt);
            }
        });

        moznostiZobrazeniaButtonGroup.add(produktyNaPrevadzkeRadioButton);
        produktyNaPrevadzkeRadioButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        produktyNaPrevadzkeRadioButton.setText("Podľa prevádzky");
        produktyNaPrevadzkeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produktyNaPrevadzkeRadioButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        produktyList.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        produktyList.setModel(new sk.upjs.ics.paz1c.obchodnaSiet.model.ProduktListModel());
        produktyList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oznacitRiadok(evt);
            }
        });
        jScrollPane1.setViewportView(produktyList);

        pridatProduktNaPredajnuButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        pridatProduktNaPredajnuButton.setText("Pridať produkt na prevádzku");
        pridatProduktNaPredajnuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pridatProduktNaPredajnuButtonActionPerformed(evt);
            }
        });

        pridatProduktButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        pridatProduktButton.setText("Pridať produkt");
        pridatProduktButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pridatProduktButtonActionPerformed(evt);
            }
        });

        spatButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        spatButton.setText("Späť");
        spatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spatButtonActionPerformed(evt);
            }
        });

        odobratProduktButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        odobratProduktButton.setText("Odobrať produkt");
        odobratProduktButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odobratProduktButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vsetkyProduktyRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(produktyNaPrevadzkeRadioButton))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prevadzkyComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pridatProduktButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(odobratProduktButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pridatProduktNaPredajnuButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(spatButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(prevadzkyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vsetkyProduktyRadioButton)
                    .addComponent(produktyNaPrevadzkeRadioButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pridatProduktButton)
                    .addComponent(odobratProduktButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pridatProduktNaPredajnuButton)
                    .addComponent(spatButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spatButtonActionPerformed
        new HlavneOknoForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_spatButtonActionPerformed

    private void vsetkyProduktyRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vsetkyProduktyRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vsetkyProduktyRadioButtonActionPerformed

    private void produktyNaPrevadzkeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produktyNaPrevadzkeRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produktyNaPrevadzkeRadioButtonActionPerformed

    private void pridatProduktButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridatProduktButtonActionPerformed
        new PridatProduktForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pridatProduktButtonActionPerformed

    private void odobratProduktButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odobratProduktButtonActionPerformed
        new OdobratProduktDialogForm(this, true).setVisible(true);
        
    }//GEN-LAST:event_odobratProduktButtonActionPerformed

    private void pridatProduktNaPredajnuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridatProduktNaPredajnuButtonActionPerformed
        new PridatProduktNaPrevadzkuForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pridatProduktNaPredajnuButtonActionPerformed

    private void oznacitRiadok(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oznacitRiadok
        // TODO add your handling code here:
    }//GEN-LAST:event_oznacitRiadok

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
            java.util.logging.Logger.getLogger(ProdutkyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutkyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutkyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutkyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutkyForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup moznostiZobrazeniaButtonGroup;
    private javax.swing.JButton odobratProduktButton;
    private javax.swing.JComboBox<Prevadzka> prevadzkyComboBox;
    private javax.swing.JButton pridatProduktButton;
    private javax.swing.JButton pridatProduktNaPredajnuButton;
    private javax.swing.JList<Produkt> produktyList;
    private javax.swing.JRadioButton produktyNaPrevadzkeRadioButton;
    private javax.swing.JButton spatButton;
    private javax.swing.JRadioButton vsetkyProduktyRadioButton;
    // End of variables declaration//GEN-END:variables
}
