/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class KonversiSuhu extends javax.swing.JFrame {

    /**
     * Creates new form KonversiSuhu
     */
    public KonversiSuhu() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        txtResult = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rbCelcius = new javax.swing.JRadioButton();
        rbFahrenheit = new javax.swing.JRadioButton();
        rbCalvin = new javax.swing.JRadioButton();
        rbC = new javax.swing.JRadioButton();
        rbF = new javax.swing.JRadioButton();
        rbCal = new javax.swing.JRadioButton();
        btnCalculate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Input");

        txtInput.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtResult.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Result");

        buttonGroup1.add(rbCelcius);
        rbCelcius.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbCelcius.setText("Celcius");

        buttonGroup1.add(rbFahrenheit);
        rbFahrenheit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbFahrenheit.setText("Fahrenheit");

        buttonGroup1.add(rbCalvin);
        rbCalvin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbCalvin.setText("Calvin");

        buttonGroup2.add(rbC);
        rbC.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbC.setText("Celcius");

        buttonGroup2.add(rbF);
        rbF.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbF.setText("Fahrenheit");

        buttonGroup2.add(rbCal);
        rbCal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbCal.setText("Calvin");

        btnCalculate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCalculate.setText("Calculate!");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Form");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("To");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41)
                        .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)
                        .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(rbCalvin)
                            .addGap(126, 126, 126)
                            .addComponent(rbCal))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(157, 157, 157))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(rbCelcius)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rbC)
                                .addComponent(jLabel4)
                                .addComponent(rbF))))
                    .addComponent(rbFahrenheit))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCelcius)
                    .addComponent(rbC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbFahrenheit)
                    .addComponent(rbF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCalvin)
                    .addComponent(rbCal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // TODO add your handling code here:
        double Input;
        float Result = 0;
        String a;
        Input = Double.parseDouble(txtInput.getText());
        
        if (rbCelcius.isSelected() && rbC.isSelected())
            Result = (float) Input;
            a = String.valueOf(Result);
            txtResult.setText(a);
        if (rbCelcius.isSelected() && rbF.isSelected())
            Result = (float) (Input * 9 / 5 + 32);
            a = String.valueOf(Result);
            txtResult.setText(a);
        if (rbCelcius.isSelected() && rbCal.isSelected())
            Result = (float) (Input+273);
            a =String.valueOf(Result);
            txtResult.setText(a);
            
        if (rbFahrenheit.isSelected() && rbC.isSelected())
            Result = (float) ((Input-32) * 55 / 9);
            a = String.valueOf(Result);
            txtResult.setText(a);
        if (rbFahrenheit.isSelected() && rbF.isSelected())
            Result = (float) Input;
            a = String.valueOf(Result);
            txtResult.setText(a);
        if (rbFahrenheit.isSelected() && rbCal.isSelected())
            Result = (float) ((Input - 32) * 5/9+273);
            a =String.valueOf(Result);
            txtResult.setText(a);
                    
        if (rbCalvin.isSelected() && rbC.isSelected())
            Result = (float) (Input-273);
            a = String.valueOf(Result);
            txtResult.setText(a);
        if (rbCalvin.isSelected() && rbF.isSelected())
            Result = (float) ((Input-273)*9/5+32);
            a = String.valueOf(Result);
            txtResult.setText(a);
        if (rbCalvin.isSelected() && rbCal.isSelected())
            Result = (float) Input;
            a =String.valueOf(Result);
            txtResult.setText(a);
    }//GEN-LAST:event_btnCalculateActionPerformed

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
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton rbC;
    private javax.swing.JRadioButton rbCal;
    private javax.swing.JRadioButton rbCalvin;
    private javax.swing.JRadioButton rbCelcius;
    private javax.swing.JRadioButton rbF;
    private javax.swing.JRadioButton rbFahrenheit;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}
